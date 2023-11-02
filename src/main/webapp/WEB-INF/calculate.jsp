<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Calculatrice</title>
</head>
<body>

<form method="post" action="calculate">
	<p><label for="operande1">Opérande 1 : <input type="text" name="operande1"/></label></p>
	<p><label for="operande2">Opérande 2 : <input type="text" name="operande2"/></label></p>
	
	<p><select name="operation">
		<option value="addition">+</option>
		
		<option value="soustraction">-</option>

		<option value="division">/</option>

		<option value="multiplication">*</option>
		
	</select></P>
	
	<p><input type="submit" value="Calculer"/></p>
</form>	
</body>
</html>

