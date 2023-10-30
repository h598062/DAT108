<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="no">
<head>
	<meta charset="UTF-8">
	<title>Temperaturomregning</title>
</head>
<body>
<fieldset>
	<legend>Temperaturomregning</legend>
	<form action="${pageContext.request.contextPath}/convert" method="post">
		<label>Temperatur: <input type="number" name="temperatur"></label><br>
		<label><input type="radio" name="type" value="celsius" checked> Celsius til Fahrenheit</label><br>
		<label><input type="radio" name="type" value="fahrenheit"> Fahrenheit til Celsius</label><br>
		<input type="submit" value="Convert">
	</form>
</fieldset>
</body>
</html>
