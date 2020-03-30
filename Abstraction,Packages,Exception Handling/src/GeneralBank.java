
public abstract class GeneralBank {
	char c;
	
	double amount;

public abstract double getSavingsInterestRate(double amount);
public abstract double getFixedDepositInterestRate(double amount);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	ICICBank i=new ICICBank();

	//	 KotMBank k=new KotMBank();

		//GeneralBank g=new KotMBank();

		 GeneralBank g=new ICICBank();
		System.out.println(g.getFixedDepositInterestRate(100000.00));
		System.out.println(g.getSavingsInterestRate(10000.00));
		
	}

}
