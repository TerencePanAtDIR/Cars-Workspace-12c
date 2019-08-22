package gov.ca.dir.acct.cars.adf.common.code;

import java.util.GregorianCalendar;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import oracle.adf.share.logging.ADFLogger;

public class DateUtils {
    
    private static ADFLogger _logger = 
                    ADFLogger.createADFLogger(DateUtils.class);
    
  /**Method to Get current date time java.util.Date
   * @return java.util.Date
   */
  public static java.util.Date getUtilDateCurrentDateTime() {
   return new java.util.Date();
  }
  
  /**Method to Get current date time java.util.GregorianCalendar
   * @return java.util.GregorianCalendar
   */
  public static java.util.GregorianCalendar 
   getUtilCalendarCurrentDateTime() {
    GregorianCalendar currentDateTime = new GregorianCalendar();
   return currentDateTime;
  }
  
  /**Method to Get current date time oracle.jbo.domain.Date
   * @return oracle.jbo.domain.Date
   */
  public static oracle.jbo.domain.Date getJboCurrentDateTime() {
   return new oracle.jbo.domain.Date(
    new java.sql.Timestamp(
      System.currentTimeMillis()));
  }
  
  /**Method to Get current date java.util.Date
   * @return java.util.Date
   */  
  public static java.util.Date getUtilDateToday() {
   java.text.SimpleDateFormat sdf =
    new java.text.SimpleDateFormat("dd.MM.yyyy");
   String datestring = 
    sdf.format(new java.util.Date());
   java.util.Date today = null;
   try {
    today = sdf.parse(datestring);
   } catch (Exception exc) {
    System.out.println("Date error");
   }
   return today;
  }
  
  /**Method to Get current date java.util.GregorianCalendar
   * @return java.util.GregorianCalendar
   */  
  public static java.util.GregorianCalendar getUtilCalendarToday() {
   java.util.GregorianCalendar now =
    new java.util.GregorianCalendar();
   java.util.GregorianCalendar today =
    new java.util.GregorianCalendar(
     now.get(java.util.GregorianCalendar.YEAR),
     now.get(java.util.GregorianCalendar.MONTH),
     now.get(java.util.GregorianCalendar.DATE));
   return today;
  }
  
  /**Method to Get current date java.sql.Date
   * @return java.sql.Date
   */
  public static java.sql.Date getSqlToday() {
   return new java.sql.Date(
    System.currentTimeMillis());
  }
  
  /**Method to Get current date oracle.jbo.domain.Date
   * @return oracle.jbo.domain.Date
   */
  public static oracle.jbo.domain.Date getJboToday() {
   return new oracle.jbo.domain.Date(
    oracle.jbo.domain.Date.getCurrentDate());
  }
  
  /**Method to Get java.util.Date from java.util.GregorianCalendar
   * @param calDate Calendar Date to be converted
   * @return java.util.Date
   */
  public static java.util.Date
   convertUtilCalendarToUtilDate(java.util.GregorianCalendar calDate) {
   return calDate.getTime();
  }
  
  /**Method to Get java.util.Date from java.sql.Date
   * @param sqlDate SQL date to be converted
   * @return java.util.Date
   */
  public static java.util.Date
   convertSqlToUtilDate(java.sql.Date sqlDate) {
   java.text.SimpleDateFormat sdf =
    new java.text.SimpleDateFormat("dd.MM.yyyy");
   String datestring = sdf.format(
    new java.util.Date(sqlDate.getTime()));
   java.util.Date date = null;
   try {
    date = sdf.parse(datestring);
   } catch (Exception exc) {
    System.out.println("Date error");
   }
   return date;
  }
  
  /**Method to Get java.util.Date from oracle.jbo.domain.Date
   * @param jboDate JBO date to be converted
   * @return java.util.Date
   */
  public static java.util.Date
   convertJboToUtilDate(oracle.jbo.domain.Date jboDate) {
   return jboDate.dateValue();
  }
  
  /**Method to Get java.util.GregorianCalendar from oracle.jbo.domain.Date
   * @param jboDate JBO date to be converted
   * @return java.util.GregorianCalendar
   */
  public static java.util.GregorianCalendar
   convertJboToUtilCalendar(oracle.jbo.domain.Date jboDate) {
   java.util.GregorianCalendar cal =
    new java.util.GregorianCalendar();
   cal.setTime(jboDate.dateValue());
   return cal;
  }

  /**Method to Get java.util.GregorianCalendar from java.sql.Date
   * @param sqlDate to be converted
   * @return java.util.GregorianCalendar
   */
  public static java.util.GregorianCalendar
   convertSqlToUtilCalendar(java.sql.Date sqlDate) {
   java.util.GregorianCalendar date =
    new java.util.GregorianCalendar();
   date.setTimeInMillis(sqlDate.getTime());
   //remove the time that comes along
   java.util.GregorianCalendar cal =
    new java.util.GregorianCalendar(
     date.get(java.util.GregorianCalendar.YEAR),
     date.get(java.util.GregorianCalendar.MONTH),
     date.get(java.util.GregorianCalendar.DATE));
   return cal;
  }

