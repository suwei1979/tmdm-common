package com.amalto.webapp.v3.workflow.tasks.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import org.apache.log4j.Logger;


/**
 *
 */
public final class DateUtil {

    private static Logger log = Logger.getLogger(DateUtil.class);
    private static String datePattern = "yyyy/MM/dd";
    private static String timePattern = "HH:mm:ss";
    private static String datetimePattern = "yyyy/MM/dd HH:mm:ss";


    /**
     * Return default date format (yyyy/MM/dd)
     * @return the date format will be show
     */
    public static String getDatePattern() {
        return datePattern;
    }

    /**
     * 
     *
     * @param aDate 
     * @return 
     */
    public static final String getDate(Date aDate) {
        SimpleDateFormat df = null;
        String returnValue = "";

        if (aDate != null) {
            df = new SimpleDateFormat(datePattern);
            returnValue = df.format(aDate);
        }

        return (returnValue);
    }

    /**
     * 
     *
     * @param aMask 
     * @param strDate 
     * @return  Date 
     * @see java.text.SimpleDateFormat
     * @throws ParseException
     */
    public static final Date convertStringToDate(String aMask, String strDate)
      throws ParseException {
        SimpleDateFormat df = null;
        Date date = null;
        df = new SimpleDateFormat(aMask);

        if (log.isDebugEnabled()) {
            log.debug("converting '" + strDate + "' to date with mask '"
                      + aMask + "'");
        }

        try {
            date = df.parse(strDate);
        } catch (ParseException pe) {
            //log.error("ParseException: " + pe);
            throw new ParseException(pe.getMessage(), pe.getErrorOffset());
        }

        return (date);
    }

    /**
     * This method returns the current date time in the format:
     * yyyy/MM/dd HH:MM a
     *
     * @param theTime the current time
     * @return the current date/time
     */
    public static String getTimeNow(Date theTime) {
        return getDateTime(timePattern, theTime);
    }

    /**
     * This method returns the current date in the format: yyyy/MM/dd
     * 
     * @return the current date
     * @throws ParseException
     */
    public static Calendar getToday() throws ParseException {
        Date today = new Date();
        SimpleDateFormat df = new SimpleDateFormat(datePattern);

        // This seems like quite a hack (date -> string -> date),
        // but it works ;-)
        String todayAsString = df.format(today);
        Calendar cal = new GregorianCalendar();
        cal.setTime(convertStringToDate(todayAsString));

        return cal;
    }

    /**
     * This method generates a string representation of a date's date/time
     * in the format you specify on input
     *
     * @param aMask the date pattern the string is in
     * @param aDate a date object
     * @return a formatted string representation of the date
     * 
     * @see java.text.SimpleDateFormat
     */
    public static final String getDateTime(String aMask, Date aDate) {
        SimpleDateFormat df = null;
        String returnValue = "";

        if (aDate == null) {
            //log.error("aDate is null!");
        } else {
            df = new SimpleDateFormat(aMask);
            returnValue = df.format(aDate);
        }

        return (returnValue);
    }

    /**
     * 
     * 
     * @param aDate 
     * @return 
     */
    public static final String convertDateToString(Date aDate) {
        return getDateTime(datetimePattern, aDate);
    }

    /**
     * 
     * 
     * @param strDate (format yyyy/MM/dd)
     * @return 
     * 
     * @throws ParseException
     */
    public static Date convertStringToDate(String strDate)
      throws ParseException {
        Date aDate = null;

        try {
            if (log.isDebugEnabled()) {
                log.debug("converting date with pattern: " + datetimePattern);
            }

            aDate = convertStringToDate(datetimePattern, strDate);
        } catch (ParseException pe) {
            log.error("Could not convert '" + strDate
                      + "' to a date, throwing exception");
            pe.printStackTrace();
            throw new ParseException(pe.getMessage(),
                                     pe.getErrorOffset());
                    
        }

        return aDate;
    }
    
    public static String weekday(String date){
        Calendar   calendar   =   Calendar.getInstance(); 
        DateFormat dateFormat=DateFormat.getDateInstance();
        
        Date da=null;
        try {
            da = dateFormat.parse(date);
        } catch (ParseException e) {
            
            e.printStackTrace();
        }
        calendar.setTime(da);
        int num=calendar.get(Calendar.DAY_OF_WEEK);
        
        if(num==1){
            num=7;
        }else{
            num=num-1;
        }
        
        return num+"";
        
    }
    
    public static boolean isMonthEnd() {
    	boolean yes=false;
    	
    	Calendar cal = new GregorianCalendar();
    	if(cal.get(Calendar.DATE) == cal.getActualMaximum(Calendar.DATE))
    	{
    		yes=true;
    	}
    	
    	return yes;
	}
    
    //test
    public static void main(String[] args) {
		String today=convertDateToString(new Date());
		System.out.println(today);
		try {
			System.out.println(convertStringToDate(today));
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}