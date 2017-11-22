<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1">
<title>Escalandrum</title>

<spring:url value="/resources/core/css/bootstrap.min.css" var="bootstrapCss" />
<link href="${bootstrapCss}" rel="stylesheet" />
<link rel="stylesheet"	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

<spring:url value="/resources/core/js/jquery-3.2.1.min.js" var="jqueryJs" />
<spring:url value="/resources/core/js/bootstrap.min.js" var="bootstrapJs" />
<script src="${jqueryJs}"></script>
<script src="${bootstrapJs}"></script>

<script>
function getzonas(){
        $.get("/zonas", function(data, status){
        	$("#dynamic-content").html(data)
        });
}

</script>

</head>

<nav class="navbar navbar-inverse navbar-fixed-top">
	<div class="container">
		<div class="navbar-header">
			<button type="button" class="navbar-toggle" data-toggle="collapse"
				data-target="#myNavbar">
				<span class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span>
			</button>
			<a class="navbar-brand" href="#">Escalandrum</a>
		</div>
		<div class="collapse navbar-collapse" id="myNavbar">
			<ul class="nav navbar-nav">
				<li class="active"><a href="#">Home</a></li>
				<li><a href="#">Nueva Via</a></li>
				<li><a href="#" onclick="getzonas()">Zonas</a></li>
				<li><a href="#">Maniobras</a></li>
			</ul>
			<ul class="nav navbar-nav navbar-right">
				<li><a href="#"><span class="glyphicon glyphicon-user"></span>
						Registrarse</a></li>
				<li><a href="#"><span class="glyphicon glyphicon-log-in"></span>
						Entrar</a></li>
			</ul>
		</div>
	</div>
</nav>


<div id="myClimbingCarousel" class="carousel slide" data-ride="carousel">

	<!-- Indicators -->
	<ol class="carousel-indicators">
		<li data-target="#myClimbingCarousel" data-slide-to="0" class="active"></li>
		<li data-target="#myClimbingCarousel" data-slide-to="1"></li>
		<li data-target="#myClimbingCarousel" data-slide-to="2"></li>
	</ol>

	<div class="carousel-inner">
		<div class="item active">
			<img class="d-block img-fluid"
				src="/resources/core/images/escalada3.jpg" alt="First slide">
		</div>
		<div class="item">
			<img class="d-block img-fluid"
				src="/resources/core/images/escalada3.jpg"
				alt="Second slide">
		</div>
		<div class="item">
			<img class="d-block img-fluid"
				src="/resources/core/images/escalada3.jpg" alt="Third slide">
		</div>
	</div>

	<!-- Left and right controls -->
	<a class="left carousel-control" href="#myClimbingCarousel"
		data-slide="prev"> <span class="glyphicon glyphicon-chevron-left"></span>
		<span class="sr-only">Previous</span></a> <a
		class="right carousel-control" href="#myClimbingCarousel"
		data-slide="next"> <span class="glyphicon glyphicon-chevron-right"></span>
		<span class="sr-only">Next</span></a>

</div>

<!-- cuerpo de la pagina, noticias e informacion de uso -->
<div class="container-fluid">
  <h2>Registra setores de escalada</h2>
  <h4>Ubicacion geografica y topos</h4>
  <p>Podes cargar una zona y varios sectores y sub-sectores. Subi una foto de las vias, o los topos. <br>
	 Consulta los sectores cercanos a la zona donde deseas ir y mira toda la info de la via, para no meterte en lios. ;D  
  </p>
  
</div>

<div id="dynamic-content" class="container">
	Aca deberian ir las zonas
</div>

<div class="container">
	<hr>
	<footer>
		<p>© Escalandrum 2017</p>
	</footer>
</div>

</body>
</html>