  /**Method to Get java.util.GregorianCalendar from java.util.Date
   * @param utilDate Util date to be converted
   * @return java.util.GregorianCalendar
   */
  public static java.util.GregorianCalendar
   convertUtilDateToCalendar(java.util.Date utilDate) {
   java.util.GregorianCalendar cal = 
    new java.util.GregorianCalendar();
   cal.setTime(utilDate);
   return cal;
  }

  /**Method to Get java.sql.Date from java.util.Date
   * @param utilDate util date to be converted
   * @return java.sql.Date
   */
  public static java.sql.Date
   convertUtilDateToSqlDate(java.util.Date utilDate) {
   return new java.sql.Date(utilDate.getTime());
  }

  /**Method to Get java.sql.Date from java.util.GregorianCalendar
   * @param calDate Calendar Date to be converted
   * @return java.sql.Date
   */
  public static java.sql.Date
   convertUtilCalendarToSqlDate(java.util.GregorianCalendar calDate) {
   return new java.sql.Date(calDate.getTimeInMillis());
  }

  /**Method to Get java.sql.Date from oracle.jbo.domain.Date
   * @param jboDate JBO Date to be converted
   * @return java.sql.Date
   */
  public static java.sql.Date
   convertJboToSqlDate(oracle.jbo.domain.Date jboDate) {
   return jboDate.dateValue();
  }

  /**Method to Get oracle.jbo.domain.Date from java.util.Date
   * @param utilDate util date to be converted
   * @return oracle.jbo.domain.Date
   */
  public static oracle.jbo.domain.Date
   convertUtilDateToJboDate(java.util.Date utilDate) {
   return new oracle.jbo.domain.Date(
    new java.sql.Date(utilDate.getTime()));
  }

  /**Method to Get oracle.jbo.domain.Date from java.util.GregorianCalendar
   * @param calDate Calendar Date to be converted
   * @return oracle.jbo.domain.Date
   */
  public static oracle.jbo.domain.Date
   convertUtilCalendarToJboDate(java.util.GregorianCalendar calDate) {
   return new oracle.jbo.domain.Date(
    new java.sql.Date(calDate.getTimeInMillis()));
  }

  /**Method to Get oracle.jbo.domain.Date from java.sql.Date
   * @param sqlDate to be converted
   * @return oracle.jbo.domain.Date
   */
  public static oracle.jbo.domain.Date
   convertSqlToJboDate(java.sql.Date sqlDate) {
   return new oracle.jbo.domain.Date(sqlDate);
  }    
    //Get XMLGregorianCalendar for the time right now
    public static XMLGregorianCalendar getXMLGregorianCalendarNow() {
        try{
            XMLGregorianCalendar now;
            GregorianCalendar gregorianCalendar = new GregorianCalendar();
            DatatypeFactory datatypeFactory = DatatypeFactory.newInstance();
            now = 
                datatypeFactory.newXMLGregorianCalendar(gregorianCalendar);
            return now;
            }
        catch(DatatypeConfigurationException e){
            _logger.info(e);
            }
        return null;
        }

    /**Method to Get javax.xml.datatype.XMLGregorianCalendar from oracle.jbo.domain.Date
     * @param jboDate JBO Date to be converted
     * @return javax.xml.datatype.XMLGregorianCalendar
     */
    public static javax.xml.datatype.XMLGregorianCalendar
     convertJboToXMLGregorianDate(oracle.jbo.domain.Date jboDate) {
        try{
            DatatypeFactory datatypeFactory = 
                DatatypeFactory.newInstance();
            return datatypeFactory
                .newXMLGregorianCalendar(convertJboToUtilCalendar(jboDate));
            }
        catch(DatatypeConfigurationException e){
            _logger.info(e);
            }
        return null;
    }

    /**Method to Get javax.xml.datatype.XMLGregorianCalendar from java.util.GregorianCalendar
     * @param gregDate GregorianCalendar Date to be converted
     * @return javax.xml.datatype.XMLGregorianCalendar
     */
    public static javax.xml.datatype.XMLGregorianCalendar
     convertCalendarToXMLGregorianDate(java.util.GregorianCalendar gregDate) {
        try{
            DatatypeFactory datatypeFactory = 
                DatatypeFactory.newInstance();
            return datatypeFactory.newXMLGregorianCalendar(gregDate);
            }
        catch(DatatypeConfigurationException e){
            _logger.info(e);
            }
        return null;
    }

    /**Method to Get javax.xml.datatype.XMLGregorianCalendar from java.util.Date
     * @param utilDate Util Date to be converted
     * @return javax.xml.datatype.XMLGregorianCalendar
     */
    public static javax.xml.datatype.XMLGregorianCalendar
     convertUtilDateToXMLGregorianDate(java.util.Date utilDate) {
        try{
            DatatypeFactory datatypeFactory = 
                DatatypeFactory.newInstance();
            return datatypeFactory
                .newXMLGregorianCalendar(convertUtilDateToCalendar(utilDate));
            }
        catch(DatatypeConfigurationException e){
            _logger.info(e);
            }
        return null;
    }
    
}
