
public class Month {
public static void main(String args[])
{
	if(args.length<0)
		System.out.println("Enter a valid number");
	else {
		
	System.out.println("Enter a value"+args[0]);
	int num=Integer.parseInt(args[0]);
	 switch (num)
	    {
	    case 1:
	        System.out.println ("The name of month number 1 is January");
	        break;
	    case 2:
	        System.out.println ("The name of month number 2 is February");
	        break;
	    case 3:
	        System.out.println ("The name of month number 3 is March");
	        break;
	    case 4:
	        System.out.println ("The name of month number 4 is April");
	        break;
	    case 5:
	        System.out.println ("The name of month number 5 is May");
	        break;
	    case 6:
	        System.out.println ("The name of month number 6 is June");
	        break;
	    case 7:
	        System.out.println ("The name of month number 7 is July");
	        break;
	    case 8:
	        System.out.println ("The name of month number 8 is August");
	        break;
	    case 9:
	        System.out.println ("The name of month number 9 is September");
	        break;
	    case 10:
	        System.out.println ("The name of month number 10 is October");
	        break;
	    case 11:
	        System.out.println ("The name of month number 11 is November");
	        break;
	    case 12:
	        System.out.println ("The name of month number 12 is December");
	        break;
	        default:
	            System.out.println ("Invalid Month");
	            break;
	    }
	 }
}
}
