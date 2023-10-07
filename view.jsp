<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="Menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body class="container">

<form action="view" method="post" class="save">
<table>
<h2>Register Here...</h2>
<tr><td><input type="text" name="name" placeholder="Name"/></td></tr>
<tr><td><input type="text" name="age" placeholder="Age"/></td></tr>
<tr><td><input type="text" name="city"placeholder="City"/></td></tr>
<tr><td><input type="text" name="email"placeholder="Email"/></td></tr>
<tr><td><input type="text" name="mobno"placeholder="MobNo"/></td></tr>
<tr><td><input type="submit" value="save"style="Background-color:skyblue;width:100%"/></td></tr>
<tr><td>

<%
if(request.getAttribute("msg")!=null){
out.println(request.getAttribute("msg"));
}
%>
</td><tr>
</table>
</form>


</body>
<style>
.container {
	background-image: url(./12.avif);
	background-size:cover;
	Display: flex;
	justify-content: center;
	height: 700px;
	align-items: center;
	Display: flex;
	
   
}
.save{
background-color: grey;
	margin:30px;
	padding:30px;
	opacity: 0.8;


}

</style>
</html>