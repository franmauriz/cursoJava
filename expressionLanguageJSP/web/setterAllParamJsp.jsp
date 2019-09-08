<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP modifica a un JavaBean por parametros</title>
    </head>
    <body>
        <h1>JSP modifica a un JavaBean por parametro</h1>
        <jsp:useBean id="rectangulo" class="beans.Rectangulo" scope="session"/>
        <jsp:setProperty name="rectangulo" property="*"/>
        <p>Se modifican todos los atributos</p>
        <br/>
        <p>Nuevo valor base: ${rectangulo.base}</p>
        <br/>
        <p>Nuevo valor altura: ${rectangulo.altura}</p>
        <br/>
        <p>
            <a href="index.jsp">Regresar al inicio</a>
        </p>
    </body>
</html>
