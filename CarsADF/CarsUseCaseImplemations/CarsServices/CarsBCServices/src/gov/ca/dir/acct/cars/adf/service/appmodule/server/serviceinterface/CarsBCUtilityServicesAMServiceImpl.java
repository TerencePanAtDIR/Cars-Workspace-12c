package gov.ca.dir.acct.cars.adf.service.appmodule.server.serviceinterface;

import gov.ca.dir.acct.cars.adf.service.appmodule.CarsBCUtilityServicesAMImpl;
import gov.ca.dir.acct.cars.adf.service.appmodule.common.serviceinterface.CarsBCUtilityServicesAMService;

import java.lang.reflect.Method;

import java.math.BigDecimal;

import java.sql.Timestamp;

import java.util.HashMap;
import java.util.Map;

import javax.ejb.Remote;
import javax.ejb.Stateless;

import javax.interceptor.Interceptors;

import oracle.jbo.common.Diagnostic;
import oracle.jbo.common.sdo.SDOHelper;
import oracle.jbo.domain.Date;
import oracle.jbo.server.svc.ServiceContextInterceptor;
import oracle.jbo.server.svc.ServiceImpl;
import oracle.jbo.service.errors.ServiceException;

import oracle.webservices.annotations.PortableWebService;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Tue Sep 03 13:25:20 PDT 2013
// ---------------------------------------------------------------------
@Interceptors( { ServiceContextInterceptor.class })
@Stateless(name="gov.ca.dir.acct.cars.adf.service.appmodule.common.CarsBCUtilityServicesAMServiceBean",
    mappedName="CarsBCUtilityServicesAMServiceBean")
@Remote(CarsBCUtilityServicesAMService.class)
@PortableWebService(targetNamespace="/gov/ca/dir/acct/cars/adf/service/appmodule/common/",
    serviceName="CarsBCUtilityServicesAMService", portName="CarsBCUtilityServicesAMServiceSoapHttpPort",
    endpointInterface="gov.ca.dir.acct.cars.adf.service.appmodule.common.serviceinterface.CarsBCUtilityServicesAMService")
public class CarsBCUtilityServicesAMServiceImpl extends ServiceImpl implements CarsBCUtilityServicesAMService {
    private static boolean _isInited = false;


    private static final Map _map = new HashMap();

    /**
     * This is the default constructor (do not remove).
     */
    public CarsBCUtilityServicesAMServiceImpl() {
        init();
        setApplicationModuleDefName("gov.ca.dir.acct.cars.adf.service.appmodule.CarsBCUtilityServicesAM");
        setConfigurationName("CarsBCUtilityServicesAMService");
    }


