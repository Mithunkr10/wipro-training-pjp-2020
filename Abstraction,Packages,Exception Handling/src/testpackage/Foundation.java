/*Create a package called test package.
Define a class called foundation inside the test package.
Inside the class, you need to define 4 integer variables:
var1 with private access modifier
var2 with default access modifier
var3 with protected access modifier
var4 with public access modifier

Import this class and packages in another class. 
Try to access all 4 variables of the foundation class and see what variables are accessible and what are not accessible.*/

package testpackage;

public class Foundation {
	@SuppressWarnings("unused")
	private int var1=4;
	int var2=3;
	private int var3=2;
	public static int var4=1;
	public int getVar3() {
		return var3;
	}
	public void setVar3(int var3) {
		this.var3 = var3;
	}

	

}
