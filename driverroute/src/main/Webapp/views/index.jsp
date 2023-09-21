<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
      <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Driver Details</title>
</head>
<body>
<h1>${msg}</h1>
<br><br>
<form:form action="insertpage">
<input type="submit" value="Add Driver">
</form:form>
<form:form action="display">
<input type="submit" value="View Drivers">
</form:form>
<form:form action="edit">
<input type="submit" value="Modify Driver">
</form:form>
<form:form action="term">
<input type="submit" value="Remove Driver">
</form:form>
</body>
</html>