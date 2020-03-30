import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class EmployeeTest {

	@Test
	public void testFindName() {
	
		ArrayList<String> arr= new ArrayList<String>();
		{	arr.add("mithun");
			arr.add("krishna");
			arr.add("shadab");
			arr.add("suhas");
		}
		
			assertEquals("Result","FOUND",new Employee().findName(arr,"mithun"));
	}

}
