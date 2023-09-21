<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
peru sollu da driver eh
<form:form action="insert" modelAttribute="dr">

FirstName : <form:input path="firstName"/><br><br>

LastName  : <form:input path="lastName"/><br><br>

MobileNumber     : <form:input path="phno"/> <br><br>

LisenceNO     : <form:input path="lno"/> <br><br>

<input type="submit" value="Add Driver">
</form:form>
<br><br>
<form:form action="/">
<input type="submit" value="Home">
</form:form>
</body>
</html>