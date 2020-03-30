/*	
 Write a program to count the number of times a character appears in a File. 

[Note :  The character check is case insensitive... i.e, 'a' and 'A' are considered to be the same]

Sample Input and Output:
Enter the file name
Input.txt
Enter the character to be counted
r
File 'Input.txt' has 99 instances of letter 'r'.*/

import java.io.*;
import java.util.Scanner;

public class Countchar {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		char c;
		int count=0;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the file you want to read:");
		String fn=in.next();
		fn="C:\\Users\\Mithun\\Desktop\\prgms\\IO operations\\src\\"+fn;
		File file = new File(fn); 
		System.out.println("Enter the character u want to count:");
		c=in.next().charAt(0);
		Scanner fin=new Scanner(file);
        while(fin.hasNextLine())
        {String l=fin.nextLine();
        for(int i=0;i<l.length();i++)
        	if(l.charAt(i)==c)
        	{
        		count++;
        	}
        }
System.out.println("Number of charters: "+count);
fin.close();
in.close();
	}

}
