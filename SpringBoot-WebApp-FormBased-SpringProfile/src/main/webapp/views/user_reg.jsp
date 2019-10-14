<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>


<!-- <script src="https://code.jquery.com/jquery-1.12.4.js"></script>
<script>
	src = "https://cdn.jsdelivr.net/jquery.validation/1.16.0/jquery.validate.min.js">
</script>
</script>
$('form[id="userRegForm"]').validate({ rules: { username: 'required',
password: 'required', email: { required: true, email: true, }, psword: {
required: true, minlength: 10, } }, messages: { username: 'username is
required', password: 'password is required', email: 'Enter a valid
email', password: { minlength: 'Password must be at least 10 characters
long' } }, submitHandler: function(form) { form.submit(); } }); });
</script> -->
</head>
<body>

	<font color='green'>${succMsg}</font>

	<h2>Register Here</h2>
	<form:form action="registerForm" method="POST" modelAttribute="user"
		id="userRegForm">
		<table>
			<tr>
				<td>Enter Username::</td>
				<td><form:input path="username" /></td>
			</tr>
			<tr>
				<td>Enter Password::</td>
				<td><form:input path="password" /></td>
			</tr>
			<tr>
				<td>Enter Email::</td>
				<td><form:input path="email" /></td>
			</tr>
			<tr>
				<td>Enter Phone::</td>
				<td><form:input path="phone" /></td>
			</tr>
			<tr>
				<td><input type="reset" value="reset"></td>
				<td><input type="submit" value="register"></td>
			</tr>

		</table>

	</form:form>
</body>
</html>