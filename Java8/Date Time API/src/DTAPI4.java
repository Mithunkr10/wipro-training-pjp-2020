import java.time.LocalDate;

/*Write a program to check whether the current year is a leap year.*/

public class DTAPI4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LocalDate d=LocalDate.now();
System.out.println(d+" is leap year? "+d.isLeapYear());
	}

}
