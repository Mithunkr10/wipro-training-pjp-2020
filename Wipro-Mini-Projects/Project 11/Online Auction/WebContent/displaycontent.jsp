<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Online Auction</title>
<style>

div.p{
background-color:"yellow";
text-align:"center";
padding-left:50px;
}
table, th, td{
border:2px solid white;
border-collapse: collapse;
}
</style>
</head>
<body >
<div class="p" align="center" style="background-color:yellow;">
<h1 align="center">Bid Submitted</h1>
<h4 align="center">Your bid is active. If your bid is successful, you will be notified within 24 hours of the close of bidding.</h4>
<table>
<tr>
<th style="color:white; background-color:black;" colspan="2" ><%= request.getAttribute("item_name") %></th>
</tr>
<tr>
<td colspan="2" align="center">Item ID:<%= request.getAttribute("item_id") %></td>
</tr>
<tr>
<td colspan="2" align="center">Name:<%= request.getAttribute("uname") %></td>
</tr>
<tr>
<td colspan="2" align="center">Email Address:<%= request.getAttribute("email") %></td>
</tr>
<tr>
<td colspan="2" align="center">Bid Amount:<%= request.getAttribute("bid_amt") %></td>
</tr>
<tr>
<td colspan="2" align="center">Auto-increment Bid to match other Bider's: true</td>
</tr>
</table>
<br>
</div>
</body>
</html>