<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="no">
<head>
    <title>Ansatt Registrering</title>
</head>
<body>
<h3>Hei. Tast inn informasjon om den ansatte</h3>

<p style="color:red;">${feilmelding}</p>
<p style="color:red;">${feilmeldinger}</p>

<form action="${pageContext.request.contextPath}/registrerAnsatt" method="post" id="person">
    <table>
        <tr>
            <td><label for="fornavn">Fornavn:</label></td>
            <td><input type="text" id="fornavn" name="fornavn" value="${ansatt.fornavn}"></td>
        </tr>
        <tr>
            <td><label for="etternavn">Etternavn:</label></td>
            <td><input type="text" id="etternavn" name="etternavn" value="${ansatt.etternavn}"></td>
        </tr>
        <tr>
            <td><label for="fdato">Fødselsdato:</label></td>
            <td><input type="date" id="fdato" name="fdato" value="${ansatt.fdato}"></td>
        </tr>
        <tr>
            <td><label for="kjonn">Kjønn:</label></td>
            <td><input type="text" id="kjonn" name="kjonn" value="${ansatt.kjonn}"></td>
        </tr>
        <tr>
            <td><label for="startdato">Startdato:</label></td>
            <td><input type="date" id="startdato" name="startdato" value="${ansatt.startdato}"></td>
        </tr>
        <tr>
            <td><label for="stilling">Stilling:</label></td>
            <td><input type="text" id="stilling" name="stilling" value="${ansatt.stilling}"></td>
        </tr>
        <tr>
            <td><label for="maanedslonn">Månedslønn:</label></td>
            <td><input type="number" id="maanedslonn" name="maanedslonn" value="${ansatt.maanedslonn}"></td>
        </tr>
    </table>

    <input type="submit" value="Send!"/>
</form>

</body>
</html>
