import java.time.*;

/* Write a program to display today's date and the date after ten days.*/

public class DTAPI1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate d=LocalDate.now();
		System.out.println("Today's date:"+d);
		System.out.println("Date after 10 day's:"+d.plusDays(10));

	}

}
