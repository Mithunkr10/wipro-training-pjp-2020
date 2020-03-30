
public class MinMaxofarray {
	  public static void main(String args[]){
		    int inputArray[] = new int[]{10, 11, 88, 2, 12, 120};
		 
		    // Calling getMax() method for getting max value
		
		    int maxValue = inputArray[0]; 
		    for(int i=1;i < inputArray.length;i++){ 
		      if(inputArray[i] > maxValue){ 
		         maxValue = inputArray[i];
		      }}
		    System.out.println("Maximum Value is: "+maxValue);
		 
		    // Calling getMin() method for getting min value
		    
		    int minValue = inputArray[0]; 
		    for(int i=1;i<inputArray.length;i++){ 
		      if(inputArray[i] < minValue){ 
		        minValue = inputArray[i]; 
		      } 
		    } 
		    System.out.println("Minimum Value is: "+minValue);
		  }
		 
		 
}
