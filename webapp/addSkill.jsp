<%@page import="models.Student" %>
<%@page import="models.Skill" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1" %>
<!DOCTYPE html public "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta  http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" >
	<meta  <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="v" %> >
	
	<link rel="stylesheet" href="css/sites.css">
	<title>Insert Skill</title>
</head>
<body>
  <!-- if logged in display the form -->



<h1>Insert Skill</h1>



	<form method = "post">
	   
		Name: <input type="text" name="name">
		Skill: <input type="text" name="skill">
		Description: <input type="text" name="description">
		Rating: <input type="text" name="rating">
		<input type="submit" value="Submit">
		
		<!-- form for add -->
		
	</form>

	

	
	<!-- login link -->
		<a href="./login"> Login </a>

</body>
</html>