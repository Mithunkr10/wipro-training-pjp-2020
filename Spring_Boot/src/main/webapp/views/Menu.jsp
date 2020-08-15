    <%@ page isELIgnored="false" %>
<html>
<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
<style>
a{
text-align:"center";
}
div {
margin-top: 50pt;
margin-left:auto;
margin-right:auto;
  text-align: center;
  border: 3px solid green;
}
</style>
</head>
<title>Menu</title>
<body>
<div>
<h2 align="center">Welcome To Employee DataBase</h2>
<h3 align="center">${msg}</h3><br>

<a href="AddEmp" class="btn btn-primary btn-lg active" role="button" aria-pressed="true">Add New Employee</a><br>
<a href="Modify" class="btn btn-primary btn-lg active" role="button" aria-pressed="true">Modify Employee Records</a><br>
<a href="DispById" class="btn btn-primary btn-lg active" role="button" aria-pressed="true">Display Employee By ID</a><br>
<a href="DisplayAll" class="btn btn-primary btn-lg active" role="button" aria-pressed="true">Display All Employees</a><br>
<a href="DeleteEmp" class="btn btn-primary btn-lg active" role="button" aria-pressed="true">Delete Employee Records</a><br>
</div>
</body>
</html>
