<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="com.patient.Patient" %>
<!DOCTYPE html>
<html>
<link rel="stylesheet" href="css/Register.css">
<head>
<meta charset="ISO-8859-1">
<title>DocLinkOnline</title>
</head>
<body>
<form class="form" action="update" method="post">
  <c:forEach items="${patients}" var="patient">
  				<input class="box" type="text" name="id"  value="${patient.pid}" readonly>
                <input class="box" type="text" name="name"  value="${patient.name}" required>
                <input class="box" type="number" name="age" id="age" value="${patient.age}" required>
                <input class="box" type="text" name="nic" id="nic" value="${patient.nic}" required>
                <input class="box" type="text" name="phone" id="phone" value="${patient.phone}" required>    
                <input class="box" type="text" name="address" id="address" value=" ${patient.address}" required>        
                
         		 
 </c:forEach>        		
            <button type="submit">Update</button>
</form>

</body>
</html>