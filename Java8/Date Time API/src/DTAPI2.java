import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

/* Write a program to find the date of next month second Sunday.*/

public class DTAPI2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate d=LocalDate.now();
		LocalDate ss=d.plusMonths(1).with(TemporalAdjusters.dayOfWeekInMonth(2,DayOfWeek.SUNDAY));
		System.out.println("Second sunday of next month is on:"+ss);
	}

}
