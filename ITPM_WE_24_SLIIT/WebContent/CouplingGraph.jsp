<%@page import="maddyModel.Coupling"%>
<%@page import="maddyModel.CodeServlet"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Coupling Graph</title>
<link href = "stylesheet/pageStyleSheet.css" rel="stylesheet" type="text/css">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
<script src = "https://cdn.jsdelivr.net/npm/chart.js@2.9.3/dist/Chart.min.js"></script>
</head>
<body>

<header>
		
		<ul class= "main-nav" >
				<li><a href = "index.jsp">HOME</a></li>				
				<li class="active"><a href = "CouplingGraph.jsp">Coupling Graph</a></li>
				<li><a href = "uploadFile.jsp">Uploaded File</a></li>
				
		</ul>
		
		</header>

<%
CodeServlet cs = new CodeServlet();
String code = cs.returnCode();
Coupling cp = new Coupling();
cp.setCode(code);
int[] tot = cp.gettotalValue();
int a = tot[0];
int b = tot[1];
int c = tot[2];
int d = tot[3];
int e = tot[4];
int f = tot[5];
int g = tot[6];
int i = tot[7];
int j = tot[8];
int k = tot[9];
int l = tot[10];
int m = tot[11];
int n = tot[12];


%>

<canvas id="myChart" width="800" height="300"></canvas>
<script>
var ctx = document.getElementById('myChart').getContext('2d');
var myChart = new Chart(ctx, {
    type: 'bar',
    data: {
        labels: ['Nr', 'Nmcms', 'Nmcmd', 'Nmcrms', 'Nmcrmd', 'Nrmcrms','Nrmcrmd','Nrmcms','Nrmcmd','Nmrgvs','Nmrgvd','Nrmrgvs','Nrmrgvd'],
        datasets: [{
            label: '# of weights',
            data: [<%=a%>, <%=b%>, <%=c%>, <%=d%>, <%=e%>, <%=f%>,<%=g%>,<%=i%>,<%=j%>,<%=k%>,<%=l%>,<%=m%>,<%=n%>],
            backgroundColor: [
                'rgba(255, 99, 132, 0.2)',
                'rgba(54, 162, 235, 0.2)',
                'rgba(255, 206, 86, 0.2)',
                'rgba(75, 192, 192, 0.2)',
                'rgba(153, 102, 255, 0.2)',
                'rgba(255, 159, 64, 0.2)'
            ],
            borderColor: [
                'rgba(255, 99, 132, 1)',
                'rgba(54, 162, 235, 1)',
                'rgba(255, 206, 86, 1)',
                'rgba(75, 192, 192, 1)',
                'rgba(153, 102, 255, 1)',
                'rgba(255, 159, 64, 1)'
            ],
            borderWidth: 1
        }]
    },
    options: {
        scales: {
            yAxes: [{
                ticks: {
                    beginAtZero: true
                }
            }]
        }
    }
});
</script>

</body>
</html>