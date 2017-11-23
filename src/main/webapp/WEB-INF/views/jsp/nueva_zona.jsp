<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<script type="text/javascript">
$(function () {

    function initMap() {

        var location = new google.maps.LatLng(50.0875726, 14.4189987);

        var mapCanvas = document.getElementById('map');
        var mapOptions = {
            center: location,
            zoom: 16,
            panControl: false,
            mapTypeId: google.maps.MapTypeId.ROADMAP
        }
        var map = new google.maps.Map(mapCanvas, mapOptions);

    }

    google.maps.event.addDomListener(window, 'load', initMap);
});
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
	<div id="map"></div>
</form:form>

<script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyBu5nZKbeK-WHQ70oqOWo-_4VmwOwKP9YQ"></script>
        