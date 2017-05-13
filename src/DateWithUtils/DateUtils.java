package DateWithUtils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.TimeZone;


public class DateUtils {
	
	
	
	public static List<Date> getDaysBetweenDates(Date startdate, Date enddate)
	{
	    List<Date> dates = new ArrayList<Date>();
	    Calendar calendar = new GregorianCalendar();
	    calendar.setTime(startdate);
	    

	    while (calendar.getTime().before(enddate))
	    {
	        Date result = calendar.getTime();
	        dates.add(result);
	        calendar.add(Calendar.DATE, 1);
	    }
	    return dates;
	}
	
	public static String convertDate(String dateInString){
	    SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS");
		
		try {

            Date date = formatter.parse(dateInString);
            dateInString = formatter.format(date)+'z';

        } catch (ParseException e) {
            e.printStackTrace();
        }		
		return dateInString;
	}
	
	public static Date convertStringToDate(String dateInString){
	     //SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS");
		Date date = null;
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
		try {
           date = formatter.parse(dateInString);
       } catch (ParseException e) {
           e.printStackTrace();
       }		
		return date;
	}
	public static boolean isDateBetweenStartAndEnd(Date startDate, Date endDate , Date date){
		Calendar c = Calendar.getInstance();
		c.setTime(endDate);
		c.add(Calendar.DATE, 1);  // number of days to add
		endDate = c.getTime();
		return date.after(startDate) && date.before(endDate);
	}
	
	public static Date truncateDate(Date date)
	{
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.set(Calendar.HOUR_OF_DAY, 0);
		cal.set(Calendar.MINUTE, 0);
		cal.set(Calendar.SECOND, 0);
		cal.set(Calendar.MILLISECOND, 0);
		date = cal.getTime();
		return date;
	}
	
	public static Date tillDate(Date date)
	{
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.set(Calendar.HOUR_OF_DAY, 23);
		cal.set(Calendar.MINUTE, 59);
		cal.set(Calendar.SECOND, 59);
		cal.set(Calendar.MILLISECOND, 99);
		date = cal.getTime();
		return date;
	}
	
	public static Date addMinutes(Date date, int n ){
		Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
		cal.setTime(date);
		cal.add(Calendar.MINUTE, n);
		return cal.getTime();
	}
	
	public static Date addHours(Date date, int n){
		Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
		cal.setTime(date);
		cal.add(Calendar.HOUR_OF_DAY, n);
		return cal.getTime();
		
	}
	
	public static void main(String [] args){
		System.out.println(DateUtils.convertStringToDate("2017/01/20"));
	}
	
	public static Date getPreviousOrNextDateFromADate(Date date, int days){
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		c.add(Calendar.DATE, days);  // number of days to add
		date = c.getTime();
		return date;
	}
	
	public static Date getCurrentDate(){
		return new Date();
	}
	
	public static Date get30DaysBeforeDate(){
		Calendar cal = Calendar.getInstance();
		cal.setTime(getCurrentDate());
		cal.add(Calendar.DAY_OF_MONTH, -30);
		return cal.getTime();
	}
	
	public static Date getNDaysBeforeDate(int n){
		Calendar cal = Calendar.getInstance();
		cal.setTime(getCurrentDate());
		cal.add(Calendar.DAY_OF_MONTH, -n);
		return cal.getTime();
	}
	
	public static String convertDate(Date date){
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		return sdf.format(date);
	}
	
	// This method generates date on the basis of the dateFormat and date(type String) passed
	public static Date getDateBasedOnStringAndDateFormat(String dateString,String dateFormat){
		DateFormat df = new SimpleDateFormat(dateFormat);
		try {
			return df.parse(dateString);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public static Date getDateFromDayAndTimeAndTimezone(String date, String time, String timeZone) {
		GregorianCalendar calendar = new GregorianCalendar(TimeZone.getTimeZone(timeZone));
		calendar.clear();
		calendar.set(
				Integer.parseInt(date.split("/")[0]), 
				Integer.parseInt(date.split("/")[1]) - 1, 
				Integer.parseInt(date.split("/")[2]),
				Integer.parseInt(time.split(":")[0]), 
				Integer.parseInt(time.split(":")[1]),
				00);
		return calendar.getTime();
	}
	
	public static boolean isLessThanLocalTime(Date date) {
		Date localTime = new Date();		
		return localTime.after(date);
	}

	public static boolean isGreaterThan(Date date1, Date date2) {
		return date1.getTime() > date2.getTime() ? true : false;
	}
		
	public static String[] getDayAndTimeAndTimezoneFromDate(Date date) {
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		c.add(Calendar.HOUR, 12);
		// convert calendar to date
		date = c.getTime();
		String[] dateArray = new String[3];
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
		dateArray[0] = dateFormat.format(date);		
		dateFormat = new SimpleDateFormat("HH:mm");
		dateArray[1] = dateFormat.format(date);	
		dateArray[2] = "America/New_York";
		return dateArray;
	}
	
	public static long numberOfDaysFromToday(String date) {
		
		Date currentDate = new Date();
		return currentDate.getTime() - convertStringToDate(date).getTime();
	}

	public static boolean checkIfThirtyDaysBefore(Date createdDate) {
		Calendar emailHunterCalendar = Calendar.getInstance();
		emailHunterCalendar.setTime(createdDate);
		
		
		Calendar before30DaysCalendar = Calendar.getInstance();
		before30DaysCalendar.setTime(new Date());
		before30DaysCalendar.add(Calendar.DATE, -30);
		
		return emailHunterCalendar.before(before30DaysCalendar);
	}
	
}
