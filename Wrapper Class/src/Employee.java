/*Create an employee class with properties of your choice.
 *  Create an object of this class and also create a clone of the same. 
 *  After making the clone, change the properties of the original employee object and 
 *  print the properties of both the original and clone object and note down your observation.*/
class Emp{
	double sal,bonus;
	Emp(){
		sal=100000.00;
		bonus=2500.00;
	}
}
public class Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Emp e=new Emp();
System.out.println("Total salary with original Object:"+(e.sal+e.bonus));
Emp e2=e;
e2.bonus=3000.00;
System.out.println("Total salary after cloning:"+(e2.sal+e2.bonus));
	}

}
