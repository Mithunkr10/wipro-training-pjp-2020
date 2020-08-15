<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Employee</title>
<style>
div{
border:1pt solid green;
position:absolute;
left:40%;
top:30%;
trsanform:translate(-50%,-50%);
}
table,th,td{
text-align:"center";
border:1pt solid black;
}
</style>
</head>
<body>
<div>
<form action="AddEmployee">
<table>
<tr><th colspan="2">Add New Employee Details</th></tr>
<tr><td>Employee ID:</td><td><input type="text" name="id" required="required"/></td></tr>
<tr><td>Employee Name:</td><td><input type="text" name="Name" required="required"/></td></tr>
<tr><td>Gender:</td><td><input type="text" name="Gender" required="required"/></td></tr>
<tr><td>Designation:</td><td><input type="text" name="Designation" required="required"/></td></tr>
<tr><td>Email:</td><td><input type="text" name="Email" required="required"/></td></tr>
<tr><td>City:</td><td><input type="text" name="City" required="required"/></td></tr>
<tr><td>Salary:</td><td><input type="text" name="Salary" required="required"/></td></tr>
<tr><td>Phone:</td><td><input type="text" name="Phone" required="required"/></td></tr>
<tr><td colspan="2" align="center"><input type="submit" value="Submit"/>
</table>
</form>
</div>
</body>
</html>