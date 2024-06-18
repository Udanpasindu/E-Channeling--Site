<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="com.doctor.Doctor" %>
<%@ include file="Components/DoctorNav.jsp" %>
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
    <p>Name: ${doc.getDname()}</p>
    <p>Specialization: ${doc.getSpecial()}</p>
    <p>Medical ID: ${doc.getMedID()}</p>
    <p>Email: ${doc.getEmail()}</p>
    <p>Phone: ${doc.getPhone()}</p>
    <p>Username: ${doc.getUsername()}</p>
    

    
  
    <a href="DoctorUpdate.jsp"><Button class="Update">Update</Button></a>
     <Button onclick="confirmDelete()" class="Delete">Delete</Button>
</c:forEach>

</body>
<script>
    function confirmDelete() {
        var result = confirm("Are you sure you want to delete your profile?");
        if (result) {
        	var form = document.createElement("form");
            form.method = "post";
            form.action = "dlt"; 
            document.body.appendChild(form);
            form.submit();
        } else {
            window.location.href = "DoctorProfile.jsp"; 
        }
    }
</script>
</html>