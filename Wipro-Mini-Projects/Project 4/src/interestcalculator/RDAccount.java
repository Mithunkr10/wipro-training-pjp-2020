package interestcalculator;

public class RDAccount extends Account {
	double i;
	static double a;
	int nd,age;
	RDAccount(double a,int nd,int age) {
		super(a);
		// TODO Auto-generated constructor stub
	this.nd=nd;
	this.age=age;
	RDAccount.a=a;
	}
	@Override
	double calculateinterest() {
		// TODO Auto-generated method stub
		if(nd>=6) {
			if(age<60) 
				i=0.075;
			else
				i=0.08;
		}
		else if(nd>=9) {
			if(age<60)
				i=0.075;
			else
				i=0.0825;
		}
		else if(nd>=12) {
			if(age<60)
				i=0.08;
			else
				i=0.085;
		}
		else if(nd>=15) {
			if(age<60)
				i=0.0825;
			else
				i=0.0875;
		}
		else if(nd>=18) {
			if(age<60)
				i=0.085;
			else
				i=0.09;
		}
		else if(nd>=21) {
			if(age<60)
				i=0.0875;
			else
				i=0.0925;
		}
		return i*a;
	}

}
