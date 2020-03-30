import java.util.Scanner;
public class SelectColour {
public static void main(String args[])
{
	 int color;
     Scanner SC=new Scanner(System.in);
      
     System.out.print("Enter a Letter(R,B,G,O,Y,W): ");
     color=SC.next().charAt(0);
      
     if(color!='R' && color!='B'&&color!='G'&&color!='O'&&color!='Y'&&color!='W'){
         System.out.println("Invalid Input.");
         System.exit(0);
     }
      
     //print weekday name according to give value
     switch(color){
           case 'R': 
               System.out.println("Red");
               break;
           case 'B': 
               System.out.println("Blue");
               break;
           case 'G': 
               System.out.println("Green");
               break;
           case 'O': 
               System.out.println("Orange");
               break;
           case 'Y': 
               System.out.println("Yellow");
               break;
           case 'W': 
               System.out.println("White");
               break;               
           default:
               System.out.println("Invalid");
               break;                  
     }
      
}
}
