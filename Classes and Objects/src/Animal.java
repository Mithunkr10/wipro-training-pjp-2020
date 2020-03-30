
public class Animal {
public void eat() {
	System.out.println("Eating");
}
public void sleep() {
	System.out.println("Sleeping");
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a=new Animal();
		a.eat();
		a.sleep();
		Bird b=new Bird();
		b.eat();
		b.sleep();
		b.fly();
	}

}

class Bird extends Animal{
	public void eat() {
		System.out.println("Bird Eating");
	}
	public void sleep() {
		System.out.println("Bird Sleeping");
	}
	public void fly() {
		System.out.println("Flying");
	}
}