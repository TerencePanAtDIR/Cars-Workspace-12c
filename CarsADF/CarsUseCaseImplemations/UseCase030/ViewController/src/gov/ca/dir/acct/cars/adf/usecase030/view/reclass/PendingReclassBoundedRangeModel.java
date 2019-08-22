package gov.ca.dir.acct.cars.adf.usecase030.view.reclass;

import gov.ca.dir.acct.cars.adf.usecase030.model.services.ReclassAMImpl;

import gov.ca.dir.acct.cars.adf.usecase030.model.view.CarsRequestViewImpl;
import gov.ca.dir.acct.cars.adf.usecase030.model.view.CarsRequestViewRowImpl;
import gov.ca.dir.acct.cars.adf.usecase030.model.view.EventEventTypeViewImpl;

import oracle.adf.model.BindingContext;
import oracle.adf.model.binding.DCDataControl;

import oracle.jbo.Row;

import org.apache.myfaces.trinidad.model.BoundedRangeModel;

public class PendingReclassBoundedRangeModel extends BoundedRangeModel {
    
    private ReclassAMImpl getApplicationModule(){
        BindingContext bindingContext = BindingContext.getCurrent();
        
        // Name of application module in datacontrolBinding.cpx
        DCDataControl dc  = bindingContext.findDataControl("ReclassAMDataControl");
        return (ReclassAMImpl)dc.getDataProvider();
    }
    
    
    
    @Override
    public long getMaximum(){

        return getApplicationModule().getCarsRequestView1().getCurrentDocument().getSize();
    }
    
    @Override
    public long getValue(){
        
        CarsRequestViewImpl carsRequestViewImpl = 
            getApplicationModule().getCarsRequestView1();
        
        carsRequestViewImpl.executeQuery();
        
        return carsRequestViewImpl.getEstimatedRowCount();
    }

    public long getErrorCount() {
        long i = 0;
        
        Row[] carsRequestViewRows = 
            getApplicationModule().getCarsRequestView1().getAllRowsInRange();
        
        for (Row row : carsRequestViewRows){
            CarsRequestViewRowImpl carsRequestViewRow = (CarsRequestViewRowImpl)row;
            if(carsRequestViewRow.getStatus().equals("E")){
                i++;
            }
        }
        
        return i;
    }
}
