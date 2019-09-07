<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP modifica a un JavaBean por parametro</title>
    </head>
    <body>
        <h1>JSP modifica a un JavaBean por parametro</h1>
        <jsp:useBean id="rectangulo" class="beans.Rectangulo" scope="session"/>
        <p>
            Modificación de los atributos:
            <br/>
            <jsp:setProperty name="rectangulo" property="base" param="basePAram" />
            <jsp:setProperty name="rectangulo" property="altura" param="alturaParam" />
        </p>
        <p>
            Nuevo valor base: <%= request.getParameter("baseParam") %>
        </p>
        <p>
            Nuevo valor altura: <%= request.getParameter("alturaParam") %>
        </p>
        <p>
            <br/>
            <a href="index.jsp">Regresar al inicio</a>
        </p>
    </body>
</html>
