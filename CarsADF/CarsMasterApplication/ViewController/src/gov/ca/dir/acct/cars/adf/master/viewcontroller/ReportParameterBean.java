package gov.ca.dir.acct.cars.adf.master.viewcontroller;

import java.text.SimpleDateFormat;

import oracle.adf.view.rich.event.DialogEvent;

import java.util.Map;

import oracle.adf.model.BindingContext;

import oracle.binding.BindingContainer;

import oracle.jbo.Row;
import oracle.jbo.uicli.binding.JUCtrlListBinding;


public class ReportParameterBean {
    private OracleReportBean reportBean = new OracleReportBean("csfmrdy2","8888","/reports/rwservlet");
    
    public ReportParameterBean() {
        reportBean.setReportServerParam(reportBean.RS_PARAM_DESFORMAT, "pdf");
        reportBean.setReportServerParam(reportBean.RS_PARAM_DESTYPE, "cache");
        //reportBean.setReportServerParam(reportBean.RS_PARAM_USERID, "CARSUSR/CARSUSR123@CARSDEV");
        //reportBean.setReportServerParam(reportBean.RS_PARAM_USERID, "carsparam");
        reportBean.setReportNamedParam("carsparam");
    }

    public void okActionListener(DialogEvent dialogEvent) {
        // Add event code here...

        SimpleDateFormat dateFormatter = new SimpleDateFormat("MM/dd/yyyy");
        reportBean.setReportServerParam(reportBean.RS_PARAM_REPORT, "statistics_report.rdf");
        reportBean.setReportParameter("p_sdate", dateFormatter.format(dialogEvent.getComponent().findComponent("bdate").getAttributes().get("value")));
        reportBean.setReportParameter("p_edate", dateFormatter.format(dialogEvent.getComponent().findComponent("edate").getAttributes().get("value")));
        reportBean.openUrlInNewWindow(reportBean.getReportServerURL());
        System.out.println(reportBean.getReportServerURL());
    }
    
    public void okActionListener05(DialogEvent dialogEvent) {
        // Add event code here...

        SimpleDateFormat dateFormatter = new SimpleDateFormat("yyyy/MM/dd");
        reportBean.setReportServerParam(reportBean.RS_PARAM_REPORT, "cars051report.rdf");
        String programUnit = getStringFromSelectOneChoiceComponent(dialogEvent,"ProgramUnitCodeView1","programunit_05","ProgramUnitCode");
        String dataSourceCode = getStringFromSelectOneChoiceComponent(dialogEvent,"DataSourceCodeView1","datasource_05","DataSourceCode");
        reportBean.setReportParameter("p_data_source_code", dataSourceCode);
        reportBean.setReportParameter("p_program_unit", programUnit);
        reportBean.setReportParameter("p_start_date", dateFormatter.format(dialogEvent.getComponent().findComponent("bdate05").getAttributes().get("value")));
        reportBean.setReportParameter("p_end_date", dateFormatter.format(dialogEvent.getComponent().findComponent("edate05").getAttributes().get("value")));
        reportBean.openUrlInNewWindow(reportBean.getReportServerURL());
        System.out.println(reportBean.getReportServerURL());
    }
    
