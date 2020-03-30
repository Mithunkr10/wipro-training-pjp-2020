
public class Maincollege {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Person1 p=new Person1("Mithun,","11/02/1999");
Teacher t=new Teacher(10000.22,"Java","Mithun,","11/02/1999,");
Student s=new Student("E2939,","Mithun,","11/02/1999,");
Collegestudent c=new Collegestudent("SVCE,","forth","E2939,","Mithun,","11/02/1999,");
System.out.println(p.putter());
System.out.println(t.putter());
System.out.println(s.putter());
System.out.println(c.putter());

	}

}
