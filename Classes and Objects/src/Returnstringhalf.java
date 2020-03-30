import java.util.Scanner;
public class Returnstringhalf {
public String Substring()
{
	Scanner in=new Scanner(System.in);
	String str=in.nextLine();
	if(str.length()%2==0)
	{
		return str.substring(0,str.length()/2);
	}
	else
		return "NULL";
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Returnstringhalf r=new Returnstringhalf();
System.out.println(r.Substring());
	}

}
