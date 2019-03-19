<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

<head>
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
<meta charset="ISO-8859-1">

<title>Insert title here</title>
</head>
<style>
* {
  box-sizing: border-box;
}

/* Set a background color */
body {
  background-color: #474e5d;
  font-family: Helvetica, sans-serif;
}

/* The actual timeline (the vertical ruler) */
.timeline {
  position: relative;
  max-width: 1200px;
  margin: 0 auto;
}

/* The actual timeline (the vertical ruler) */
.timeline::after {
  content: '';
  position: absolute;
  width: 6px;
  background-color: white;
  top: 0;
  bottom: 0;
  left: 50%;
  margin-left: -3px;
}

/* Container around content */
.container {
  padding: 10px 40px;
  position: relative;
  background-color: inherit;
  width: 50%;
}

/* The circles on the timeline */
.container::after {
  content: '';
  position: absolute;
  width: 25px;
  height: 25px;
  right: -17px;
  background-color: white;
  border: 4px solid #FF9F55;
  top: 15px;
  border-radius: 50%;
  z-index: 1;
}

/* Place the container to the left */
.left {
  left: 0;
}

/* Place the container to the right */
.right {
  left: 50%;
}

/* Add arrows to the left container (pointing right) */
.left::before {
  content: " ";
  height: 0;
  position: absolute;
  top: 22px;
  width: 0;
  z-index: 1;
  right: 30px;
  border: medium solid white;
  border-width: 10px 0 10px 10px;
  border-color: transparent transparent transparent white;
}

/* Add arrows to the right container (pointing left) */
.right::before {
  content: " ";
  height: 0;
  position: absolute;
  top: 22px;
  width: 0;
  z-index: 1;
  left: 30px;
  border: medium solid white;
  border-width: 10px 10px 10px 0;
  border-color: transparent white transparent transparent;
}

/* Fix the circle for containers on the right side */
.right::after {
  left: -16px;
}

/* The actual content */
.content {
  padding: 20px 30px;
  background-color: white;
  position: relative;
  border-radius: 6px;
}

/* Media queries - Responsive timeline on screens less than 600px wide */
@media screen and (max-width: 600px) {
/* Place the timelime to the left */
  .timeline::after {
    left: 31px;
  }

/* Full-width containers */
  .container {
    width: 100%;
    padding-left: 70px;
    padding-right: 25px;
  }

/* Make sure that all arrows are pointing leftwards */
  .container::before {
    left: 60px;
    border: medium solid white;
    border-width: 10px 10px 10px 0;
    border-color: transparent white transparent transparent;
  }

/* Make sure all circles are at the same spot */
  .left::after, .right::after {
    left: 15px;
  }

/* Make all right containers behave like the left ones */
  .right {
    left: 0%;
  }
}

</style>
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
            <a class="nav-link js-scroll active" href="./logout">Log out</a>
          </li>
          <li class="nav-item">
            <v:if test="${session == true }"> <!-- if user is logged in display add new and logout  -->
		    	<a class="nav-link js-scroll" href="./showunits">Show Units</a>
			</v:if>
          </li>
          <li class="nav-item">
            <a class="nav-link js-scroll" href="./showskills">Show Skills</a>
          </li>
           <li class="nav-item">
			<v:if test="${session == true }"> <!-- if user is logged in display add new and logout  -->
		    	<a class="nav-link js-scroll" href="./addSkill">Add Skills</a>
			</v:if>
			</li>
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


<div class="timeline">
  <div class="container left">
    <div class="content">
      <h2>January Goals</h2>
      <p>Lorem ipsum..</p>
    </div>
  </div>
  <div class="container right">
    <div class="content">
      <h2>Febuaray Goals</h2>
      <p>Lorem ipsum..</p>
    </div>
  </div>
    <div class="container left">
    <div class="content">
      <h2>March Goals</h2>
      <p>Lorem ipsum..</p>
    </div>
  </div>
  <div class="container right">
    <div class="content">
      <h2>April Goals</h2>
      <p>Lorem ipsum..</p>
    </div>
  </div>
  <div class="container left">
    <div class="content">
      <h2>May Goals</h2>
      <p>Lorem ipsum..</p>
    </div>
  </div>
  <div class="container right">
    <div class="content">
      <h2>June Goals</h2>
      <p>Lorem ipsum..</p>
    </div>
  </div>
  <div class="container left">
    <div class="content">
      <h2>July Goals</h2>
      <p>Lorem ipsum..</p>
    </div>
  </div>
  <div class="container right">
    <div class="content">
      <h2>August Goals</h2>
      <p>Lorem ipsum..</p>
    </div>
  </div>
  <div class="container left">
    <div class="content">
      <h2>Septemeber Goals</h2>
      <p>Lorem ipsum..</p>
    </div>
  </div>
  <div class="container right">
    <div class="content">
      <h2>October Goals</h2>
      <p>Lorem ipsum..</p>
    </div>
  </div>
  <div class="container left">
    <div class="content">
      <h2>November Goals</h2>
      <p>Lorem ipsum..</p>
    </div>
  </div>
  <div class="container right">
    <div class="content">
      <h2>December Goals</h2>
      <p>Lorem ipsum..</p>
    </div>
  </div>
  
  </div>
</div>

</body>
</html>