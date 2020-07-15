import java.util.ArrayList;
import java.util.List;


/*	
 Create a Student class with
1. Instance variables: rollNo, name, mark.
2. A parameterized constructor to initialize them.

Write a program
1. To add five Student objects into and ArrayList,
2. Filter the Student objects who have cleared the test with minimum 50 marks,
3. Get the count of how many have cleared and print it.
*/

public class SAPI3 {
	int rno;
	String name;
	float marks;
	SAPI3(int rno,String name,float marks)
	{
		this.marks=marks;
		this.rno=rno;
		this.name=name;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<SAPI3> emp=new ArrayList<SAPI3>();
		emp.add(new SAPI3(111,"Mithun",49));
		emp.add(new SAPI3(222,"Vijay",60));
		emp.add(new SAPI3(333,"Shadab",100));
		emp.add(new SAPI3(444,"Lochan",50));
		emp.add(new SAPI3(555,"Suhas",60));
	long c=emp.stream().filter(x->x.marks>=50).count();
	System.out.println(c);


	}

}
