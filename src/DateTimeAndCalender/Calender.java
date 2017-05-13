package DateTimeAndCalender;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class Calender {
	
	public static void main(String[] args){
		GregorianCalendar calender = new GregorianCalendar();
		System.out.println("Time:"+calender.getTime());
		System.out.println("FirstDay:"+calender.getFirstDayOfWeek());
		
		//object clone
		
		GregorianCalendar cloneCalender = (GregorianCalendar) calender.clone();
		System.out.println("Cloned Time:"+cloneCalender.getTime());
		System.out.println("TimeZone:"+cloneCalender.getTimeZone());
		System.out.println("Time in millis:"+cloneCalender.getTimeInMillis());
		
		//create Calender
		 Calendar cal = Calendar.getInstance();
		 System.out.println(""+cal.getTime());
		 
		 //set time
		 cal.setTime(new Date(1918,10,10));
		 System.out.println(""+cal.getTime());
		 //set days
		 cal.setFirstDayOfWeek(cal.WEDNESDAY);
		 System.out.println(""+cal.getFirstDayOfWeek());
		 
		 //current time zone and modified time zone
		 String currentTimZone = cal.getTimeZone().getDisplayName();
		 System.out.println("Time Zone: "+currentTimZone);
		 cal.setTimeZone(TimeZone.getTimeZone("GMT"));
		 System.out.println("Changed TimeZone:"+cal.getTimeZone().getDisplayName());
		 
		 //hashcode
		 System.out.println("HashCode for Calender:"+cal.hashCode());
		 
		 
		 
		 
		 
		
		//date
		Date date = new Date();
		System.out.println("Date:"+date);
		
		long currentTime = System.currentTimeMillis();
		System.out.println(currentTime);
		
		
		
	}

}
