import java.util.Scanner;

public class Repeatlast3 {
	
public String read()
{	Scanner in=new Scanner(System.in);
	String str1=in.nextLine();
	int n=in.nextInt();
	int len=str1.length()-n;
	String str2="";
	for(int i=0;i<n;i++)
	{
	str2=str2+str1.substring(len);
	}
	return str2;
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Repeatlast3 r=new Repeatlast3();
System.out.println(r.read());
	}
}
