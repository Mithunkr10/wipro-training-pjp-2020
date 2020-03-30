/* Write a java program that will concatenate 2 strings and return the result. The result 
 * should be in lowercase.

Note:If the concatenation creates a double-char, then one of the characters need to be omitted.

Example1)
i/p:Sachin,Tendulkar
o/p:sachin tendulkar

Example2)
i/p:Mark,kate
o/p:markate*/
import java.util.Scanner;
public class Stringconcat {
	public static String delstr(String str,int i)
	{
		return str.substring(0,i) + str.substring(i+1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1,str2;
		Scanner in=new Scanner(System.in);
		str1=in.nextLine();
		str2=in.nextLine();
		System.out.println("Concatinating the 2 strings...");
		int a=str1.length(),b=str2.length();
		Character s1=str1.charAt(a-1),s2=str2.charAt(0);

		if(s1.equals(s2)==true)
		{ str1=delstr(str1,a-1);
			System.out.println(str1.concat(str2));
		}
		else
			System.out.println(str1.concat(str2));
	}

}