    /**
     * Generated method. Do not modify. Do initialization in the constructor
     */
    protected void init() {
        if (_isInited) {
            return;
        }
        synchronized (CarsBCUtilityServicesAMServiceImpl.class) {
            if (_isInited) {
                return;
            }
            try {
                SDOHelper.INSTANCE.defineSchema("gov/ca/dir/acct/cars/adf/service/appmodule/common/serviceinterface/", "CarsBCUtilityServicesAMService.xsd");
                _map.put("getEventIDSequence",
                         CarsBCUtilityServicesAMImpl.class.getMethod("getEventIDSequence",
                                                                     new Class[] { }));
                _map.put("getARStatusIDSequence",
                         CarsBCUtilityServicesAMImpl.class.getMethod("getARStatusIDSequence",
                                                                     new Class[] { }));
                _map.put("getPartyIDSequence",
                         CarsBCUtilityServicesAMImpl.class.getMethod("getPartyIDSequence",
                                                                     new Class[] { }));
                _map.put("getParticipantRoleIdSequence",
                         CarsBCUtilityServicesAMImpl.class.getMethod("getParticipantRoleIdSequence",
                                                                     new Class[] { }));
                _map.put("getContactMethodIdSequence",
                         CarsBCUtilityServicesAMImpl.class.getMethod("getContactMethodIdSequence",
                                                                     new Class[] { }));
                _map.put("getAddressIdSequence",
                         CarsBCUtilityServicesAMImpl.class.getMethod("getAddressIdSequence",
                                                                     new Class[] { }));
                _map.put("getAcctgTransactionIdSequence",
                         CarsBCUtilityServicesAMImpl.class.getMethod("getAcctgTransactionIdSequence",
                                                                     new Class[] { }));
                _map.put("getAcctgEntryIdSequence",
                         CarsBCUtilityServicesAMImpl.class.getMethod("getAcctgEntryIdSequence",
                                                                     new Class[] { }));
                _map.put("getNoteIdSequence",
                         CarsBCUtilityServicesAMImpl.class.getMethod("getNoteIdSequence",
                                                                     new Class[] { }));
                _map.put("isEventReversed",
                         CarsBCUtilityServicesAMImpl.class.getMethod("isEventReversed",
                                                                     new Class[] { String.class }));
                _map.put("isChildrenExist",
                         CarsBCUtilityServicesAMImpl.class.getMethod("isChildrenExist",
                                                                     new Class[] { String.class }));
                _map.put("is2YearsPrior",
                         CarsBCUtilityServicesAMImpl.class.getMethod("is2YearsPrior",
                                                                     new Class[] { String.class }));
                _map.put("getCurrentBalance",
                         CarsBCUtilityServicesAMImpl.class.getMethod("getCurrentBalance",
                                                                     new Class[] { String.class }));
                _map.put("isReclassNeeded",
                         CarsBCUtilityServicesAMImpl.class.getMethod("isReclassNeeded",
                                                                     new Class[] { String.class }));
                _map.put("findAROtherReferenceDocumentWithParams",
                         CarsBCUtilityServicesAMImpl.class.getMethod("findAROtherReferenceDocumentWithParams",
                                                                     new Class[] { String.class }));
                _map.put("findAROthersContingentRefDoc",
                         CarsBCUtilityServicesAMImpl.class.getMethod("findAROthersContingentRefDoc",
                                                                     new Class[] { String.class }));
                _map.put("isAROthersRefDocExisted",
                         CarsBCUtilityServicesAMImpl.class.getMethod("isAROthersRefDocExisted",
                                                                     new Class[] { String.class }));
                _map.put("isDecisionAfterReclassExisted",
                         CarsBCUtilityServicesAMImpl.class.getMethod("isDecisionAfterReclassExisted",
                                                                     new Class[] { String.class,
                                                                                   String.class,
                                                                                   String.class }));
                _isInited = true;
            } catch (Exception ex) {
                Diagnostic.printStackTrace(ex);
            }
        }
    }

    /**
     * getEventIDSequence: generated method. Do not modify.
     */
    public BigDecimal getEventIDSequence() throws ServiceException {
        return (BigDecimal)invokeCustom((Method)_map.get("getEventIDSequence"),
                                        new Object[] { }, new String[] { },
                                        false);
    }


    /**
     * getARStatusIDSequence: generated method. Do not modify.
     */
    public BigDecimal getARStatusIDSequence() throws ServiceException {
        return (BigDecimal)invokeCustom((Method)_map.get("getARStatusIDSequence"),
                                        new Object[] { }, new String[] { },
                                        false);
    }


    /**
     * getPartyIDSequence: generated method. Do not modify.
     */
    public BigDecimal getPartyIDSequence() throws ServiceException {
        return (BigDecimal)invokeCustom((Method)_map.get("getPartyIDSequence"),
                                        new Object[] { }, new String[] { },
                                        false);
    }

    /**
     * getParticipantRoleIdSequence: generated method. Do not modify.
     */
    public BigDecimal getParticipantRoleIdSequence() throws ServiceException {
        return (BigDecimal)invokeCustom((Method)_map.get("getParticipantRoleIdSequence"),
                                        new Object[] { }, new String[] { },
                                        false);
    }

    /**
     * getContactMethodIdSequence: generated method. Do not modify.
     */
    public BigDecimal getContactMethodIdSequence() throws ServiceException {
        return (BigDecimal)invokeCustom((Method)_map.get("getContactMethodIdSequence"),
                                        new Object[] { }, new String[] { },
                                        false);
    }

    /**
     * getAddressIdSequence: generated method. Do not modify.
     */
    public BigDecimal getAddressIdSequence() throws ServiceException {
        return (BigDecimal)invokeCustom((Method)_map.get("getAddressIdSequence"),
                                        new Object[] { }, new String[] { },
                                        false);
    }


