/*Create an abstract class Instrument which is having the abstract function play. 

Create three more sub classes from Instrument which is Piano, Flute, Guitar. 
Override the play method inside all three classes printing a message 
“Piano is playing  tan tan tan tan  ”  for Piano class
“Flute is playing  toot toot toot toot”  for Flute class
“Guitar is playing  tin  tin  tin ”  for Guitar class 

Create an array of 10 Instruments.
Assign different type of instrument to Instrument reference.
Check for the polymorphic behavior of  play method.
Use the instanceof operator to print which object is stored at which index of instrument array.*/


public abstract class Instrument {

public abstract String play();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Instrument in[]=new Instrument[10];

for(int i=0;i<10;i++)
{
	if(i==0||i==3||i==6)
		in[i]=new Piano();
	else if(i==1||i==4||i==7)
		in[i]=new Flute();
	else
		in[i]=new Guitar();
	System.out.println(in[i].play());
	if(in[i] instanceof Piano)
		System.out.println("InstanceOf Piano"); 
	else if(in[i] instanceof Flute)
		System.out.println("InstanceOf Flute"); 
	else
		System.out.println("InstanceOf Guitar");
	System.out.println();
}

	}

}
