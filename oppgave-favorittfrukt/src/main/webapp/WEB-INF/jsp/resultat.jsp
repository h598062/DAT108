<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="no">
<head>
	<meta charset="UTF-8">
	<title>Favorittfrukt resultat</title>
</head>
<body>
<fieldset>
	<legend>Resultat</legend>
	<c:forEach var="frukt" items="${stemmer}">
		<p>${frukt.key}: ${frukt.value}</p>
	</c:forEach>
	<a href="/">Stem en gang til</a>
</fieldset>
</body>
</html>