    public void okActionListener05Fiscal(DialogEvent dialogEvent) {
        // Add event code here...

        SimpleDateFormat dateFormatter = new SimpleDateFormat("yyyy/MM/dd");
        reportBean.setReportServerParam(reportBean.RS_PARAM_REPORT, "Cars051report_fiscal.rdf");
        String programUnit = getStringFromSelectOneChoiceComponent(dialogEvent,"ProgramUnitCodeView1","selectOneChoice3","ProgramUnitCode");
        String dataSourceCode = getStringFromSelectOneChoiceComponent(dialogEvent,"DataSourceCodeView1","selectOneChoice4","DataSourceCode");
        reportBean.setReportParameter("p_data_source_code", dataSourceCode);
        if(programUnit != null){
            reportBean.setReportParameter("p_program_unit", programUnit);
        }
        reportBean.setReportParameter("p_start_date", dateFormatter.format(dialogEvent.getComponent().findComponent("inputDate5").getAttributes().get("value")));
        reportBean.setReportParameter("p_end_date", dateFormatter.format(dialogEvent.getComponent().findComponent("inputDate6").getAttributes().get("value")));
        reportBean.openUrlInNewWindow(reportBean.getReportServerURL());
        System.out.println(reportBean.getReportServerURL());
    }
    
    
    public void okActionListener05_2(DialogEvent dialogEvent) {
        // Add event code here...

        SimpleDateFormat dateFormatter = new SimpleDateFormat("yyyy/MM/dd");
        reportBean.setReportServerParam(reportBean.RS_PARAM_REPORT, "cars052report.rdf");
        reportBean.setReportParameter("p_start_date", dateFormatter.format(dialogEvent.getComponent().findComponent("bdate05_2").getAttributes().get("value")));
        reportBean.setReportParameter("p_end_date", dateFormatter.format(dialogEvent.getComponent().findComponent("edate05_2").getAttributes().get("value")));
        reportBean.openUrlInNewWindow(reportBean.getReportServerURL());
        System.out.println(reportBean.getReportServerURL());
    }
    
    public void okActionListener07(DialogEvent dialogEvent) {
        // Add event code here...

        SimpleDateFormat dateFormatter = new SimpleDateFormat("yyyy/MM/dd");
        reportBean.setReportServerParam(reportBean.RS_PARAM_REPORT, "cars071report.rdf");
        String programUnit = getStringFromSelectOneChoiceComponent(dialogEvent,"ProgramUnitCodeView1","programunit_07","ProgramUnitCode");
        String dataSourceCode = getStringFromSelectOneChoiceComponent(dialogEvent,"DataSourceCodeView1","datasource_07","DataSourceCode");
        reportBean.setReportParameter("p_data_source_code", dataSourceCode);
        reportBean.setReportParameter("p_program_unit", programUnit);
        reportBean.setReportParameter("p_start_date", dateFormatter.format(dialogEvent.getComponent().findComponent("bdate07").getAttributes().get("value")));
        reportBean.setReportParameter("p_end_date", dateFormatter.format(dialogEvent.getComponent().findComponent("edate07").getAttributes().get("value")));
        reportBean.openUrlInNewWindow(reportBean.getReportServerURL());
        System.out.println(reportBean.getReportServerURL());
    }
    
    public void okActionListener07Fiscal(DialogEvent dialogEvent) {
        // Add event code here...

        SimpleDateFormat dateFormatter = new SimpleDateFormat("yyyy/MM/dd");
        reportBean.setReportServerParam(reportBean.RS_PARAM_REPORT, "cars071report_fiscal.rdf");
        String programUnit = getStringFromSelectOneChoiceComponent(dialogEvent,"ProgramUnitCodeView1","selectOneChoice5","ProgramUnitCode");
        String dataSourceCode = getStringFromSelectOneChoiceComponent(dialogEvent,"DataSourceCodeView1","selectOneChoice6","DataSourceCode");
        reportBean.setReportParameter("p_data_source_code", dataSourceCode);
        if(programUnit != null){
            reportBean.setReportParameter("p_program_unit", programUnit);
        }
        reportBean.setReportParameter("p_start_date", dateFormatter.format(dialogEvent.getComponent().findComponent("inputDate9").getAttributes().get("value")));
        reportBean.setReportParameter("p_end_date", dateFormatter.format(dialogEvent.getComponent().findComponent("inputDate10").getAttributes().get("value")));
        reportBean.openUrlInNewWindow(reportBean.getReportServerURL());
        System.out.println(reportBean.getReportServerURL());
    }
    
