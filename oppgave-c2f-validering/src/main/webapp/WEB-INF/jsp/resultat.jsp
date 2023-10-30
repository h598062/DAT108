<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="no">
<head>
	<meta charset="UTF-8">
	<title>Temperaturomregning - Resultat</title>
</head>
<body>
<fieldset>
	<legend>Temperaturomregning - Resultat</legend>
	<p>${celsius} °C = ${fahrenheit} °F</p>
	<a href="${pageContext.request.contextPath}/">Konverter på nytt</a>
</fieldset>
</body>
</html>
