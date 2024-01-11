<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="style.css">
</head>
<body>
<%
String msgPass=(String)request.getAttribute("passwordMessage");
%>
<%if(msgPass!=null){%>
<h4 style="color: red"><%=msgPass%>></h4>
<%}%>
<div>
<form action="userRegister" method="post">
<label>UserName:</label> <br>
<p>
<input type="text" placeholder="user name" name="userName" >
</p>
<p>
<label>UserEmail:</label> <br>
<input type="email" placeholder="user email" name="userEmail" >
</p>
<p>
<label>UserPassword:</label> <br>
<input type="password" placeholder="user password atleast 6 characters" name="userPassword" >
</p>
<p>
<label>UserPhone:</label> <br>
<input type="tel" placeholder="user phone" name="userPhone" >
</p>
<label>UserAddress:</label> <br>
<p>
<input type="text" placeholder="user address" name="userAddress" >
</p>
<p>
<input type="submit" value ="signup">
</p>
</form>
</div>

</body>
</html>