    public void okActionListener07_2(DialogEvent dialogEvent) {
        // Add event code here...

        SimpleDateFormat dateFormatter = new SimpleDateFormat("yyyy/MM/dd");
        reportBean.setReportServerParam(reportBean.RS_PARAM_REPORT, "cars072report.rdf");
        reportBean.setReportParameter("p_start_date", dateFormatter.format(dialogEvent.getComponent().findComponent("bdate07_2").getAttributes().get("value")));
        reportBean.setReportParameter("p_end_date", dateFormatter.format(dialogEvent.getComponent().findComponent("edate07_2").getAttributes().get("value")));
        reportBean.openUrlInNewWindow(reportBean.getReportServerURL());
        System.out.println(reportBean.getReportServerURL());
    }
    
    public void okActionListener09(DialogEvent dialogEvent) {
        // Add event code here...

        SimpleDateFormat dateFormatter = new SimpleDateFormat("yyyy/MM/dd");
        reportBean.setReportServerParam(reportBean.RS_PARAM_REPORT, "cars091report.rdf");
        String programUnit = getStringFromSelectOneChoiceComponent(dialogEvent,"ProgramUnitCodeView1","programunit_09","ProgramUnitCode");
        String dataSourceCode = getStringFromSelectOneChoiceComponent(dialogEvent,"DataSourceCodeView1","datasource_09","DataSourceCode");
        reportBean.setReportParameter("p_data_source_code", dataSourceCode);
        reportBean.setReportParameter("p_program_unit", programUnit);
        reportBean.setReportParameter("p_start_date", dateFormatter.format(dialogEvent.getComponent().findComponent("bdate09").getAttributes().get("value")));
        reportBean.setReportParameter("p_end_date", dateFormatter.format(dialogEvent.getComponent().findComponent("edate09").getAttributes().get("value")));
        reportBean.openUrlInNewWindow(reportBean.getReportServerURL());
        System.out.println(reportBean.getReportServerURL());
    }
    
    public void okActionListener09Fiscal(DialogEvent dialogEvent) {
        // Add event code here...

        SimpleDateFormat dateFormatter = new SimpleDateFormat("yyyy/MM/dd");
        reportBean.setReportServerParam(reportBean.RS_PARAM_REPORT, "Cars091report_fiscal.rdf");
        String programUnit = getStringFromSelectOneChoiceComponent(dialogEvent,"ProgramUnitCodeView1","selectOneChoice7","ProgramUnitCode");
        String dataSourceCode = getStringFromSelectOneChoiceComponent(dialogEvent,"DataSourceCodeView1","selectOneChoice8","DataSourceCode");
        reportBean.setReportParameter("p_data_source_code", dataSourceCode);
        if(programUnit != null){
            reportBean.setReportParameter("p_program_unit", programUnit);
        }
        reportBean.setReportParameter("p_start_date", dateFormatter.format(dialogEvent.getComponent().findComponent("inputDate13").getAttributes().get("value")));
        reportBean.setReportParameter("p_end_date", dateFormatter.format(dialogEvent.getComponent().findComponent("inputDate14").getAttributes().get("value")));
        reportBean.openUrlInNewWindow(reportBean.getReportServerURL());
        System.out.println(reportBean.getReportServerURL());
    }
    
    public void okActionListener09_2(DialogEvent dialogEvent) {
        // Add event code here...

        SimpleDateFormat dateFormatter = new SimpleDateFormat("yyyy/MM/dd");
        reportBean.setReportServerParam(reportBean.RS_PARAM_REPORT, "cars092report.rdf");
        reportBean.setReportParameter("p_start_date", dateFormatter.format(dialogEvent.getComponent().findComponent("bdate09_2").getAttributes().get("value")));
        reportBean.setReportParameter("p_end_date", dateFormatter.format(dialogEvent.getComponent().findComponent("edate09_2").getAttributes().get("value")));
        reportBean.openUrlInNewWindow(reportBean.getReportServerURL());
        System.out.println(reportBean.getReportServerURL());
    }
    
