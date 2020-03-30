/*Create a test suite for all the classes created in this tech module and execute the same*/



import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
	DemoTestJUnit.class,
	Demo2TestJUnit.class,
	EmployeeTestJUnit.class
	
})

public class TestSuite {

}
