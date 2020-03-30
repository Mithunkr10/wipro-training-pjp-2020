package interestcalculator;

public class FDAccount extends Account {
double i;
static double a;
static int nd;
static int age;
FDAccount(double a,int nd,int age){
	super(a);
	FDAccount.age=age;
	FDAccount.nd=nd;
	FDAccount.a=a;
}

	@Override
 double calculateinterest() {
		
		if(a<10000000) {
			if(nd>=7&&nd<=14) {
				if(age<60)
					i=0.0450;
				else
					i=0.05;
			}
			else if(nd>=15&&nd<=29) {
				if(age<60)
					i=0.0475;
				else
					i=0.0525;
			}
			else if(nd>=30&&nd<45) {
				if(age<60)
					i=0.055;
				else
					i=0.06;
			}
			else if(nd>=45&&nd<=60) {
				if(age<60)
					i=0.07;
				else
					i=0.0750;
			}
			else if(nd>=61&&nd<=184) {
				if(age<60)
					i=0.0750;
				else
					i=0.08;
			}
			else if(nd>=185){
				if(age<60)
					i=0.08;
				else
					i=0.085;
			}
		}
		
		else {
			if(nd>=7&&nd<=14) {
					i=0.065;
			}
			else if(nd>=15&&nd<=29) {

					i=0.0675;
			}
			else if(nd>=30&&nd<45) {

					i=0.0675;
			}
			else if(nd>=45&&nd<=60) {
					i=0.08;
			}
			else if(nd>=61&&nd<=184) {

					i=0.085;
			}
			else if(nd>=185) {

					i=0.1;
			}
			
		}
			return i*a;
		
	}}
