/* Create a class called compartment which represents the ship compartments with attributes like height, 
 * width and breadth. 

Take care it should not conflict with the compartment class you have created in Abstract class exercise 2.

To avoid conflict create this class in a new package called com.wipro.automobile.ship*/

package com.wipro.automobile.ship;
import java.util.Scanner;
public class Compartment {
	static double height,width,breadth;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		height=in.nextDouble();
		width=in.nextDouble();
		breadth=in.nextDouble();
		System.out.println(height*width*breadth);
	}

}
