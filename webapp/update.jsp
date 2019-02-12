<%@page import="models.Student" %>
<%@page import="models.Skill" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" %>
<!DOCTYPE html public "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta  http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" >
	<meta  <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="v" %> >
	
	<link rel="stylesheet" href="css/sites.css">
	<title>update fix Vehicle</title>
</head>
<body>
<v:if test="${session == true }">  <!-- if logged in display the form -->


<h1>update fix Vehicle</h1>



	<form method = "post">
	   
		Make: <input type="text" name="make" value="${vehicle.getMake()}">
		Model: <input type="text" name="model" value="${vehicle.getModel()}">
		Year: <input type="text" name="year" value="${vehicle.getYear()}">
		Price: <input type="text" name="price" value="${vehicle.getPrice()}">
		License number: <input type="text" name="license_number" value="${vehicle.getLicense_number()}">
		Colour: <input type="text" name="colour" value="${vehicle.getColour()}">
		Number of doors: <input type="text" name="numberofdoors" value="${vehicle.getNumber_doors()}">
		Transmission: <input type="text" name="transmission" value="${vehicle.getTransmission()}">
		Mileage: <input type="text" name="mileage" value="${vehicle.getMileage()}">
		Fuel Type: <input type="text" name="fuelType" value="${vehicle.getFuel_type()}">
		Engine Size: <input type="text" name="engineSize" value="${vehicle.getEngine_size()}">
		Body Style: <input type="text" name="bodyStyle" value="${vehicle.getBody_style()}">
		Condition: <input type="text" name="condition" value="${vehicle.getCondition()}">
		Notes: <input type="text" name="notes" value="${vehicle.getNotes()}">
		<input type="submit" value="Submit" value="${vehicle.getModel()}">
		
		<!-- form for the update -->
	
	</form>
	</v:if>
	

	
		<!-- login button -->
		<a href="./login"> Login </a>

</body>
</html>