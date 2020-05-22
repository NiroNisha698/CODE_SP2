<%@page import="maddyModel.UploadFile"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Upload File</title>

<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">

</head>
<body>

<div>
<form action= 'SelectFileServlet'>
<%
UploadFile fu = new UploadFile();
out.print(fu.getFileList());
%>

</form>
</div>


		
			<form action= "CodeServlet" method = POST >
			<div class = "textarea" style=" margin-left: 50px; width: 90%; text-align: left ;">
		
			<textarea  name = "code" rows = "15" cols="100" placeholder="Type your code here..."   Style = "" >${tb}</textarea>
			</div>
			<div style = " margin-left: 50px">
			
			
			<div class="btn-group">
			<input class = "btn btn-primary" type = "submit" id = "bottom" name = "button" value = "Coupling" style = "height: 50px; width: 100px ; float: left;">
			</div>
			<div class="btn-group">
			<input class="btn btn-outline-primary" type = "submit" name = "button" value = "All-Factors" style = "height: 75px; width: 100px ; float: left; color:#094C71; font-weight: bold;">
			</div>
			
			</div>
			
		</form>
		

</body>
</html>