import java.util.Scanner;

public class Stringpalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str;

Scanner in=new Scanner(System.in);
System.out.println("Enter a string:");
str=in.nextLine();

StringBuffer rstr=new StringBuffer(str);

String str1=rstr.reverse().toString();
System.out.println(str1);

if(str1.equals(str))
{
	System.out.println("The string "+str+" is a panidrome");
}
else
	System.out.println("The string "+str+" is not a palindrome");

	in.close();
	}

}
