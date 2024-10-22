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
<hr/>
<form action="process-homepage" method="get">
<div align="center">
<p>
<lable for="yn">Your Name:</lable>
<input type="text" id="yn" name="userName"/>
</p>
<p>
<lable for="cn">Crush Name:</lable>
<input type="text" id="cn" name="crushName"/>
</p>
<input type="submit" value="calculate">
</div>
</form>
</body>
</html>