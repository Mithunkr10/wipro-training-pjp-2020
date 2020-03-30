
public class Orange extends Fruit {
	String name,size,taste;
Orange(String n,String t,String s)
	{ super(n,t,s);
		name=n;
		taste=t;
		size=s;
	}
	void eat()
	{
		System.out.println("Name:"+name+",Taste:"+taste);
	}


}
