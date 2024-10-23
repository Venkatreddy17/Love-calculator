<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>home-page</title>

<style type="text/css">
.error {
	color: red;
	position: fixed;
	text-align: left;
	margin-left: 30px;
}
</style>
<script type="text/javascript">
function validateYourName() {
	
	var yname = document.getElementById('yn').value;
	if (yname.length < 3) {
		alert("Your Name should  have atleast 3 character");
		return false;
	} 
	return true;
}

function validateCrushName() {
	
	var cname = document.getElementById('cn').value;
	if (cname.length < 3) {
		alert("Crush Name should  have atleast 3 character");
		return false;
	} 
	return true;
}

</script>
</head>
<body>
	<h1 align="center">Love Calculator</h1>
	<hr />
	<form:form action="process-homepage" method="post"
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
			<p>
			<form:checkbox path="termsAndCondition" id="check"/>
			<lable>I am agreeing that is is for fun</lable>
			
			</p>
			<input type="submit" value="calculate">
		</div>
	</form:form>
</body>
</html>