
public class KidUsers implements Libraryuser {
	KidUsers(int a,String b)
	{
		age=a;
		booktype=b;
	}
int age;
String booktype;
	@Override
	public void registerAccount() {
		// TODO Auto-generated method stub
		if( age <= 12)
			System.out.println("You have successfully registered under a Kids Account"); 

		if(age>12)
		System.out.println("Sorry, Age must be less than 12 to register as a kid"); 
		 
	}

	@Override
	public void requestBook() {
		// TODO Auto-generated method stub
		if (booktype.equals("Kids"))
			System.out.println("Book Issued successfully, please return the book within 10 days");
		else
			System.out.println("Oops, you are allowed to take only kids books");
		
	}

}
