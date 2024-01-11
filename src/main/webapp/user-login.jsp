<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>J-Cart-Web-App</title>
<link rel="stylesheet" href="style.css">
</head>
<body>
<%
	String emailMessage = (String) request.getAttribute("incorrectEmail");

	String passwordMessage = (String) request.getAttribute("incorrectPassword");
	%>
	<div class="message">
		<%
		if (emailMessage != null) {
		%>
		<h3 style="color: red"><%=emailMessage%></h3>
		<%
		}
		%>
		<%
		if (passwordMessage != null) {
		%>
		<h3 style="color: red"><%=passwordMessage%></h3>
		<%
		}
		%>
	</div>
	   <div class="innner-block">
        <form action="#">
            <fieldset>

                <p>
                    <input type="text" placeholder="user name">
                </p>
                <p>
                    <input type="password" placeholder="at least 8 characters">
                </p>
                <p>
                    <select name="dropdown" id="">
                        <option value="Login with Admin">Login with Admin</option>
                        <option value="Login with Product Owner">Login with Product Owner</option>
                    </select>
                </p>
                <p>
                    <input type="submit" value="Login">
                    <button>
                    <a href ="user-register.jsp">Signup</a>
                    </button>
                </p>
            </fieldset>
	
        </form>
        
    </div>

</body>
</html>