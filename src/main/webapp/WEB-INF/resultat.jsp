<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Résultat</title>
</head>
<body>
	<p>Operande 1 : <c:out value="${ operande1 } "></c:out></p>
	<p>Operande 2 : <c:out value="${ operande2 }"></c:out></p>
	<p>Operateur : <c:out value="${ operation }"></c:out></p>
<c:if test="${ !empty res }"><h3><c:out value="Resultat : ${ res }"></c:out></h3></c:if>
<a href="/TP2-Calculatrice/calculate">Revenir à la calculatirce</a>
</body>
</html>