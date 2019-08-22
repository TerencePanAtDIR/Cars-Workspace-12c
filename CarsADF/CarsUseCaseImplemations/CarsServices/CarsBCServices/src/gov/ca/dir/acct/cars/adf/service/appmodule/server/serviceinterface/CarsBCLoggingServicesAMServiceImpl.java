package gov.ca.dir.acct.cars.adf.service.appmodule.server.serviceinterface;

import gov.ca.dir.acct.cars.adf.service.appmodule.CarsBCLoggingServicesAMImpl;
import gov.ca.dir.acct.cars.adf.service.appmodule.common.serviceinterface.CarsBCLoggingServicesAMService;
import gov.ca.dir.acct.cars.adf.service.view.common.CarsErrorLogViewSDO;
import gov.ca.dir.acct.cars.adf.service.view.common.CarsErrorMessageViewSDO;
import gov.ca.dir.acct.cars.adf.service.view.common.CarsRequestViewSDO;

import java.lang.reflect.Method;

import java.math.BigDecimal;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ejb.Remote;
import javax.ejb.Stateless;

import javax.interceptor.Interceptors;

import oracle.jbo.common.Diagnostic;
import oracle.jbo.common.sdo.SDOHelper;
import oracle.jbo.common.service.types.FindControl;
import oracle.jbo.common.service.types.FindCriteria;
import oracle.jbo.server.svc.ServiceContextInterceptor;
import oracle.jbo.server.svc.ServiceImpl;
import oracle.jbo.service.errors.ServiceException;

import oracle.webservices.annotations.PortableWebService;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Fri Oct 04 09:56:22 PDT 2013
// ---------------------------------------------------------------------
@Interceptors( { ServiceContextInterceptor.class })
@Stateless(name="gov.ca.dir.acct.cars.adf.service.appmodule.common.CarsBCLoggingServicesAMServiceBean",
    mappedName="CarsBCLoggingServicesAMServiceBean")
@Remote(CarsBCLoggingServicesAMService.class)
@PortableWebService(targetNamespace="/gov/ca/dir/acct/cars/adf/service/appmodule/common/",
    serviceName="CarsBCLoggingServicesAMService", portName="CarsBCLoggingServicesAMServiceSoapHttpPort",
    endpointInterface="gov.ca.dir.acct.cars.adf.service.appmodule.common.serviceinterface.CarsBCLoggingServicesAMService")
public class CarsBCLoggingServicesAMServiceImpl extends ServiceImpl implements CarsBCLoggingServicesAMService {
    private static boolean _isInited = false;


    private static final Map _map = new HashMap();

    /**
     * This is the default constructor (do not remove).
     */
    public CarsBCLoggingServicesAMServiceImpl() {
        init();
        setApplicationModuleDefName("gov.ca.dir.acct.cars.adf.service.appmodule.CarsBCLoggingServicesAM");
        setConfigurationName("CarsBCLoggingServicesAMService");
    }


    /**
     * Generated method. Do not modify. Do initialization in the constructor
     */
    protected void init() {
        if (_isInited) {
            return;
        }
        synchronized (CarsBCLoggingServicesAMServiceImpl.class) {
            if (_isInited) {
                return;
            }
            try {
                SDOHelper.INSTANCE.defineSchema("gov/ca/dir/acct/cars/adf/service/appmodule/common/serviceinterface/", "CarsBCLoggingServicesAMService.xsd");
                _map.put("getErrorLogIdSequence",
                         CarsBCLoggingServicesAMImpl.class.getMethod("getErrorLogIdSequence",
                                                                     new Class[] { }));
                _map.put("getRequestIdSequence",
                         CarsBCLoggingServicesAMImpl.class.getMethod("getRequestIdSequence",
                                                                     new Class[] { }));
                _isInited = true;
            } catch (Exception ex) {
                Diagnostic.printStackTrace(ex);
            }
        }
    }

    /**
     * createCarsErrorLog: generated method. Do not modify.
     */
    public CarsErrorLogViewSDO createCarsErrorLog(CarsErrorLogViewSDO carsErrorLogView1) throws ServiceException {
        return (CarsErrorLogViewSDO)create(carsErrorLogView1,
                                           "CarsErrorLogView1");
    }

    /**
     * findCarsErrorMessageWithParams: generated method. Do not modify.
     */
    public List<CarsErrorMessageViewSDO> findCarsErrorMessageWithParams(FindCriteria findCriteria,
                                                                        Integer varErrorMessageId,
                                                                        String varFaultCode,
                                                                        FindControl findControl) throws ServiceException {
        return (List<CarsErrorMessageViewSDO>)find(findCriteria, findControl,
                                                   "CarsErrorMessageView1",
                                                   CarsErrorMessageViewSDO.class,
                                                   "CarsErrorMessageViewCriteria",
                                                   new NamedParam[] { new NamedParam("varErrorMessageId",
                                                                                     varErrorMessageId),
                                                                      new NamedParam("varFaultCode",
                                                                                     varFaultCode) });
    }


    /**
     * createCarsRequest: generated method. Do not modify.
     */
    public CarsRequestViewSDO createCarsRequest(CarsRequestViewSDO carsRequestView1) throws ServiceException {
        return (CarsRequestViewSDO)create(carsRequestView1,
                                          "CarsRequestView1");
    }

    /**
     * updateCarsRequest: generated method. Do not modify.
     */
    public CarsRequestViewSDO updateCarsRequest(CarsRequestViewSDO carsRequestView1) throws ServiceException {
        return (CarsRequestViewSDO)update(carsRequestView1,
                                          "CarsRequestView1");
    }

    /**
     * findCarsRequestWithParams: generated method. Do not modify.
     */
    public List<CarsRequestViewSDO> findCarsRequestWithParams(FindCriteria findCriteria,
                                                              String varEcid,
                                                              FindControl findControl) throws ServiceException {
        return (List<CarsRequestViewSDO>)find(findCriteria, findControl,
                                              "CarsRequestView1",
                                              CarsRequestViewSDO.class,
                                              "CarsRequestViewCriteria",
                                              new NamedParam[] { new NamedParam("varEcid",
                                                                                varEcid) });
    }


    /**
     * getErrorLogIdSequence: generated method. Do not modify.
     */
    public BigDecimal getErrorLogIdSequence() throws ServiceException {
        return (BigDecimal)invokeCustom((Method)_map.get("getErrorLogIdSequence"),
                                        new Object[] { }, new String[] { },
                                        false);
    }

    /**
     * getRequestIdSequence: generated method. Do not modify.
     */
    public BigDecimal getRequestIdSequence() throws ServiceException {
        return (BigDecimal)invokeCustom((Method)_map.get("getRequestIdSequence"),
                                        new Object[] { }, new String[] { },
                                        false);
    }


    /**
     * findCarsRequestWithInstanceIdParam: generated method. Do not modify.
     */
    public List<CarsRequestViewSDO> findCarsRequestWithInstanceIdParam(FindCriteria findCriteria,
                                                                       String varEcid,
                                                                       String varPayloadName,
                                                                       FindControl findControl) throws ServiceException {
        return (List<CarsRequestViewSDO>)find(findCriteria, findControl,
                                              "CarsRequestView1",
                                              CarsRequestViewSDO.class,
                                              "CarsRequestViewCriteriaInstance",
                                              new NamedParam[] { new NamedParam("varEcid",
                                                                                varEcid),
                                                                 new NamedParam("varPayloadName",
                                                                                varPayloadName) });
    }

}
