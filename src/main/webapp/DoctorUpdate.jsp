<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="com.doctor.Doctor" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>DocLinkOnline</title>
	</head>
	<body>
		<form class="form" action="dltdoc" method="post" enctype="multipart/form-data">
		   <c:forEach items="${doctors}" var="doc"> 		
						<input class="box" type="text" name="did"  value="${doc.getDid()}" readonly><br>
		                 <input class="box" type="text" name="dname"  value="${doc.getDname()}" required><br>
		             
		                <input class="box" type="text" name="Email"  value="${doc.getEmail()}" required> <br>  
		                <input class="box" type="text" name="Phone"  value="${doc.getPhone()}" required>  <br> 
		
		            <button type="submit">Update</button>
			</c:forEach>   
		</form>
	</body>
</html>