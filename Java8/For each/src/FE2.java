import java.util.ArrayList;

/* Create an ArrayList and add 5 Employee(id,name,address,salary) objects.
Retrieve the objects from the ArrayList using forEach and print the Employee details.*/

public class FE2 {
	public int id;
	public static int count=0;
	public double sal;
	public String name,add;
	
	public FE2() {}
public FE2(int id,String name,String add,double sal)
{
	super();
	this.id=id;
	this.name=name;
	this.sal=sal;
	this.add=add;
	count++;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<FE2> al=new ArrayList<FE2>();
al.add(new FE2(111,"Mithun","Bangalore",1234545.90));
al.add(new FE2(222,"Vijay","Bangalore",1654343.44));
al.add(new FE2(333,"Suhas","Bangalore",2345678.88));
al.add(new FE2(444,"Shadab","Bangalore",398765.60));
al.add(new FE2(555,"Lochan","Bangalore",19876.90));
		al.forEach(
				s->{
					System.out.println(s.getId()+", "+s.getName()+", "+s.getSal()+", "+s.getAdd());
				}
				);
		
	}
	public int getId() {
		return id;
	}
	public double getSal() {
		return sal;
	}
	public String getName() {
		return name;
	}
	public String getAdd() {
		return add;
	}

}
