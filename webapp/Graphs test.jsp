 <%@page import="models.Student" %>
<%@page import="models.Skill" %>
<%@page import="java.util.ArrayList" %>
<%@ page import="java.util.*" %>
<%@ page import="com.google.gson.Gson"%>
<%@ page import="com.google.gson.JsonObject"%>
 
<%
Gson gsonObj = new Gson();
Map<Object,Object> map = null;
List<Map<Object,Object>> list = new ArrayList<Map<Object,Object>>();
 
String skillN = (String)request.getAttribute("skillName"); //BIGGGGGGGGGGGGGG
ArrayList<Skill> ratings = new ArrayList<>();
ratings = (ArrayList<Skill>)request.getAttribute("ratings");
int counter = 1;
for(Skill s : ratings) {
	String c = String.valueOf(counter);
	String d = s.getDate();
	map = new HashMap<Object,Object>(); map.put("label", d); map.put("y", s.getRating()); list.add(map);
	counter++;
}
//map = new HashMap<Object,Object>(); map.put("label", "1"); map.put("y", 188); list.add(map);
//map = new HashMap<Object,Object>(); map.put("label", "2"); map.put("y", 213); list.add(map);
//map = new HashMap<Object,Object>(); map.put("label", "3"); map.put("y", 213); list.add(map);
//map = new HashMap<Object,Object>(); map.put("label", "4"); map.put("y", 219); list.add(map);
//map = new HashMap<Object,Object>(); map.put("label", "5"); map.put("y", 207); list.add(map);



String dataPoints = gsonObj.toJson(list);

%>
  <!DOCTYPE HTML>
  <html>
  <head>
  	<meta charset="ISO-8859-1" >
	<meta  <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="v" %> >
		
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
	<link rel="stylesheet" href="css/site.css">
	<script type="text/javascript">
window.onload = function() { 
 
var chart = new CanvasJS.Chart("chartContainer", {
	theme: "light2",
	title: {
		text: "<%out.print(skillN);%>"
	},
	axisX: {
		title: "Date"
	},
	axisY: {
		title: "Rating"
	},
	data: [{
		type: "line",
		dataPoints : <%out.print(dataPoints);%>
	}]
});
chart.render();
 
}
</script>
  </head>
  <body id="page-top">
   <div class="intro route bg-image" style="background-image: url(img/intro-bg.jpg); background-repeat: no-repeat;
  background-attachment: fixed; height:2400px;">
  
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
  
    <br>
  
  
  <div id="chartContainer" style="height: 370px; width: 100%;"></div>
  <script src="https://canvasjs.com/assets/script/jquery-1.11.1.min.js"></script>
  <script src="https://canvasjs.com/assets/script/jquery.canvasjs.min.js"></script>
  </body>
  </html>