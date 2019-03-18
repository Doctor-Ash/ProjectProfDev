<%@page import="models.Student" %>
<%@page import="models.Skill" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1" %>
<!DOCTYPE html public "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta charset="ISO-8859-1" >
	<meta  <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="v" %> >
	<link rel="stylesheet" href="css/site.css">
	<title>Professional Development Planner</title>
	
	  <!-- Favicons -->
  <link href="img/favicon.png" rel="icon">
  <link href="img/apple-touch-icon.png" rel="apple-touch-icon">

  <!-- Bootstrap CSS File -->
  <link href="lib/bootstrap/css/bootstrap.min.css" rel="stylesheet">

  <!-- Libraries CSS Files -->
  <link href="lib/font-awesome/css/font-awesome.min.css" rel="stylesheet">
  <link href="lib/animate/animate.min.css" rel="stylesheet">
  <link href="lib/ionicons/css/ionicons.min.css" rel="stylesheet">
  <link href="lib/owlcarousel/assets/owl.carousel.min.css" rel="stylesheet">
  <link href="lib/lightbox/css/lightbox.min.css" rel="stylesheet">

  <!-- Main Stylesheet File -->
  <link href="css/style.css" rel="stylesheet">
  <style>
  .box2 {
  	clear: both;
  	position: relative;
  	top: 200px;
  }
  
  nav {
  	
  }
  
  </style>
	
</head>
<body>
<!--/ Nav Star /-->
 <div class="intro route bg-image" style="background-image: url(img/intro-bg.jpg)">

  <nav class="navbar navbar-expand-md fixed-top" id="mainNav">
    <div class="container">
      <a class="navbar-brand js-scroll" href="#page-top">ProfDev</a>
      <button class="navbar-toggler collapsed" type="button" data-toggle="collapse" data-target="#navbarDefault"
        aria-controls="navbarDefault" aria-expanded="false" aria-label="Toggle navigation">
        <span></span>
        <span></span>
        <span></span>
      </button>
      <div class="navbar-collapse collapse justify-content-end" id="navbarDefault">
        <ul class="navbar-nav">
          <li class="nav-item">
            <a class="nav-link js-scroll active" href="./home">Home</a>
          </li>
          <li class="nav-item">
	          <v:if test="${session == true }"> <!-- if user is logged in display add new and logout  -->
		      	<a class="nav-link js-scroll" href="./logout">Log out</a>
			  </v:if>
				
			  <v:if test="${session == false }"> <!-- if user is logged in display add new and logout  -->
		      	<a class="nav-link js-scroll" href="./login">Log in</a>
			  </v:if>
          </li>
          <li class="nav-item">
            <v:if test="${session == true }"> <!-- if user is logged in display add new and logout  -->
		    	<a class="nav-link js-scroll" href="./showunits">Show Units</a>
			</v:if>
          	<v:if test="${session == false }"> <!-- if user is logged in display add new and logout  -->
		      	<a class="nav-link js-scroll" href="#feature">Features</a>
			</v:if>
          
          </li>
          <li class="nav-item">
          	<v:if test="${session == false }"> <!-- if user is logged in display add new and logout  -->
		      	<a class="nav-link js-scroll" href="./create">Create account</a>
			</v:if>
			
			<v:if test="${session == true }"> <!-- if user is logged in display add new and logout  -->
		    	<a class="nav-link js-scroll" href="./showskills">Show Skills</a>
			</v:if>
			
			 <li class="nav-item">
			<v:if test="${session == true }"> <!-- if user is logged in display add new and logout  -->
		    	<a class="nav-link js-scroll" href="./addSkill">Add Skills</a>
			</v:if>
			</li>
            
          </li>
          <li class="nav-item">
            <a class="nav-link js-scroll" href="contact.jsp">Contact</a>
          </li>
        </ul>
      </div>
    </div>
  </nav>
  <!-- if logged in display the form -->


<div class="box2">
<center><h1>Insert Skill</h1>


              
              <form method = "post"  action="./addSkill">
	
	Communication Rating :
	<select name="selectCommunicationRating">
	 <option value="1">1</option>
	 <option value="2">2</option>
	<option value="3">3</option>
	<option value="4">4</option>
	<option value="5">5</option>
	<option value="6">6</option>
	<option value="7">7</option>
	<option value="8">8</option>
	<option value="9">9</option>
	<option value="10">10</option>
	</select>
	
		Description: <input type="text" name="Communicationdescription">
	<br>
	
	Teamwork Rating :
	<select name="selectTeamworkRating">
	 <option value="1">1</option>
	 <option value="2">2</option>
	<option value="3">3</option>
	<option value="4">4</option>
	<option value="5">5</option>
	<option value="6">6</option>
	<option value="7">7</option>
	<option value="8">8</option>
	<option value="9">9</option>
	<option value="10">10</option>
	</select>
	Description: <input type="text" name="Teamworkdescription">
	<br>
	
		Organisation Rating :
	<select name="selectOrganisationRating">
	 <option value="1">1</option>
	 <option value="2">2</option>
	<option value="3">3</option>
	<option value="4">4</option>
	<option value="5">5</option>
	<option value="6">6</option>
	<option value="7">7</option>
	<option value="8">8</option>
	<option value="9">9</option>
	<option value="10">10</option>
	</select>
	Description: <input type="text" name="selectOrganisationdescription">
	<br>
	
		Time Management Rating :
	<select name="selectTimemanagementRating">
	 <option value="1">1</option>
	 <option value="2">2</option>
	<option value="3">3</option>
	<option value="4">4</option>
	<option value="5">5</option>
	<option value="6">6</option>
	<option value="7">7</option>
	<option value="8">8</option>
	<option value="9">9</option>
	<option value="10">10</option>
	</select>
	Description: <input type="text" name="Timemanagementdescription">
	<br>
	
		Personal Development Rating :
	<select name="selectPersonaldevelopmentRating">
	 <option value="1">1</option>
	 <option value="2">2</option>
	<option value="3">3</option>
	<option value="4">4</option>
	<option value="5">5</option>
	<option value="6">6</option>
	<option value="7">7</option>
	<option value="8">8</option>
	<option value="9">9</option>
	<option value="10">10</option>
	</select>
	Description: <input type="text" name="PersonalDevelopmentdescription">

	<br>
	
	<!--  <select name="selectSkill">
	 <option value="Communication">Communication</option>
	  <option value="TeamWork">Team Work</option>
	  <option value="Organisation">"Organisation"</option>
	  <option value="TimeManagement">Time Management</option>
	  <option value="PersonalDevelopment">Personal Development</option>
	</select>
	Rating :
	<select name="selectRating">
	 <option value="1">1</option>
	 <option value="2">2</option>
	<option value="3">3</option>
	<option value="4">4</option>
	<option value="5">5</option>
	<option value="6">6</option>
	<option value="7">7</option>
	<option value="8">8</option>
	<option value="9">9</option>
	<option value="10">10</option>
	</select>
	
	
	
		Description: <input type="text" name="description">
		
		-->
		
		<input type="submit" value="Submit">
		</center>
		<!-- form for add -->
		
	</form>
              
</div>

</div>
	


</body>
</html>