
public class Sumexcludingrange {
public static void main(String[] args) 
{ 
int lis[] = {1, 2,5,6, 4, 5,7,8,9}; 

int a = 6; 
int b = 7;	
int sum = 0; 
boolean add = true; 

// loop in li 
for (int i = 0;  
i < lis.length; i++) 
{ 

// if no != a then add 
if (lis[i] != a &&  
add == true) 
sum = sum + lis[i]; 

// mark when a  
// and b are found  
else if (lis[i] == a) 
add = false; 
else if( lis[i] == b) 
add = true; 
} 

// print sum 
System.out.print(sum); 
} 

}
