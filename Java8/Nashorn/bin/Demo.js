/* Write a JavaScript function which accepts a number and returns true if it is a prime number else returns false.
Save the code as Demo.js, invoke the function from a Java program and display the result. */

var r=function (n)
{
	for(var i=2;i<n;i++)
		{
		if(n%i==0)
			return false;
		}
	return true;
}