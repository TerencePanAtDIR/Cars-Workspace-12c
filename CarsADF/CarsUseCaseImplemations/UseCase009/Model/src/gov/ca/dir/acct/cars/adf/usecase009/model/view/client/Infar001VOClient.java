package gov.ca.dir.acct.cars.adf.usecase009.model.view.client;

import gov.ca.dir.acct.cars.adf.usecase009.model.view.common.Infar001VO;

import java.math.BigDecimal;

import oracle.jbo.client.remote.ViewUsageImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Thu Apr 19 13:36:23 PDT 2018
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class Infar001VOClient extends ViewUsageImpl implements Infar001VO {
  /**
   * This is the default constructor (do not remove).
   */
  public Infar001VOClient() {
  }

  public void set001BatchIdVC(BigDecimal batchId) {
    Object _ret =
      getApplicationModuleProxy().riInvokeExportedMethod(this,"set001BatchIdVC",new String [] {"java.math.BigDecimal"},new Object[] {batchId});
    return;
  }
}