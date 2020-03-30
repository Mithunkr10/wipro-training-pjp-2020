import java.util.Scanner;
public class Primenum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner in=new Scanner(System.in);
System.out.println("Enter a number");
int n=in.nextInt();
int flag=0;
if(n<=0)
	System.out.println("Not Prime");
else
{
	for(int i=2;i<n;i++)
		if(n%i==0)
			flag=1;
	if(flag==0)
		System.out.println("Prime number");
	else
		System.out.println("Not Prime");
}
	}

}