    public void okActionListener02_1_1(DialogEvent dialogEvent) {
        // Add event code here...

        SimpleDateFormat dateFormatter = new SimpleDateFormat("yyyy/MM/dd");
        reportBean.setReportServerParam(reportBean.RS_PARAM_REPORT, "cars211report.rdf");
        String programUnit = getStringFromSelectOneChoiceComponent(dialogEvent,"ProgramUnitCodeView1","programunit_02_1_1","ProgramUnitCode");
        String dataSourceCode = getStringFromSelectOneChoiceComponent(dialogEvent,"DataSourceCodeView1","datasource_02_1_1","DataSourceCode");
        reportBean.setReportParameter("p_data_source_code", dataSourceCode);
        reportBean.setReportParameter("p_program_unit", programUnit);
        reportBean.setReportParameter("p_start_date", dateFormatter.format(dialogEvent.getComponent().findComponent("bdate02_1_1").getAttributes().get("value")));
        reportBean.setReportParameter("p_end_date", dateFormatter.format(dialogEvent.getComponent().findComponent("edate02_1_1").getAttributes().get("value")));
        reportBean.openUrlInNewWindow(reportBean.getReportServerURL());
        System.out.println(reportBean.getReportServerURL());
    }
    

    public void okActionListener02_1_2(DialogEvent dialogEvent) {
        // Add event code here...

        SimpleDateFormat dateFormatter = new SimpleDateFormat("yyyy/MM/dd");
        reportBean.setReportServerParam(reportBean.RS_PARAM_REPORT, "cars212report.rdf");
        String programUnit = getStringFromSelectOneChoiceComponent(dialogEvent,"ProgramUnitCodeView1","programunit_02_1_2","ProgramUnitCode");
        String dataSourceCode = getStringFromSelectOneChoiceComponent(dialogEvent,"DataSourceCodeView1","datasource_02_1_2","DataSourceCode");
        reportBean.setReportParameter("p_data_source_code", dataSourceCode);
        reportBean.setReportParameter("p_program_unit", programUnit);
        reportBean.setReportParameter("p_start_date", dateFormatter.format(dialogEvent.getComponent().findComponent("bdate02_1_2").getAttributes().get("value")));
        reportBean.setReportParameter("p_end_date", dateFormatter.format(dialogEvent.getComponent().findComponent("edate02_1_2").getAttributes().get("value")));
        reportBean.openUrlInNewWindow(reportBean.getReportServerURL());
        System.out.println(reportBean.getReportServerURL());
    }
    
    public void okActionListener02_1_3(DialogEvent dialogEvent) {
        // Add event code here...

        SimpleDateFormat dateFormatter = new SimpleDateFormat("yyyy/MM/dd");
        reportBean.setReportServerParam(reportBean.RS_PARAM_REPORT, "cars213report.rdf");
        String programUnit = getStringFromSelectOneChoiceComponent(dialogEvent,"ProgramUnitCodeView1","programunit_02_1_3","ProgramUnitCode");
        String dataSourceCode = getStringFromSelectOneChoiceComponent(dialogEvent,"DataSourceCodeView1","datasource_02_1_3","DataSourceCode");
        reportBean.setReportParameter("p_data_source_code", dataSourceCode);
        reportBean.setReportParameter("p_program_unit", programUnit);
        reportBean.setReportParameter("p_start_date", dateFormatter.format(dialogEvent.getComponent().findComponent("bdate02_1_3").getAttributes().get("value")));
        reportBean.setReportParameter("p_end_date", dateFormatter.format(dialogEvent.getComponent().findComponent("edate02_1_3").getAttributes().get("value")));
        reportBean.openUrlInNewWindow(reportBean.getReportServerURL());
        System.out.println(reportBean.getReportServerURL());
    }
    
