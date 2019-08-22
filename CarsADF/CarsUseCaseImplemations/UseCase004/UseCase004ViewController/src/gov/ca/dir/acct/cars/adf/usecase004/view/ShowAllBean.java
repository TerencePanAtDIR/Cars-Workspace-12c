package gov.ca.dir.acct.cars.adf.usecase004.view;

import java.util.Map;

import javax.el.ELContext;
import javax.el.ExpressionFactory;
import javax.el.ValueExpression;

import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.faces.event.ValueChangeEvent;

import oracle.adf.model.BindingContext;
import oracle.adf.model.binding.DCBindingContainer;

import oracle.binding.BindingContainer;
import oracle.binding.OperationBinding;


public class ShowAllBean {
    public ShowAllBean() {
    }

    public void showAllCheckBoxChangeListener(ValueChangeEvent valueChangeEvent) {
        // Add event code here...
        BindingContainer bc =
            BindingContext.getCurrent().getCurrentBindingsEntry();
        OperationBinding op = bc.getOperationBinding("setCriteriaParams");
        Map omap = op.getParamsMap();
        String selected = valueChangeEvent.getNewValue().toString();
        System.out.println("xdebug, selected value: "+selected);
        if (selected.compareTo("A")==0) {
            omap.put("varStatus", null);
            omap.put("varIsReviewed", null);
        } else {
            omap.put("varStatus", "P");
            omap.put("varIsReviewed", "N");
        }
        Object result = op.execute();
    }




}
