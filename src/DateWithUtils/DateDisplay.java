package DateWithUtils;

import java.util.Date;

public class DateDisplay {
	
	public static void main(String[] args){
		// current date
	    Date date = DateUtils.getCurrentDate();
	    System.out.println("Current Date::"+date);
	    
	    // 30 days ago date
	    Date date30ago = DateUtils.get30DaysBeforeDate();
	    System.out.println("Date 30 days ago::"+date30ago);
	    
	    Date dateTruncate = DateUtils.truncateDate(date30ago);
	    System.out.println("Truncate Date::"+dateTruncate);
	    
	    Date addHours = DateUtils.addHours(DateUtils.getCurrentDate(), 1);
	    System.out.println("Hours added:"+addHours);
	    
	    
	    
	    
	    
	    
  		
		
	}

}
