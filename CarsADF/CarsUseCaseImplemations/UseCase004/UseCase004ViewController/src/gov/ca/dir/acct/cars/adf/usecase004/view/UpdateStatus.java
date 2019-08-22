package gov.ca.dir.acct.cars.adf.usecase004.view;

import javax.el.ELContext;

import javax.el.ExpressionFactory;

import javax.el.ValueExpression;

import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.faces.event.ValueChangeEvent;

import oracle.adf.model.BindingContext;
import oracle.adf.model.binding.DCBindingContainer;
import oracle.adf.model.binding.DCIteratorBinding;

import oracle.binding.BindingContainer;

import oracle.jbo.Row;
import oracle.jbo.RowSetIterator;
import oracle.jbo.ViewObject;


public class UpdateStatus {
    public UpdateStatus() {
    }

    public void saveStatusChange(ActionEvent actionEvent) {
        // Add event code here...
        //Get iterator for the DC Collection
        BindingContext bctx = BindingContext.getCurrent();
        BindingContainer bindings = bctx.getCurrentBindingsEntry();
        DCIteratorBinding iter =
            (DCIteratorBinding)bindings.get("RequestErrorLogView1Iterator");

        //get RowSetIterator
        RowSetIterator rows = iter.getRowSetIterator();
        Row[] selectedRows = rows.getFilteredRows("IsReviewed", true);

        while (rows.hasNext()) {
            Row currentRow = rows.next();
            if (selectedRows.length > 0) {
                for (Row row : selectedRows) {
                    if (row.getKey().equals(currentRow.getKey())) {
                        row.setAttribute("Status", "N");
                    }
                }

            }
        }
        iter.executeQuery();
    }

    public void isReviewedCheckedListener(ValueChangeEvent valueChangeEvent) {
        // Add event code here...
        String _oldval;
        BindingContext bctx = BindingContext.getCurrent();
        BindingContainer bindings = bctx.getCurrentBindingsEntry();
        DCIteratorBinding iter =
            (DCIteratorBinding)bindings.get("RequestErrorLogView1Iterator");
        //get RowSetIterator
        Row row;
        row = iter.getCurrentRow();
        _oldval = (String)row.getAttribute("Status");
        if ((Boolean)valueChangeEvent.getNewValue()) {
            //  row.setAttribute("Status", "N");
        } else {
            //   row.setAttribute("Status", _oldval);
        }
        iter.executeQuery();
    }

    public void selectAllCheckBoxVCL(ValueChangeEvent valueChangeEvent) {

        System.out.println("xdebug c1 : In selectAllChoiceBoxLN with value = " +
                           valueChangeEvent.getNewValue());

        boolean isSelected =
            ((Boolean)valueChangeEvent.getNewValue()).booleanValue();
        DCBindingContainer dcb = (DCBindingContainer)evaluateEL("#{bindings}");
        DCIteratorBinding dciter = dcb.findIteratorBinding("RequestErrorLogView1Iterator");

        ViewObject vo = dciter.getViewObject();
        int i = 0;
        Row row = null;
        vo.reset();
        while (vo.hasNext()) {
            if (i == 0)
                row = vo.first();
            else
                row = vo.next();
            //            System.out.println("Changing row 1: " +
            //              row.getAttribute("Name"));
            System.out.println("xdebug c2: Changing row 2: " +
                               row.getAttribute("IsReviewed"));

            if (isSelected)
                row.setAttribute("IsReviewed", "Y");
            else
                row.setAttribute("IsReviewed", "N");
            i++;
        }
    }

    private static Object evaluateEL(String el) {
        FacesContext facesContext = FacesContext.getCurrentInstance();
        ELContext elContext = facesContext.getELContext();
        ExpressionFactory expressionFactory =
            facesContext.getApplication().getExpressionFactory();
        ValueExpression exp =
            expressionFactory.createValueExpression(elContext, el,
                                                    Object.class);
        return exp.getValue(elContext);
    }
}
