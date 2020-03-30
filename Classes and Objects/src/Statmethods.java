class Calculator{
	

	public static double powerint(int num1,int num2)
	{ double a=num1,b=num2;
		return Math.pow(a,b);
	}
	public static double powerdouble(double num3,int num4)
	{
		double b=num4;
		return Math.pow(num3, b);
}
}
public class Statmethods {

/*	
	}*/
	public static void main(String[] args) {
//Calculator cal=new Calculator();
 int a=Integer.parseInt(args[0]);
int b=Integer.parseInt(args[1]);
double c=Double.parseDouble(args[2]);
int d=Integer.parseInt(args[3]);
System.out.println(Calculator.powerint(a,b));
System.out.println(Calculator.powerdouble(c,d));

	}

}
