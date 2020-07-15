import java.util.Scanner;

/* Create an interface WordCount with a single abstract method int count(String str), to count and return the
 *  no of words in the given String. 
Implement count method using Lambda expression in another class MyClassWithLambda.
Invoke it to display the result on the console.*/

interface wordcount{
	int count(String str);
}
public class LE4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
wordcount wc=(str)->(str.length());
System.out.println("Enter a string:");
Scanner in=new Scanner(System.in);
String str1=in.next();
	int n=wc.count(str1);
	System.out.println("Length of \""+str1+"\" is "+n);
in.close();
	}
	

}
