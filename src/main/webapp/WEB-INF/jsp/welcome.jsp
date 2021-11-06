<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<title>Hello World Spring MVC Example</title>
<style type="text/css">
h1{
color:blue;
}
</style>
</head>
<body>
<c:forEach var="msg" items="${messages}">
    <h3>${msg}</h3>
</c:forEach>
</body>
</html>