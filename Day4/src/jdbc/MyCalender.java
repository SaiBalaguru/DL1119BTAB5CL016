package jdbc;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
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
		
		LocalDate id = LocalDate.now();
		System.out.println(id);
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		System.out.println(dtf.format(id));
		System.out.println("The difference is: ");
		daystoDate("07-08-2020");

	}
	public static int daystoDate(String date) {
		int numdays = 0;
		LocalDate dt =  LocalDate.now();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		LocalDate temp = LocalDate.from(dtf.parse(date));
		dt = LocalDate.now();
		int year = dt.getYear();
		int mnth = dt.getMonthValue();
		int day = dt.getDayOfMonth();
		System.out.println(year+"-"+mnth+"-"+day);
		int tyear = temp.getYear();
		int tmnth = temp.getMonthValue();
		int tday = temp.getDayOfMonth();
		System.out.println(tyear+"-"+tmnth+"-"+tday);
		System.out.println("Using Chronounits");
		System.out.println(ChronoUnit.DAYS.between(dt, temp)); //chronounits are used for finding the difference
		return numdays;
		
	}

}
