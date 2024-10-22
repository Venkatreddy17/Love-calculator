<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>registreation-success page</title>
</head>
<body>
	<h1>registreation-success</h1>
	<h2>the Deatais you enter</h2>
	Name: ${UserReg.name};
	<br> userName: ${UserReg.userName};
	<br> password: ${UserReg.password};
	<br> countryName: ${UserReg.countryName};
	<br> hobbies:
	<c:forEach var="temp" items="${UserReg. hobbies}"> ${temp}</c:forEach>


	<br> gender: ${UserReg.gender};
</body>
</html>