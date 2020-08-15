<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home|Add Employee</title>
</head>
<body>
<form action="AddEmp">
Enter EmployeeID:<input type="text" name="id"/>
Enter User-name: <input type="text" name="name"/>
Enter Password: <input type="text" name="pswd" />
<input type="submit" value="Add Employee" >
</form>
${msg }
</body>
</html>