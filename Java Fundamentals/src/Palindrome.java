
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	      
	      int reversenum =0;
	      System.out.println("Input your number and press enter: "+args[0]);
	      int num=Integer.parseInt(args[0]);
	      //This statement will capture the user input
		/*
		 * Scanner in = new Scanner(System.in); //Captured input would be stored in
		 * number num num = in.nextInt();
		 */
	      int temp=num;
	      //While Loop: Logic to find out the reverse number
	      while( num != 0 )
	      {
	          reversenum = reversenum * 10;
	          reversenum = reversenum + num%10;
	          num = num/10;
	      }
if(temp==reversenum)
	      System.out.println(args[0]+" is a Palindrome");
else
	System.out.println(args[0]+" is not a Palindrome");
	}

}
