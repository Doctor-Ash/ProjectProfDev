<%@page import="models.Student" %>
<%@page import="models.Skill" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1" %>
<!DOCTYPE html public "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta  http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" >
	<meta  <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="v" %> >
	
	<link rel="stylesheet" href="css/sites.css">
	<title>Insert Vehicle</title>
</head>
<body>
<v:if test="${session == true }">   <!-- if logged in display the form -->



<h1>Insert Vehicle</h1>



	<form method = "post">
	   
		Make: <input type="text" name="make">
		Model: <input type="text" name="model">
		Year: <input type="text" name="year">
		Price: <input type="text" name="price">
		License number: <input type="text" name="license_number">
		Colour: <input type="text" name="colour">
		Number of doors: <input type="text" name="numberofdoors">
		Transmission: <input type="text" name="transmission">
		Mileage: <input type="text" name="mileage">
		Fuel Type: <input type="text" name="fuelType">
		Engine Size: <input type="text" name="engineSize">
		Body Style: <input type="text" name="bodyStyle">
		Condition: <input type="text" name="condition">
		Notes: <input type="text" name="notes">
		<input type="submit" value="Submit">
		
		<!-- form for add -->
		
	</form>
	</v:if>
	

	
	<!-- login link -->
		<a href="./login"> Login </a>

</body>
</html>