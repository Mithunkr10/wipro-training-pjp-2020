import java.util.Optional;

/*Given an Employee object which may be initialized to null,
 *  use Optional class to check if it is null and 
to throw an user defined exception InvalidEmployeeException.*/

@SuppressWarnings("serial")
class InvalidEmployeeException extends Exception
{
	public InvalidEmployeeException() {
		System.out.println("Invalid Employee Exception");
	}
}
public class OC3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OC3 e=null;
		Optional<OC3> n=Optional.ofNullable(e);
		try {
			System.out.println(n.orElseThrow(InvalidEmployeeException::new));
		} catch (InvalidEmployeeException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}

}
