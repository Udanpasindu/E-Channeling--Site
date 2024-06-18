<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="Components/PatientNav.jsp" %>
    <%
String userName = (String) session.getAttribute("Uname");
%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>DocLinkOnline</title>
		<style>
		.line{
			font-size:50px;
			font-weight: bold;
			color:white;
			text-transform:capitalize;
			 margin-left:10%;
			 width:150px;
			 padding:10px 0
		}
			.lineUp {
=			  animation: 2s anim-lineUp ease-out ;
			}
			@keyframes anim-lineUp {
			  0% {
			    opacity: 0;
			    transform: translateY(80%);
			  }
			  20% {
			    opacity: 0;
			  }
			  50% {
			    opacity: 1;
			    transform: translateY(0%);
			  }
			  100% {
			    opacity: 1;
			    transform: translateY(0%);
			  }
			}
		</style>
	</head>
	<body>
		<br>
		
		<%@ include file="Searchdoctor.jsp" %>
		<div style="background-image:url('images/PatientBack11.jpg'); background-size: 100%;background-repeat: no-repeat;margin-top:0px;height:600px">
			<div class="line">
				    <h2 class='lineUp'>Hi..! <%= userName %></h2>
				  </div>
			<div style="font-size:15px; font-style: italic;;color:white;text-transform: capitalize;width:600px;margin-left:10%">
				<p>"Welcome to our e-channeling platform, where your health and well-being are our top priorities.</p>
				<p> We're delighted to have you here, and we're committed to making your healthcare journey as seamless 
				and convenient as possible. Let's begin this journey to better health together.</p>
				<p> How can we assist you today?"</p>
				  
			</div><br>
		</div>
	</body>
</html>