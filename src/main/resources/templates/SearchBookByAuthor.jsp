<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
List of books of author:
<table border="2">
<tr><th>bookUUId</th><th>title</th><th>category</th><th>status</th>
<forEach var="book" items="${list}">
<tr>
<td>${book.bookUUId}</td>
<td>${book.title}</td>
<td>${book.category}</td>
<td>${book.status}</td>
</tr>
<forEach>
</table>
</body>
</html>