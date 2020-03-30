/* Create an abstract class Compartment to represent a rail coach. Provide an abstract
 *  function notice in this class. 

public abstract String notice();

Derive FirstClass, Ladies, General, Luggage classes from the compartment class. 
Override the notice function in each of them to print notice message that is suitable 
to the specific type of  compartment.

Create a class TestCompartment.Write main function to do the following:
Declare an array of Compartment of size 10.
Create a compartment of a type as decided by a randomly generated integer in the range 1 to 4.
Check the polymorphic behavior of the notice method.
[i.e based on the random  number genererated, the first compartment can be Luggage,
 the second one could be Ladies and so on..]*/

import java.util.Random;
public class TestCompartment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int Compartment[]=new int[10];
Compartments c=new FirstClass();
Compartments l=new Ladies();
Compartments g=new General();
Compartments lg=new Luggage();
Random r=new Random();
for(int i=0;i<10;i++)
{
	Compartment[i]=r.nextInt(4)+1;
}
for(int i=0;i<10;i++)
{
	if(Compartment[i]==1)
		System.out.println(c.notice());
	else if(Compartment[i]==2)
		System.out.println(l.notice());
	else if(Compartment[i]==3)
		System.out.println(g.notice());
	else
		System.out.println(lg.notice());
}
	}

}
