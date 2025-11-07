<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@  page isELIgnored="false"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>profile</title>
</head>
<body>

	<h2>This is Profile page</h2>

	<%-- <h3>Name: ${model_name}</h3>
	<h3>Email Id: ${model_id}</h3> --%>
	
	<%-- <h3>Name: ${model_user.getName()}</h3>
	<h3>Email Id: ${model_user.getEmailId()}</h3> --%>
	
	<h3>Name: ${model_name.getName()}</h3>
	<h3>Email Id: ${model_name.getEmailId()}</h3>

</body>
</html>