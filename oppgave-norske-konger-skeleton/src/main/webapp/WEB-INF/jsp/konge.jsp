<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="nb">
<head>
    <meta charset="utf-8"/>
    <meta http-equiv="X-UA-Compatible" content="IE=edge"/>
    <title>Konge søk</title>
    <meta name="description" content=""/>
    <meta name="viewport" content="width=device-width, initial-scale=1"/>
    <link rel="stylesheet" href=""/>
</head>
<body>
    <h1>Konge søk</h1>
    <form action="${pageContext.request.contextPath}/getkonge" method="get">
        <label for="aar">Hvem var konge i år </label>
        <input type="number" name="aar" id="aar"/>
        <input type="submit" value="Søk"/>
    </form>
    <img src="${konge.bilde}" alt="${konge.navn}" width="200" height="200">
    <p>Konge i år ${param.aar} var  ${konge.navn}, født ${konge.fodtAar}, konge fra ${konge.kongeFraAar} til ${konge.kongeTilAar}</p>
</body>
</html>
