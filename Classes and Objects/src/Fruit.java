
public class Fruit {
String name,taste,size;
public Fruit(String n,String t,String s)
{
	name=n;
	taste=t;
	size=s;
}
void eat()
{
	System.out.println("The Fruit "+name+" is "+taste);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Fruit f=new Fruit("Banana","Sweet","M");
Fruit a=new Apple("Apple","Sour","M");
Fruit o=new Orange("Orange","Sweet","L");
f.eat();
a.eat();
o.eat();
	}

}
