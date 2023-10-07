<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login here....</title>
</head>
<body class="container">
<form action="verifyLogin" method="post" class="loginform">
<table>
<tr class="p"><td><p>----ENTER ID/PASS----</p></td></tr>
<tr><td><input type="email" name="email"placeholder="username" style="color:brown"/></td></tr>
<tr><td><input type="password" name="password" placeholder="password" style="color:brown"/></td></tr>
<tr><td><input type="submit" value="LogIn" style="width:100%;background-color:skyblue"/></td></tr>
<tr><td>
<div style="color:white;">
<%
if(request.getAttribute("Error")!=null){
out.println(request.getAttribute("Error"));
}
%>

</td></tr>
</table>
</form>

</body>
<style>
.container {
	background-image: url(./uv.avif);
	background-size:cover;
	Display: flex;
	justify-content: center;
	height: 700px;
	align-items: center;
	Display: flex;
}
.loginform{
background-color: #orange;
	margin:80px;
	padding:80px;
	opacity: 5;
	


}
.p{
color:orange;


}

</style>
</html>