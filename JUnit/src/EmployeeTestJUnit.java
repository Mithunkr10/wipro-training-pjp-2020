

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;


public class EmployeeTestJUnit {

	@Test
	public void testFindName() {
		System.out.println("Testing Employee List");
	
		ArrayList<String> arr= new ArrayList<String>();
		{	arr.add("mithun");
			arr.add("krishna");
			arr.add("shadab");
			arr.add("suhas");
		}
			assertEquals("Result","FOUND",new Employee().findName(arr,"mithun"));
	
	}
}
