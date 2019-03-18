  <!DOCTYPE HTML>
  <html>
  <head>
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
              { x: 1, y: 1 },
              { x: 2, y: 2 },
              { x: 3, y: 3 },
              { x: 4, y: 4 },
              { x: 5, y: 5 },
              { x: 6, y: 6 },
              { x: 7, y: 7 },
              { x: 8, y: 8 },
              { x: 9, y: 9 },
              { x: 10, y: 10 }

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