<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<table class="table table-striped">
<caption>Lista de Zonas</caption>
    <thead>
      <tr>
        <th>zona</th>
        <th>descripcion</th>
        <th>cantidad de sectores</th>
      </tr>
    </thead>
    <tbody>
		<c:forEach items="${zonas}" var="zona">
		<tr>
        	<td>${zona.nombre}</td>
        	<td>${zona.descripcion}</td>
        	<td>${zona.sectores != null ? zona.sectores.size : 0}</td>
        </tr> 
		</c:forEach>
	</tbody>
</table>