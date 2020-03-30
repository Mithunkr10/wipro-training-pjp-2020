
public class Collegestudent extends Student {
String clgname,year;
Collegestudent(String c,String y,String s,String n,String d)
{
	super(s,n,d);
	clgname=c;
	year=y;	
}
public String putter()
{
	return "Name:"+super.name+"DOB"+super.dob+"Student ID:"+super.studentid+"College Name:"+clgname+"Year:"+year;
}
}
