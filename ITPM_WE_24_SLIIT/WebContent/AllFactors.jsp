
<%@page import="AllCom.AllFactors"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here All factor</title>

</head>
<body>
<h1 class="display-1"
					style="center: 2%; text-align:center; margin-left: 100px; font-family: century gothic; font-size: 50px;margin-top: 10px">
					<font color="#00376c">Complexity of All Factor</font></h1>

<div style="background-color:#ccccff">		
<br>
<br>
<%
	AllFactors af = new AllFactors();
	out.print(af.gettable());
%>
<br>
 <br>
</div>

</body>
</html>