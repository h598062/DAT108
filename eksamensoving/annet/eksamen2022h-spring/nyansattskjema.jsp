<html>
<body>
	<c:if test="${not empty nyansatt}">
		<p style="color:green;">Ny ansatt lagt til!<br>
		Ansatt nr. ${nyansatt.id}, ${nyansatt.fornavn} ${nyansatt.etternavn} / (${nyansatt.stilling}) ${nyansatt.mndlonn},- per mnd</p>
	</c:if>
	<c:if test="${not empty feilmelding}">
		<p style="color:red;">${feilmelding}</p>
	</c:if>
	<h3>Registrer ny ansatt</h3>
	<form method="post">
		Fornavn <input type="text" name="fornavn"><br>
		Etternavn <input type="text" name="etternavn"><br>
		Velg stilling <select name="stilling">
			<c:foreach var="s" items="${stillinger}">
				<option value="${s}">${s}</option>
			</c:foreach>
		</select><br>
		Månedslønn <input type="number" name="mndlonn" min="10000" max="99999" value="10000" ><br>
		<input type="submit" value="OK">
	</form>
</body>
</html>