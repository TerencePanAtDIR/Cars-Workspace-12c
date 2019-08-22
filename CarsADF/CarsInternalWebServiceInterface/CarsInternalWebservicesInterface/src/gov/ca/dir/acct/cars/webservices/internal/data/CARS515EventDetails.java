package gov.ca.dir.acct.cars.webservices.internal.data;

import gov.ca.dir.acct.cars.webservices.internal.types.CARS515Event;
import gov.ca.dir.acct.cars.webservices.internal.types.CARS900Event;
import gov.ca.dir.acct.cars.webservices.internal.types.ObjectFactory;
import gov.ca.dir.acct.cars.webservices.internal.types.common.TAddress;
import gov.ca.dir.acct.cars.webservices.internal.types.common.TAdjustmentType;
import gov.ca.dir.acct.cars.webservices.internal.types.common.TDataSourceCode;
import gov.ca.dir.acct.cars.webservices.internal.types.common.TNote;
import gov.ca.dir.acct.cars.webservices.internal.types.common.TNoteTypeCode;
import gov.ca.dir.acct.cars.webservices.internal.types.common.TOrganization;
import gov.ca.dir.acct.cars.webservices.internal.types.common.TParticipant;
import gov.ca.dir.acct.cars.webservices.internal.types.common.TProgramUnitCode;

import gov.ca.dir.acct.cars.webservices.internal.types.common.TZip;

import java.math.BigDecimal;

import java.math.BigInteger;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;


public class CARS515EventDetails {
    private static final String eventSchemaVersion = "1.0.0";

    private CARS515Event event;
    private CARS515Event.CARSEventHeader eventHeader;
    private CARS515Event.CARSEventDetail eventDetail;
    private CARS515Event.CARSEventDetail.Participants participants;
    private ObjectFactory objectFactory;

    /**
     * Default constructor
     */
    public CARS515EventDetails() {
        objectFactory = new ObjectFactory();
        event = objectFactory.createCARS515Event();
        eventDetail = objectFactory.createCARS515EventCARSEventDetail();
        eventHeader = objectFactory.createCARS515EventCARSEventHeader();
        participants =  objectFactory.createCARS515EventCARSEventDetailParticipants();
        event.setSchemaVersionNumber(eventSchemaVersion);
    }//CARS515EventDetails()
    

    /**
     * get CARS 515 Event.
     * 
     * @return  CARS515Event
     */
    public CARS515Event getEvent() {
        return event;
    }//getEvent()
    
    /**
     * Sets the header for this event interface object
     * 
     * @param programUnitCode  String
     * @param dataSourceCode   String
     * @param submitBy         String
     * @param submitDate       XMLGregorianCalendar
     */
    public void setEventHeader(String programUnitCode, String dataSourceCode, 
                               String submitBy, XMLGregorianCalendar submitDate) {
        eventHeader.setDataSourceCode(TDataSourceCode.fromValue(dataSourceCode));
        eventHeader.setEventType("515");
        eventHeader.setProgramUnitCode(TProgramUnitCode.fromValue(programUnitCode));
        eventHeader.setSubmitBy(submitBy);
        eventHeader.setSubmitDate(submitDate); 
        event.setCARSEventHeader(eventHeader);
    }//setEventHeader()


    /**
     * Sets the detail for this event interface object
     *  
     * @param amount             BigDecimal
     * @param currentDocument    String
     * @param referenceDocument  String
     * @param eventDate          XMLGregorianCalendar
     */
    public void setEventDetail(BigDecimal amount, String currentDocument,
                               String referenceDocument, XMLGregorianCalendar eventDate) {
        eventDetail.setAmount(amount);
        eventDetail.setRootDocument(referenceDocument);
        eventDetail.setCurrentDocument(currentDocument);
        eventDetail.setReferenceDocument(referenceDocument);
        eventDetail.setAdjustmentTypeCode(TAdjustmentType.RECLASSIFY);
        eventDetail.setParticipants(participants);
        eventDetail.setEventDate(eventDate);  
        event.setCARSEventDetail(eventDetail);
    }//setEventDetail()
    
