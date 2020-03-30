package list;

/*Write a program that will have a Vector which is capable of storing Employee objects.
 *  Use an Iterator and enumeration to list all the elements of the Vector.*/

import java.util.Iterator;
import java.util.Vector;

class Emp {
	private int id;
	private String name;
	private String address;
	private Double salary;
	
	public Emp(int id, String name, String address, Double salary) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.salary = salary;
	}	
	
	public int getId() {
		return id;
	}

}

public class EmployeeVector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Vector<Emp> list = new Vector<>();
		
		list.add(new Emp(101, "Bob", "123 street, India", 20000.0));
		list.add(new Emp(102, "Alice", "234 street, India", 30000.0));
		list.add(new Emp(103, "John", "345 street, India", 25000.0));
		list.add(new Emp(104, "Stuart", "456 street, India", 40000.0));
		
		Iterator<Emp> it = list.iterator();
		while (it.hasNext()) 
			System.out.println(it.next());
	}

}
