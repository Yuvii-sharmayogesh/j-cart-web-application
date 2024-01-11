<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
  ::placeholder{
  color: red;
  }
 
  </style>
 
</head>
<body>
<marquee><h3><i>Welcome To Admin Login </i></h3></marquee>
<form action="adminLogin" method="post">
<label>UserName:</label> <br>
<input type="email" placeholder="type your email" name="adminEmail" ><br>
<label>Password:</label> <br>
<input type="password" placeholder="type your password atleast 6 characters" name="adminPassword" ><br>
<input type="submit" value ="login" ><br>

</form>

</body>
</html>