    /**
     * Sets the accouting code for this event interface object
     * 
     * @param agencySourceCode    String
     * @param revenueSourceCode   String
     * @param indexCode           String
     * @param fund                String
     * @param pcaCode             String
     */
    public void setAccountingCode(String agencySourceCode,
                                  String revenueSourceCode, String indexCode,
                                  String fund, String pcaCode) {
        CARS515Event.CARSEventDetail.AccountingCode accountingCode = 
            objectFactory.createCARS515EventCARSEventDetailAccountingCode();
        accountingCode.setAgencySourceCode(agencySourceCode);
        accountingCode.setFund(fund);
        accountingCode.setRevenueSourceCode(revenueSourceCode);
        accountingCode.setIndexCode(indexCode);
        accountingCode.setPCACode(pcaCode);
        accountingCode.setElement("");
        accountingCode.setFundDetail("");
        accountingCode.setObjectCode("");
        accountingCode.setObjectDetail("");
        accountingCode.setPCAActivity("");
        accountingCode.setProgram("");
        accountingCode.setProjectNumber("");
        accountingCode.setSubject("");
        accountingCode.setWorkPhase("");
        eventDetail.setAccountingCode(accountingCode);
    }//setAccountingCode()

    /**
     * Adds a participant to this event interface object
     * 
     * @param participant  Participant
     */
    public void addParticipant(TParticipant participant) {
        List<TParticipant> lp = participants.getParticipant();
        lp.add(participant);
    }//addParticipant()
    
    /**
     * Sets note for this event interface object
     * 
     * @param note  String
     */
    public void setNote(String note) {
        TNote tNote = new TNote();
        tNote.setNote(note);
        tNote.setNoteTypeCode(TNoteTypeCode.GENERAL);
        eventDetail.setNote(tNote);
    }//setNote()
    
    /**
     * Sets the Header and Detail of the Event object
     */
    public void set(){
        event.setCARSEventHeader(this.eventHeader);
        event.setCARSEventDetail(this.eventDetail);
    }//set()
    
    public static class CARS515EventBuilder{

        private CARS515Event event;
        private CARS515Event.CARSEventHeader eventHeader;
        private CARS515Event.CARSEventDetail eventDetail;
        private static final String eventSchemaVersion = "1.0.0";
        private ObjectFactory objectFactory = new ObjectFactory();
        private TNote tNote;
        private TOrganization organization;
        private TAddress address;
        private TZip zip;
        private TParticipant participant;
        private TParticipant.Party party;
        
        private CARS515Event.CARSEventDetail.AccountingCode accountingCode;
        private CARS515Event.CARSEventDetail.Participants participants
        ;
        
        public CARS515EventBuilder(){
            event = objectFactory.createCARS515Event();
            eventHeader = objectFactory.createCARS515EventCARSEventHeader();
            eventHeader.setEventType("515");
            eventDetail = objectFactory.createCARS515EventCARSEventDetail();
            organization = objectFactory.createTOrganization();
            address = objectFactory.createTAddress();
            zip = objectFactory.createTZip();
            participant = objectFactory.createTParticipant();
            party = objectFactory.createTParticipantParty();
            accountingCode = objectFactory.createCARS515EventCARSEventDetailAccountingCode();
            participants = objectFactory.createCARS515EventCARSEventDetailParticipants();
        }
        
        public CARS515EventBuilder setProgramUnitCode(String programUnitCode){
            this.eventHeader.setProgramUnitCode(TProgramUnitCode.fromValue(programUnitCode));
            return this;
        }
        
        public CARS515EventBuilder setDataSourceCode(String dataSourceCode){
            this.eventHeader.setDataSourceCode(TDataSourceCode.fromValue(dataSourceCode));
            return this;
        }
        
        public CARS515EventBuilder setSubmitBy(String submitBy){
            this.eventHeader.setSubmitBy(submitBy);
            return this;
        }
        
        public CARS515EventBuilder setSubmitDate(XMLGregorianCalendar submitDate){
            this.eventHeader.setSubmitDate(submitDate);
            return this;
        }

