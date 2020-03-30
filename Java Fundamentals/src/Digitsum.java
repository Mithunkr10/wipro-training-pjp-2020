import java.util.Scanner;
public class Digitsum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int sum = 0; 
		  Scanner in=new Scanner(System.in);
          int n=in.nextInt();
	        while (n != 0) 
	        { 
	            sum = sum + n % 10; 
	            n = n/10; 
	        }
	        System.out.println(sum);
	}

}
