
import java.util.*;
import java.util.stream.Collectors;

/*	
 Given an ArrayList with 5 Employee(id,name,location,salary) objects,
write a program to extract the location details of each Employee and store it in an ArrayList, with the help of Function.
*/
@FunctionalInterface
interface Function{
	abstract String loc(String s);
}
public class FI1 {
	int id,sal;
	String name,loc;
	public FI1(int id,String name,int sal,String loc) {
		this.id=id;
		this.name=name;
		this.sal=sal;
		this.loc=loc;
	}
	public String toString() {
		return loc.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<FI1> al=new ArrayList<FI1>();
		al.add(new FI1(111,"Mithun",123445,"Bangalore"));
		al.add(new FI1(222,"Shadab",123445,"Bangalore"));
		al.add(new FI1(333,"Suhas",123445,"Mumbai"));
		al.add(new FI1(444,"Vijay",123445,"Bangalore"));
		al.add(new FI1(555,"Lochan",123445,"pune"));
		ArrayList<FI1> li=(ArrayList<FI1>) al.stream().filter(str->!str.loc.isEmpty()).collect(Collectors.toList());
		for(FI1 a:li)
			System.out.println(a.toString());

	}

}
