<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ page import="java.util.List" %>
<%@ page import="com.book.Booking" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
    <h1>Bookings List</h1>
    <table>
        <tr>
            <th>Booking ID</th>
            <th>Doctor Name</th>
            <th>Name</th>
            <th>Age</th>
            <th>Gender</th>
            <th>NIC</th>
            <th>Phone</th>
            <th>Address</th>
        </tr>
        <c:forEach items="${bookings}" var="book">
            <tr>
                <td>${book.getBid()}</td>
                <td>${book.docName}</td>
                <td>${book.uname}</td>
                <td>${book.age}</td>
                <td>${book.gender}</td>
                <td>${book.nic}</td>
                <td>${book.phone}</td>
                <td>${book.address}</td>
                <td><button>Delete</button></td>
                
                
            </tr>
        </c:forEach>
    </table>
</body>
</html>