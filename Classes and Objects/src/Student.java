
public class Student extends Person1 {
String studentid;

public Student(String s,String n,String d)
{
	super(n,d);
	studentid=s;
}
public String putter()
{
	return "Name:"+super.name+"DOB:"+super.dob+"Student ID:"+studentid;
}
}