    /**
     * getAcctgTransactionIdSequence: generated method. Do not modify.
     */
    public BigDecimal getAcctgTransactionIdSequence() throws ServiceException {
        return (BigDecimal)invokeCustom((Method)_map.get("getAcctgTransactionIdSequence"),
                                        new Object[] { }, new String[] { },
                                        false);
    }


    /**
     * getAcctgEntryIdSequence: generated method. Do not modify.
     */
    public BigDecimal getAcctgEntryIdSequence() throws ServiceException {
        return (BigDecimal)invokeCustom((Method)_map.get("getAcctgEntryIdSequence"),
                                        new Object[] { }, new String[] { },
                                        false);
    }


    /**
     * getNoteIdSequence: generated method. Do not modify.
     */
    public BigDecimal getNoteIdSequence() throws ServiceException {
        return (BigDecimal)invokeCustom((Method)_map.get("getNoteIdSequence"),
                                        new Object[] { }, new String[] { },
                                        false);
    }


    /**
     * isEventReversed: generated method. Do not modify.
     */
    public BigDecimal isEventReversed(String currentDocumentNumber) throws ServiceException {
        return (BigDecimal)invokeCustom((Method)_map.get("isEventReversed"),
                                        new Object[] { currentDocumentNumber },
                                        new String[] { null }, false);
    }

    /**
     * isChildrenExist: generated method. Do not modify.
     */
    public BigDecimal isChildrenExist(String currentDocumentNumber) throws ServiceException {
        return (BigDecimal)invokeCustom((Method)_map.get("isChildrenExist"),
                                        new Object[] { currentDocumentNumber },
                                        new String[] { null }, false);
    }


    /**
     * is2YearsPrior: generated method. Do not modify.
     */
    public BigDecimal is2YearsPrior(String ReferenceDocument) throws ServiceException {
        return (BigDecimal)invokeCustom((Method)_map.get("is2YearsPrior"),
                                        new Object[] { ReferenceDocument },
                                        new String[] { null }, false);
    }


    /**
     * getCurrentBalance: generated method. Do not modify.
     */
    public BigDecimal getCurrentBalance(String ReferenceDocument) throws ServiceException {
        return (BigDecimal)invokeCustom((Method)_map.get("getCurrentBalance"),
                                        new Object[] { ReferenceDocument },
                                        new String[] { null }, false);
    }


    /**
     * isReclassNeeded: generated method. Do not modify.
     */
    public BigDecimal isReclassNeeded(String ReferenceDocument) throws ServiceException {
        return (BigDecimal)invokeCustom((Method)_map.get("isReclassNeeded"),
                                        new Object[] { ReferenceDocument },
                                        new String[] { null }, false);
    }


    /**
     * findAROtherReferenceDocumentWithParams: generated method. Do not modify.
     */
    public String findAROtherReferenceDocumentWithParams(String rootDocument) throws ServiceException {
        return (String)invokeCustom((Method)_map.get("findAROtherReferenceDocumentWithParams"),
                                    new Object[] { rootDocument },
                                    new String[] { null }, false);
    }


    /**
     * findAROthersContingentRefDoc: generated method. Do not modify.
     */
    public String findAROthersContingentRefDoc(String referenceDocument) throws ServiceException {
        return (String)invokeCustom((Method)_map.get("findAROthersContingentRefDoc"),
                                    new Object[] { referenceDocument },
                                    new String[] { null }, false);
    }


    /**
     * isAROthersRefDocExisted: generated method. Do not modify.
     */
    public BigDecimal isAROthersRefDocExisted(String ReferenceDocument) throws ServiceException {
        return (BigDecimal)invokeCustom((Method)_map.get("isAROthersRefDocExisted"),
                                        new Object[] { ReferenceDocument },
                                        new String[] { null }, false);
    }


    /**
     * isDecisionAfterReclassExisted: generated method. Do not modify.
     */
    public BigDecimal isDecisionAfterReclassExisted(String ReferenceDocument,
                                                    String eventDateStr,
                                                    String eventTypeCode) throws ServiceException {
        return (BigDecimal)invokeCustom((Method)_map.get("isDecisionAfterReclassExisted"),
                                        new Object[] { ReferenceDocument,
                                                       eventDateStr,
                                                       eventTypeCode },
                                        new String[] { null, null, null },
                                        false);
    }

}