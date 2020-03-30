import static org.junit.Assert.*;

import org.junit.Test;

import static org.junit.Assert.assertEquals;



public class Demo1Test {

	@Test
public void testStringConcat() {
		Demo1 myUnit = new Demo1();
		String result=myUnit.stringConcat("Hello","World");
		assertEquals("Reason for Failure", "HelloWorld", result);
	}

}
