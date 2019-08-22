package gov.ca.dir.acct.cars.adf.usecase001.view;

import java.util.List;
import java.util.Map;

import javax.el.ELContext;

import javax.el.ExpressionFactory;

import javax.el.MethodExpression;

import javax.el.ValueExpression;

import javax.faces.application.Application;
import javax.faces.context.FacesContext;

import javax.faces.event.ValueChangeEvent;

import oracle.adf.model.BindingContext;
import oracle.adf.model.binding.DCBindingContainer;
import oracle.adf.model.binding.DCIteratorBinding;
import oracle.adf.view.rich.component.rich.RichQuery;
import oracle.adf.view.rich.component.rich.data.RichTable;
import oracle.adf.view.rich.component.rich.input.RichSelectOneChoice;
import oracle.adf.view.rich.context.AdfFacesContext;
import oracle.adf.view.rich.event.QueryEvent;
import oracle.adf.view.rich.event.QueryOperationEvent;

import oracle.adf.view.rich.model.QueryDescriptor;

import oracle.adf.view.rich.model.QueryModel;

import oracle.binding.OperationBinding;

import oracle.jbo.ViewObject;

import oracle.binding.BindingContainer;

import oracle.jbo.uicli.binding.JUCtrlListBinding;

public class QueryOperationBean {
    private RichTable resultTable;
    private String facetName;
    private RichSelectOneChoice preferredUnit;
    private String preferredUnitValue   =   "ANY";
    private RichQuery queryPanel;
    private String currentSearchUnit    =   "All Invoices";
    private String searchDataBindName   =   "SearchAll";
    private String searchCriteriaName   =   "SearchCarsInvoicesCriteriaANY";//   "SearchCarsInvoicesCriteriaCALOSHA";

    public QueryOperationBean() {
    }

    public void setPreferredUnitValue(String preferredUnitValue) {
        this.preferredUnitValue = preferredUnitValue;
    }

    public String getPreferredUnitValue() {
        return preferredUnitValue;
    }
    
    public void setSearchDataBindName(String searchDataBindName) {
        this.searchDataBindName = searchDataBindName;
    }

    public String getSearchDataBindName() {
        return searchDataBindName;
    }

    public void setSearchCriteriaName(String searchCriteriaName) {
        this.searchCriteriaName = searchCriteriaName;
    }

    public String getSearchCriteriaName() {
        return searchCriteriaName;
    }

    public void setCurrentSearchUnit(String currentSearchUnit) {
        this.currentSearchUnit = currentSearchUnit;
    }

    public String getCurrentSearchUnit() {
        return currentSearchUnit;
    }

    public Object invokeMethodExpression(String expr, Class returnType,
                                         Class[] argTypes, Object[] args) {
        FacesContext fc = FacesContext.getCurrentInstance();
        ELContext elctx = fc.getELContext();
        ExpressionFactory elFactory =
            fc.getApplication().getExpressionFactory();
        MethodExpression methodExpr =
            elFactory.createMethodExpression(elctx, expr, returnType,
                                             argTypes);
        return methodExpr.invoke(elctx, args);
    }


    public static Object resolveExpression(String expression) {
        FacesContext facesContext = FacesContext.getCurrentInstance();
        Application app = facesContext.getApplication();

        ExpressionFactory elFactory = app.getExpressionFactory();
        ELContext elctx = facesContext.getELContext();
        ValueExpression valueExpr =
            elFactory.createValueExpression(elctx, expression, Object.class);
        return valueExpr.getValue(elctx);

    }

    public void setResultTable(RichTable resultTable) {
        this.resultTable = resultTable;
    }

    public RichTable getResultTable() {
        return resultTable;
    }

    public void setFacetName(String facetName) {
        this.facetName = facetName;
    }

    public String getFacetName() {
        return facetName;
    }

    public void setPreferredUnit(RichSelectOneChoice preferredUnit) {
        this.preferredUnit = preferredUnit;
    }

    public RichSelectOneChoice getPreferredUnit() {
        return preferredUnit;
    }


    public void setQueryPanel(RichQuery queryPanel) {
        this.queryPanel = queryPanel;
    }

    public RichQuery getQueryPanel() {
        return queryPanel;
    }

    public void preferredUnitChanged(ValueChangeEvent valueChangeEvent) {
        
        if (valueChangeEvent.getNewValue().equals("CALOSHA")){
            preferredUnitValue  =    "CALOSHA";
            searchDataBindName  =    "SearchCALOSHA";
            searchCriteriaName  =    "SearchCarsInvoicesCriteriaCALOSHA";
        } else if (valueChangeEvent.getNewValue().equals("DLSE")){
            preferredUnitValue  =    "DLSE";
            searchDataBindName  =    "SearchDLSE";
            searchCriteriaName  =    "SearchCarsInvoicesCriteriaDLSE";
        } else if (valueChangeEvent.getNewValue().equals("PV")){
            preferredUnitValue  =    "PV";
            searchDataBindName  =    "SearchPV";
            searchCriteriaName  =    "SearchCarsInvoicesCriteriaPV";
        } else if (valueChangeEvent.getNewValue().equals("EV")){
            preferredUnitValue  =    "EV";
            searchDataBindName  =    "SearchEV";
            searchCriteriaName  =    "SearchCarsInvoicesCriteriaEV";
        } else if (valueChangeEvent.getNewValue().equals("ART")){
            preferredUnitValue  =    "ART";
            searchDataBindName  =    "SearchART";
            searchCriteriaName  =    "SearchCarsInvoicesCriteriaART";
        } else if (valueChangeEvent.getNewValue().equals("ANY")){
            preferredUnitValue  =    "ANY";
            searchDataBindName  =    "SearchAll";
            searchCriteriaName  =    "SearchCarsInvoicesCriteriaANY";
        }
        
        QueryModel qm = queryPanel.getModel();
        QueryDescriptor qd = queryPanel.getValue();

        List<QueryDescriptor> systemQueries = qm.getSystemQueries();
        
        for (QueryDescriptor qdesc : systemQueries) {
            if (qdesc.getName().equals(searchCriteriaName)){
                qd = qdesc;
            }
        }
        
        qm.setCurrentDescriptor(qd);
    }
    
    public String viewEvents(){
        BindingContainer bindings = getBindings();
        OperationBinding operationBinding = bindings.getOperationBinding("setCurrentRowWithKeyValue");
        Object result = operationBinding.execute();
        if (!operationBinding.getErrors().isEmpty()) {
            return null;
        }
        return "viewEvents";
    }

    public BindingContainer getBindings() {
        return BindingContext.getCurrent().getCurrentBindingsEntry();
    }
}
