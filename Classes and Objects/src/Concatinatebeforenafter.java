import java.util.Scanner;

public class Concatinatebeforenafter {
	public int isSubstring(String s1, String s2, int m) 
    { int n=-1;
			if(s1.contains(s2))
			{
				n=s1.indexOf(s2,m);
			}
			return n;
    }
      
    /* Driver program to test above function */
    public static void main(String args[]) 
    { Concatinatebeforenafter co=new Concatinatebeforenafter();
    	Scanner in=new Scanner(System.in);
        String s1 = in.nextLine(); 
        String s2 = in.nextLine(); 
          for(int res=0,i=0;i<s1.length()/4;i++,res++) {
         res = co.isSubstring(s1, s2,res); 
          
        if (res == -1) 
            continue; 
        else
        { 
        	if(res==0)
        	{
        		char a=s1.charAt(res+s2.length());
        		System.out.print(a);
        	}
        	else
        	{ StringBuilder s=new StringBuilder();
        		char b=s1.charAt(res-1);
        		char a=s1.charAt(res+s2.length());
        		s.append(b);
        		s.append(a);
        		System.out.print(s);
        	}
        }
       
          }

    }
}
