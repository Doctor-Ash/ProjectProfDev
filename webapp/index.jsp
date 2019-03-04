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
	<header>
                <h1>Professional Development Planner</h1>
            
                <!-- Navigation bar within the header  -->
                <nav>
                    <ul>
                        <!-- class: current, to indicate which page user is currently on -->
                        <li><a href="" >Home</a></li>   
                        <li><a href="">About</a></li>
                    </ul>
                </nav>
        </header>

	

	<br>


	<a href="./login"><button>Login</button>  </a>
	
	<br>
	
	<v:if test="${session == true }"> <!-- if user is logged in display add new and logout  -->
			<a href=./addSkill ><button>Add a skill</button></a>
			<br>
			<a href="./logout"><button>log out</button> </a>
			</v:if>

 

	<%
	
	%>


</body>
</html>