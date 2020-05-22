<%@page import="CSCom.java.CSFileUpload"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>File Uploading</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">


</head>
<body>

<div>
<form action= 'CSFileSelectServelet'>
<%
CSFileUpload fu = new CSFileUpload();
out.print(fu.getFileList());
%>

</form>
</div>

<form action= "CS_Servelet" method = POST >
			<div class = "textarea" style=" margin-left: 50px; width: 90%; text-align: left ;">
		
			<textarea  name = "code" rows = "15" cols="100" placeholder="COPPY YOUR CIDE HERE"   Style = "" >${tb}</textarea>
			</div>
			<div style = " margin-left: 50px">
			<div class="btn-group">
			<input class = "btn btn-primary" type = "submit" name = "button" value = "Control Stucture" style = "height: 50px; width: 100px">
			</div>
			</div>
			</form>

</body>
</html>