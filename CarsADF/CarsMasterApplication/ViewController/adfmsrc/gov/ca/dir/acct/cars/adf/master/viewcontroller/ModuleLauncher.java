package gov.ca.dir.acct.cars.adf.master.viewcontroller;

import javax.faces.event.ActionEvent;

import oracle.ui.pattern.dynamicShell.TabContext;
import gov.ca.dir.acct.cars.adf.master.viewcontroller.dynamicWorkspaceRegion;

import oracle.adf.controller.TaskFlowId;


public class ModuleLauncher {
    private dynamicWorkspaceRegion dwr = new dynamicWorkspaceRegion();
    private String taskFlowId;// = "/WEB-INF/test-module-1-tf.xml#test-module-1-tf";

    public void multipleInstanceActivity(ActionEvent actionEvent) {
        /**
    * Example method when called repeatedly, will open another instance as
    * oppose to selecting a previously opened tab instance. Note the boolean
    * to create another tab instance is set to true.
    */

        _launchActivity("A New Activity", "/WEB-INF/flows/new.xml#new", true);
    }

    
  public void launchInfarBatchSearch(ActionEvent actionEvent){
  //UseCase008
  _launchActivity("FISCAL Batch Search",
                  "/WEB-INF/Batch-tf.xml#Batch-tf",
                  false);
  }
  
  public void launchCustomerSearch(ActionEvent actionEvent){
  //UseCase008
  _launchActivity("Customer Search",
                  "/WEB-INF/Customer-Search-tf.xml#Customer-Search-tf",
                  false);
  }

    public void launchARSearchPage(ActionEvent actionEvent) {
        /**
      * Example method to call a single instance task flow. Note the boolean
      * to create another tab instance is set to false. The taskflow ID is used
      * to track whether to create a new tab or select an existing one.
      */
        _launchActivity("Search ARs",
                        "/WEB-INF/CarsArSearch.xml#CarsArSearch",
                        false);
    }
    
    public void launchEventsSearchPage(ActionEvent actionEvent) {
        /**
      * Example method to call a single instance task flow. Note the boolean
      * to create another tab instance is set to false. The taskflow ID is used
      * to track whether to create a new tab or select an existing one.
      */
        _launchActivity("Search Events",
                        "/WEB-INF/CarsEventSearchFlow.xml#CarsEventSearchFlow",
                        true);
    }

    public void launchCalstarsBatch(ActionEvent actionEvent) {
        /**
      * Example method to call a single instance task flow. Note the boolean
      * to create another tab instance is set to false. The taskflow ID is used
      * to track whether to create a new tab or select an existing one.
      */
/*
        _launchActivity("CALSTARS Batch",
                        "/WEB-INF/CalstarsBatch.xml#CalstarsBatch",
                        true);
*/
                _launchActivity("CALSTARS Batch",
                        "/WEB-INF/CalstarsBatch.xml#CalstarsBatch",
                        true);
    }
    
    
    public void launchInboundTransactionsMgnt(ActionEvent actionEvent) {
        /**
      * Example method to call a single instance task flow. Note the boolean
      * to create another tab instance is set to false. The taskflow ID is used
      * to track whether to create a new tab or select an existing one.
      */
         _launchActivity("Inbound Transaction Manager",
                        "/WEB-INF/InboundTransactionMgntFlow.xml#InboundTransactionMgntFlow",
                        false); 
    }

    //#{backingBeanScope.moduleLauncher.launchReclassCarsEvents}
    public void launchReverseDeleteCarsEvents(ActionEvent actionEvent) {
        /**
      * Example method to call a single instance task flow. Note the boolean
      * to create another tab instance is set to false. The taskflow ID is used
      * to track whether to create a new tab or select an existing one.
      */
         _launchActivity("Reverse CARS Events",
                        "/WEB-INF/reverse-cars-events.xml#reverse-cars-events",
                        false); 
    }
    
    public void launchReclassCarsEvents(ActionEvent actionEvent) {
        /**
      * Example method to call a single instance task flow. Note the boolean
      * to create another tab instance is set to false. The taskflow ID is used
      * to track whether to create a new tab or select an existing one.
      */
         _launchActivity("Reclass CARS Events",
                        "/WEB-INF/cars-reclass-events.xml#cars-reclass-events",
                        false); 
    }  
    
    public void launchGenericActivity(ActionEvent actionEvent) {
        /**
      * Example method to call a single instance task flow. Note the boolean
      * to create another tab instance is set to false. The taskflow ID is used
      * to track whether to create a new tab or select an existing one.
      */
        _launchActivity("Reconcile AR",
                        "/WEB-INF/Flows/generic-tf.xml#generic-tf",
                        true);
    }

   
    
