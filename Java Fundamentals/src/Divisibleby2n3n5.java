
public class Divisibleby2n3n5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i=0,count=0;
while(count<5)
{
	if(i%2==0 && i%3==0 && i%5==0)
	{	System.out.println(i);
	count++;
	}
	i++;
}
	}

}
