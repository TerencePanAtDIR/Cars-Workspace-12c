package gov.ca.dir.acct.cars.adf.service.appmodule.common.serviceinterface;

import java.math.BigDecimal;

import java.sql.Timestamp;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.soap.SOAPBinding;

import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

import oracle.jbo.service.errors.ServiceException;

import oracle.webservices.annotations.PortableWebService;
import oracle.webservices.annotations.SDODatabinding;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Tue Sep 03 13:25:20 PDT 2013
// ---------------------------------------------------------------------
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.WRAPPED, style = SOAPBinding.Style.DOCUMENT)
@PortableWebService(targetNamespace="/gov/ca/dir/acct/cars/adf/service/appmodule/common/",
    name="CarsBCUtilityServicesAMService", wsdlLocation="gov/ca/dir/acct/cars/adf/service/appmodule/common/serviceinterface/CarsBCUtilityServicesAMService.wsdl")
@SDODatabinding(schemaLocation="gov/ca/dir/acct/cars/adf/service/appmodule/common/serviceinterface/CarsBCUtilityServicesAMService.xsd")
public interface CarsBCUtilityServicesAMService {


    public static final String NAME = "{/gov/ca/dir/acct/cars/adf/service/appmodule/common/}CarsBCUtilityServicesAMService";

    /**
     * Exported method getEventIDSequence from CarsBCUtilityServicesAM.
     */
    @WebMethod(action="/gov/ca/dir/acct/cars/adf/service/appmodule/common/getEventIDSequence",
        operationName="getEventIDSequence")
    @RequestWrapper(targetNamespace="/gov/ca/dir/acct/cars/adf/service/appmodule/common/types/",
        localName="getEventIDSequence")
    @ResponseWrapper(targetNamespace="/gov/ca/dir/acct/cars/adf/service/appmodule/common/types/",
        localName="getEventIDSequenceResponse")
    @WebResult(name="result")
    BigDecimal getEventIDSequence() throws ServiceException;

    /**
     * Exported method getARStatusIDSequence from CarsBCUtilityServicesAM.
     */
    @WebMethod(action="/gov/ca/dir/acct/cars/adf/service/appmodule/common/getARStatusIDSequence",
        operationName="getARStatusIDSequence")
    @RequestWrapper(targetNamespace="/gov/ca/dir/acct/cars/adf/service/appmodule/common/types/",
        localName="getARStatusIDSequence")
    @ResponseWrapper(targetNamespace="/gov/ca/dir/acct/cars/adf/service/appmodule/common/types/",
        localName="getARStatusIDSequenceResponse")
    @WebResult(name="result")
    BigDecimal getARStatusIDSequence() throws ServiceException;

    /**
     * Exported method getPartyIDSequence from CarsBCUtilityServicesAM.
     */
    @WebMethod(action="/gov/ca/dir/acct/cars/adf/service/appmodule/common/getPartyIDSequence",
        operationName="getPartyIDSequence")
    @RequestWrapper(targetNamespace="/gov/ca/dir/acct/cars/adf/service/appmodule/common/types/",
        localName="getPartyIDSequence")
    @ResponseWrapper(targetNamespace="/gov/ca/dir/acct/cars/adf/service/appmodule/common/types/",
        localName="getPartyIDSequenceResponse")
    @WebResult(name="result")
    BigDecimal getPartyIDSequence() throws ServiceException;

    /**
     * Exported method getParticipantRoleIdSequence from CarsBCUtilityServicesAM.
     */
    @WebMethod(action="/gov/ca/dir/acct/cars/adf/service/appmodule/common/getParticipantRoleIdSequence",
        operationName="getParticipantRoleIdSequence")
    @RequestWrapper(targetNamespace="/gov/ca/dir/acct/cars/adf/service/appmodule/common/types/",
        localName="getParticipantRoleIdSequence")
    @ResponseWrapper(targetNamespace="/gov/ca/dir/acct/cars/adf/service/appmodule/common/types/",
        localName="getParticipantRoleIdSequenceResponse")
    @WebResult(name="result")
    BigDecimal getParticipantRoleIdSequence() throws ServiceException;

    /**
     * Exported method getContactMethodIdSequence from CarsBCUtilityServicesAM.
     */
    @WebMethod(action="/gov/ca/dir/acct/cars/adf/service/appmodule/common/getContactMethodIdSequence",
        operationName="getContactMethodIdSequence")
    @RequestWrapper(targetNamespace="/gov/ca/dir/acct/cars/adf/service/appmodule/common/types/",
        localName="getContactMethodIdSequence")
    @ResponseWrapper(targetNamespace="/gov/ca/dir/acct/cars/adf/service/appmodule/common/types/",
        localName="getContactMethodIdSequenceResponse")
    @WebResult(name="result")
    BigDecimal getContactMethodIdSequence() throws ServiceException;

