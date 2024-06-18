<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="com.doctor.Doctor" %>
<%@ include file="Components/PatientNav.jsp" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>DocLinkOnline</title>
</head>
	<body>
	<h1></h1>
		 <c:forEach items="${doctors}" var="doc">
			    <img src="images/${doc.getImage()}" width="200px">
			    <p style="font-size:25px">Dr. ${doc.getDname()}</p>
			    <p style="font-size:18px"> ${doc.getSpecial()}</p>
			    <p>Medical ID: ${doc.getMedID()}</p>
			    <p>Room NO: ${doc.getRoomNo()}</p>
			    <p>Time: ${doc.getTime()}</p>
			    <p>Day: ${doc.getDate()}</p>
			    
			         
			    <br>
			    <br>
				<a href="Booking.jsp"><Button class="Update">Book Now</Button></a>
			    <br>
			    <br>
		</c:forEach>
	
	</body>
</html>