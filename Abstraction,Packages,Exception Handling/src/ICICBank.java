
public class ICICBank extends GeneralBank {
double savings=0.04,fixed=0.085;

@Override
public double getSavingsInterestRate(double amount) {
	// TODO Auto-generated method stub
	return amount*savings;
}
@Override
public double getFixedDepositInterestRate(double amount) {
	// TODO Auto-generated method stub
	return amount*fixed;
}
}
