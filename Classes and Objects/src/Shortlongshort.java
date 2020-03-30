	import java.util.Scanner;
public class Shortlongshort {


	    public static void main (String[] args) 
	    {
	        // your code goes here
	        Scanner scanner = new Scanner(System.in);
	        String a = scanner.next();
	        String b = scanner.next();
	        if(a.length() > b.length())
	        System.out.println(b+a+b);
	        else
	        System.out.println(a+b+a);
	    }
	}

