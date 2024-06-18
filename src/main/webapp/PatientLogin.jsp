<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>DocLinkOnline</title>
		<link rel="stylesheet" href="css/login.css">
	
	</head>
	<body>
		<div class="login">	
			<p class="title">Login as Patient</p>
			<form action="log1" method="post">
				<img src="images/PatientLogin.jpg" width="40%">
				<input class="boxl" type="text" name="usname" id="Hname" placeholder="Username" required><br>
	   	 		<input class="boxl" type="password" name="pass" id="age" placeholder="Password" required><br>
	     		<button class="loginButton" type="submit">Login</button><br><br>
				<p class="link">Login as<a href="HospitalLogin.jsp">  Hospital  </a>  or Login as<a href="DoctorLogin.jsp">  Doctor</a></p>
			</form>
		</div>
	</body>
</html>