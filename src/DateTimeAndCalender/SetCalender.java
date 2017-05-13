package DateTimeAndCalender;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class SetCalender {
	public static void main(String[] args){
		// truncate date value and change the value
		 Date date = new Date();
		 Calendar cal = Calendar.getInstance();
		 cal.setTime(date);
		 cal.set(cal.HOUR_OF_DAY, 0);
		 cal.set(cal.MINUTE, 0);
		 cal.set(cal.SECOND, 0);
		 cal.set(cal.MONTH, 0);
		 cal.set(cal.YEAR, 1990);
		 System.out.println(cal.getTime());
		 
		
		 //convert string to date
		 
		 String dateInString = "2017/10/12";
		 SimpleDateFormat dateFormatter = new SimpleDateFormat("yyyy/MM/dd");
		 
		 Date dateformat = null;
		try {
			dateformat = dateFormatter.parse(dateInString);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 System.out.println("Date in format"+dateformat);
		 
		 
		 //date formatter
	      Date date1 = new Date();
	     SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	     String s = formatter.format(date1);
	     System.out.println("Date in format::"+s);
	     
	     SimpleDateFormat formatter1 = new SimpleDateFormat("yyyy/MM/dd  HH/mm/ss");
	     String s1 = formatter1.format(date1);
	     System.out.println("Date in other format::"+s1);
	     
		 
	     //get n days before current date
	     int n = 2;
	     Date date2 = new Date();
	     System.out.println("current date:"+date2);
	     Calendar cal1 = Calendar.getInstance();
	     cal1.setTime(date2);
	     cal1.add(cal1.DAY_OF_MONTH,-n );
	     System.out.println("Before 2 days::"+cal1.getTime());
	     //get n day after given new date
	     cal1.add(cal1.DAY_OF_MONTH, n);
	     System.out.println("After 2 days::"+cal1.getTime());
	     
	     
	     //get n day before given date
	     //taken value from dateformat
	     
	     System.out.println("Given date:"+dateformat);
	     Calendar cal2 = Calendar.getInstance();
	     cal2.setTime(dateformat);
	     cal2.add(cal.DAY_OF_MONTH, -n);
	     System.out.println("Before 2 days of given date:"+cal2.getTime());
	     
	     // find which date is greater than which based of given two dates
	     
	     Date dateNew = new Date();
	     Date dateNew1 = new Date("2017/10/12");
	     System.out.println("Date New:"+dateNew1);
	     boolean value = dateNew.getTime() > dateNew1.getTime() ? true : false;
	     System.out.println(value);
	    
	     
	     
	     
	   
	}

	
	   

}

