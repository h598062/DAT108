<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="no">
<head>
    <title>Kvittering</title>
</head>
<body>
    <h3>Kvittering for lagret info om ansatt</h3>
    <table>
        <tr>
            <td>Fornavn: </td>
            <td>${ansatt.fornavn}</td>
        </tr>
        <tr>
            <td>Etternavn: </td>
            <td>${ansatt.etternavn}</td>
        </tr>
        <tr>
            <td>Fødselsdato: </td>
            <td>${ansatt.fdato}</td>
        </tr>
        <tr>
            <td>Kjønn: </td>
            <td>${ansatt.kjonn}</td>
        </tr>
        <tr>
            <td>Startdato: </td>
            <td>${ansatt.startdato}</td>
        </tr>
        <tr>
            <td>Stilling: </td>
            <td>${ansatt.stilling}</td>
        </tr>
        <tr>
            <td>Månedslønn: </td>
            <td>${ansatt.maanedslonn}</td>
        </tr>
    </table>
</body>
</html>
