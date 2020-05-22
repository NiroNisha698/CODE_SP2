<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<head>
<link rel="stylesheet" type="text/css" href="couple.css">
<link rel="stylesheet" type="text/css" href="style.css">
<link rel="stylesheet" href="Views/bootstrap.min.css">
<style>

/*
Bule shades: #3C9DD0


*/

body, ul, div{
  margin:150;
  padding:150;
}

/* basics */
body {
  margin: 0;
  padding: 10px;
  min-width: 900px;
  font: 100%/1.4 Georgia, serif;
  background:#ddd top left;
  color: #333;
}

.span-full {
  display:inline;/*font-size: 180%;*/
  margin: 0 0 10px 0;
  text-align: center;
  /*padding: 4px;*/
  background: #fff;
  min-width: 900px;
  width:100%;
  float: left;
  /*margin: 0 -260px 0 0; */
  padding: 0 0 10px;
}
.bolder-shadow{
  box-shadow: 0px 1px 1px rgba(0,0,0,.4);
}
div.top-nav-bar-pos{
 background: #fff; 

}

.top-nav-bar-pos, .span-full, #footer{
  box-shadow: 0 0 3px rgba(50, 172, 219, 0.6);
}
.button {
  background-color: white;
  color: black;
  border: 2px solid #4CAF50; /* Green */
}

div.top-nav-bar{
 width:"100%";
 margin: 0 0 100px 0;
 text-align: center;
 font-size: 180%;
 padding: 10px;
 background: #fff;
 height: 100px;
}

ul.top-nav-bar{
  list-style-type:none;
}

li.top-nav-bar{
  float:right;
  display:list-item;
  text-align: -webkit-match-parent;
  margin:.5em;
}

h2 {font-size: 130%; margin: 6px; clear: both;}
h3 {font-size: 130%; margin: 6px;}

p {margin: 6px; padding: 4px; font-size: 100%;}

/* 3 column */

#side1 {width: 50%; float: left; margin: 0 -260px 0 0; 
  padding: 0 0 10px;}
#side1 div {background: #dda; margin: 0 260px 0 0; min-height: 100px; padding: 1px 0;}
#side2 {width: 50%; float: right; margin: 0 0 0 -260px; background: #fff; padding: 0 0 10px;}
#side2 div {background: #dda; margin: 0 0 0 260px; min-height: 100px; padding: 1px 0;}
#side1 #center {background: #fea; width: 500px; min-height: 100px; float: right; margin: 0 -250px 0 0 ; padding: 1px 0; position: relative;}

* html #side1 div,* html #side2 div, * html #side1 #center {height: 300px; /* min-height for IE6 */}
* html #side1 {position: relative;}
* html #side1 #center {position: relative; left: -2px;}

/* 2 Column */

#side3 {width: 50%; float: left; margin: 0 -260px 0 0; 
  padding: 0 0 10px;}
#side3 div {background: #dda; margin: 0 260px 0 0; min-height: 100px; padding: 1px 0;}
#side4 {width: 50%; float: right; margin: 0 0 0 -260px; background: #fff; padding: 0 0 10px;}
#side4 div {background: #dda; margin: 0 0 0 260px; min-height: 100px; padding: 1px 0;}
#side3 #center2 {background: #fea; width: 100%; min-height: 100px; float: right; margin: 0 -250px 0 0 ; padding: 1px 0; position: relative;}

* html #side3 div,* html #side4 div, * html #side3 #center {height: 300px; /* min-height for IE6 */}
* html #side3 {position: relative;}
* html #side3 #center {position: relative; left: -2px;}

/* footer */

#footer {float: left; width: 100%; text-align: center; background: #edb; }


.in-center{
  <!--padding:100px 50px;-->
  top:50%;  
  left:50%;  
  margin:-100px 0 0 -100px;
}


@font-face {
    font-family: 'WebSymbolsRegular';
    src: url('http://websymbols/websymbols-regular-webfont.eot');
    src: url('http://websymbols/websymbols-regular-webfont.eot?#iefix') format('embedded-opentype'),
        url('/websymbols/websymbols-regular-webfont.woff') format('woff'),
        url('/websymbols/websymbols-regular-webfont.ttf') format('truetype'),
        url('/websymbols/websymbols-regular-webfont.svg#WebSymbolsRegular') format('svg');
    font-weight: normal;
    font-style: normal;
}
.ca-menu{
    position:relative;
    padding:0;
    /*margin: 0 150px 0 150px;*/
    margin:20px 350px;
    width: 850px;
}

