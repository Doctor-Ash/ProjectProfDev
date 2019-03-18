 <%@page import="models.Student" %>
<%@page import="models.Skill" %>
<%@page import="java.util.ArrayList" %>
  <!DOCTYPE HTML>
  <html>
  <head>
  	<meta charset="ISO-8859-1" >
	<meta  <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="v" %> >
	<link rel="stylesheet" href="css/site.css">
  <script>
  window.onload = function () {

  //Better to construct options first and then pass it as a parameter
  var options = {
      title: {
          text: "Spline Chart with Export as Image"
      },
      animationEnabled: true,
      exportEnabled: true,
      data: [
      {
          type: "spline", //change it to line, area, column, pie, etc
          dataPoints: [
             <v:forEach items="${rating}" var="v">
              { x: ${${v.getRating()}, y: ${v.getDate()} },
           
              </v:forEach>

          ]
      }
      ]
  };
  $("#chartContainer").CanvasJSChart(options);

  }
  </script>
  </head>
  <body>
  <div id="chartContainer" style="height: 370px; width: 100%;"></div>
  <script src="https://canvasjs.com/assets/script/jquery-1.11.1.min.js"></script>
  <script src="https://canvasjs.com/assets/script/jquery.canvasjs.min.js"></script>
  </body>
  </html>