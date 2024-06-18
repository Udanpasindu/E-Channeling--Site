<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="com.payment.Payment" %>

<!DOCTYPE html>
<html>
	<head>
	    <title>Patients Profile</title>
	    <link rel="stylesheet" href="css/Profile.css">
	</head>
	
	<body>
			<div class="profile1">
				<h1>Card Details</h1>
				
				
					<c:forEach items="${payments}" var="pay">
					    <div class="details">
						    <p>Card name: ${pay.getCardname()}</p>
						    <p>Card NO: ${pay.getCardno}</p>
						    <p>cvv: ${pay.getCvv()}</p>
						    <p>ex date: ${pay.getExdate()}</p>
				
					    </div>
					    
					   
					</c:forEach>
			</div>
	</body>

</html>
