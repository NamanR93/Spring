<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home</title>
</head>
<body>

	<h2>This is home page</h2>

	<%
		String name = (String)request.getAttribute("name");
		Integer id = (Integer)request.getAttribute("id");
		List<String> friends = (List<String>)request.getAttribute("f");
	%>
	
	<p>hi, I'm <%= name %> and my Id is <%= id %></p>
	
	<%for(String s : friends){%>
	
	<h1><%=s %></h1>
		
	<%} %>

</body>
</html>