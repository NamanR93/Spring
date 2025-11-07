<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Profile</title>
</head>
<body>

	<h3>${Header}</h3>

	<%-- method 1 using request param
<h4>Name is: ${name}</h4>
<h4>email is: ${email}</h4>
<h4>password is: ${password}</h4>
 --%>
 
 <h4>Name is: ${user.email}</h4>
 <h4>email is: ${user.username}</h4>



</body>
</html>