    /**
     * Exported method getAddressIdSequence from CarsBCUtilityServicesAM.
     */
    @WebMethod(action="/gov/ca/dir/acct/cars/adf/service/appmodule/common/getAddressIdSequence",
        operationName="getAddressIdSequence")
    @RequestWrapper(targetNamespace="/gov/ca/dir/acct/cars/adf/service/appmodule/common/types/",
        localName="getAddressIdSequence")
    @ResponseWrapper(targetNamespace="/gov/ca/dir/acct/cars/adf/service/appmodule/common/types/",
        localName="getAddressIdSequenceResponse")
    @WebResult(name="result")
    BigDecimal getAddressIdSequence() throws ServiceException;

    /**
     * Exported method getAcctgTransactionIdSequence from CarsBCUtilityServicesAM.
     */
    @WebMethod(action="/gov/ca/dir/acct/cars/adf/service/appmodule/common/getAcctgTransactionIdSequence",
        operationName="getAcctgTransactionIdSequence")
    @RequestWrapper(targetNamespace="/gov/ca/dir/acct/cars/adf/service/appmodule/common/types/",
        localName="getAcctgTransactionIdSequence")
    @ResponseWrapper(targetNamespace="/gov/ca/dir/acct/cars/adf/service/appmodule/common/types/",
        localName="getAcctgTransactionIdSequenceResponse")
    @WebResult(name="result")
    BigDecimal getAcctgTransactionIdSequence() throws ServiceException;

    /**
     * Exported method getAcctgEntryIdSequence from CarsBCUtilityServicesAM.
     */
    @WebMethod(action="/gov/ca/dir/acct/cars/adf/service/appmodule/common/getAcctgEntryIdSequence",
        operationName="getAcctgEntryIdSequence")
    @RequestWrapper(targetNamespace="/gov/ca/dir/acct/cars/adf/service/appmodule/common/types/",
        localName="getAcctgEntryIdSequence")
    @ResponseWrapper(targetNamespace="/gov/ca/dir/acct/cars/adf/service/appmodule/common/types/",
        localName="getAcctgEntryIdSequenceResponse")
    @WebResult(name="result")
    BigDecimal getAcctgEntryIdSequence() throws ServiceException;

    /**
     * Exported method getNoteIdSequence from CarsBCUtilityServicesAM.
     */
    @WebMethod(action="/gov/ca/dir/acct/cars/adf/service/appmodule/common/getNoteIdSequence",
        operationName="getNoteIdSequence")
    @RequestWrapper(targetNamespace="/gov/ca/dir/acct/cars/adf/service/appmodule/common/types/",
        localName="getNoteIdSequence")
    @ResponseWrapper(targetNamespace="/gov/ca/dir/acct/cars/adf/service/appmodule/common/types/",
        localName="getNoteIdSequenceResponse")
    @WebResult(name="result")
    BigDecimal getNoteIdSequence() throws ServiceException;

    /**
     * Exported method isEventReversed from CarsBCUtilityServicesAM.
     */
    @WebMethod(action="/gov/ca/dir/acct/cars/adf/service/appmodule/common/isEventReversed",
        operationName="isEventReversed")
    @RequestWrapper(targetNamespace="/gov/ca/dir/acct/cars/adf/service/appmodule/common/types/",
        localName="isEventReversed")
    @ResponseWrapper(targetNamespace="/gov/ca/dir/acct/cars/adf/service/appmodule/common/types/",
        localName="isEventReversedResponse")
    @WebResult(name="result")
    BigDecimal isEventReversed(@WebParam(mode = WebParam.Mode.IN, name="currentDocumentNumber")
        String currentDocumentNumber) throws ServiceException;

    /**
     * Exported method isChildrenExist from CarsBCUtilityServicesAM.
     */
    @WebMethod(action="/gov/ca/dir/acct/cars/adf/service/appmodule/common/isChildrenExist",
        operationName="isChildrenExist")
    @RequestWrapper(targetNamespace="/gov/ca/dir/acct/cars/adf/service/appmodule/common/types/",
        localName="isChildrenExist")
    @ResponseWrapper(targetNamespace="/gov/ca/dir/acct/cars/adf/service/appmodule/common/types/",
        localName="isChildrenExistResponse")
    @WebResult(name="result")
    BigDecimal isChildrenExist(@WebParam(mode = WebParam.Mode.IN, name="currentDocumentNumber")
        String currentDocumentNumber) throws ServiceException;


    /**
     * Exported method is2YearsPrior from CarsBCUtilityServicesAM.
     */
    @WebMethod(action="/gov/ca/dir/acct/cars/adf/service/appmodule/common/is2YearsPrior",
        operationName="is2YearsPrior")
    @RequestWrapper(targetNamespace="/gov/ca/dir/acct/cars/adf/service/appmodule/common/types/",
        localName="is2YearsPrior")
    @ResponseWrapper(targetNamespace="/gov/ca/dir/acct/cars/adf/service/appmodule/common/types/",
        localName="is2YearsPriorResponse")
    @WebResult(name="result")
    BigDecimal is2YearsPrior(@WebParam(mode = WebParam.Mode.IN, name="ReferenceDocument")
        String ReferenceDocument) throws ServiceException;

