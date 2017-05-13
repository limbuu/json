package DateTimeAndCalender;

import java.time.DayOfWeek;
import java.time.Month;
import java.time.MonthDay;
import java.time.format.TextStyle;
import java.util.Locale;

public class DisplayDateAndTime {
	public static void main(String[] args){
		//style of displaying time and date
		DayOfWeek day = DayOfWeek.MONDAY;
		Locale locale = Locale.getDefault(); //returns default locale for the instance
		System.out.println(day.getDisplayName(TextStyle.FULL, locale));
		System.out.println(day.getDisplayName(TextStyle.NARROW, locale));
		System.out.println(day.getDisplayName(TextStyle.SHORT, locale));
		System.out.println(day.getDisplayName(TextStyle.FULL_STANDALONE, locale));
		System.out.println(day.getDisplayName(TextStyle.NARROW_STANDALONE, locale));
		System.out.println(day.getDisplayName(TextStyle.SHORT_STANDALONE, locale));
		
		Month month = Month.AUGUST;
		Locale locale1 = Locale.getDefault();
		System.out.println(month.getDisplayName(TextStyle.FULL, locale1));
	    System.out.println(month.getDisplayName(TextStyle.SHORT, locale1));	
		
		
		
	}

}
