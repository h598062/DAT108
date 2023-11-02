<%--@elvariable id="feilmelding" type="java.lang.String"--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
        <c:forEach var="frukt" items="${frukter}">
            <label><input type="radio" name="frukt" value="${frukt}"> ${frukt}</label><br>
        </c:forEach>
        <input type="submit" value="Stem">
    </form>
</fieldset>
</body>
</html>
