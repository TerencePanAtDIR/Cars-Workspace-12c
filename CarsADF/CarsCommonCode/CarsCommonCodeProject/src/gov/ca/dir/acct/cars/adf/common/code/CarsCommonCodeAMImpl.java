package gov.ca.dir.acct.cars.adf.common.code;

import oracle.jbo.server.ApplicationModuleImpl;
import oracle.jbo.server.SequenceImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Wed Jun 26 09:14:13 PDT 2013
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class CarsCommonCodeAMImpl extends ApplicationModuleImpl {
    /**
     * This is the default constructor (do not remove).
     */
    public CarsCommonCodeAMImpl() {
    }
    
    /**
     * Get party id for sequence.
     * @return Number
     */
    public oracle.jbo.domain.Number getEventIDSequence(){
        return (new SequenceImpl("EVENT_ID_SEQ",getDBTransaction())).getSequenceNumber();
    }
}
