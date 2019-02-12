<%@page import="models.Vehicle" %>
<%@page import="java.util.ArrayList" %>

<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1" >
	<meta  <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="v" %> >
	<link rel="stylesheet" href="css/site.css">
	<title>Vehicles</title>
</head>
<body>
<h1>All Vehicles</h1>
	<table>
	<tr>
		<th>ID</th>
		<th>Make</th>
		<th>model</th>
		<th>year</th>
		<th>price</th>
		<th>license_number</th>
		<th>colour</th>
		<th>number_doors</th>
		<th>transmission</th>
		<th>mileage</th>
		<th>fuel_type</th>
		<th>engine_size</th>
		<th>body_style</th>
		<th>condition</th>
		<th>notes</th>
		<th></th>
		<th></th>
 <!-- top row of table -->
	</tr>
	<v:forEach items="${AllVehicle}" var="v"> <!-- creates a row for each table with another vehicle -->
		<tr>
			<td>${v.getVehicle_id()}</td>
			<td>${v.getMake()}</td>
			<td>${v.getModel()}</td>
			<td>${v.getYear()}</td>
			<td>${v.getPrice()}</td>
			<td>${v.getLicense_number()}</td>
			<td>${v.getColour()}</td>
			<td>${v.getNumber_doors()}</td>
			<td>${v.getTransmission()}</td>
			<td>${v.getMileage()}</td>
			<td>${v.getFuel_type()}</td>
			<td>${v.getEngine_size()}</td>
			<td>${v.getBody_style()}</td>
			<td>${v.getCondition()}</td>
			<td>${v.getNotes()}</td>
			<!-- data for the table -->
			<v:if test="${session == true }">
		<td>	<a href=./delete?id=${v.getVehicle_id()} ><button>Delete</button></a></td> <!-- if the user is logged in display the delete  and sends the ID to the server-->
		<td>	<a href=./update?id=${v.getVehicle_id()} ><button >Update</button></a></td> <!-- if the user is logged in display update -->
			</v:if>
	</tr>
	</v:forEach>
	</table>

	<br>


	<a href="./login"><button>Login</button>  </a>
	
	<br>
	
	<v:if test="${session == true }"> <!-- if user is logged in display add new and logout  -->
			<a href=./addNew ><button>Add new vehicle</button></a>
			<br>
			<a href="./logout"><button>log out</button> </a>
			</v:if>

 

	<%
		//ArrayList<Vehicle> AllVehicle = (ArrayList<Vehicle>) request.getAttribute("allVehicle");
		//for(Vehicle x : AllVehicle){
		//	out.write("" + x.getVehicle_id());
	//	}	
	%>


</body>
</html>