    public void okActionListener02_2_1(DialogEvent dialogEvent) {
        // Add event code here...

        SimpleDateFormat dateFormatter = new SimpleDateFormat("yyyy/MM/dd");
        reportBean.setReportServerParam(reportBean.RS_PARAM_REPORT, "cars221report.rdf");
        String programUnit = getStringFromSelectOneChoiceComponent(dialogEvent,"ProgramUnitCodeView1","programunit_02_2_1","ProgramUnitCode");
        String dataSourceCode = getStringFromSelectOneChoiceComponent(dialogEvent,"DataSourceCodeView1","datasource_02_2_1","DataSourceCode");
        reportBean.setReportParameter("p_data_source", dataSourceCode);
        reportBean.setReportParameter("p_program_unit", programUnit);
        reportBean.setReportParameter("p_start_date", dateFormatter.format(dialogEvent.getComponent().findComponent("bdate02_2_1").getAttributes().get("value")));
        reportBean.setReportParameter("p_end_date", dateFormatter.format(dialogEvent.getComponent().findComponent("edate02_2_1").getAttributes().get("value")));
        reportBean.openUrlInNewWindow(reportBean.getReportServerURL());
        System.out.println(reportBean.getReportServerURL());
    }
    

    public void okActionListener02_2_2(DialogEvent dialogEvent) {
        // Add event code here...

        SimpleDateFormat dateFormatter = new SimpleDateFormat("yyyy/MM/dd");
        reportBean.setReportServerParam(reportBean.RS_PARAM_REPORT, "cars222report.rdf");
        String programUnit = getStringFromSelectOneChoiceComponent(dialogEvent,"ProgramUnitCodeView1","programunit_02_2_2","ProgramUnitCode");
        String dataSourceCode = getStringFromSelectOneChoiceComponent(dialogEvent,"DataSourceCodeView1","datasource_02_2_2","DataSourceCode");
        reportBean.setReportParameter("p_data_source", dataSourceCode);
        reportBean.setReportParameter("p_program_unit", programUnit);
        reportBean.setReportParameter("p_start_date", dateFormatter.format(dialogEvent.getComponent().findComponent("bdate02_2_2").getAttributes().get("value")));
        reportBean.setReportParameter("p_end_date", dateFormatter.format(dialogEvent.getComponent().findComponent("edate02_2_2").getAttributes().get("value")));
        reportBean.openUrlInNewWindow(reportBean.getReportServerURL());
        System.out.println(reportBean.getReportServerURL());
    }
    
