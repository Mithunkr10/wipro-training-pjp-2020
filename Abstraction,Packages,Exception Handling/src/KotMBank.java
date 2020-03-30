
public class KotMBank extends GeneralBank {
double savings=0.06,fixed=0.09;
public double getSavingsInterestRate(double amount)
{
		return amount*savings;

}
public double getFixedDepositInterestRate(double amount)
{
		return amount*fixed;
}
}