    /******Reports Caller Begin*****************/
     public void launchCars01Report(ActionEvent actionEvent) {
         /**
       * Example method to call a single instance task flow. Note the boolean
       * to create another tab instance is set to false. The taskflow ID is used
       * to track whether to create a new tab or select an existing one.
       */
          _launchActivity("AR Setups Details",
                         "/WEB-INF/cars01report-tf.xml#cars01report-tf",
                         false); 
     }
    
    public void launchCars01fiscalReport(ActionEvent actionEvent) {
      /**
    * Example method to call a single instance task flow. Note the boolean
    * to create another tab instance is set to false. The taskflow ID is used
    * to track whether to create a new tab or select an existing one.
    */
       _launchActivity("AR Setups Details",
                      "/WEB-INF/cars01reportfiscal-tf.xml#cars01reportfiscal-tf",
                      false); 
    }
    
     public void launchCars03Report(ActionEvent actionEvent) {
         /**
       * Example method to call a single instance task flow. Note the boolean
       * to create another tab instance is set to false. The taskflow ID is used
       * to track whether to create a new tab or select an existing one.
       */
          _launchActivity("AR Amendment and Adjustment",
                         "/WEB-INF/cars03report-tf.xml#cars03report-tf",
                         false); 
     }
     
     public void launchCars03FiscalReport(ActionEvent actionEvent) {
         /**
       * Example method to call a single instance task flow. Note the boolean
       * to create another tab instance is set to false. The taskflow ID is used
       * to track whether to create a new tab or select an existing one.
       */
          _launchActivity("AR Amendment and Adjustment",
                         "/WEB-INF/cars03Report4Fiscal-tf.xml#cars03Report4Fiscal-tf",
                         false); 
     }
     
    public void launchCars04Report(ActionEvent actionEvent) {
        /**
      * Example method to call a single instance task flow. Note the boolean
      * to create another tab instance is set to false. The taskflow ID is used
      * to track whether to create a new tab or select an existing one.
      */
         _launchActivity("Cash Receipts Checks Details",
                        "/WEB-INF/cars04report-tf.xml#cars04report-tf",
                        false); 
    }
    
  public void launchCars04fiscalReport(ActionEvent actionEvent) {
      /**
    * Example method to call a single instance task flow. Note the boolean
    * to create another tab instance is set to false. The taskflow ID is used
    * to track whether to create a new tab or select an existing one.
    */
       _launchActivity("Cash Receipts Checks Details",
                      "/WEB-INF/cars04report-fiscal-tf.xml#cars04report-fiscal-tf",
                      false); 
  }
    
    public void launchCars06Report(ActionEvent actionEvent) {
        /**
      * Example method to call a single instance task flow. Note the boolean
      * to create another tab instance is set to false. The taskflow ID is used
      * to track whether to create a new tab or select an existing one.
      */
         _launchActivity("Cash Receipts CC Details",
                        "/WEB-INF/cars06Report-tf.xml#cars06Report-tf",
                        false); 
    }  
    
    public void launchCars06FiscalReport(ActionEvent actionEvent) {
        /**
      * Example method to call a single instance task flow. Note the boolean
      * to create another tab instance is set to false. The taskflow ID is used
      * to track whether to create a new tab or select an existing one.
      */
         _launchActivity("Cash Receipts CC Details",
                        "/WEB-INF/cars06report-fiscal-tf.xml#cars06report-fiscal-tf",
                        false); 
    }  
    
    public void launchCars08Report(ActionEvent actionEvent) {
        /**
      * Example method to call a single instance task flow. Note the boolean
      * to create another tab instance is set to false. The taskflow ID is used
      * to track whether to create a new tab or select an existing one.
      */
         _launchActivity("Cash Receipts EFT Details",
                        "/WEB-INF/cars08Report-tf.xml#cars08Report-tf",
                        false); 
    }  
    
    public void launchCars08FiscalReport(ActionEvent actionEvent) {
        /**
      * Example method to call a single instance task flow. Note the boolean
      * to create another tab instance is set to false. The taskflow ID is used
      * to track whether to create a new tab or select an existing one.
      */
         _launchActivity("Cash Receipts EFT Details",
                        "/WEB-INF/cars08FiscalReport-tf.xml#cars08FiscalReport-tf",
                        false); 
    }  
    
    public void launchCars10Report(ActionEvent actionEvent) {
        /**
      * Example method to call a single instance task flow. Note the boolean
      * to create another tab instance is set to false. The taskflow ID is used
      * to track whether to create a new tab or select an existing one.
      */
         _launchActivity("Abnormal Balance",
                        "/WEB-INF/cars10report-tf.xml#cars10report-tf",
                        false); 
    }
    
