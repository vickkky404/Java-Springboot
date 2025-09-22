<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


<% 
out.println((String) request.getAttribute("REQ") + "<br>");
out.println((String) session.getAttribute("SES") + "<br>");
out.println((String) application.getAttribute("APP") + "<br>");

%>

<a href = "welcome.jsp">Second</a>
</body>
</html>