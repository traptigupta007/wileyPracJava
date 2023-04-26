package day5;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate myDate=LocalDate.now();
		System.out.println(myDate);
		LocalDate myTime=LocalDate.now();
		System.out.println(myTime);
		LocalDateTime myDateTime=LocalDateTime.now();
		System.out.println("before format "+myDateTime);
		DateTimeFormatter modDateTime=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:MM:SS");
		String modDateTime1=myDateTime.format(modDateTime);
		System.out.println("after format "+modDateTime1);
		DateTimeFormatter modDateTimeFormat=DateTimeFormatter.ofPattern("yyyy-MM-dd");
		String modDateTime2=myDateTime.format(modDateTimeFormat);
		System.out.println("after format "+modDateTime2);	
		DateTimeFormatter modDateTimeFormat3=DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String modDateTime3=myDateTime.format(modDateTimeFormat3);
		System.out.println("after format "+modDateTime3);	
		DateTimeFormatter modDateTimeFormat4=DateTimeFormatter.ofPattern("dd-MMM-yyyy");
		String modDateTime4=myDateTime.format(modDateTimeFormat4);
		System.out.println("after format "+modDateTime4);	
		DateTimeFormatter modDateTimeFormat5=DateTimeFormatter.ofPattern("HH:mm:ss , MMM dd yyyy");
		String modDateTime5=myDateTime.format(modDateTimeFormat5);
		System.out.println("after format "+modDateTime5);
		String dateStr="01/01/2023";
		DateTimeFormatter format=DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate date1=LocalDate.parse(dateStr,format);
		System.out.println(date1);
	}

}
