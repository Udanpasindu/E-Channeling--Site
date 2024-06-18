<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="com.patient.Patient" %>

<!DOCTYPE html>
<html>
	<head>
	    <title>Patients Profile</title>
	    <link rel="stylesheet" href="css/Profile.css">
	</head>
	
	<body>
			<div class="profile1">
				<h1>User Profile</h1>
				
				<img src="images/UserProfile1.jpg" width="20%">
					<c:forEach items="${patients}" var="patient">
					    <div class="details">
						    <p>User ID: ${patient.getPid()}</p>
						    <p>Name: ${patient.name}</p>
						    <p>Age: ${patient.age}</p>
						    <p>NIC: ${patient.nic}</p>
						    <p>Phone: ${patient.phone}</p>
						    <p>Address: ${patient.address}</p>
					    </div>
					    <a href="UpdatePatient.jsp"><Button class="Update">Update</Button></a>
					    <Button onclick="confirmDelete()" class="Delete">Delete</Button>
					</c:forEach>
			</div>
	</body>

	<script>
	    function confirmDelete() {
	        var result = confirm("Are you sure you want to delete your profile?");
	        if (result) {
	        	var form = document.createElement("form");
	            form.method = "post";
	            form.action = "delete"; // Replace with your actual delete Servlet URL
	            document.body.appendChild(form);
	            form.submit();
	        } else {
	            // If the user cancels, do nothing or redirect back to a different page
	            window.location.href = "PatientProfile.jsp"; // Replace with your desired action
	        }
	    }
	</script>
</html>
