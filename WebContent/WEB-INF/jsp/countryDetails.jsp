<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<link rel="stylesheet" href="./css/world.css" type="text/css" />
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Details of Country</title>
</head>
<body>
	<h1>Country Details</h1>
	<table class="silver" width="260">
	<tr>
		<td>Name</td>
		<td>${country.name}</td>
	</tr>
	<tr>
		<td>Area</td>
		<td>${country.area}</td>
	</tr>
	<tr>
		<td>Population</td>
		<td>${country.population}</td>
	</tr>
	<tr>
		<td>Last Updated</td>
		<td>${country.populationLastUpdated}</td>
	</tr>
	<tr>
		<td>Currency</td>
		<td>${country.currency}</td>
	</tr>
	</table>

</body>
</html>