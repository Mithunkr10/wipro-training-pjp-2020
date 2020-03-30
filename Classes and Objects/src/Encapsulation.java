/* Create a class Author with the following information.
Member variables : name (String), email (String), and gender (char)
Parameterized Constructor: To initialize the variables


Create a class Book with the following information.
Member variables : name (String), author (of the class Author you have just created), price (double), 
and qtyInStock (int)
[Assumption: Each book will be written by exactly one Author]
Parameterized Constructor: To initialize the variables
Getters and Setters for all the member variables

In the main method, create a book object and print all details of the book (including the author details)*/

class Author{
	String name,email;
	char gender;
	Author(String n,String em,char g)
	{
		this.gender=g;
		this.name=n;
		this.email=em;
	}
}
class Book{
	String name;
	Author author;
	double price;
	int qtyinstock;
	String n=author.name;
Book(String n,Author a,double p,int q)
{
	this.name=n;
	this.author=a;
	this.price=p;
	this.qtyinstock=q;
}
}
public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char gender=args[2].charAt(0);
		Author a=new Author(args[0],args[1],gender);
		System.out.println(a);
		double p=Double.parseDouble(args[4]);
		int q=Integer.parseInt(args[5]);
		Book b=new Book(args[3],a,p,q);
		System.out.println(b);

	}

}
