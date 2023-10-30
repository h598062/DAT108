<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="no">
<head>
	<meta charset="UTF-8">
	<title>Temperaturomregning - Resultat</title>
</head>
<body>
<fieldset>
	<legend>Temperaturomregning - Feilmelding</legend>
	<p>Feil: ${feilmelding}</p>
	<a href="${pageContext.request.contextPath}/">Prøv på nytt</a>
</fieldset>
</body>
</html>
