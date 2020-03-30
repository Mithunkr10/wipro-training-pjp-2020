package list;

import java.util.*;

/*Create an ArrayList that can store only numbers like int,float,double,etc, but not any other data type.*/

public class NumberArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList al=new ArrayList();

al.add(111.00);
al.add(11);
al.add(3.123456789087654);
al.add(1234.67f);
al.add("abc");

for(int i=0;i<al.size();i++) {
	Object a=al.get(i);
	if(a instanceof Integer||a instanceof Float||a instanceof Double||a instanceof Long||a instanceof Boolean)
		System.out.println(a);
}

	}

}
