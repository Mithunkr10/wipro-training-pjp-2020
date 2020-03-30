/*Write a program to receive an integer number as a command line argument, and print the binary, octal and hexadecimal equivalent of the given number.

Sample Output:

java  Test 20
Given Number :20
Binary equivalent :10100
Octal equivalent :24
Hexadecimal equivalent :14*/

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=Integer.parseInt(args[0]);
		//int i=20;
System.out.println("Given number :"+i);
System.out.println("Binary equivalent :"+Integer.toBinaryString(i));
System.out.println("Octal equivalent :"+Integer.toOctalString(i));
System.out.println("Hexadecimal equivalent :"+Integer.toHexString(i));
	}

}
