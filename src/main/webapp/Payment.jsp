<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="com.patient.Patient" %>
<%@ include file="Components/PatientNav.jsp" %>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Payment Checkout Form</title>
		<link rel="stylesheet" href="css/Payment1.css">
	</head>
	<body>
		<c:forEach items="${patients}" var="patient">
			<div class="payment">
				<form action="pay1" method="post">
				       <div class="title"><h2>Payment</h2><p>LKR 1500.00</p></div>
				       <br>
				        <div class="type">
						        <img src="images/visa.png" width=40px>
								<input type="radio" name="type"  value="visa" required>
											
								<img src="images/mc.png" width=40px>
								<input type="radio" name="type"  value="mastercard" required>
								
								<img src="images/AE.png" width=40px>
								<input type="radio" name="type"  value="AmericanExpress" required><br><br><br>
						</div>
						<div class="pay1">
						        <label class="label">Card holder</label><br>
						        <input type="text" class="input" name="name" value="${patient.name}">
						         <i class="fas fa-user"></i><br>
						             
					            <label class="label">Card number</label><br>
						        <input type="text" class="input" name="cardNO" placeholder="Card Number" >
						        <i class="far fa-credit-card"></i><br>
						        
								<label class="label">Expire date</label><br>
					            <input type="text" class="input" name="exdate" placeholder="00/00" >
						        <i class="far fa-calendar-alt"></i><br>
						        
						        <label class="label">CVV</label><br>
						        <input type="text" class="input" name="cvv" placeholder="000" >
						        <i class="fas fa-lock"></i><br>
				        </div>           
				        <input type="checkbox" id="saveCard" name="saveCard" value="save">  Save Card Details:<br>
				        <button class="btn" type="submit">Pay</button><br><br>
				 </form>
				 
			</div>
		</c:forEach>
	</body>
</html>