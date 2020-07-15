import java.time.LocalTime;

/*Write a program to display the current time and the time after 25 minutes.*/

public class DTAPI5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LocalTime t=LocalTime.now();
System.out.println("Current time: "+t);
System.out.println("Time after 25 min: "+t.plusMinutes(25));
	}

}
