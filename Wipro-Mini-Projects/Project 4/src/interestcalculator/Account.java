package interestcalculator;
import java.util.Scanner;

class Nonnegativevalue extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	double a;
	int nd,age;
	Nonnegativevalue(double a,int nd,int age){
this.a=a;
this.nd=nd;
this.age=age;
	}
	void disp() {if(a<0)
		System.out.println("Invalid Amount,Please enter a non-negative value");
	else if(age<0)
		System.out.println("Invalid age,Please enter a non-negative value");
	else
		System.out.println("Invalid Number of days,Please enter a non-negative value");
	}
}


public abstract class Account {
	double interestrate,amount;
	Account(double a){
	//	 this.interestrate=i;
		 this.amount=a;
	}
abstract double calculateinterest();



@SuppressWarnings("resource")
public static void main(String args[]) throws Nonnegativevalue {
	Scanner in=new Scanner(System.in);
	double a;
	int m,nd,age;
System.out.println("MAIN MENU\n------------");
System.out.println("1.Interest Calculator-SB\n2.Interest Calculator-FD\n3.Interest Calculator-RD");
System.out.println("Enter your option(1..4):");
int n=in.nextInt();
try {
switch(n)
{
case 1: System.out.println("Enter the average amount in your account:");
		a=in.nextDouble();
		System.out.println("1. Normal\n2. NRI");
		m=in.nextInt();
		if(m==1) {System.out.print("Interest Gained: Rs");
		SBAccount s=new SBAccount(0.04,a);
		System.out.print(s.calculateinterest());}
		else {System.out.print("Interest Gained: Rs");
		SBAccount s=new SBAccount(0.06,a);
		System.out.println(s.calculateinterest());}
		break;
case 2: System.out.println("Enter the FD amount");
		a=in.nextDouble();
		System.out.println("Enter the number of days:");
		nd=in.nextInt();
		System.out.println("Enter your age:");
		age=in.nextInt();
		if(a<0||nd<0||age<0) {
			throw new Nonnegativevalue(a,nd,age);
		} else {
		System.out.println("Interest gained is:Rs");
		FDAccount f=new FDAccount(a,nd,age);
		System.out.print(f.calculateinterest());}
		break;
case 3: System.out.println("Enter the FD amount");
		a=in.nextDouble();
		System.out.println("Enter the number of months:");
		nd=in.nextInt();
		System.out.println("Enter your age:");
		age=in.nextInt();
		if(a<0||nd<0||age<0) {
			throw new Nonnegativevalue(a,nd,age);
		} else {
		System.out.println("Interest gained is:Rs");
		RDAccount r=new RDAccount(a,nd,age);
		System.out.print(r.calculateinterest());}
		break;
case 4: System.exit(0);
		break;
		
default: System.exit(0);
		break;
		
}}
catch(Nonnegativevalue ne) {
	ne.disp();
	System.out.println(ne.getClass());
}

in.close();
}
}
