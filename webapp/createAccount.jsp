<%@page import="models.Student" %>
<%@page import="models.Skill" %>
<%@page import="java.util.ArrayList" %>

<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1" >
	<meta  <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="v" %> >
	<link rel="stylesheet" href="css/style2.css">
	<title>Create Account</title>
	

  <!-- Main Stylesheet File -->
  <link href="css/style.css" rel="stylesheet">

  	<!--Bootsrap 4 CDN-->
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
    
    <!--Fontawesome CDN-->
	<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.3.1/css/all.css" integrity="sha384-mzrmE5qonljUremFsqc01SB46JvROS7bZs3IO2EmfFsd15uHvIt+Y8vEf7N7fWAU" crossorigin="anonymous">


  <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  
<body>
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
<div class="container">
	<div class="d-flex justify-content-center h-100">
		<div class="card">
			<div class="card-header">
				<h3>Create</h3>
			
		
			</div>
			<div class="card-body">
				<form  action="./create" method="post" >
					<div class="input-group form-group">
						<div class="input-group-prepend">
							<span class="input-group-text"><i class="fas fa-user"></i></span>
						</div>
						<input type="text" class="form-control" name="username" placeholder="username">
						
						
					</div>
					<div class="input-group form-group">
						<div class="input-group-prepend">
							<span class="input-group-text"><i class="fas fa-key"></i></span>
						</div>
						<input type="password" class="form-control" name="password" placeholder="password">
					</div>
					<div class="input-group form-group">
						<div class="input-group-prepend">
							<span class="input-group-text"><i class="fas fa-user"></i></span>
						</div>
					<input type="text" class="form-control" name="firstName" placeholder="Firstname">
						
					</div>
						<div class="input-group form-group">
						<div class="input-group-prepend">
							<span class="input-group-text"><i class="fas fa-user"></i></span>
						</div>
					<input type="text" class="form-control" name="lastName" placeholder="lastName">
						
					</div>
						<div class="input-group form-group">
						<div class="input-group-prepend">
							<span class="input-group-text"><i class="fas fa-user"></i></span>
						</div>
					<input type="number" class="form-control" name=age placeholder="age">
						
					</div>
						<div class="input-group form-group">
						<div class="input-group-prepend">
							<span class="input-group-text"><i class="fas fa-user"></i></span>
						</div>
					<input type="text" class="form-control" name="email" placeholder="email">
						
					</div>
					
						<div class="input-group form-group">
						<div class="input-group-prepend">
							<span class="input-group-text"><i class="fas fa-user"></i></span>
						</div>
					<input type="text" class="form-control" name="university" placeholder="university">
						
					</div>
					
						<div class="input-group form-group">
						<div class="input-group-prepend">
							<span class="input-group-text"><i class="fas fa-user"></i></span>
						</div>
					<input type="text" class="form-control" name="course" placeholder="course">
						
					</div>
					
					<div class="row align-items-center remember">
						<input type="checkbox">Remember Me
					</div>
					<div class="form-group">
						<input type="submit" value="Create" class="btn float-right login_btn">
						
						
					</div>
				</form>
			</div>
			<div class="card-footer">
				<div class="d-flex justify-content-center links">
					Have a account?<a href="./login">Login</a>
				</div>
				<div class="d-flex justify-content-center">
					<a href="#">Forgot your password?</a>
				</div>
			</div>
		</div>
	</div>
</div>
</body>




</html>