<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>  
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>	
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

<script src="https://code.jquery.com/jquery-3.5.1.js"></script>
<script
	src="https://cdn.datatables.net/1.10.21/js/jquery.dataTables.min.js"></script>
<!-- //cdn.datatables.net/1.10.21/css/jquery.dataTables.min.css
 --><link href="https://cdn.datatables.net/1.10.21/css/jquery.dataTables.min.css"
	rel="stylesheet" type="text/css">


<script type="text/javascript">
$(document).ready(function () {
    $('#dritab').DataTable({
        pagingType: 'full_numbers',
    });
});
</script>

</head>
<body>
ivunga dhan drivers uh
<table id="dritab" class="table">
<thead class="thead-dark">
<tr>
<th>
DriverId
</th>
<th>
FirstName
</th>
<th>
LastName
</th>
<th>PhoneNumber</th>
<th>License</th>
</tr>
</thead>
<tbody>
<c:forEach items="${Drivers}" var="dr">
<tr>
<td>${dr.drno}</td>

<td>${dr.firstName}</td>
<td>${dr.lastName}</td>
<td>${dr.phno}</td>
<td>${dr.lno }</td>

</tr>

</c:forEach>

</tbody>

</table>
<form:form action="/">
<input type="submit" value="Home">
</form:form>
</body>
</html>