    /**
     * Exported method getCurrentBalance from CarsBCUtilityServicesAM.
     */
    @WebMethod(action="/gov/ca/dir/acct/cars/adf/service/appmodule/common/getCurrentBalance",
        operationName="getCurrentBalance")
    @RequestWrapper(targetNamespace="/gov/ca/dir/acct/cars/adf/service/appmodule/common/types/",
        localName="getCurrentBalance")
    @ResponseWrapper(targetNamespace="/gov/ca/dir/acct/cars/adf/service/appmodule/common/types/",
        localName="getCurrentBalanceResponse")
    @WebResult(name="result")
    BigDecimal getCurrentBalance(@WebParam(mode = WebParam.Mode.IN, name="ReferenceDocument")
        String ReferenceDocument) throws ServiceException;


    /**
     * Exported method isReclassNeeded from CarsBCUtilityServicesAM.
     */
    @WebMethod(action="/gov/ca/dir/acct/cars/adf/service/appmodule/common/isReclassNeeded",
        operationName="isReclassNeeded")
    @RequestWrapper(targetNamespace="/gov/ca/dir/acct/cars/adf/service/appmodule/common/types/",
        localName="isReclassNeeded")
    @ResponseWrapper(targetNamespace="/gov/ca/dir/acct/cars/adf/service/appmodule/common/types/",
        localName="isReclassNeededResponse")
    @WebResult(name="result")
    BigDecimal isReclassNeeded(@WebParam(mode = WebParam.Mode.IN, name="ReferenceDocument")
        String ReferenceDocument) throws ServiceException;

    /**
     * Exported method findAROtherReferenceDocumentWithParams from CarsBCUtilityServicesAM.
     */
    @WebMethod(action="/gov/ca/dir/acct/cars/adf/service/appmodule/common/findAROtherReferenceDocumentWithParams",
        operationName="findAROtherReferenceDocumentWithParams")
    @RequestWrapper(targetNamespace="/gov/ca/dir/acct/cars/adf/service/appmodule/common/types/",
        localName="findAROtherReferenceDocumentWithParams")
    @ResponseWrapper(targetNamespace="/gov/ca/dir/acct/cars/adf/service/appmodule/common/types/",
        localName="findAROtherReferenceDocumentWithParamsResponse")
    @WebResult(name="result")
    String findAROtherReferenceDocumentWithParams(@WebParam(mode = WebParam.Mode.IN,
            name="rootDocument")
        String rootDocument) throws ServiceException;

    /**
     * Exported method findAROthersContingentRefDoc from CarsBCUtilityServicesAM.
     */
    @WebMethod(action="/gov/ca/dir/acct/cars/adf/service/appmodule/common/findAROthersContingentRefDoc",
        operationName="findAROthersContingentRefDoc")
    @RequestWrapper(targetNamespace="/gov/ca/dir/acct/cars/adf/service/appmodule/common/types/",
        localName="findAROthersContingentRefDoc")
    @ResponseWrapper(targetNamespace="/gov/ca/dir/acct/cars/adf/service/appmodule/common/types/",
        localName="findAROthersContingentRefDocResponse")
    @WebResult(name="result")
    String findAROthersContingentRefDoc(@WebParam(mode = WebParam.Mode.IN,
            name="referenceDocument")
        String referenceDocument) throws ServiceException;

    /**
     * Exported method isAROthersRefDocExisted from CarsBCUtilityServicesAM.
     */
    @WebMethod(action="/gov/ca/dir/acct/cars/adf/service/appmodule/common/isAROthersRefDocExisted",
        operationName="isAROthersRefDocExisted")
    @RequestWrapper(targetNamespace="/gov/ca/dir/acct/cars/adf/service/appmodule/common/types/",
        localName="isAROthersRefDocExisted")
    @ResponseWrapper(targetNamespace="/gov/ca/dir/acct/cars/adf/service/appmodule/common/types/",
        localName="isAROthersRefDocExistedResponse")
    @WebResult(name="result")
    BigDecimal isAROthersRefDocExisted(@WebParam(mode = WebParam.Mode.IN,
            name="ReferenceDocument")
        String ReferenceDocument) throws ServiceException;

    /**
     * Exported method isDecisionAfterReclassExisted from CarsBCUtilityServicesAM.
     */
    @WebMethod(action="/gov/ca/dir/acct/cars/adf/service/appmodule/common/isDecisionAfterReclassExisted",
        operationName="isDecisionAfterReclassExisted")
    @RequestWrapper(targetNamespace="/gov/ca/dir/acct/cars/adf/service/appmodule/common/types/",
        localName="isDecisionAfterReclassExisted")
    @ResponseWrapper(targetNamespace="/gov/ca/dir/acct/cars/adf/service/appmodule/common/types/",
        localName="isDecisionAfterReclassExistedResponse")
    @WebResult(name="result")
    BigDecimal isDecisionAfterReclassExisted(@WebParam(mode = WebParam.Mode.IN,
            name="ReferenceDocument")
        String ReferenceDocument, @WebParam(mode = WebParam.Mode.IN, name="eventDateStr")
        String eventDateStr, @WebParam(mode = WebParam.Mode.IN, name="eventTypeCode")
        String eventTypeCode) throws ServiceException;
}