<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<html>
<head>

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



<meta charset="ISO-8859-1">
<title>Inheritance</title>
</head>
<body>


	<ul class="menu cf">
		<li><a href="new.jsp">Home</a></li>
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


<br>
<br>
<br>
	<!--begin::Portlet-->
	<div style="background-color: #F4F7FF;" class=box1; ">
	

	
		<div class="heading">
			
				
				<h3 class="kt-portlet__head-title kt-font-brand;" style="text-align:center;">Complexity of
					the Program due to Inheritance</h3>
			</div>

		</div>
		
		


						<div
							class="kt-input-icon kt-input-icon--right kt-subheader__search kt-hidden">
							<input type="text" class="form-control"
								placeholder="Search ..." id="generalSearch"> <span
								class="kt-input-icon__icon kt-input-icon__icon--right" style="align:center;"> <span><i
									class="flaticon2-search-1"></i></span>
							</span>


						</div>
						<br> <br>


						<div
							style="width: 60%; margin: auto; padding: 20px; background: #f0e68c; box-shadow: 0 104px 108px 0 rgba(0.2, 0.2, 0.2, 0.2), 0 116px 120px 0 rgba(0.5, 0.5, 0.5, 0.19);"
							class="container">
							<h1 style="text-align: center">File Upload</h1>
							<p style="text-align: center">Single file upload or ZIP file Upload</p>
							<p style="text-align: center">You can drag and drop here!</p>

		

							

							<div style="margin:auto; width: 500px; height:300px; border: 4px dashed #00008B;">
  									
  					<form action= "Inheritance_FileUploadServlet" method="post" enctype="multipart/form-data" id = bottom>
						<input class="btn btn-link" type ="file" name ="file" multiple/>
						<input class="btn btn-outline-secondary"  type = "submit" value = "file-upload" style = "font-weight: bold "/>
					</form>
</div>
</div>
		


</body>
</html>