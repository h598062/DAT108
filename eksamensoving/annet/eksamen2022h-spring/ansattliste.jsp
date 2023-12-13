<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title>Ansattliste</title>
</head>
<body>
	<h3>Liste over alle ansatte</h3>
	<table>
		<tr>
			<th>Id</th>
			<th>Fornavn</th>
			<th>Etternavn</th>
			<th>Stilling</th>
			<th>Mndlønn</th>
		</tr>
		<c:foreach var="a" items="${ansatte}">
			<tr>
				<td>${a.id}</td>
				<td>${a.fornavn}</td>
				<td>${a.etternavn}</td>
				<td>${a.stilling}</td>
				<td>${a.mndlonn}</td>
			</tr>
		</c:foreach>
	</table>
</body>
</html>