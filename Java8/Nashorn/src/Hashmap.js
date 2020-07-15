/*Write a JavaScript code which creates a Java HashMap object, store 5 country and capital names as key and value.
Iterate them with for loop and display the elements one by one.*/

var HashMap=Java.type("java.util.HashMap");
var hs=new HashMap();
hs.put("India", "Delhi");
hs.put("England", "London");
hs.put("Germany", "Berlin");
hs.put("Norway", "Oslo");
hs.put("USA", "Washington DC");
/*for(String s ; hs.keySet())
	print("Country:" +s+ " : Capital:"+hs.get(s));*/

print(hs);