    public void launchCars11Report(ActionEvent actionEvent) {
        /**
      * Example method to call a single instance task flow. Note the boolean
      * to create another tab instance is set to false. The taskflow ID is used
      * to track whether to create a new tab or select an existing one.
      */
         _launchActivity("Aging of ARs",
                        "/WEB-INF/cars11areport-tf.xml#cars11areport-tf",
                        false); 
    }
    
    public void launchCars12Report(ActionEvent actionEvent) {
        /**
      * Example method to call a single instance task flow. Note the boolean
      * to create another tab instance is set to false. The taskflow ID is used
      * to track whether to create a new tab or select an existing one.
      */
         _launchActivity("Delinquent Payment Plan",
                        "/WEB-INF/cars12report-tf.xml#cars12report-tf",
                        false); 
    }
    
    public void launchCars13Report(ActionEvent actionEvent) {
        /**
      * Example method to call a single instance task flow. Note the boolean
      * to create another tab instance is set to false. The taskflow ID is used
      * to track whether to create a new tab or select an existing one.
      */
         _launchActivity("SCO Write-Off",
                        "/WEB-INF/cars13report-tf.xml#cars13report-tf",
                        false); 
    }
    
    public void launchCars14Report(ActionEvent actionEvent) {
        /**
      * Example method to call a single instance task flow. Note the boolean
      * to create another tab instance is set to false. The taskflow ID is used
      * to track whether to create a new tab or select an existing one.
      */
         _launchActivity("Paid-In-Full",
                        "/WEB-INF/cars14report-tf.xml#cars14report-tf",
                        false); 
    }
    
    public void launchCars16Report(ActionEvent actionEvent) {
        /**
      * Example method to call a single instance task flow. Note the boolean
      * to create another tab instance is set to false. The taskflow ID is used
      * to track whether to create a new tab or select an existing one.
      */
         _launchActivity("Accounts Receivable Status",
                        "/WEB-INF/cars16Report-tf.xml#cars16Report-tf",
                        false); 
    }
    
    public void launchCars20Report(ActionEvent actionEvent) {
        /**
      * Example method to call a single instance task flow. Note the boolean
      * to create another tab instance is set to false. The taskflow ID is used
      * to track whether to create a new tab or select an existing one.
      */
         _launchActivity("Revenue by Fund and Fund Source",
                        "/WEB-INF/cars20Report-tf.xml#cars20Report-tf",
                        false); 
    }
     /******Reports Caller End*****************/
     
    public void closeCurrentActivity(ActionEvent actionEvent) {
        TabContext tabContext = TabContext.getCurrentInstance();
        int tabIndex = tabContext.getSelectedTabIndex();
        if (tabIndex != -1) {
            tabContext.removeTab(tabIndex);
        }
    }

    public void currentTabDirty(ActionEvent e) {
        /**
        * When called, marks the current tab "dirty". Only at the View level
        * is it possible to mark a tab dirty since the model level does not
        * track to which tab data belongs.
        */
        TabContext tabContext = TabContext.getCurrentInstance();
        tabContext.markCurrentTabDirty(true);
    }

    public void currentTabClean(ActionEvent e) {
        TabContext tabContext = TabContext.getCurrentInstance();
        tabContext.markCurrentTabDirty(false);
    }

    private void _launchActivity(String title, String taskflowId,
                                 boolean newTab) {
        try {
            if (newTab) {
                TabContext.getCurrentInstance().addTab(title, taskflowId);
            } else {
                TabContext.getCurrentInstance().addOrSelectTab(title,
                                                               taskflowId);
            }
        } catch (TabContext.TabOverflowException toe) {
            // causes a dialog to be displayed to the user saying that there are
            // too many tabs open - the new tab will not be opened...
            toe.handleDefault();
        }
    }

    public void launchFirstReplaceNPlace(ActionEvent actionEvent) {
        TabContext tabContext = TabContext.getCurrentInstance();
        try {
            tabContext.setMainContent("/WEB-INF/flows/first.xml#first");
        } catch (TabContext.TabContentAreaDirtyException toe) {
            // TODO: warn user TabContext api needed for this use case.
        }
    }

    public void launchSecondReplaceNPlace(ActionEvent actionEvent) {
        TabContext tabContext = TabContext.getCurrentInstance();
        try {
            tabContext.setMainContent("/WEB-INF/flows/second.xml#second");
        } catch (TabContext.TabContentAreaDirtyException toe) {
            // TODO: warn user TabContext api needed for this use case.
        }
    }

    public TaskFlowId getDynamicTaskFlowId() {
        return TaskFlowId.parse(taskFlowId);
    }
}
