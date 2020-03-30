
public class Floydsformat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		if(args.length<0)
			System.out.println("Please enter a value");
		else
			{
			int n=Integer.parseInt(args[0]);
		int i=n-1;
			while(i>=0) 
		{System.out.println();
			for(int j=i;j<n;j++)
				System.out.print("* ");
	i--;}
		}
	}
}
