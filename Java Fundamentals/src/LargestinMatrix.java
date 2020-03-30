
public class LargestinMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
if(args.length<9)
	System.out.println("Please enter 9 inputs");
else
{
int arr[][]=new int[3][3];
    int k=0;
for(i=0;i<3;i++)
{
    for(int j=0;j<3;j++)
    {
        
    arr[i][j]=Integer.parseInt(args[k]);
    k++;
    }
    
}
System.out.println("The given array is:");
for(i=0;i<3;i++)
{
    for(int j=0;j<3;j++)
    {
    System.out.print(arr[i][j]+" ");
    }
    System.out.println();
    
}
int maxValue = arr[0][0]; 
for(i=0;i <3;i++){
	for(int j=0;j<3;j++) {
		if(arr[i][j] > maxValue){ 
     maxValue = arr[i][j];
  }}}
System.out.println("Maximum Value is: "+maxValue);
}
	}

}
