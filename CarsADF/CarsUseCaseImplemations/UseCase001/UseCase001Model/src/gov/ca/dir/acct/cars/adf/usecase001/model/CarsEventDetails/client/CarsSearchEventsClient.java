package gov.ca.dir.acct.cars.adf.usecase001.model.CarsEventDetails.client;

import gov.ca.dir.acct.cars.adf.usecase001.model.CarsEventDetails.common.CarsSearchEvents;

import oracle.jbo.client.remote.ApplicationModuleImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Thu Jan 02 10:05:03 PST 2014
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class CarsSearchEventsClient extends ApplicationModuleImpl implements CarsSearchEvents {
    /**
     * This is the default constructor (do not remove).
     */
    public CarsSearchEventsClient() {
    }

    public void doResetViewArRootDocuments1(String searchCriteriaName) {
        Object _ret =
            this.riInvokeExportedMethod(this,"doResetViewArRootDocuments1",new String [] {"java.lang.String"},new Object[] {searchCriteriaName});
        return;
    }
}