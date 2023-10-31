<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Favorittfrukt</title>
</head>
<body>
<fieldset>
    <legend>Stem på din favorittfrukt</legend>
    <form action="/stem" method="post">
        <label><input type="radio" name="frukt" value="eple">Eple</label><br>
        <label><input type="radio" name="frukt" value="appelsin">Appelsin</label><br>
        <label><input type="radio" name="frukt" value="banan">Banan</label><br>
        <input type="submit" value="Stem">
    </form>
</fieldset>
</body>
</html>
