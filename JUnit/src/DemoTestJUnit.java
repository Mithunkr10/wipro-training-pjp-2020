

import static org.junit.Assert.*;
import org.junit.Test;


public class DemoTestJUnit {
	String str="HelloWorld";
	Demo1 s=new Demo1();
	
	@Test
	public void teststringConcat() {
	System.out.println("testing String Concate");
		assertEquals(str,s.stringConcat("Hello","World"));
	}
}
