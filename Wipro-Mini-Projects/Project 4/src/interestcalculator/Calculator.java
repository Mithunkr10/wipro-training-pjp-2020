package interestcalculator;

import static org.junit.Assert.*;

import org.junit.Test;

class ConcreteCalc extends Account{

	ConcreteCalc(double a) {
		super(a);
		// TODO Auto-generated constructor stub
	}

	@Override
	double calculateinterest() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
public class Calculator {

	@SuppressWarnings("deprecation")
	@Test
	public void test() {
		ConcreteCalc ac= new ConcreteCalc(10000.00);
		FDAccount fd=new FDAccount(10000.00,33,45);
		Account rd=new RDAccount(10000.00,33,45);
		Account sb=new SBAccount(0.05,10000.00);
		assertEquals(550.00,fd.calculateinterest(),0.0);
		assertEquals(750.00,rd.calculateinterest(),0.0);
		assertEquals(500.00,sb.calculateinterest(),0.0);
	}

}
