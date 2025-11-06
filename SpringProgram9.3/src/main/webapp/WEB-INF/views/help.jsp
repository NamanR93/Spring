<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
<%@ page isELIgnored="false"%>

 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>help</title>
</head>
<body>

	<h4>this is Help page</h4>

	<%-- <%
		String name = (String)request.getAttribute("name");
		Integer id = (Integer)request.getAttribute("rollno");
		
	%>
	
	<p> Help me <%=name %>_<%=id %></p> --%>
	
	<p> help me ${name}${rollno} </p>
	<c:forEach var="item" items="${marks}">
	<h3>${item}</h3>
	</c:forEach>
	
	



</body>
</html>