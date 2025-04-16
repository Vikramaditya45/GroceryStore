<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Register</title>
</head>
<body>
		<h1>Register Page</h1>
	<form action="Register" method="post">
		UserName : <input type="text" name="Username"> <br><br>
		Email : <input type="text" name="email"><br><br>
		Phone : <input type="number" name="phone"><br><br>
		Password : <input type="password" name="password"><br><br>
		Confirm Password : <input type="password" name="cpassword"><br><br>
		<input type="submit" value="Register">
	</form>
</body>
</html>