
public class Primenumin10to99 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
for(int n=10;n<=99;n++)
{
	int flag=0;
		for(int i=2;i<n;i++)
			if(n%i==0)
				flag=1;
		if(flag==0)
			System.out.println(n);

	
}
	}

}
