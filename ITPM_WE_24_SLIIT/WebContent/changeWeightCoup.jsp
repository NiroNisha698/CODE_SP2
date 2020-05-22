<%@page import="maddyModel.Coupling"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Change weight for Coupling</title>
</head>
<body>
<h2>If you want to change default WEIGHTS change here....</h2>
	<form action = "CouplingWeightServlet" method= POST>
	<div style = "width : 50%; float : left;">
			<table class="table table-hover" border="1">
			<tr><th bgcolor= '#839192'>Coupling Type</th><th bgcolor= '#839192'>Weight</th></tr>
			<tr><td >A recursive call</td><td ><input type="text" name = "wNr" value = 2> </td></tr>
			<tr><td>A regular method calling another regular method in the same file</td><td><input type="text" name = "wNmcms" value = 2> </td></tr>
			<tr><td>A regular method calling another regular method in a different file</td><td><input type="text" name = "wNmcmd" value = 3> </td></tr>
			<tr><td>A regular method calling a recursive method in the same file</td><td><input type="text" name = "wNmcrms" value = 3> </td></tr>
			<tr><td>A regular method calling a recursive method in a different file</td><td> <input type="text" name = "wNmcrmd" value = 4></td></tr>
			<tr><td>A recursive method calling another recursive method in the same file</td><td><input type="text" name = "wNrmcrms" value = 4> </td></tr>
			<tr><td>A recursive method calling another recursive method in a different file</td><td> <input type="text" name = "wNrmcrmd" value = 5></td></tr>
			<tr><td>A recursive method calling a regular method in the same file</td><td> <input type="text" name = "wNrmcms" value = 3></td></tr>
			<tr><td>A recursive method calling a regular method in a different file</td><td><input type="text" name = "wNrmcmd" value = 4> </td></tr>
			<tr><td>A regular method referencing a global variable in the same file </td><td><input type="text" name = "wNmrgvs" value = 1> </td></tr>
			<tr><td>A regular method referencing a global variable in a different file</td><td><input type="text" name = "wNmrgvd" value = 2> </td></tr>
			<tr><td>A recursive method referencing a global variable in the same file</td><td><input type="text" name = "wNrmrgvs" value = 1> </td></tr>
			<tr><td>A recursive method referencing a global variable in a different file </td><td><input type="text" name = "wNrmrgvd" value = 2> </td></tr>
			<tr><td></td><td></td></tr>
			
			</table>
			
			</div>
			<div style = "width : 50% ;margin-top: 200px; float : right; text-align: center;">
			<input class="btn btn-info btn-arrow-right" type = "submit" name = "submit" value = "save" style = "width: 200px;height: 50px">
			</div>
</form>
</body>
</html>