package DateTimeAndCalender;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class MainClass {
	  public static void main(String[] args) throws ParseException {
		  
		
		  Date date = new Date();
		  System.out.println(">>>Current Date>>>"+date);
		  
		  String dateInString = "2017-01-18T01:02:03+00:00";
		  int length = dateInString.length();
		  System.out.println("Lengthh of Date in String:"+length);
		  
		  String newDateInString = dateInString.substring(0, length-3)+dateInString.substring(length-2,length);
				  //dateInString.substring(length - 2, length);
		  //dateInString.substring(0, length-3)
				 // dateInString.substring(0, length-6);
//				  +dateInString.substring(beginIndex, endIndex)
			  System.out.println("New Date in Srtring::"+newDateInString);
			  
			  String newDate =dateInString.substring(0, length-6);
			  System.out.println("New Date::"+newDate+"+00.00");
			  
			  DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'hh:mm:ssZ"); //UTC dateFormat
			 dateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
			 
			 Date date1= dateFormat.parse(newDateInString);
			 System.out.println("ParsedDate:::"+date1);
			 String formatteddate = dateFormat.format(date1);
			 System.out.println("formatted date"+formatteddate);
			
           
			  
			  String salesforceDate= "2017-04-11T09:22:53.000+0000";
			  SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
			
				Date daaate = formatter.parse(salesforceDate);
				String newSalesforceDate = formatter.format(daaate)+"+00.00";
			
		  System.out.println("New salesforce parsed Date"+daaate);
		  System.out.println("New Salesforce Date"+newSalesforceDate);
		  
		  
//	    String pattern = "MM/dd/yyyy";
//	    SimpleDateFormat format = new SimpleDateFormat(pattern);
//	    try {
//	      Date date = format.parse("001-07-04T12:08:56.235-0700");
//	      System.out.println(date);
//	    } catch (ParseException e) {
//	      e.printStackTrace();
//	    }
//	    // formatting
//	    System.out.println(format.format(new Date()));
//	  }
	}
//	  public  Date parseDate(String inDate) {
//			   Date	dateRes = null;
//			//	1 - Try locale specific mm/dd/yyyy or dd/mm/yyyy	
//			//try {
//				String candDate	= inDate.substring(0,Math.min(10,inDate.length()));// grab date portion only m[m]/d[d]/yyyy , ignore time
//				dateRes = Date.parse(candDate);
////			}
////			catch (Exception e) { 
////				}
////			
//
////			if (dateRes == null) {
////			//	2 - Try yyyy-mm-dd			
////				try {
////					String candDate	= inDate.substring(0,10);			// grab date portion only, ignore time, if any
////					dateRes	= Date.valueOf(candDate);
////				}
////				catch (Exception e) {} 
////			}
//			
//			return dateRes;
//		}
}
	  
