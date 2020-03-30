import java.util.Scanner;

public class Removexbothsides {

	public String delstr(String str,int i)
	{
		return str.substring(0, i).concat(str.substring(i+1));
	}
	public String read()
	{
		Scanner in=new Scanner(System.in);
		String str=in.nextLine();
		if(str.charAt(0)=='x')
			str=delstr(str,0);
		if(str.charAt(str.length()-1)=='x')
			str=delstr(str,str.length()-1);
		else
			return str;
		return str;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Removexbothsides r=new Removexbothsides();
System.out.println(r.read());
	}

}
