<%-- 
    Document   : alcanceVariables
    Created on : 8 sept. 2019, 16:25:30
    Author     : franmp
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Alcance de Variables</title>
    </head>
    <body>
        <h1>Alcance de Variables</h1>
        <br>
            Variable request:
            Base: ${rectanguloRequest.base}
            Altura: ${rectanguloRequest.altura}
            Area: ${rectanguloRequest.area}
        <br><br>
            Variable session:
            Base: ${rectanguloSession.base}
            Altura: ${rectanguloSession.altura}
            Area: ${rectanguloSession.area}
        <br><br>
            Variable application:
            Base: ${rectanguloApplication.base}
            Altura: ${rectanguloApplication.altura}
            Area: ${rectanguloApplication.area}
        <br><br>
            <a href="${pageContext.request.contextPath}/index.jsp">
            Regresar al inicio
        </a>
    </body>
</html>
