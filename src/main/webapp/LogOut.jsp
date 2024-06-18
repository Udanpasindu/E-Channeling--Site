<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Logout</title>
</head>
<body>
    <h1>Logout</h1>

    <%
        session.invalidate();
        response.sendRedirect("PatientLogin.jsp");
    %>
</body>
</html>
