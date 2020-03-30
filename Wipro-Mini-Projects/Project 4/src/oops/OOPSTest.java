package oops;
import static org.junit.Assert.*;

import org.junit.Test;

public class OOPSTest {

	@Test
	public void test() {
		VideoLauncher vl=new VideoLauncher();
		Video c=new Video("Mithun");
		VideoStore vs=new VideoStore();
		assertEquals("Mithun",c.getname());
	
	}

}
