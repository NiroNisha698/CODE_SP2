<!DOCTYPE html>
<%@page import="maddyModel.Coupling"%>
<html>
<head>

<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
  
<title>Home</title>

   <style> 
textarea {
  width: 100%;
  height: 200px;
  padding: 12px 20px;
  box-sizing: border-box;
  border: 2px solid #ccc;
  border-radius: 4px;
  background-color: #f8f8f8;
  font-size: 16px;
  resize: none;
  
  }
button {
  background-color:; /* Green */
  border: none;
  color: white;
  padding: 16px 32px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  font-size: 16px;
  margin: 4px 2px;
  transition-duration: 0.4s;
  cursor: pointer;
}
  
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
		<div class= "row" style="background-image: url()">
		<ul class= "main-nav">
				
				
		</ul>
		<div class = "header2">
			<h1>CODE COMPLEXITY  Calculator</h1>

		</div>
		</div>
		
		<style>
			html{
				scroll-behavior: smooth;
			}
		
				
		
		</style>
		</header>
		
		
	
      			
		
		<div class = "uploadFile" style="margin-top: 30px; margin-left: 100px;">
		
				<p>Upload a Zip file </p>
					<form action= "UploadFileServlet" method="post" enctype="multipart/form-data" >
						<input class="btn btn-link" type ="file" name ="file" multiple/>
						<input class="btn btn-outline-secondary"  type = "submit" value = "file-upload" style = "font-weight: bold "/>
					</form>
					
					
		</div>
		
		
		<div>
			<form action= "CodeServlet" method  = POST>
		<div class = "textarea" style="margin-top: 90px; margin-left: 50px; width: 90%; text-align: left ;">
			<textarea  name = "code" rows = "15" cols="100" placeholder="Type you code"    >${tb}</textarea>
			</div>
			
			<br>
			<br>
			<br>
			
			<script>
			
			// erase the input
			$("#erase").click(function(){
				 $(this).prev().val("");
			});
			
			</script>
			
			<div style = " margin-left: 50px">
			<div class="btn-group">
			<input class = "btn btn-primary"  type = "submit" name = "button" value = "Coupling" style = "height: 50px; width: 100px ; float: left;">
			</div>
			<div class="btn-group">
			<input id="erase" class="buttonInside" type = "submit" name = "button" value = "All-Factors" style = "height: 75px; width: 100px ; float: left; color:#094C71; font-weight: bold;">
			</div>
			</div>
			
			
			
			
			</form>
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
			
		  
		
		
	
</body>
</html>