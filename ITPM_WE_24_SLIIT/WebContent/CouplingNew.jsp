<%@page import="maddyModel.Coupling"%>
<%@page import="maddyModel.UploadFile"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>coupling</title>

  <link href = "stylesheet/pageStyleSheet.css" rel="stylesheet" type="text/css">
  <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
	
	
	<style>
  
#myBtn {
  display: none;
  position: fixed;
  bottom: 20px;
  right: 30px;
  z-index: 99;
  font-size: 18px;
  border: none;
  outline: none;
  background-color: black;
  color: white;
  cursor: pointer;
  padding: 15px;
  border-radius: 4px;
}

#myBtn:hover {
  background-color: #555;
}
</style>
	
</head>
<body>
	<header>
		
		<ul class= "main-nav" >
				<li><a href = "Coupling.jsp">HOME</a></li>
				<li class="active"><a href = "#">Coupling</a></li>
				<li><a href = "changeWeightCoup.jsp">Change Weight</a></li>
				<li><a href = "CouplingGraph.jsp">Graphic View</a></li>
				<li><a href = "uploadFile.jsp">Uploaded File</a></li>
				
		</ul>
		
		</header>
<div>
	
			
		
			 ${tb}
			
</div>
			
	
	<button onclick="topFunction()" id="myBtn" title="Go to top">Top</button>


<script>
//Get the button
var mybutton = document.getElementById("myBtn");

// When the user scrolls down 20px from the top of the document, show the button
window.onscroll = function() {scrollFunction()};

function scrollFunction() {
  if (document.body.scrollTop > 20 || document.documentElement.scrollTop > 20) {
    mybutton.style.display = "block";
  } else {
    mybutton.style.display = "none";
  }
}

// When the user clicks on the button, scroll to the top of the document
function topFunction() {
  document.body.scrollTop = 0;
  document.documentElement.scrollTop = 0;
}
</script>
	
		<br>
		<br>
		<br>
		<br>		


	
		
		
</body>
</html>