<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyCuJf_gatA6sr-m_uBt4ztLKTvLgzxLLuE"></script>

<script type="text/javascript">
function myMap() {
	var mapOptions = {
	    center: new google.maps.LatLng(51.5, -0.12),
	    zoom: 10,
	    mapTypeId: google.maps.MapTypeId.HYBRID
	}
	var map = new google.maps.Map(document.getElementById("map"), mapOptions);
	}
</script>

<h3>Agregar Zona de Escalada</h3>

<form:form method="POST" action="/zona/insertar" modelAttribute="zona">
	<table>
		<tr>
			<td><form:label path="nombre">Nombre: </form:label></td>
			<td><form:input path="nombre" /></td>
		</tr>
		<tr>
			<td><form:label path="descripcion">Descripcion: </form:label></td>
			<td><form:input path="descripcion" /></td>
		</tr>
		<tr>
            <td><input type="submit" value="Agregar"/></td>
        </tr>
	</table>
	<form:hidden id="longitud" path="ubicacion.longitud"/>
	<form:hidden id="latitud" path="ubicacion.latitud"/>
	<!-- parametros relativos a locacion (google map insertado)-->
	<div id="map" style="width:400px;height:400px;background:yellow"></div>
</form:form>


        