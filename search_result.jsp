<%@page import="java.sql.ResultSet"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"

    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All Leads..</title>
</head>
<body style="background-image: url(./32.avif);">
</br>
</br>
<div class="container" style="padding: 10px;text-align: center;">
<h3>All Registration Details </h3>
</div>
<table border="1" width="100%" height="150">

<tr>
<th>Name</th>
<th>Age</th>
<th>City</th>
<th>Email</th>
<th>MobNo</th>
</tr>
<%
ResultSet result=(ResultSet)request.getAttribute("result");
while(result.next()){

%>
<tr>
<td><%=result.getString(1) %></td>
<td><%=result.getString(2) %></td>
<td><%=result.getString(3) %></td>
<td><%=result.getString(4) %></td>
<td><%=result.getString(5) %></td>
</tr>

<%
}
%>
</table>
</body>
<style>
.containte p{
background-color:red;
}
</style>
</html>