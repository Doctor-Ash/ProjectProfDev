<%@page import="models.Student" %>
<%@page import="models.Skill" %>
<%@page import="java.util.ArrayList" %>

<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1" >
	<meta  <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="v" %> >
	<link rel="stylesheet" href="css/site.css">
	<title>Professional Development Planner</title>
</head>
<body>
<h1>Professional Development Planner</h1>
	

	<br>


	<a href="./login"><button>Login</button>  </a>
	
	<br>
	
	<v:if test="${session == true }"> <!-- if user is logged in display add new and logout  -->
			<a href=./addSkill ><button>Add new skill</button></a>
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