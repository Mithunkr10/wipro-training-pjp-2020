import java.util.*;
import java.util.stream.Collectors;

/* Create an Employee class with
1. Instance variables: empNo, name, age, location.
2. A parameterized constructor to initialize them.

Write a program
1. To add five Employee objects into an ArrayList,
2. Filter the Employee objects whose location is Pune,
3. Store them in a separate ArrayList and print their details.*/

public class SAPI2 {
	int empno,age;
	String name,loc;
	SAPI2(int empno,String name,int age,String loc){
		this.age=age;
		this.empno=empno;
		this.loc=loc;
		this.name=name;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<SAPI2> emp=new ArrayList<SAPI2>();
		emp.add(new SAPI2(111,"Mithun",21,"Bangalore"));
		emp.add(new SAPI2(222,"Vijay",22,"Bangalore"));
		emp.add(new SAPI2(333,"Shadab",22,"Pune"));
		emp.add(new SAPI2(444,"Lochan",22,"Bangalore"));
		emp.add(new SAPI2(555,"Suhas",22,"Pune"));
		List<SAPI2> li=emp.stream().filter(x->x.loc=="Pune").collect(Collectors.toList());
		for(SAPI2 a:li)
		System.out.println(a.empno+", "+a.name+", "+a.age+", "+a.loc);

	}

}
