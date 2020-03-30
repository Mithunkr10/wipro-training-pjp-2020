
public class Teacher extends Person1 {
double salary;
String sub;
Teacher(double sa,String s,String n,String d)
{
super(n,d);
salary=sa;
sub=s;
}
public String putter()
{
	return "Teacher:"+super.name+"DOB:"+super.dob+"Salary:"+salary+",Subject:"+sub;
}
}
