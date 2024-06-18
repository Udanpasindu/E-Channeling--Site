<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

 <link rel="stylesheet" href="css/navbar.css">

</head>
<body class="Navback">
	 
<div class="header">
<img src="images/logo.jpg" style="display: inline-block; vertical-align: top; width: 200px; ">
<form class="search" action="" method="post">
   <div class="search">
      <input type="text" class="searchTerm" name="searchDoc" placeholder="Search Doctor">
      <button class="SearchButton" type="submit" class="searchButton" >Search</button>
   </div>
</form>
<div class="topnav">
  <a  href="Home.jsp">Home</a> 
  <a href="test.jsp">Doctors</a>
  <a href="DoctorRegistration.jsp">Add Doctors +</a>
  <a  href="Home.jsp"><button class="button-68" role="button">Logout</button></a>
  
  </div>
</div>
</body>
</html>