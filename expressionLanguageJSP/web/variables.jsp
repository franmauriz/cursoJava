<%-- 
    Document   : variables
    Created on : 7 sept. 2019, 11:22:36
    Author     : franmp
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Variables</h1>
        <ul>
            <li>Nombre aplicacion: ${pageContext.request.contextPath}</li>
            <li>Navegador Cliente: ${header["User-Agent"]}</li>
            <li>Id Session: ${cookie.JSESSIONID.value}</li>
            <li>Web Server: ${pageContext.servletContext.serverInfo}</li>
            <li>Valor parametro usuario: ${param.usuario}</li>
        </ul>
    </body>
</html>