.ca-menu li{
    width: 250px;
    height: 350px;
    overflow: hidden;
    position: relative;
    float: left;
    margin: .4em;
    border: 5px solid #fff;
    background: #e2f0ff;
    -webkit-box-shadow: 1px 1px 2px rgba(0,0,0,0.2);
    -moz-box-shadow: 1px 1px 2px rgba(0,0,0,0.2);
    box-shadow: 1px 1px 2px rgba(0,0,0,0.2);
    margin-right: 4px;
    -webkit-transition: all 300ms linear;
    -moz-transition: all 300ms linear;
    -o-transition: all 300ms linear;
    -ms-transition: all 300ms linear;
    transition: all 300ms linear;
}
.ca-menu li:last-child{
    margin-right: 0px;
}
.ca-menu li a{
    text-align: left;
    width: 100%;
    height: 100%;
    display: block;
    color: #333;
    position: relative;
}
.ca-icon{
    font-family: 'WebSymbolsRegular', cursive;
    color: #c5e4f4;
    font-size: 90px;
    text-shadow: 1px 0px 1px rgba(255,255,255,0.7);
    line-height: 150px;
    position: absolute;
    width: 100%;
    height: 50%;
    left: 0px;
    top: 0px;
    text-align: center;
    -webkit-transition: all 200ms linear;
    -moz-transition: all 200ms linear;
    -o-transition: all 200ms linear;
    -ms-transition: all 200ms linear;
    transition: all 200ms linear;
}
.ca-content{
    position: absolute;
    left: 0px;
    width: 100%;
    height: 50%;
    top: 50%;
}
.ca-main{
    font-size: 30px;
    color: #005382;
    opacity: 0.8;
    text-align: center;
    -webkit-transition: all 200ms linear;
    -moz-transition: all 200ms linear;
    -o-transition: all 200ms linear;
    -ms-transition: all 200ms linear;
    transition: all 200ms linear;
}
.ca-sub{
    text-align:center;
    font-size: 14px;
    color: #666;
    line-height: 40px;
    opacity: 0.8;
    -webkit-transition: all 200ms linear;
    -moz-transition: all 200ms linear;
    -o-transition: all 200ms linear;
    -ms-transition: all 200ms linear;
    transition: all 200ms linear;
}
.ca-menu li:hover{
    background-color: #fff;
}
.ca-menu li:hover .ca-icon{
    text-shadow: 0px 0px 20px #c5e4f4;
    color: transparent;
    -webkit-animation: moveFromTop 400ms ease;
    -moz-animation: moveFromTop 400ms ease;
    -ms-animation: moveFromTop 400ms ease;
}
.ca-menu li:hover .ca-main{
    color: #000;
    -webkit-animation: moveFromTop 300ms ease;
    -moz-animation: moveFromTop 300ms ease;
    -ms-animation: moveFromTop 300ms ease;
}
.ca-menu li:hover .ca-sub{
    color: #000;
    -webkit-animation: moveFromBottom 500ms ease;
    -moz-animation: moveFromBottom 500ms ease;
    -ms-animation: moveFromBottom 500ms ease;
}
@-webkit-keyframes moveFromTop {
    from {
        -webkit-transform: translateY(-300%);
    }
    to {
        -webkit-transform: translateY(0%);
    }
}
@-moz-keyframes moveFromTop {
    from {
        -moz-transform: translateY(-300%);
    }
    to {
        -moz-transform: translateY(0%);
    }
}
@-ms-keyframes moveFromTop {
    from {
        -ms-transform: translateY(-300%);
    }
    to {
        -ms-transform: translateY(0%);
    }
}

@-webkit-keyframes moveFromBottom {
    from {
        -webkit-transform: translateY(200%);
    }
    to {
        -webkit-transform: translateY(0%);
    }
}
@-moz-keyframes moveFromBottom {
    from {
        -moz-transform: translateY(200%);
    }
    to {
        -moz-transform: translateY(0%);
    }
}
@-ms-keyframes moveFromBottom {
    from {
        -ms-transform: translateY(200%);
    }
    to {
        -ms-transform: translateY(0%);
    }
    
    
}


</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<ul class="menu cf">
  <li><a href="index.jsp">Home</a></li>
  <li>
    <a href="Upload.jsp">Size, Variable, Method</a></li>
  <li><a href="inheritance.jsp">Inheritance</a></li>
  <li><a href="Coupling.jsp">Coupling</a></li>
   <li><a href="#">Control Structure</a></li>  
</ul>
<br><br>
<br>
<br>
<button onclick="myFunction()">Toggle dark mode</button>

<script>
function myFunction() {
   var element = document.body;
   element.classList.toggle("dark-mode");
}
</script>
<center>


 <center>
<div  style="height:100%; float : center;  width:60%; border: 5px black; background-color: #CED4EA; border: 2px solid #0F2B76; "  float ="center">
<br><br>
<h2>Calculate Complexity of Method</h2>
<br>
   <form action= "FileUploadServlet" method="post" enctype="multipart/form-data" id = bottom font-size="200%" float ="center">
            Select file to upload:
            <br><br>
            <input type="file" name="uploadFile" class="btn btn-primary" />
            <br>
            <br>
            <input type="submit"   padding="32px 16px" font-size="16px" value = "UPLOAD"  style = "height: 50px; width: 100px; background-color: white; border: 2px solid #0F2B76;"  />
        </form>
        <br><br>
</div>
</center>
</div>
</center>

</body>
</html>