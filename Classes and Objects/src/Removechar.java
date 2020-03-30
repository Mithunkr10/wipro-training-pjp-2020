import java.util.Scanner;

public class Removechar {
	public String delstr(String str,int i)
	{
		return str.substring(0, i).concat(str.substring(i+1));
	}
	public String read()
	{
		Scanner in=new Scanner(System.in);
		String str=in.nextLine();
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='*')
				{str=delstr(str,i);
			str=delstr(str,i-1);
			str=delstr(str,i-1);}			
		}

		return str;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Removechar r=new Removechar();
System.out.println(r.read());
	}

}
