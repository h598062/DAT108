<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="no">
<head>
	<title>Title</title>
</head>
<body>
<fieldset>
	<legend>Personlige opplysninger</legend>
	<form action="/" method="post">
		<label>Fornavn: <input type="text" name="fornavn" value="${fornavn}"/></label><br>
		<label>Etternavn: <input type="text" name="etternavn" value="${etternavn}"/></label><br>
		<input type="submit" value="Registrer"/>
	</form>
</body>
</html>
