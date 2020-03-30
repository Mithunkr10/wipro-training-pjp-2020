import static org.junit.Assert.*;

import org.junit.Test;

public class Demo2Test {

	
	@Test
	public void test() {
		
		Demo2 d=new Demo2();
		assertEquals("Result",true,d.palindromeCheck("aabbaa"));
	}

}
