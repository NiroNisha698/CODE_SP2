<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Control Structure</title>

<link href = "StyleSheet/Stylesheet.css" rel="stylesheet" type="text/css">
  <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
</head>
<body>

<div class = "header1">
			<h1>CODE COMPLEXITY OF CONTROL STRUCTURE</h1>
		
	
		
			<div class = "button">
				  <a href = "#bottom" class = "btn1">Start Here</a>
				
			</div>
	
		</div>
		<style>
			html{
				scroll-behavior: smooth;
			}
		
		</style>
		
		
		
		
			<form action= "CS_Servelet" method  = POST>
		<div class = "textarea" style="margin-top: 90px; margin-left: 50px; width: 90%; text-align: left ;">
			<textarea  name = "code" rows = "15" cols="100" placeholder="COPPY YOUR CIDE HERE"    >${tb}</textarea>
			</div>
			
			<div style = " margin-left: 50px">
			<div class="btn-group">
			<input class = "btn btn-primary" type = "submit" name = "button" value = "Control Structure" style = "height: 50px; width: 100px">
		</div>
		</div>
		</form>
			
        <div class = "fileUpload" style="margin-top: 30px; margin-left: 800px;">
		
      
		<h5>upload A ZIP file or normal fileS here...</h5>
					<form action= "CSFileUploadServelet" method="post" enctype="multipart/form-data" id = bottom>
						<input class="btn btn-link" type ="file" name ="file" multiple/>
						<input class="btn btn-outline-secondary"  type = "submit" value = "file-upload" style = "font-weight: bold "/>
					</form>
					
					
		</div>

</body>
</html>