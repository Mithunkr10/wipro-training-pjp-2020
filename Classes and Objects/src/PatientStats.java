/*Name of the class - Patient
Member Variables - patientName(String),height(double),width(double)
Member Function - double computeBMI()
The above method should compute the BMI and return the result. The formula for computation of BMI  is 
weight (in kg) ÷ height*height(in metres).
Create an object of the Patient class and check the results.*/
class Patient{
	String patientName;
	double height,weight;
	Patient(String name,double wght,double hght)
	{
		this.patientName=name;
		this.height=hght;
		this.weight=wght;
	}
	public double computeBMI()
	{
		return weight/(height*height);
	}
}
public class PatientStats {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		  String n=args[0];
		  double w=Double.parseDouble(args[1]); 
		  double h=Double.parseDouble(args[2]);
		 
		Patient p=new Patient(n,w,h);
		System.out.println(p.computeBMI()+" kg/m");
	}

}
