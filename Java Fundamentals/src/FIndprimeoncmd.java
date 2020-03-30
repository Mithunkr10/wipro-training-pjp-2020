
public class FIndprimeoncmd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
if(args.length<0)
	System.out.println("Please Enter a number");
else
{
	int n=Integer.parseInt(args[0]);
	if(n==0 || n==1)
		System.out.println(n+" is neither Prime nor Composite");
	else
	{int flag=0;
		for(int i=2;i<n;i++)
			if(n%i==0)
				flag=1;
		if(flag==0)
			System.out.println(n+" is Prime number");
		else
			System.out.println(n+" is Not Prime");
	}
}
	}

}
