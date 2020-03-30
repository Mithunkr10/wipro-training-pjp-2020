import java.util.Scanner;

/*i) Create the following class and implement the method to check whether the given string is a palindrome 
 * and return the result.

Class Name : Demo2
Method : palindromeCheck(String):boolean

(Hint: A String is palindrome,  If the reversed string is equal to the actual string. Ex: madam, mom, dad, malayalam )
ii) Create a Junit test class to test the above class.*/

public class Demo2 {
private StringBuffer str1;
private String str2;

public boolean palindromeCheck(String str) {
	boolean a=true;
	char c;
	str1 = new StringBuffer();
			
			
			str2 = str;
		
			for(int j=str2.length()-1;j>=0;j--)
			{
				c=str2.charAt(j);
				str1.append(c);
				
			}
			
			for(int j=0;j<str2.length();j++)
			if(str2.charAt(j)==str1.charAt(j))
				a=true;
			else
				a=false;
	
	return a;
}
public static void main(String[] args) {
	// TODO Auto-generated method stub
	Scanner in=new Scanner(System.in);
	Demo2 d=new Demo2();
	System.out.println("Enter a string:");
	String str=in.nextLine();
	System.out.println(d.palindromeCheck(str));
	in.close();
}

}
