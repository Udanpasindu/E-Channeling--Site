<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="com.doctor.Doctor" %>

<%@ include file="Components/HospitalNav.jsp" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>DocLinkOnline</title>
</head>
<body>
    <h1>Employee List</h1>
    <table border="1">
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Salary</th>
        </tr>
        <c:forEach items="${doctor1}" var="doc1">
            <tr>
                <td>${doc1.getDname()}</td>
                <td>${doc1.DName}</td>
               
            </tr>
        </c:forEach>
    </table>
</body>
</html>
