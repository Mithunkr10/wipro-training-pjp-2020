/* Write a JavaScript code which displays the current system date and time.
Save the code as Sample.js, invoke it using jjs tool and display the result.*/
import java.io.FileNotFoundException;
import java.io.FileReader;

import javax.script.*;
public class Ns1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ScriptEngineManager se=new ScriptEngineManager();
ScriptEngine engine=se.getEngineByName("nashorn");
try {
	engine.eval(new FileReader("C:\\Users\\Mithun\\Desktop\\Wipro Training PJP 2020\\Java8\\Nashorn\\src\\Sample.js"));
} catch (FileNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} catch (ScriptException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
	}

}
