<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="login" method="post">
<div>
<label>Usuario</label>
<input type="text" name="usuario">
</div>
<div>
<label>Contraseña</label>
<input type="password" name="contraseña">
</div>
<div>
<input type="submit" name="enviar" value="Aceptar">
<a href="Login.jsp"><input type="button" name="cancelar" value="Cancelar"></a>
</div>
</form>
</body>
</html>