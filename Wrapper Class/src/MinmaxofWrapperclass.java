/*Write a java program that generates the minimum and maximum value for each of the Numeric Wrapper classes (Byte, Short, nteger, Long, Float, Double)

Sample Output:
Integer range: 
min: -2147483648 
max: 2147483647 
Double range: 
min: 4.9E-324 
max: 1.7976931348623157E308 
Long range: 
min: -9223372036854775808 
max: 9223372036854775807 
Short range: 
min: -32768 
max: 32767 
Byte range: 
min: -128 
max: 127 
Float range: 
min: 1.4E-45 
max: 3.4028235E38*/

public class MinmaxofWrapperclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Integer range\nmin:"+Integer.MIN_VALUE+"\nmax:"+Integer.MAX_VALUE);
		System.out.println("Double range\nmin:"+Double.MIN_VALUE+"\nmax:"+Double.MAX_VALUE);
		System.out.println("Long range:\nmin:"+Long.MIN_VALUE+"\nmax:"+Long.MAX_VALUE);
		System.out.println("Short range:\nmin:"+Short.MIN_VALUE+"\nmax:"+Short.MAX_VALUE);
		System.out.println("Byte range:\nmin:"+Byte.MIN_VALUE+"\nmax:"+Byte.MAX_VALUE);
		System.out.println("Float range\nmin:"+Float.MIN_VALUE+"\nmax:"+Float.MAX_VALUE);
	}

}