        public CARS515EventBuilder setNote(String note){
            tNote = new TNote();
            tNote.setNote(note.trim());
            tNote.setNoteTypeCode(TNoteTypeCode.GENERAL);
            return this;
        }
        
        public CARS515EventBuilder setCurrentDocument(String currentDocument){
            this.eventDetail.setCurrentDocument(currentDocument);
            return this;
        }
        
        public CARS515EventBuilder setReferenceDocument(String referenceDocument){
            this.eventDetail.setReferenceDocument(referenceDocument);
            return this;
        }
        
        public CARS515EventBuilder setArRootDocument(String rootDocument){
            this.eventDetail.setRootDocument(rootDocument);
            return this;
        }
        
        public CARS515EventBuilder setEventDate(XMLGregorianCalendar eventDate){
            this.eventDetail.setEventDate(eventDate);
            return this;
        }
        
        public CARS515EventBuilder setAddressStreetAddress(String streetAddress){
            this.address.setStreetAddress(streetAddress);
            return this;
        }
        
        public CARS515EventBuilder setAddressCity(String city){
            this.address.setCity(city);
            return this;
        }
        
        public CARS515EventBuilder setAddressState(String state){
            this.address.setState(state);
            return this;
        }
        
        public CARS515EventBuilder setAddressZipCode(String zipCode){
            this.zip.setZipCode(zipCode);
            return this;
        }
        
        public CARS515EventBuilder setAddressZip4(String zip4){
            this.zip.setZip4(zip4);
            return this;
        }
        
        public CARS515EventBuilder setOrgDbaName(String dbaName){
            this.organization.setDbaName(dbaName);
            return this;
        }
        
        public CARS515EventBuilder setOrgLegalName(String legalName){
            this.organization.setLegalName(legalName);
            return this;
        }
        
        public CARS515EventBuilder setOrgOrganizationName(String organizationName){
            this.organization.setOrganizationName(organizationName);
            return this;
        }
        
        public CARS515EventBuilder setParticipantCustomerId(String customerId){
            this.participant.setCustomerId(customerId);
            return this;
        }
        
        public CARS515EventBuilder setParticipantParticipantRole(String participantRole){
            this.participant.setParticipantRole(participantRole);
            return this;
        }
        
        public CARS515EventBuilder setParticipantPartyNumber(BigInteger partyNumber){
            this.participant.setPartyNumber(partyNumber);
            return this;
        }
        
        public CARS515EventBuilder setAccountingCodeAgencySourceCode(String agencySourceCode){
            this.accountingCode.setAgencySourceCode(agencySourceCode);
            return this;
        }
        
        public CARS515EventBuilder setAccountingCodeRevenueCode(String revenueSourceCode){
            this.accountingCode.setRevenueSourceCode(revenueSourceCode);
            return this;
        }
        
        public CARS515EventBuilder setAccountingCodeIndexCode(String indexCode){
            this.accountingCode.setIndexCode(indexCode);
            return this;
        }
        
        public CARS515EventBuilder setAmount(BigDecimal amount){
            this.eventDetail.setAmount(amount);
            return this;
        }
        
        public CARS515Event createCARS515Event(){
            event.setCARSEventHeader(eventHeader);
            if(tNote != null){
                this.eventDetail.setNote(tNote);
            }
            
            //this field is static for Event 515s
            this.eventDetail.setAdjustmentTypeCode(TAdjustmentType.RECLASSIFY);
            
            //TZip goes in TAddress
            address.setZipCode(zip);
            //TAddress goes in TOrganization
            organization.setAddress(address);
            //TOrganization goes in TParty
            party.setOrganization(organization);
            //TParty goes in TParticipant
            participant.setParty(party);
            //TParticipant gets added to TParticipants
            participants.getParticipant().add(participant);
            //TParticipants goes in CARS515Event.CARSEventDetail
            this.eventDetail.setParticipants(participants);
            //TAccountingCode goes in CARS515Event.CARSEventDetail
            eventDetail.setAccountingCode(accountingCode);
            event.setCARSEventDetail(eventDetail);
            event.setSchemaVersionNumber(eventSchemaVersion);
            return event;
        }
        
        
    }
    
}
