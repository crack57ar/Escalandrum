<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>

<html>	
<head>

<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1" />

<title>Escalandrum</title>

<spring:url value="/resources/core/css/bootstrap.min.css"
	var="bootstrapCss" />
<link href="${bootstrapCss}" rel="stylesheet" />

<spring:url value="/resources/core/js/jquery-3.2.1.min.js"
	var="jqueryJs" />
<spring:url value="/resources/core/js/bootstrap.min.js"
	var="bootstrapJs" />
<script src="${jqueryJs}"></script>
<script src="${bootstrapJs}"></script>
</head>

<body>
	<jsp:include page="/WEB-INF/views/jsp/menu.jsp" />
		<tiles:insertAttribute name="main" />
	<jsp:include page="/WEB-INF/views/jsp/footer.jsp" />
</body>
</html>