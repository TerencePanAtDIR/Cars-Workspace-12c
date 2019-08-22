package gov.ca.dir.acct.cars.webservices.internal.proxy;

import gov.ca.dir.acct.cars.webservices.internal.types.CARSPacket;

import gov.ca.dir.acct.cars.webservices.internal.types.ObjectFactory;

import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import javax.jws.soap.SOAPBinding;

import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.soap.MTOM;

@XmlSeeAlso( { ObjectFactory.class })
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT, parameterStyle = SOAPBinding.ParameterStyle.BARE)
@WebService(name = "execute_ptt", serviceName = "CARSIntakeWebService", targetNamespace = "http://xmlns.oracle.com/CarsCompositeWorkspace/CarsEventRouterSCA/CARSIntakeWebService", portName = "execute_pt")
@MTOM
public class Execute_pttImpl {
    public Execute_pttImpl() {
    }

    @SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
    @Action(input = "execute")
    @WebMethod(action = "execute")
    @Oneway
    public void execute(@WebParam(name = "CARSPacket", partName = "request", targetNamespace = "http://www.dir.ca.gov/acct/cars/schema/common")
        CARSPacket request) {
    }
}
