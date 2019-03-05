<%@page import="java.util.List"%>
<%@ page language="java" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>SGP - App</title>
		<link rel="stylesheet" href="<%=request.getContextPath()%>/bootstrap-4.3.1-dist/css/bootstrap.css">
	</head>
	<body>
		<h1>Nouveau Collaborateur</h1>
		<table>
			<tr>
				<td>Nom</td>
				<td><input type="text"></td>
			</tr>
			<tr>
				<td>Prénom</td>
				<td><input type="text"></td>
			</tr>
			<tr>
				<td>Date de naissance</td>
				<td><input type="text"></td>
			</tr>
			<tr>
				<td>Adresse</td>
				<td><input type="text"></td>
			</tr>
			<tr>
				<td>Numéro de sécurité sociale</td>
				<td><input type="text"></td>
			</tr>
		</table>
	</body>
</html>