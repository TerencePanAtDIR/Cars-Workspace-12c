package gov.ca.dir.acct.cars.webservices.internal.data;

import gov.ca.dir.acct.cars.webservices.internal.types.common.TProgramUnitCode;
import gov.ca.dir.acct.cars.webservices.internal.types.CARSPacket;
import gov.ca.dir.acct.cars.webservices.internal.types.ObjectFactory;

import gov.ca.dir.acct.cars.webservices.internal.types.common.TDataSourceCode;

import gov.ca.dir.acct.cars.webservices.internal.types.common.TEventType;

import java.util.GregorianCalendar;

import java.util.List;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

public class CARSPacketDetails {
    String schemaVersionNumber = "1.0.0";
    CARSPacket carsPacket;
    CARSPacket.CARSPacketHeader packetHeader;
    CARSPacket.CARSPayloadInformation packetPayloadInformation;
    CARSPacket.CarsPacketPayload packetPayload;
    ObjectFactory objectFactory = new ObjectFactory();
    
    public CARSPacketDetails() {
        objectFactory = new ObjectFactory();
        carsPacket = objectFactory.createCARSPacket();
        packetHeader = objectFactory.createCARSPacketCARSPacketHeader();
        packetPayloadInformation = objectFactory.createCARSPacketCARSPayloadInformation();
        packetPayload = objectFactory.createCARSPacketCarsPacketPayload();
        carsPacket.setSchemaVersionNumber(schemaVersionNumber);
    }
    
    public void setPacketHeader(String packetTransport, String packetTarget, String packetID, String programUnit, String dataSourceCode,String environment, String submitBy, GregorianCalendar submitDate){
        packetHeader.setDataSourceCode(TDataSourceCode.fromValue(dataSourceCode));
        packetHeader.setEnvironment(environment);
        packetHeader.setPacketID(packetID);
        packetHeader.setPacketTarget(packetTarget);
        packetHeader.setPacketTransport(packetTransport);
        packetHeader.setProgramUnitCode(TProgramUnitCode.fromValue(programUnit));
        packetHeader.setSubmitBy(submitBy);
        XMLGregorianCalendar cal;
        try {
            cal = DatatypeFactory.newInstance().newXMLGregorianCalendar(submitDate);
            packetHeader.setSubmitDate(cal);
        } catch (DatatypeConfigurationException e) {
            //TODO: SET CATCH
        }         
        carsPacket.setCARSPacketHeader(packetHeader);
    }
    
    public void setPacketPayloadInformation(TEventType payloadName){
        packetPayloadInformation.setPayloadName(payloadName);
        packetPayloadInformation.setPayloadSchema(payloadName.value());
        carsPacket.setCARSPayloadInformation(packetPayloadInformation);
    }
    
    public void setPacketPayload(List<Object> payload){
        packetPayload.setCARSPacketPayload(payload);
        carsPacket.setCARSPacketPayload(packetPayload);
    }

    public CARSPacket getCarsPacket() {
        return carsPacket;
    }
    
    /*
     * Builder Class for building the CARSPacket if you prefer
     */
    public static class CARSPacketBuilder{
        String schemaVersionNumber = "1.0.0";
        CARSPacket carsPacket;
        CARSPacket.CARSPacketHeader packetHeader;
        CARSPacket.CARSPayloadInformation packetPayloadInformation;
        CARSPacket.CarsPacketPayload packetPayload;
        ObjectFactory objectFactory = new ObjectFactory();       
        
        public CARSPacketBuilder(){
            carsPacket = objectFactory.createCARSPacket();
            packetHeader = objectFactory.createCARSPacketCARSPacketHeader();
            packetPayloadInformation = objectFactory.createCARSPacketCARSPayloadInformation();
            packetPayload = objectFactory.createCARSPacketCarsPacketPayload();
            carsPacket.setSchemaVersionNumber(schemaVersionNumber);
        }
        
        public CARSPacketBuilder setDataSourceCode(String dataSourceCode){
            this.packetHeader.setDataSourceCode(TDataSourceCode.fromValue(dataSourceCode));
            return this;
        }
        
        public CARSPacketBuilder setEnvironment(String environment){
            this.packetHeader.setEnvironment(environment);
            return this;
        }
        
        public CARSPacketBuilder setPacketID(String packetId){
            this.packetHeader.setPacketID(packetId);
            return this;
        }
        
        public CARSPacketBuilder setPacketTarget(String packetTarget){
            this.packetHeader.setPacketTarget(packetTarget);
            return this;
        }
        
        public CARSPacketBuilder setPacketTransport(String packetTransport){
            this.packetHeader.setPacketTransport(packetTransport);
            return this;
        }
        
        public CARSPacketBuilder setProgramUnitCode(String programUnit){
            this.packetHeader.setProgramUnitCode(TProgramUnitCode.fromValue(programUnit));
            return this;
        }
        
        public CARSPacketBuilder setSubmitBy(String submitBy){
            this.packetHeader.setSubmitBy(submitBy);
            return this;
        }
        
        public CARSPacketBuilder setSubmitDate(XMLGregorianCalendar submitDate){
            this.packetHeader.setSubmitDate(submitDate);
            return this;
        }
        
        public CARSPacketBuilder setPacketPayloadInformation(TEventType payloadName){
            this.packetPayloadInformation.setPayloadName(payloadName);
            this.packetPayloadInformation.setPayloadSchema(payloadName.value());
            return this;
        }
        
        public CARSPacketBuilder setPacketPayload(Object payload){
            this.packetPayload.addCARSPacketPayload(payload);
            return this;
        }
        
        public CARSPacket createCARSPacketDetails(){
            carsPacket.setCARSPacketHeader(packetHeader);
            carsPacket.setCARSPacketPayload(packetPayload);
            carsPacket.setCARSPayloadInformation(packetPayloadInformation);
            
            return carsPacket;
        }
    }
}