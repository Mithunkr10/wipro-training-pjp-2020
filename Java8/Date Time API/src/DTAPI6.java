import java.time.LocalTime;

/* Write a program to display the current time and the time before 5 hours and 30 minutes.*/
public class DTAPI6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalTime t=LocalTime.now();
		//LocalTime t1=t.minusHours(5);
		//LocalTime t2=t1.minusMinutes(30);
		System.out.println("Current time: "+t);
		System.out.println("Time before 5hrs and 30 min: "+t.minusHours(5).minusMinutes(30));
	}

}
