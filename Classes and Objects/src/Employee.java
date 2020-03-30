
public class Employee extends Person {
double anualsalary;
String yearofjoin,nationalinsurancenum;
Employee(double as,String yj,String ni,String n)
{
super(n);
anualsalary=as;
yearofjoin=yj;
nationalinsurancenum=ni;
}

public String putter()
{ 
	return "Employee[super="+super.putname()+",Salary="+anualsalary+",Insurance number="+nationalinsurancenum+"]";
}

}
