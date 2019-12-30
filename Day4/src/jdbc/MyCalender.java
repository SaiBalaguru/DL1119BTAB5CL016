package jdbc;

import java.util.Calendar;
import java.util.Date;

public class MyCalender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar cal = Calendar.getInstance();
		System.out.println(cal);
		int yr = cal.get(Calendar.YEAR);
		int mon = cal.get(Calendar.MONTH);
		int day = cal.get(Calendar.DATE);
		System.out.println(":"+(mon+1)+":"+yr);
		
		Date dt = new Date();
		long millis = dt.getTime();
		Calendar calendr = Calendar.getInstance();
		calendr.setTime(dt);
		calendr.setTimeInMillis(millis);

	}

}
