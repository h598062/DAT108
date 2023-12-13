<!DOCTYPE html>
<html lang="no_nb">
<head>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title>Anmelde</title>
</head>
<body>
	<a href="/bokanmeldelser?bok_id=${bok.id}">Tilbake til anmeldelser</a>
	<img src="bilder/${bok.bildefil}">
	<p>${bok.tittel}</p>
	<p>Din Anmeldelse:</p>
	<form action="/anmelde" method="post">
		<input type="hidden" name="bok_id" value="${bok.id}" />
		<c:forEach var="i" begin="5" end="1" step="-1">
			<input id="rt${i}" type="radio" name="rating" value="${i}" ${i eq 5 ? "checked" : ""}>
			<label for="rt${i}"><img src="bilder/rating${i}.png"></label>
		</c:forEach>
		<label for="amd_tekst">Tekst</label>
		<textarea id="amd_tekst" name="amd_tekst"></textarea>
		<label for="navn">Hilsen</label>
		<input id="navn" type="tekst" name="navn">
		<input type="submit" value="Send anmeldelse">
	</form>
</body>
</html>