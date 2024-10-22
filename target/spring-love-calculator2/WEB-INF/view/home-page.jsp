<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>home-page</title>
</head>
<body>
	<h1 align="center">Love Calculator</h1>
	<hr />
	<form:form action="process-homepage" method="get"
		modelAttribute="userInfo">
		<div align="center">
			<p>
				<lable for="yn">Your Name:</lable>
				<form:input id="yn" path="userName"/>
			</p>
			<p>
				<lable for="cn">Crush Name:</lable>
				<form:input id="cn" path="crushName"/>
			</p>
			<input value="calculate">
		</div>
	</form:form>
</body>
</html>