package gov.ca.dir.acct.cars.internal.soamanager;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;

import java.util.Set;

import javax.naming.Context;

import oracle.soa.management.facade.Composite;
import oracle.soa.management.facade.CompositeInstance;
import oracle.soa.management.facade.Locator;
import oracle.soa.management.facade.LocatorFactory;
import oracle.soa.management.util.ComponentInstanceFilter;
import oracle.soa.management.util.CompositeFilter;
import oracle.soa.management.util.CompositeInstanceFilter;


public class SoaManager {

    public Hashtable<String, String> getJNDIProps() {
        Hashtable<String, String> jndiProps = new Hashtable<String, String>();
        jndiProps.put(Context.PROVIDER_URL, "t3://cssoady2:8001/soa-infra");
        jndiProps.put(Context.INITIAL_CONTEXT_FACTORY,
                      "weblogic.jndi.WLInitialContextFactory");
        jndiProps.put(Context.SECURITY_PRINCIPAL, "tpan");
        jndiProps.put(Context.SECURITY_CREDENTIALS, "welcome2");
        jndiProps.put("dedicated.connection", "true");
        return jndiProps;
    }

    public Locator getLocator() {
        try {
            return LocatorFactory.createLocator(getJNDIProps());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static Hashtable<String, String> getStaticJNDIProps() {
        Hashtable<String, String> jndiProps = new Hashtable<String, String>();
        jndiProps.put(Context.PROVIDER_URL, "t3://cssoady2:8001/soa-infra");
        jndiProps.put(Context.INITIAL_CONTEXT_FACTORY,
                      "weblogic.jndi.WLInitialContextFactory");
        jndiProps.put(Context.SECURITY_PRINCIPAL, "tpan");
        //Waymore2!
        jndiProps.put(Context.SECURITY_CREDENTIALS, "welcome2");
        jndiProps.put("dedicated.connection", "true");
        return jndiProps;
    }


    public static Locator getStaticLocator() {
        try {
            return LocatorFactory.createLocator(getStaticJNDIProps());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public void purgeStaleInstances(CompositeFilter compositeFilter,
                                    int state) {
        Locator locator = null;
        int purgedInstanceCount = 0;

        try {
            locator = this.getLocator();
            CompositeInstanceFilter instanceFilter =
                new CompositeInstanceFilter();
            System.out.println("------- Setting the process State --------");
            instanceFilter.setState(state);
            
            /**
             * Retrieve all the instances based on the filter criteria given
             */
            List<Composite> composites =
                locator.getComposites(compositeFilter);
            System.out.println("## Composite Instance Size: " +
                               composites.size() + " matching composites.");

            Iterator compositeIter = composites.iterator();
            while (compositeIter.hasNext()) {
                Composite composite = (Composite)compositeIter.next();
                int compositeInstanceSize =
                    composite.getInstances(instanceFilter).size();
                if (compositeInstanceSize > 0) {
                    purgedInstanceCount += compositeInstanceSize;
                    composite.purgeInstances(instanceFilter);
                    System.out.println("## Purged " + compositeInstanceSize +
                                       " instances for composite " +
                                       composite.getCompositeDN().getCompositeName());
                } else {
                    System.out.println("## No instances found for composite " +
                                       composite.getCompositeDN().getCompositeName());
                }
            }
            System.out.println("## Cleaned a total of " + purgedInstanceCount +
                               " instances.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Locator locator = null;
        PurgeRunningFaultedSoaInstances instanceManager =
            new PurgeRunningFaultedSoaInstances();
        /**
         *Clean instances based on instance state
         */
        //int instanceState = CompositeInstance.STATE_STALE;
        CompositeFilter compositeFilter = new CompositeFilter();
        
        CompositeInstanceFilter instanceFilter = new CompositeInstanceFilter();
        Calendar beginDateCal = new GregorianCalendar(2017, Calendar.AUGUST, 1);
        Date beginDate = beginDateCal.getTime();
        Calendar endDateCal = new GregorianCalendar(2017, Calendar.AUGUST, 31);
        Date endDate = endDateCal.getTime();
        instanceFilter.setMinCreationDate(beginDate);
        instanceFilter.setMaxCreationDate(endDate);
        //instanceFilter.setCompositeName("CarsEventRouterSCA");
        //instanceFilter.setState(CompositeInstance.STATE_COMPLETED_SUCCESSFULLY);
        try {
            locator = getStaticLocator();
            List<CompositeInstance> composites = locator.getCompositeInstances(instanceFilter);
            
            System.out.println(composites.size());
            
            int i =0;
            HashMap compositesHashMap = new HashMap<String, Integer>();
            
            for (CompositeInstance compositeInstance: composites){
                String compositeName = compositeInstance.getCompositeDN().getCompositeName();
                if(!compositesHashMap.containsKey(compositeName)){
                    compositesHashMap.put(compositeName, 1);
                } else{
                    compositesHashMap.put(compositeName, (Integer)compositesHashMap.get(compositeName) + 1);
                }
                //System.out.println(compositeInstance.getCreationDate().toString() + compositeInstance.getCompositeDN().getCompositeName());    
            }
            
            Set<String> compositeNameSet = compositesHashMap.keySet();
            for (String compositeName : compositeNameSet){
                System.out.println(compositeName + ": " + compositesHashMap.get(compositeName));
            }
            
            //ComponentInstanceFilter cif = new ComponentInstanceFilter();
            //cif.setComponentName("LoggingProcess");
            //composites.get(0).abort();
            //System.out.println(composite.getInstances(instanceFilter).size());
        } catch (Exception e) {
            e.printStackTrace();
        }
        //System.out.println("------ Starting to purge Instance -----");
        //instanceManager.purgeStaleInstances(compositeFilter, instanceState);

    }
}
