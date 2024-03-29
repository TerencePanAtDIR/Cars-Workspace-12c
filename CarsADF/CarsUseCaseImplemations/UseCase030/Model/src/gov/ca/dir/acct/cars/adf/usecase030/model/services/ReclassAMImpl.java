package gov.ca.dir.acct.cars.adf.usecase030.model.services;

import gov.ca.dir.acct.cars.adf.usecase030.model.view.CarsRequestViewImpl;
import gov.ca.dir.acct.cars.adf.usecase030.model.view.PendingReclassItemsViewImpl;

import gov.ca.dir.acct.cars.adf.usecase030.model.view.ProcessedReclassEventViewImpl;

import oracle.jbo.server.ApplicationModuleImpl;
import oracle.jbo.server.ViewObjectImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Tue Mar 05 13:23:54 PST 2019
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class ReclassAMImpl extends ApplicationModuleImpl {
    /**
     * This is the default constructor (do not remove).
     */
    public ReclassAMImpl() {
    }

    /**
     * Container's getter for PendingReclassItemsView1.
     * @return PendingReclassItemsView1
     */
    public PendingReclassItemsViewImpl getPendingReclassItemsView1() {
        return (PendingReclassItemsViewImpl)findViewObject("PendingReclassItemsView1");
    }

    /**
     * Container's getter for ProcessedReclassEventView1.
     * @return ProcessedReclassEventView1
     */
    public ProcessedReclassEventViewImpl getProcessedReclassEventView1() {
        return (ProcessedReclassEventViewImpl)findViewObject("ProcessedReclassEventView1");
    }

    /**
     * Container's getter for CarsRequestView1.
     * @return CarsRequestView1
     */
    public CarsRequestViewImpl getCarsRequestView1() {
        return (CarsRequestViewImpl)findViewObject("CarsRequestView1");
    }
}