    public void okActionListener02_2_3(DialogEvent dialogEvent) {
        // Add event code here...

        SimpleDateFormat dateFormatter = new SimpleDateFormat("yyyy/MM/dd");
        reportBean.setReportServerParam(reportBean.RS_PARAM_REPORT, "cars223report.rdf");
        String programUnit = getStringFromSelectOneChoiceComponent(dialogEvent,"ProgramUnitCodeView1","programunit_02_2_3","ProgramUnitCode");
        String dataSourceCode = getStringFromSelectOneChoiceComponent(dialogEvent,"DataSourceCodeView1","datasource_02_2_3","DataSourceCode");
        reportBean.setReportParameter("p_data_source", dataSourceCode);
        reportBean.setReportParameter("p_program_unit", programUnit);
        reportBean.setReportParameter("p_start_date", dateFormatter.format(dialogEvent.getComponent().findComponent("bdate02_2_3").getAttributes().get("value")));
        reportBean.setReportParameter("p_end_date", dateFormatter.format(dialogEvent.getComponent().findComponent("edate02_2_3").getAttributes().get("value")));
        reportBean.openUrlInNewWindow(reportBean.getReportServerURL());
        System.out.println(reportBean.getReportServerURL());
    }
    
    
    public void okActionListener02_4(DialogEvent dialogEvent) {
        // Add event code here...

        SimpleDateFormat dateFormatter = new SimpleDateFormat("yyyy/MM/dd");
        reportBean.setReportServerParam(reportBean.RS_PARAM_REPORT, "cars24report.rdf");
        reportBean.setReportParameter("p_start_date", dateFormatter.format(dialogEvent.getComponent().findComponent("bdate02_4").getAttributes().get("value")));
        reportBean.setReportParameter("p_end_date", dateFormatter.format(dialogEvent.getComponent().findComponent("edate02_4").getAttributes().get("value")));
        reportBean.openUrlInNewWindow(reportBean.getReportServerURL());
        System.out.println(reportBean.getReportServerURL());
    }
    
    
    public void okActionListener02(DialogEvent dialogEvent) {
        // Add event code here...

        SimpleDateFormat dateFormatter = new SimpleDateFormat("yyyy/MM/dd");
        reportBean.setReportServerParam(reportBean.RS_PARAM_REPORT, "Cars02report.rdf");
        String programUnit = getStringFromSelectOneChoiceComponent(dialogEvent,"ProgramUnitCodeView1","programunit_02","ProgramUnitCode");
        String dataSourceCode = getStringFromSelectOneChoiceComponent(dialogEvent,"DataSourceCodeView1","datasource_02","DataSourceCode");
        reportBean.setReportParameter("p_data_source_code", dataSourceCode);
        reportBean.setReportParameter("p_program_unit", programUnit);
        reportBean.setReportParameter("p_start_date", dateFormatter.format(dialogEvent.getComponent().findComponent("bdate02").getAttributes().get("value")));
        reportBean.setReportParameter("p_end_date", dateFormatter.format(dialogEvent.getComponent().findComponent("edate02").getAttributes().get("value")));
        reportBean.openUrlInNewWindow(reportBean.getReportServerURL());
        System.out.println(reportBean.getReportServerURL());
    }
    
    public void okActionListener02Fiscal(DialogEvent dialogEvent) {
        // Add event code here...

        SimpleDateFormat dateFormatter = new SimpleDateFormat("yyyy/MM/dd");
        reportBean.setReportServerParam(reportBean.RS_PARAM_REPORT, "Cars02report_fiscal.rdf");
        String programUnit = getStringFromSelectOneChoiceComponent(dialogEvent,"ProgramUnitCodeView1","selectOneChoice1","ProgramUnitCode");
        String dataSourceCode = getStringFromSelectOneChoiceComponent(dialogEvent,"DataSourceCodeView1","selectOneChoice2","DataSourceCode");
        reportBean.setReportParameter("p_data_source_code", dataSourceCode);
        if(programUnit != null){
            reportBean.setReportParameter("p_program_unit", programUnit);
        }
        reportBean.setReportParameter("p_start_date", dateFormatter.format(dialogEvent.getComponent().findComponent("inputDate3").getAttributes().get("value")));
        reportBean.setReportParameter("p_end_date", dateFormatter.format(dialogEvent.getComponent().findComponent("inputDate4").getAttributes().get("value")));
        reportBean.openUrlInNewWindow(reportBean.getReportServerURL());
        System.out.println(reportBean.getReportServerURL());
    }
    /**
     * Helper method to convert List component to return the actual selected text instead of index.
     * @param dialogEvent - DialogEvent object
     * @param bindingName - the name of the List Binding in the form
     * @param componentName - the name of the List Component
     * @param attributeName - the name of the Attribute where the Index must resolve to desired return values
     * @return
     */
    private String getStringFromSelectOneChoiceComponent(DialogEvent dialogEvent, String bindingName, String componentName, String attributeName) {
        BindingContainer bindings = BindingContext.getCurrent().getCurrentBindingsEntry();
        JUCtrlListBinding list = (JUCtrlListBinding) bindings.get(bindingName); 
        list.getDisplayData();
        String selectedValue = (String) list.getValueFromList(Integer.parseInt(dialogEvent.getComponent().findComponent(componentName).getAttributes().get("value").toString()));
        return selectedValue;
    }
    
    
}
