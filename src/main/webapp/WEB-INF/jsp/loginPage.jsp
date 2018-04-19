<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE HTML>
<html>
<head>
<title>SpringMVC_1</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
</head>

<body>

	<form:form action="validateUserLogin" modelAttribute="userForm">
		<table style="float:center">
			<tr>
				<td>
					<p>Username :</p>
				</td>
				<td>
					<form:input path="username" />
				</td>
			</tr>
			<tr>
				<td>
					<p>Password :</p>
				</td>
				<td>
					<form:password path="password" />
				</td>
			</tr>
			<tr>
				<td>
					<p>&nbsp;</p>
				</td>
				<td>
					<input type="submit" value="Submit" />&nbsp;&nbsp;&nbsp;<input type="reset" value="Reset" />
				</td>
			</tr>
		</table>
	</form:form>
</body>
</html>