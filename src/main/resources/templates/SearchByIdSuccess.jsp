<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table>
<tr>
<td> entered ${book.bookUUID } found successfully</td>
<td>${book.title}</td>
<td>${book.author}</td>
<td>${book.category}</td>
<td>${book.status}</td>
<td>${book.returnDate}</td>
</tr>
</table>

</body>
</html>