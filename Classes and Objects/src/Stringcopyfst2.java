import java.util.Scanner;
public class Stringcopyfst2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner in=new Scanner(System.in);
String str=in.nextLine();
int n=str.length();
for(int i=0;i<n;i++)
{
	System.out.print(str.substring(0,2));
}
	}

}
