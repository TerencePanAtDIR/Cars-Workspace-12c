package gov.ca.dir.acct.cars.adf.usecase030.model.view;

import oracle.jbo.domain.Array;
import oracle.jbo.server.ViewObjectImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Sun May 05 23:20:59 PDT 2019
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class EventEventTypeViewImpl extends ViewObjectImpl {
    /**
     * This is the default constructor (do not remove).
     */
    public EventEventTypeViewImpl() {
    }

    /**
     * Returns the variable value for currentDocument.
     * @return variable value for currentDocument
     */
    public Array getcurrentDocument() {
        return (Array)ensureVariableManager().getVariableValue("currentDocument");
    }

    /**
     * Sets <code>value</code> for variable currentDocument.
     * @param value value to bind as currentDocument
     */
    public void setcurrentDocument(Array value) {
        ensureVariableManager().setVariableValue("currentDocument", value);
    }
}