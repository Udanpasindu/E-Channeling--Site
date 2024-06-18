<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="com.doctor.Doctor" %>
<%@ include file="Components/DoctorNav.jsp" %>
    <%
String userName = (String) session.getAttribute("UDname");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>DocLinkOnline</title>

</head>
<body>
<p style="font-size:70px;font-weight: bold;color:royalblue;text-transform: capitalize;margin-left:40%">Hi, Dr. <%= userName %>!</p>

</body>
</html>