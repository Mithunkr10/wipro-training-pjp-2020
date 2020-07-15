import java.util.Optional;

/*Given a String address, print the address if it is not null or else print the default address as "India".*/

public class OC2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String add = null;
String default_add="India";
Optional<String> n=Optional.ofNullable(add);
System.out.println(n.orElse(default_add));
	}

}
