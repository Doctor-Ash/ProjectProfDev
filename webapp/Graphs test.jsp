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
  <body>
  <div id="chartContainer" style="height: 370px; width: 100%;"></div>
  <script src="https://canvasjs.com/assets/script/jquery-1.11.1.min.js"></script>
  <script src="https://canvasjs.com/assets/script/jquery.canvasjs.min.js"></script>
  </body>
  </html>