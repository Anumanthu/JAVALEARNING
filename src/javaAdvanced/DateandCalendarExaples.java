package javaAdvanced;

import java.text.SimpleDateFormat;
import java.util.*;



public class DateandCalendarExaples {

	public static void main(String[] args) {
		
		
		Date d=new Date();
		
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy  hh mm ss");
		
	
		
		System.out.println(d.toString());
		
		System.out.println(sdf.format(d));
		
		Calendar cal= Calendar.getInstance();
		
		System.out.println(sdf.format(cal.getTime()));
		System.out.println(cal.getWeeksInWeekYear());
		
		System.out.println(cal.getTimeZone());
		
		
		System.out.println(Calendar.AM_PM);
		
		System.out.println(Calendar.DAY_OF_MONTH);
		
		System.out.println(Calendar.DAY_OF_WEEK_IN_MONTH);
		
		

	}

}


