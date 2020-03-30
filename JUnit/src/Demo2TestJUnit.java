

import static org.junit.Assert.*;
import org.junit.Test;


public class Demo2TestJUnit {
	boolean a=true;
	Demo2 d=new Demo2();
	
	@Test
	public void testpalindrome() {
		System.out.println("Testing Palindrome:");
		assertEquals(a,d.palindromeCheck("abbabba"));
	}

}
