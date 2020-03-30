package interestcalculator;

public class SBAccount extends Account {
	double i,a;
	SBAccount(double i, double a) {
		super(a);
		this.i=i;
		this.a=a;
		// TODO Auto-generated constructor stub
	}

	@Override
	double calculateinterest() {
		// TODO Auto-generated method stub
		return i*a;
	}

}
