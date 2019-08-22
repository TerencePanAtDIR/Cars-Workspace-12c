package gov.ca.dir.acct.cars.adf.common.code;

import java.sql.CallableStatement;
import java.sql.SQLException;
import java.sql.Types;

import javax.el.ELContext;
import javax.el.ExpressionFactory;
import javax.el.MethodExpression;
import javax.el.ValueExpression;

import javax.faces.application.Application;
import javax.faces.application.FacesMessage;

import javax.faces.context.FacesContext;
import javax.faces.application.FacesMessage.Severity;

import oracle.adf.model.BindingContext;
import oracle.adf.model.binding.DCBindingContainer;
import oracle.adf.share.ADFContext;

import oracle.adf.share.logging.ADFLogger;

import oracle.binding.BindingContainer;

import oracle.jbo.domain.Number;
import oracle.jbo.domain.Date;
import oracle.jbo.server.DBTransaction;
import oracle.jbo.server.DBTransactionImpl;

public class CarsUtils {
    
    private static ADFLogger _logger = 
                    ADFLogger.createADFLogger(CarsUtils.class);
    
    /**Helper Method to Get DCBindingContainer
     * @return BindingContainer
     */
    public static BindingContainer getBindings() {
        return BindingContext.getCurrent().getCurrentBindingsEntry();
    }
    
    /**Helper Method to Get DCBindingContainer
     * @return DCBindingContainer
     */
    public static DCBindingContainer getDcBindings(){
        return (DCBindingContainer)getBindings();
    }
    
    /**Method to Get String from pageFlowScope
     * @param pageFlowScopeName name of page flow scope
     * @return String
     */
     public static String getPageFlowScopeString(String pageFlowScopeName) {
        return (String)ADFContext.getCurrent().getPageFlowScope().get(pageFlowScopeName);
    }    
    
    /**Method to Get oracle.jbo.domain.Number from pageFlowScope
     * @param pageFlowScopeName name of page flow scope
     * @return oracle.jbo.domain.Number
     */
    //Get Number from pageFlowScope
     public static Number getPageFlowScopeNumber(String pageFlowScopeName) {
        return (Number)ADFContext.getCurrent().getPageFlowScope().get(pageFlowScopeName);
    }

    /**Method to Get oracle.jbo.domain.Date from pageFlowScope
     * @param pageFlowScopeName name of page flow scope
     * @return oracle.jbo.domain.Date
     */
     public static Date getPageFlowScopeDate(String pageFlowScopeName) {
        return (Date)ADFContext.getCurrent().getPageFlowScope().get(pageFlowScopeName);
    }

    /**Method to show info severity dialog with one argument
     * @param infoMsg error message
     */
    public static void showInfoDialog(String infoMsg){
        showFacesMessageDialog("Info Popup", FacesMessage.SEVERITY_INFO, infoMsg);
    }

    /**Method to show warning severity dialog with one argument
     * @param warningMsg error message
     */
    public static void showWarningDialog(String warningMsg){
        showFacesMessageDialog("Warnig Popup", FacesMessage.SEVERITY_WARN, warningMsg);
    }
    
    /**Method to show error severity dialog with one argument
     * @param errorMsg error message
     */
    public static void showErrorDialog(String errorMsg){
        showFacesMessageDialog("Error Popup", FacesMessage.SEVERITY_ERROR, errorMsg);
    }
    
    /**Method to show fatal severity dialog with one argument
     * @param fatalMsg error message
     */
    public static void showFatalDialog(String fatalMsg){
        showFacesMessageDialog("Fatal Popup", FacesMessage.SEVERITY_FATAL, fatalMsg);
    }

    /**Method to show severity type dialog with severity argument and error message
     * @param facesSeverity faces severity of error
     * @param facesMsg error message
     */
    public static void showFacesMessageDialog(String msgType, Severity facesSeverity, String facesMsg){
        FacesMessage fm = new FacesMessage(facesSeverity, facesMsg, "");
        FacesContext fctx = FacesContext.getCurrentInstance();
        fctx.addMessage(msgType, fm);
    }

