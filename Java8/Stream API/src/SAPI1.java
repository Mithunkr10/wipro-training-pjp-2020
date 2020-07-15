import java.util.ArrayList;

import java.util.stream.Collectors;

/*Write a program 
1. To filter the negative even numbers from an ArrayList,
2. Store them into a new ArrayList,
3. Print the ArrayList elements.
*/
public class SAPI1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(123);
		al.add(-34);
		al.add(-67);
		al.add(56);
		al.add(78);
		ArrayList<Integer> li=(ArrayList<Integer>) al.stream().filter(x->(x<0)).collect(Collectors.toList());
		for(Integer a:li)
			System.out.println(a);

	}

}
