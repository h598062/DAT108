<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="no">
<head>
    <meta charset="UTF-8">
    <title>Favorittfrukt</title>
</head>
<body>
<fieldset>
    <legend>Stem på din favorittfrukt</legend>
    <p style="color: red">${feilmelding}</p>
    <form action="/stem" method="post">
        <label><input type="radio" name="frukt" value="eple">Eple</label><br>
        <label><input type="radio" name="frukt" value="appelsin">Appelsin</label><br>
        <label><input type="radio" name="frukt" value="banan">Banan</label><br>
        <input type="submit" value="Stem">
    </form>
</fieldset>
</body>
</html>
