/* Create an interface Vehicle with a default method message() that returns nothing and prints
 *  "Inside Vehicle".
Create an interface FourWheeler with a default method message() that returns nothing and prints 
"Inside FourWheeler".

Create a class Car implementing these two interfaces. 
In this class, Override the message() method and call the message() method of the Vehicle interface 
using super keyword. 

Instantiate the class, call the message method and observe the output.*/

interface Vehicle{
	default void message() {
		System.out.println("Inside Vehicle");
	}
}
interface FourWheeler{
	default void message() {
		System.out.println("Inside FourWheeler");
	}
}
public class Interface1 implements Vehicle,FourWheeler {

	public void message() {
		System.out.println("Inside class Car");
		Vehicle.super.message();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interface1 in=new Interface1();
		in.message();

	}

}
