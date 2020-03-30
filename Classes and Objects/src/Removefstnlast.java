import java.util.Scanner;
public class Removefstnlast {
	public String delstr(String str,int i)
	{
		return str.substring(0, i).concat(str.substring(i+1));
	}
	public String read()
	{
		Scanner in=new Scanner(System.in);
		String str=in.nextLine();
		str=delstr(str,0);
		return (delstr(str,str.length()-1));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Removefstnlast r=new Removefstnlast();
System.out.println(r.read());
	}

}
