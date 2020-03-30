
public class GenderInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String Gender = args[0];
	        int age = Integer.parseInt(args[1]);
	        if(args.length==0)
	        {
	            System.out.println("Empty Arguments");
	        }  
	        else{
	            if(Gender.equals("Male") || Gender.equals("Female"))
	            {
	                if(age>1 && age<=100)
	                {
	                    if (Gender.equals("Female") && (age >= 1 && age <= 58)) {
	                        System.out.println("Interest == 8.2%");
	                    } else if (Gender.equals("Female") && (age >= 59 && age <= 100)) {
	                        System.out.println("Interest == 9.2%");
	                    } else if (Gender.equals("Male") && (age >= 1 && age <= 58)) {
	                        System.out.println("Interest == 8.4%");
	                    } else if (Gender.equals("Male") && (age >= 59 && age <= 100)) {
	                        System.out.println("Interest == 10.5%");
	                    }
	                }
	            }
	        }

	}

}
