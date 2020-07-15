import java.io.FileNotFoundException;
import java.io.FileReader;

import javax.script.*;

/* Write a JavaScript function which accepts a number and returns true if it is a prime number else returns false.
Save the code as Demo.js, invoke the function from a Java program and display the result. */
public class Ns2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ScriptEngineManager se=new ScriptEngineManager();
ScriptEngine e=se.getEngineByName("nashorn");

try {
	e.eval(new FileReader("C:\\Users\\Mithun\\Desktop\\Wipro Training PJP 2020\\Java8\\Nashorn\\src\\Demo.js"));
	Invocable i=(Invocable)e;
	boolean s=(boolean) i.invokeFunction("r",11 );
	System.out.println(s);
} catch (NoSuchMethodException e1) {
	// TODO Auto-generated catch block
	e1.printStackTrace();
} catch (ScriptException e1) {
	// TODO Auto-generated catch block
	e1.printStackTrace();
}catch (FileNotFoundException e1) {
	// TODO Auto-generated catch block
	e1.printStackTrace();
}
	}

}
