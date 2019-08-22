package gov.ca.dir.acct.cars.webservices.internal.data;

import gov.ca.dir.acct.cars.webservices.internal.types.CARS900Event;
import gov.ca.dir.acct.cars.webservices.internal.types.ObjectFactory;
import gov.ca.dir.acct.cars.webservices.internal.types.common.TDataSourceCode;
import gov.ca.dir.acct.cars.webservices.internal.types.common.TNote;
import gov.ca.dir.acct.cars.webservices.internal.types.common.TNoteTypeCode;
import gov.ca.dir.acct.cars.webservices.internal.types.common.TProgramUnitCode;

import javax.xml.datatype.XMLGregorianCalendar;

public class CARS900EventDetails {
    private static final String eventSchemaVersion = "1.0.0";

    private CARS900Event event;
    private CARS900Event.CARSEventHeader eventHeader;
    private CARS900Event.CARSEventDetail eventDetail;
    private ObjectFactory objectFactory = new ObjectFactory();
    private TNote note;        

    /**
     * Default constructor
     */
    public CARS900EventDetails() {
        objectFactory = new ObjectFactory();
        event = objectFactory.createCARS900Event();
        eventDetail = objectFactory.createCARS900EventCARSEventDetail();
        eventHeader = objectFactory.createCARS900EventCARSEventHeader();
        event.setSchemaVersionNumber(eventSchemaVersion);
    }//CARS900EventDetails()

    /**
     * get CARS 900 Event.
     * 
     * @return  CARS900Event
     */
    public CARS900Event getEvent() {
        return event;
    }//getEvent()

    /**
     * Sets the header for this event interface object
     * 
     * @param programUnitCode  String
     * @param dataSourceCode   String
     * @param submitBy         String
     * @param submitDate       GregorianCalendar
     */
    public void setEventHeader(String programUnitCode, String dataSourceCode, 
                               String submitBy, XMLGregorianCalendar submitDate) {
        eventHeader.setDataSourceCode(TDataSourceCode.fromValue(dataSourceCode));
        eventHeader.setEventType("900");
        eventHeader.setProgramUnitCode(TProgramUnitCode.fromValue(programUnitCode));
        eventHeader.setSubmitBy(submitBy);
        eventHeader.setSubmitDate(submitDate); 
        event.setCARSEventHeader(eventHeader);
    }//setEventHeader()

    /**
     * Sets the detail for this event interface object
     *  
     * @param currentDocument     String
     * @param referenceDocument   String
     * @param rootDocument        String
     * @param eventDate           GregorianCalendar
     */
    public void setEventDetail(String currentDocument,String referenceDocument, 
                               String rootDocument, XMLGregorianCalendar eventDate) {
        if (this.note != null)
            eventDetail.setNote(this.note);
        eventDetail.setCurrentDocument(currentDocument);
        eventDetail.setReferenceDocument(referenceDocument);
        eventDetail.setRootDocument(rootDocument);
        eventDetail.setEventDate(eventDate); 
        event.setCARSEventDetail(eventDetail);
    }//setEventDetail()

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
    
    
    /*
     * Builder class for CARS Event 900 if you prefer
     * 
     */
    public static class CARS900EventBuilder{
        private CARS900Event event;
        private CARS900Event.CARSEventHeader eventHeader;
        private CARS900Event.CARSEventDetail eventDetail;
        private static final String eventSchemaVersion = "1.0.0";
        private ObjectFactory objectFactory = new ObjectFactory();
        private TNote tNote;
        
        public CARS900EventBuilder(){
            event = objectFactory.createCARS900Event();
            eventHeader = objectFactory.createCARS900EventCARSEventHeader();
            eventHeader.setEventType("900");
            eventDetail = objectFactory.createCARS900EventCARSEventDetail();
        }
        
        public CARS900EventBuilder setProgramUnitCode(String programUnitCode){
            this.eventHeader.setProgramUnitCode(TProgramUnitCode.fromValue(programUnitCode));
            return this;
        }
        
        public CARS900EventBuilder setDataSourceCode(String dataSourceCode){
            this.eventHeader.setDataSourceCode(TDataSourceCode.fromValue(dataSourceCode));
            return this;
        }
        
        public CARS900EventBuilder setSubmitBy(String submitBy){
            this.eventHeader.setSubmitBy(submitBy);
            return this;
        }
        
        public CARS900EventBuilder setSubmitDate(XMLGregorianCalendar submitDate){
            this.eventHeader.setSubmitDate(submitDate);
            return this;
        }
        
        public CARS900EventBuilder setNote(String note){
            tNote = new TNote();
            tNote.setNote(note.trim());
            tNote.setNoteTypeCode(TNoteTypeCode.GENERAL);
            //this.eventDetail.setNote(tNote);
            return this;
        }
        
        public CARS900EventBuilder setCurrentDocument(String currentDocument){
            this.eventDetail.setCurrentDocument(currentDocument);
            return this;
        }
        
        public CARS900EventBuilder setReferenceDocument(String referenceDocument){
            this.eventDetail.setReferenceDocument(referenceDocument);
            return this;
        }
        
        public CARS900EventBuilder setArRootDocument(String rootDocument){
            this.eventDetail.setRootDocument(rootDocument);
            return this;
        }
        
        public CARS900EventBuilder setEventDate(XMLGregorianCalendar eventDate){
            this.eventDetail.setEventDate(eventDate);
            return this;
        }
        
        public CARS900Event createCARS900Event(){
            event.setCARSEventHeader(eventHeader);
            if(tNote != null){
                this.eventDetail.setNote(tNote);
            }
            event.setCARSEventDetail(eventDetail);
            event.setSchemaVersionNumber(eventSchemaVersion);
            return event;
        }
    }
}
