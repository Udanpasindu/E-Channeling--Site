<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Doctor Login</title>
 <link rel="stylesheet" href="css/login.css">
</head>
<body>
<div class="login">
<form action="doclog" method="post">
	<h2>Login as Doctor</h2>
	<input class="boxl" type="text" name="usname" placeholder="Username" required><br>
    <input class="boxl" type="password" name="pass" placeholder="Password" required><br>
     <button class="loginButton" type="submit">Login</button>
	<h5>Login as<a href="PatientLogin.jsp">  Patient</a></h5>
	<h5>Login as<a href="HospitalLogin.jsp">  Hospital</a></h5>
</form>
</div>

</body>
</html>