
public class Apple extends Fruit{
String name,size,taste;
Apple(String n,String t,String s)
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
