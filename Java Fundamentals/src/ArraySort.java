
public class ArraySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {22,1,5,66,7,9,4,8};
System.out.println("The sorted array is:");
for(int i=0;i<a.length;i++) {
	for(int j=i;j<a.length;j++) {
		if(a[i]>a[j]) {
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
		}
	}}
	for(int i=0;i<a.length;i++)
	System.out.print(a[i]+" ");

	}

}
