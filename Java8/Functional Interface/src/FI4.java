import java.util.*;
import java.util.stream.Collectors;

/* Create an Employee class with three private variables id, name and salary.
Create getters & setters and a parameterized constructor.

Create an ArrayList and store 5 to 10 Employee objects in it. 
Write a program using Predicate, to filter and display the name of the employees whose salary is less than 10000.*/

public class FI4 {
	private int id,sal;
	private String name;
	
	FI4(int id,String name,int sal){
		this.id=id;
		this.name=name;
		this.sal=sal;
	}
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getSal() {
		return sal;
	}


	public void setSal(int sal) {
		this.sal = sal;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<FI4> al=new ArrayList<FI4>();
		al.add(new FI4(111,"Mithun",123445));
		al.add(new FI4(222,"Shadab",125));
		al.add(new FI4(333,"Suhas",123445));
		al.add(new FI4(444,"Vijay",123445));
		al.add(new FI4(555,"Lochan",123445));
		List<FI4> sa=al.stream().filter(x->x.getSal()>10000).collect(Collectors.toList());
		for(FI4 a:sa)
			System.out.println(a.getName());
	}

}
