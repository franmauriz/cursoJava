<%@ page isErrorPage="true" %>
<%@ page import="java.io.*" %>
<%@ page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Error</title>
        <script type="text/javascript" src="<%= request.getContextPath()%>/recursos/funciones.js"></script>
    </head>
    <body>
        <h1>Ocurrio un Error:</h1>
        <%= exception.getMessage() %>
        <br>
        <br>
        <a href="<%= request.getContextPath() %>/index.html">Volver al Inicio</a>
        <br>
        <br>
        <a href="#" onclick="cambio('mensaje1')">Ver Detalle</a>
        <div id="mensaje1" style="position: relative; visibility: hidden">
            <% exception.printStackTrace(new PrintWriter(out)); %>
        </div>
    </body>
</html>