    /**Method to call Database procedure, pass the dbTransaction from the am,
     * if the procedure has an out parameter, the statement and bind vars as 
     * varargs
     * @param dbTransactionImpl
     * @param isOutParameter
     * @param stmt
     * @param bindVars
     * @return
     */
    public static String callStoredProcOut(DBTransactionImpl dbTransactionImpl, 
                                       Boolean isOutParameter, 
                                       String stmt, Object[] bindVars) {
        String outParameter = "";
        
        CallableStatement st = null;
        
        try {
            //Creating sql statement
            st = dbTransactionImpl.createCallableStatement("begin " + stmt + ";end;", 0);

            int paramaterIncrementer = 1;
            
            for (Object bindvar : bindVars ){
                st.setObject(paramaterIncrementer, bindvar);
                paramaterIncrementer = paramaterIncrementer + 1;
            }

            //Register out parameters and their types (In this case procedure has 1 out parameters)
            if (isOutParameter == true){
                st.registerOutParameter(paramaterIncrementer, Types.VARCHAR);
            }

            // Execute the statement
            st.executeUpdate();

            // Print Return Values of out parameters
            if (isOutParameter == true){
                outParameter = st.getString(paramaterIncrementer);
            }

        } catch (SQLException e) {
            _logger.severe(e);

        } finally {
            if (st != null) {
                try {
                    st.close();
                } catch (SQLException e) {
                    _logger.severe(e);
                }
            }
        }
        return outParameter;
    }

    /**Method to call Database procedure, pass the dbTransaction from the am,
     * if the procedure has an out parameter, the statement and bind vars as 
     * varargs
     * @param dbTransaction
     * @param isOutParameter
     * @param stmt
     * @param bindVars
     * @return String
     */
    public static String callStoredProcOut(DBTransaction dbTransaction, 
                                       Boolean isOutParameter, 
                                       String stmt, Object[] bindVars) {
        String outParameter = "";
        
        CallableStatement st = null;
        
        try {
            //Creating sql statement
            st = dbTransaction.createCallableStatement("begin " + stmt + ";end;", 0);

            int paramaterIncrementer = 1;
            
            for (Object bindvar : bindVars ){
                st.setObject(paramaterIncrementer, bindvar);
                paramaterIncrementer = paramaterIncrementer + 1;
            }

            //Register out parameters and their types (In this case procedure has 1 out parameters)
            if (isOutParameter == true){
                st.registerOutParameter(paramaterIncrementer, Types.VARCHAR);
            }

            // Execute the statement
            st.executeUpdate();

            // Print Return Values of out parameters
            if (isOutParameter == true){
                outParameter = st.getString(paramaterIncrementer);
            }

        } catch (SQLException e) {
            _logger.severe(e);

        } finally {
            if (st != null) {
                try {
                    st.close();
                } catch (SQLException e) {
                    _logger.severe(e);
                }
            }
        }
        return outParameter;
    }
    
    /*
    * Code to invoke method expression
    * useful for overriding stuff like selection or query listener and to keep
    * same functionality
    */
    public static Object invokeMethodExpression(
     String expr, Class returnType, Class[] argTypes, Object[] args) {
     FacesContext fc = FacesContext.getCurrentInstance();
     ELContext elctx = fc.getELContext();
     ExpressionFactory elFactory =
     fc.getApplication().getExpressionFactory();
     MethodExpression methodExpr = elFactory.createMethodExpression(
     elctx, expr, returnType, argTypes);
     return methodExpr.invoke(elctx, args);
    }

    public static Object invokeMethodExpression(
     String expr, Class returnType, Class argType, Object argument) {
     return invokeMethodExpression(expr, returnType,
     new Class[]{argType},new Object[]{argument});
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
    
    /**Method to Set String from pageFlowScope
     * @param pageFlowScopeName name of page flow scope, String value to set
     */
     public static void setPageFlowScopeString(String pageFlowScopeName, String value) {
        ADFContext.getCurrent().getPageFlowScope().put(pageFlowScopeName, value);
    }
    
    /**Method to Set oracle.jbo.domain.Number from pageFlowScope
     * @param pageFlowScopeName name of page flow scope, oracle.jbo.domain.Number value to set
     */
     public static void setPageFlowScopeNumber(String pageFlowScopeName, oracle.jbo.domain.Number value) {
        ADFContext.getCurrent().getPageFlowScope().put(pageFlowScopeName, value);
    }
    
    /**Method to Set oracle.jbo.domain.Date from pageFlowScope
     * @param pageFlowScopeName name of page flow scope, oracle.jbo.domain.Date value to set
     */
     public static void setPageFlowScopeDate(String pageFlowScopeName, oracle.jbo.domain.Date value) {
        ADFContext.getCurrent().getPageFlowScope().put(pageFlowScopeName, value);
    }
}
