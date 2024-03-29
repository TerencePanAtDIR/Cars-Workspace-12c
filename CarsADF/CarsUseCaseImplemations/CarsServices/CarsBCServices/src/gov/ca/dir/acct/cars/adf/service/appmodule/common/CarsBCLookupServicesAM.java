package gov.ca.dir.acct.cars.adf.service.appmodule.common;

import oracle.jbo.ApplicationModule;
import oracle.jbo.domain.Number;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Tue Aug 11 07:58:30 PDT 2015
// ---------------------------------------------------------------------
public interface CarsBCLookupServicesAM extends ApplicationModule {
    String findFiscalPeriodIdWithParams(String rootDocument);
    Number recheckReferenceDocument(String referenceDocument, int processNum, long waitTime);
    String findSOARecipient();
    String validateAddress(String state, String zipCode, String province, 
        String postalCode, String countryAbbreviation);
}
