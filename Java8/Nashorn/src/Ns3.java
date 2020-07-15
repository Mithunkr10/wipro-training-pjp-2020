import java.io.FileNotFoundException;
import java.io.FileReader;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

/*Write a JavaScript code which creates a Java HashMap object, store 5 country and capital names as key and value.
Iterate them with for loop and display the elements one by one.*/
public class Ns3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ScriptEngineManager se=new ScriptEngineManager();
		ScriptEngine e=se.getEngineByName("nashorn");
		try {
			e.eval(new FileReader("C:\\Users\\Mithun\\Desktop\\Wipro Training PJP 2020\\Java8\\Nashorn\\src\\Hashmap.js"));
		} catch (ScriptException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

}
