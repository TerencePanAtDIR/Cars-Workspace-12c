package gov.ca.dir.acct.cars.adf.usecase030.model.view;

import java.math.BigDecimal;

import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Sun May 05 23:20:59 PDT 2019
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class EventEventTypeViewRowImpl extends ViewRowImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        ArRootDocument {
            public Object get(EventEventTypeViewRowImpl obj) {
                return obj.getArRootDocument();
            }

            public void put(EventEventTypeViewRowImpl obj, Object value) {
                obj.setArRootDocument((String)value);
            }
        }
        ,
        EventId {
            public Object get(EventEventTypeViewRowImpl obj) {
                return obj.getEventId();
            }

            public void put(EventEventTypeViewRowImpl obj, Object value) {
                obj.setEventId((BigDecimal)value);
            }
        }
        ,
        CurrentDocument {
            public Object get(EventEventTypeViewRowImpl obj) {
                return obj.getCurrentDocument();
            }

            public void put(EventEventTypeViewRowImpl obj, Object value) {
                obj.setCurrentDocument((String)value);
            }
        }
        ,
        ReferenceDocument {
            public Object get(EventEventTypeViewRowImpl obj) {
                return obj.getReferenceDocument();
            }

            public void put(EventEventTypeViewRowImpl obj, Object value) {
                obj.setReferenceDocument((String)value);
            }
        }
        ,
        EventTypeCode {
            public Object get(EventEventTypeViewRowImpl obj) {
                return obj.getEventTypeCode();
            }

            public void put(EventEventTypeViewRowImpl obj, Object value) {
                obj.setEventTypeCode((String)value);
            }
        }
        ,
        EventTypeId {
            public Object get(EventEventTypeViewRowImpl obj) {
                return obj.getEventTypeId();
            }

            public void put(EventEventTypeViewRowImpl obj, Object value) {
                obj.setEventTypeId((BigDecimal)value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static final int firstIndex = 0;

        public abstract Object get(EventEventTypeViewRowImpl object);

        public abstract void put(EventEventTypeViewRowImpl object,
                                 Object value);

        public int index() {
            return AttributesEnum.firstIndex() + ordinal();
        }

        public static final int firstIndex() {
            return firstIndex;
        }

        public static int count() {
            return AttributesEnum.firstIndex() + AttributesEnum.staticValues().length;
        }

        public static final AttributesEnum[] staticValues() {
            if (vals == null) {
                vals = AttributesEnum.values();
            }
            return vals;
        }
    }
    public static final int ARROOTDOCUMENT = AttributesEnum.ArRootDocument.index();
    public static final int EVENTID = AttributesEnum.EventId.index();
    public static final int CURRENTDOCUMENT = AttributesEnum.CurrentDocument.index();
    public static final int REFERENCEDOCUMENT = AttributesEnum.ReferenceDocument.index();
    public static final int EVENTTYPECODE = AttributesEnum.EventTypeCode.index();
    public static final int EVENTTYPEID = AttributesEnum.EventTypeId.index();

    /**
     * This is the default constructor (do not remove).
     */
    public EventEventTypeViewRowImpl() {
    }

    /**
     * Gets Event entity object.
     * @return the Event
     */
    public EntityImpl getEvent() {
        return (EntityImpl)getEntity(0);
    }

    /**
     * Gets EventType entity object.
     * @return the EventType
     */
    public EntityImpl getEventType() {
        return (EntityImpl)getEntity(1);
    }

    /**
     * Gets the attribute value for AR_ROOT_DOCUMENT using the alias name ArRootDocument.
     * @return the AR_ROOT_DOCUMENT
     */
    public String getArRootDocument() {
        return (String) getAttributeInternal(ARROOTDOCUMENT);
    }

    /**
     * Sets <code>value</code> as attribute value for AR_ROOT_DOCUMENT using the alias name ArRootDocument.
     * @param value value to set the AR_ROOT_DOCUMENT
     */
    public void setArRootDocument(String value) {
        setAttributeInternal(ARROOTDOCUMENT, value);
    }

    /**
     * Gets the attribute value for EVENT_ID using the alias name EventId.
     * @return the EVENT_ID
     */
    public BigDecimal getEventId() {
        return (BigDecimal) getAttributeInternal(EVENTID);
    }

    /**
     * Sets <code>value</code> as attribute value for EVENT_ID using the alias name EventId.
     * @param value value to set the EVENT_ID
     */
    public void setEventId(BigDecimal value) {
        setAttributeInternal(EVENTID, value);
    }

    /**
     * Gets the attribute value for CURRENT_DOCUMENT using the alias name CurrentDocument.
     * @return the CURRENT_DOCUMENT
     */
    public String getCurrentDocument() {
        return (String) getAttributeInternal(CURRENTDOCUMENT);
    }

    /**
     * Sets <code>value</code> as attribute value for CURRENT_DOCUMENT using the alias name CurrentDocument.
     * @param value value to set the CURRENT_DOCUMENT
     */
    public void setCurrentDocument(String value) {
        setAttributeInternal(CURRENTDOCUMENT, value);
    }

    /**
     * Gets the attribute value for REFERENCE_DOCUMENT using the alias name ReferenceDocument.
     * @return the REFERENCE_DOCUMENT
     */
    public String getReferenceDocument() {
        return (String) getAttributeInternal(REFERENCEDOCUMENT);
    }

    /**
     * Sets <code>value</code> as attribute value for REFERENCE_DOCUMENT using the alias name ReferenceDocument.
     * @param value value to set the REFERENCE_DOCUMENT
     */
    public void setReferenceDocument(String value) {
        setAttributeInternal(REFERENCEDOCUMENT, value);
    }

    /**
     * Gets the attribute value for EVENT_TYPE_CODE using the alias name EventTypeCode.
     * @return the EVENT_TYPE_CODE
     */
    public String getEventTypeCode() {
        return (String) getAttributeInternal(EVENTTYPECODE);
    }

    /**
     * Sets <code>value</code> as attribute value for EVENT_TYPE_CODE using the alias name EventTypeCode.
     * @param value value to set the EVENT_TYPE_CODE
     */
    public void setEventTypeCode(String value) {
        setAttributeInternal(EVENTTYPECODE, value);
    }

    /**
     * Gets the attribute value for EVENT_TYPE_ID using the alias name EventTypeId.
     * @return the EVENT_TYPE_ID
     */
    public BigDecimal getEventTypeId() {
        return (BigDecimal) getAttributeInternal(EVENTTYPEID);
    }

    /**
     * Sets <code>value</code> as attribute value for EVENT_TYPE_ID using the alias name EventTypeId.
     * @param value value to set the EVENT_TYPE_ID
     */
    public void setEventTypeId(BigDecimal value) {
        setAttributeInternal(EVENTTYPEID, value);
    }

    /**
     * getAttrInvokeAccessor: generated method. Do not modify.
     * @param index the index identifying the attribute
     * @param attrDef the attribute

     * @return the attribute value
     * @throws Exception
     */
    protected Object getAttrInvokeAccessor(int index,
                                           AttributeDefImpl attrDef) throws Exception {
        if ((index >= AttributesEnum.firstIndex()) && (index < AttributesEnum.count())) {
            return AttributesEnum.staticValues()[index - AttributesEnum.firstIndex()].get(this);
        }
        return super.getAttrInvokeAccessor(index, attrDef);
    }

    /**
     * setAttrInvokeAccessor: generated method. Do not modify.
     * @param index the index identifying the attribute
     * @param value the value to assign to the attribute
     * @param attrDef the attribute

     * @throws Exception
     */
    protected void setAttrInvokeAccessor(int index, Object value,
                                         AttributeDefImpl attrDef) throws Exception {
        if ((index >= AttributesEnum.firstIndex()) && (index < AttributesEnum.count())) {
            AttributesEnum.staticValues()[index - AttributesEnum.firstIndex()].put(this, value);
            return;
        }
        super.setAttrInvokeAccessor(index, value, attrDef);
    }
}
