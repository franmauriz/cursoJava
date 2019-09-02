<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Formulario</title>
    </head>
    <body>
        <h1>Formulario JSP!</h1>
        Usuario: <%= request.getParameter("usuario") %>
        <br/><br/>
        Password: <%= request.getParameter("password") %>
        <br/><br/>
        <a href="index.html">Volver</a>        
    </body>
</html>
