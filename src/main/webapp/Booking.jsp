<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="com.doctor.Doctor" %>
  <%@ include file="Components/PatientNav.jsp" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>DocLinkOnline</title>
		<link rel="stylesheet" href="css/booking.css">
	    <script type="text/javascript">
	        function validateNIC() {
	            var nic = document.getElementById("nic").value;
	            var nicPattern = /^[0-9]{9}[vV]$|^[0-9]{12}$/;
	            if (!nicPattern.test(nic)) {
	                alert("NIC should contain 12 numbers or 9 numbers + 'v' or 'V'.");
	                return false;
	            }
	            return true;
	        }
	    </script>
	</head>
	<body>
		 <div class="book1">
		 	<c:forEach items="${doctors}" var="doc">
		 			<div class="bookdetails">
		 				<h2>Booking Details</h2>
		 				<div class="image1">
		 					<img src="images/${doc.getImage()}" width="200px"><br>
		 				</div>
			 			<p>Doctor: Dr. ${doc.getDname()}</p>
			 			<p>Time: ${doc.getTime()}</p>
			 			<p>Date: ${doc.getDate()}</p>
			 			<p>Room Number: ${doc.getRoomNo()}</p>
			 			<p class="fee">Booking Fee: LKR.1500.00</p>
		 			</div>
		 </c:forEach>
		<div class="bookingForm">
			 <form id="bookingForm" class="form" action="book1" method="post" onsubmit="return validateNIC();">
			 	<h2>Patient Details</h2>
			 	
			 	 <label for="name">Patient Name</label><br>
			     <input class="box" type="text" name="name" id="name" placeholder="Patient Name" required><br>
			     
			     <label for="name">Age</label><br>
				 <input class="box" type="number" name="age" id="age" placeholder="Age" required><br>
				 
				 <label for="name">Gender</label><br><br>
				 <label for="male">Male</label>
				 <input type="radio" id="male" name="gender" value="male" required>
				            
				 <label for="female">Female</label>
				 <input type="radio" id="female" name="gender" value="female" required><br><br>
				 
				 <label for="name">NIC</label><br>
				 <input class="box" type="text" name="nic" id="nic" placeholder="NIC" required><br>
				 
				 <label for="name">Phone</label><br>
				 <input class="box" type="text" name="phone" id="phone" placeholder="Phone" required><br>
				 
				 <label for="name">Address</label><br>
				 <input class="box" type="text" name="address" id="address" placeholder="Address" required><br>
				           
				 <button class="btn" type="submit">Book</button>
			 </form>
		</div>
		
		 </div>
	</body>
</html>