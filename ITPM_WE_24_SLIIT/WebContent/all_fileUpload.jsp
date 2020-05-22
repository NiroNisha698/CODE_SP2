<%@page import="AllCom.All_FileUpload"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>File Uploading</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">


 <!-- add icon link -->
<link rel="icon" href="logo3.png" type="image/png"> 

<link rel="stylesheet" type="text/css" href="style.css">
<style>


.btn {
  box-sizing: border-box;
  -webkit-appearance: none;
     -moz-appearance: none;
          appearance: none;
  background-color: transparent;
  border: 2px solid #e74c3c;
  border-radius: 0.6em;
  color: #e74c3c;
  cursor: pointer;
  display: -webkit-box;
  display: -webkit-flex;
  display: -ms-flexbox;
  display: flex;
  -webkit-align-self: center;
      -ms-flex-item-align: center;
          align-self: center;
  font-size: 1rem;
  font-weight: 400;
  line-height: 1;
  margin: 20px;
  
  padding: 1.2em 2.8em;
  text-decoration: none;
  text-align: center;
  text-transform: uppercase;
  font-family: 'Montserrat', sans-serif;
  font-weight: 700;
}
.btn:hover, .btn:focus {
  color: #fff;
  outline: 0;
}
.third {
margin:auto;
  border-color: #3498db;
  color: #fff;
  box-shadow: 0 0 40px 40px #3498db inset, 0 0 0 0 #3498db;
  -webkit-transition: all 150ms ease-in-out;
  transition: all 150ms ease-in-out;
}
.third:hover {
  box-shadow: 0 0 10px 0 #3498db inset, 0 0 10px 4px #3498db;
}

.third2 {
margin:auto;
  border-color: #3498db;
  color: #fff;
  box-shadow: 0 0 40px 40px #3498db inset, 0 0 0 0 #3498db;
  -webkit-transition: all 150ms ease-in-out;
  transition: all 150ms ease-in-out;
}
.third2:hover {
  box-shadow: 0 0 10px 0 #3498db inset, 0 0 10px 4px #3498db;
}

/*
Bule shades: #3C9DD0


*/
body, ul, div {
	margin: 0;
	padding: 0;
}

/* basics */
body {
	margin: 0;
	padding: 10px;
	min-width: 900px;
	font: 100%/1.4 Georgia, serif;
	background: #ddd top left;
	color: #333;
}

.span-full {
	display: inline; /*font-size: 180%;*/
	margin: 0 0 10px 0;
	text-align: center;
	/*padding: 4px;*/
	background: #fff;
	min-width: 900px;
	width: 100%;
	float: left;
	/*margin: 0 -260px 0 0; */
	padding: 0 0 10px;
}

.bolder-shadow {
	box-shadow: 0px 1px 1px rgba(0, 0, 0, .4);
}

div.top-nav-bar-pos {
	background: #fff;
}

.top-nav-bar-pos, .span-full, #footer {
	box-shadow: 0 0 3px rgba(50, 172, 219, 0.6);
}

div.top-nav-bar {
	margin: 0 0 10px 0;
	text-align: center;
	padding: 4px;
	background: #fff;
	height: 50px;
}

ul.top-nav-bar {
	list-style-type: none;
}

li.top-nav-bar {
	float: right;
	display: list-item;
	text-align: -webkit-match-parent;
	margin: .5em;
}





</style>


</head>
<body>



<ul class="menu cf">
		<li><a href="index.jsp">Home</a></li>
		<li><a href="#">Size, Variable, Method</a>
			<ul class="submenu">
				<li><a href="">SIZE</a></li>
				<li><a href="#">VARIABLE</a></li>
				<li><a href="#">METHOD</a></li>
			</ul></li>
		<li><a href="inheritance.jsp">Inheritance</a></li>
		<li><a href="Coupling.jsp">Coupling</a></li>
		<li><a href="#">Control Structure</a></li>
	</ul>

	<br>
<br>


<div style="background-color:#f0e68c; width:350px; margin:auto; " >

<form action= 'all_FileSelectServlet'>
<%
All_FileUpload fu = new All_FileUpload();
out.print(fu.getFileList());
%>

</form>
</div>



			<div>
			<form action= "AllcodeServlet" method  = POST>
			<div class = "textarea" style="margin-top: 30px; margin-left: 300px; width: 90%; text-align: left ;">
			<textarea  name = "code" rows = "15" cols="100" placeholder="COPPY YOUR CODE HERE"    >${tb}</textarea>
			</div>		
							
	
			<div style = " margin-left:480px">
			<div class="btn-group">
			<input class = "btn btn-primary" type = "submit" name = "button" value = "All Factor" style = "height: 50px; width: 200px">
			</div>
						
			
						
						</div>
						</form>
	
	
			</div>


</body>
</html>