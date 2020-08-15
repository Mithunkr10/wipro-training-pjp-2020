<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Delete Employee</title>
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
<form action="DeleteEmpById" >
<table>
<tr><th colspan="2">Delete Employee Details</th></tr>
<tr><td>Employee ID:</td><td><input type="text" name="id" required="required"/></td></tr>
<tr><td colspan="2" align="center"><input type="submit" value="Submit"/>
</table>
</form>
</div>
</body>
</html>