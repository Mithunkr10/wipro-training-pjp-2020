import java.util.Scanner;

public class Mixcharofstring {

	public String read()
	{
		Scanner in=new Scanner(System.in);

		StringBuffer a=new StringBuffer();
		String str1=in.nextLine();
		String str2=in.nextLine();
		for(int i=0;i<str1.length()||i<str2.length();i++)
		{	if (i < str1.length()) 
            a.append(str1.charAt(i)); 
		  
  
        if (i < str2.length()) 
            a.append(str2.charAt(i)); 
		}
		return a.toString();
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mixcharofstring r=new Mixcharofstring();
System.out.println(r.read());
	}
}