import java.util.Scanner;
public class Demo1 {
public String stringConcat(String s1,String s2) {
	return s1+s2;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		  String s1,s2; Scanner in=new Scanner(System.in); 
		  s1=in.next(); s2=in.next();
		 Demo1 d=new Demo1(); 
		 System.out.println(d.stringConcat(s1, s2));
		 in.close();
		
	}

}
