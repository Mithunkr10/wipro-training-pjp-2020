/* Write a Java program that reads an integer number (between 1 and 255) from the user and prints 
 * the binary representation of the number. The answer should be printed as a String.

Note: The output displayed should contain 8 digits and should be padded with leading 0s(zeros), 
in case the returned String contains less than 8 characters.

For example, if the user enters the value 16, then the output should be
 00010000

and if the user enters the value 100, the output should be
 01100100

You are expected to use Integer class conversion method/s described in the PDF file. 
Use Scanner class to accept user inputs.
(Hint : You may use String.format() method for the expected output)*/

import java.util.Scanner;
public class BinaryinString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int i=in.nextInt();

	String str=String.format("%08d",Integer.parseInt(Integer.toBinaryString(i)));
		System.out.println(str);
				

	}

}
