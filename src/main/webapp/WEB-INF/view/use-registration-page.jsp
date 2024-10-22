<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>register page</title>
</head>
<body>
<h1 align="center">Please register here</h1>
<hr>
<form:form action="register-success" method="GET"
		modelAttribute="UserReg">
		<div align="center">
			<p>
				<label>Name :</label>
				<form:input path="name" />
				</p>
				<p>
				<label>User Name:</label>
				<form:input path="userName" />
				</p>
				<p>
				<label>Password:</label>
				<form:password path="password" />
				</p>
				<p>
				<label>Country:</label>
				<form:select path="countryName">
				<form:option value="India" label="INDIA"></form:option>
					<form:option value="United State" label="USA"></form:option>
					<form:option value="Australia" label="AUSTRALIA"></form:option>
					<form:option value="England" label="ENGLAND"></form:option>
				</form:select>
				</p>
				<p>
				<label>Hobbies:</label>
				<form:checkbox path="hobbies" value="programming" />
				Programming
				<form:checkbox path="hobbies" value="pubg" />
				PUBG
				<form:checkbox path="hobbies" value="cricket" />
				Cricket
			</p>
			<p>
				<label>Gender:</label> Male
				<form:radiobutton path="gender" value="Male" />
				Female
				<form:radiobutton path="gender" value="Female" />
			</p>
			<br>
			<input type="submit" value="register">
	</div>
	</form:form>
</body>
</html>