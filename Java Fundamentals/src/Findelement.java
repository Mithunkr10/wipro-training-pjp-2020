
public class Findelement {
	   public static void main(String args[]){
		      int[] myArray = {55, 45, 69, 44};
		      int num = 55;

		      for(int i = 0; i<myArray.length; i++){
		         if(num == myArray[i]){
		            System.out.println(i);
		            System.exit(0);
		         }
		         else
		        	 System.out.println("-1");
		      }
		   }
}
