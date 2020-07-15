/*Create an interface Test with an abstract method "int myFunction".
This function takes three integer parameters.

Write a program to create two Test reference variables t1 and t2.
t1 should add three integer parameters and t2 should multiply three integer parameters, 
using lambda expression.

Call myFunction using t1 and t2 reference variables, by passing three integer values and print the result.*/

interface Test{
	abstract int myFunction(int a,int b,int c);
}
public class Interface2 {

	private int myFunction(int a,int b,int c,Test t) {
		return t.myFunction(a, b, c);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interface2 inf2=new Interface2();
		Test t1=(int a,int b,int c)->a+b+c;
		System.out.println("Adding three values:"+(inf2.myFunction(3,4,5,t1)));
		Test t2=(int a,int b,int c)->a*b*c;
		System.out.println("Multiplying three values:"+(inf2.myFunction(3, 4, 5, t2)));
	}

}
