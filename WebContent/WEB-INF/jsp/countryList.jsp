<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
	<link rel="stylesheet" href="./css/world.css" type="text/css" />
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>List of Countries</title>
</head>
<body>
	<h1>List of Countries</h1>
	<table class="silver" width="150">
		<c:forEach items="${countries}" var="country">
			<tr>
				<td><a href="countryDetails.html?id=${country.id}">${country.name}</a>
				</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>