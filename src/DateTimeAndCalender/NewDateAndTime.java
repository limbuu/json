package DateTimeAndCalender;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class NewDateAndTime {
	public static void main(String[] args) throws InterruptedException{
		NewDateAndTime test = new NewDateAndTime();
		test.testLocalDateAndTime();
		
	}
	public void testLocalDateAndTime() throws InterruptedException{
		//local date and time now
		LocalDateTime time = LocalDateTime.now();
		System.out.println(""+time);
		LocalDate date = LocalDate.now();
		System.out.println(""+date);
		System.out.println(""+date.getMonthValue());
		System.out.println(""+date.getDayOfMonth());
		System.out.println(""+date.getYear());
		System.out.println(""+date.getDayOfYear());
		
		//date format
		
		Date date1 = new Date();
		//E-Dayof week a-Am/PM zzz-timezone
		SimpleDateFormat format = new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a zzz"); 
		System.out.println(format.format(date1));
		
		long startTime = System.currentTimeMillis();
		System.out.println("Start:"+startTime);
		System.out.println(new Date());
		
		Thread.sleep(5*60*10);//in milis seconds
		
		long stopTime = System.currentTimeMillis();
		System.out.println("Stop:"+stopTime);
		System.out.println(new Date());
		long diff = stopTime - startTime;
		System.out.println("Difference:"+diff);
		
		
		
		
		
		
		
		
	}

}
