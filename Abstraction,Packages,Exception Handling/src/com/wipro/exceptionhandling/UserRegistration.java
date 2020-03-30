/* A student portal provides user to register their profile. During registration the system needs
 *  to validate the user should be located in India. If not the system should throw an exception.

Step 1: Create a user defined exception class named “InvalidCountryException”.
Step 2: Overload the respective constructors.
Step 3: Create a main class “UserRegistration”, add the following method,
void registerUser(String username,String userCountry) with the below implementation
• if userCountry is not equal to  “India” throw a InvalidCountryException with the message
 “User Outside India  cannot be registered”
• if userCountry is equal to  “India”,  print the message “User registration done successfully”

Invoke the method registerUser from the main method with the data specified and see how the program behaves.
Example1)
i/p:Mickey,US 
o/p:InvalidCountryException should be thrown.
The message should be “User Outside India  cannot be registered”

Example2)
i/p:Mini,India
o/p:User registration done successfully*/

package com.wipro.exceptionhandling;

import java.util.Scanner;

class InvalidCountryException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
String cy;
	InvalidCountryException(String c){
		this.cy=c;
	}
	void check()
	{	if(!cy.equals("India"))
		{
			System.out.println("User Outside India cannot be registered");
		}
	}
	
}
public class UserRegistration {
	void registerUser(String username,String userCountry)
	{
	System.out.println("User registration done successfully");	
	}

	@SuppressWarnings("resource")
	public static void main(String[] args) throws InvalidCountryException {
		// TODO Auto-generated method stub
UserRegistration u=new UserRegistration();
Scanner in = new Scanner(System.in);

try {
	String name=in.next();
String country=in.next();
if(country.equals("India")) {
	u.registerUser(name,country);
}
else
	{
	throw new InvalidCountryException(country);
	}

	}
catch(InvalidCountryException e)
{
	e.check();
}
in.close();
	}
}
