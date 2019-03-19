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
	
</head>

<body id="page-top">

  
  <div class="intro route bg-image" style="background-image: url(img/intro-bg.jpg); background-repeat: no-repeat;
  background-attachment: fixed; height:2000px;">
  
  <!--/ Nav Star /-->
  <nav class="navbar navbar-b navbar-trans navbar-expand-md fixed-top" id="mainNav">
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
		    	<a class="nav-link js-scroll" href="./showGoals">Show Goals</a>
			</v:if>
			</li>
			
            
          
          <li class="nav-item">
            <a class="nav-link js-scroll" href="contact.jsp">Contact</a>
          </li>
        </ul>
      </div>
    </div>
  </nav>
  <!--/ Nav End /-->	

 <br>
 <br>
 <br>


  <!--/ Section Services Star /-->
  <section id="feature" class="services-mf route">
    <div class="container">
    
     
    
      <div class="row"><!-- Row start -->
      
      <%
     
      %>
     
        <div class="col-sm-12">
          <div class="title-box text-center">
            <h3 class="title-a">
              Units
            </h3>
            
            <table align="center" style="background-color: black; opacity: 0.75;">
			<tr>
				<th>Unit Name</th>
				<th>Grade</th>
				
				
			</tr>
			<v:forEach items="${units}" var="v">
				<tr>
					<td>${v.getUnit_name() }</td>
					<td>${v.getGrade() }</td>
					<v:if test="${sesh == true }">
						<td><button>Delete</button></td>
					</v:if>
				</tr>
			</v:forEach>
		
		
		
		</table>
            <p class="subtitle-a" style="color: white;">
              List of your Units
            </p>
            <div class="">
            	<v:if test="${session == true }"> <!-- if user is logged in display add new and logout  -->
			    	<a class="nav-link js-scroll" href="./addUnit"><button>Add Units</button></a>
				</v:if>
            </div>
          </div>
        </div>
      </div>
      
      <v:forEach items="${units}" var="v">
      
      	<div class="col-md-4" id="skillBoxes" >
          <div class="service-box">
            <div class="service-content">
              <h2 class="s-title">${v.getUnit_name() }</h2>
              <h3 class = "s-title">Grade = ${v.getGrade()} </h3>
              <p class = "s-title">
	              <a href="./deleteUnit?unitName=${v.getUnit_name()}">
	              	<button>DELETE</button>
	              </a>
              </p>

            </div>
          </div>
        </div>
      
      </v:forEach>
      <div class="row">
      
       
        
      </div><!-- row end -->
      
      
    </div>
    </div>
  </section>
  <!--/ Section Services End /-->



  <a href="#" class="back-to-top"><i class="fa fa-chevron-up"></i></a>
  <div id="preloader"></div>

  <!-- JavaScript Libraries -->
  <script src="lib/jquery/jquery.min.js"></script>
  <script src="lib/jquery/jquery-migrate.min.js"></script>
  <script src="lib/popper/popper.min.js"></script>
  <script src="lib/bootstrap/js/bootstrap.min.js"></script>
  <script src="lib/easing/easing.min.js"></script>
  <script src="lib/counterup/jquery.waypoints.min.js"></script>
  <script src="lib/counterup/jquery.counterup.js"></script>
  <script src="lib/owlcarousel/owl.carousel.min.js"></script>
  <script src="lib/lightbox/js/lightbox.min.js"></script>
  <script src="lib/typed/typed.min.js"></script>
  <!-- Contact Form JavaScript File -->
  <script src="contactform/contactform.js"></script>

  <!-- Template Main Javascript File -->
  <script src="js/main.js"></script>

</body>
</html>