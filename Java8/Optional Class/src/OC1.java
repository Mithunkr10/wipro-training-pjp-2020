import java.util.*;
/* Use Optional class and avoid NullPointerException from the below code:

String names[ ] = new String[5];
System.out.print(names[0].length( ));
*/
public class OC1 {
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String names[ ] = new String[5];
		Optional<String> n=Optional.ofNullable(names[0]);
		if(n.isPresent())
		{ 
			System.out.print(names[0].length( ));
		}
		else
			System.out.println("null value");
		
		
		
	}

}
