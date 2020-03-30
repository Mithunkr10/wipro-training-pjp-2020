/*Write a program to copy contents from one file to another and check the output.

Sample Input and Output:
Enter the input file name
Input.txt
Enter the output file name
Output.txt
File is copied.
*/

import java.io.*;
import java.util.Scanner;
public class Copycontent {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
Scanner in=new Scanner(System.in);



System.out.println("Enter the file you want to read:");
String f1=in.next();
System.out.println(new File(f1).getAbsolutePath());
System.out.println("Enter the file you want to write:");
	String f2=in.next();
	try {
        File input = new File("C:\\Users\\Mithun\\Desktop\\prgms\\IO operations\\src\\"+f1);
        File output = new File("C:\\Users\\Mithun\\Desktop\\prgms\\IO operations\\src\\"+f2);
       
        Scanner sc = new Scanner(input);
        PrintWriter printer = new PrintWriter(output);
        while (sc.hasNextLine()) {
            String s = sc.nextLine();
            printer.write(s);
        }
        System.out.println("File is copied");
        printer.flush();
        sc.close();
        printer.close();
  
    }
	catch(FileNotFoundException e) {
		e.printStackTrace();
	}

	in.close();
	
	}
}
