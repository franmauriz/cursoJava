<%-- 
    Document   : index
    Created on : 31 ago. 2019, 11:53:15
    Author     : franmp
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page Hola Mundo</title>
    </head>
    <body>
        <h1>Hello World! con JSP</h1>
        
        <ul>
            <li>Hola con HTML</li>
            <li><% out.print("Hola Mundo Scriptlets");%></li>
            <li>${"Hola mundo con Expresion Language (EL)"}</li>
            <li><c:out value="Hola Mundo con JSTL"/></li>
        </ul>
        
        <ul>
            <li>Hola: <%= new java.util.Date()%></li>
            <li>Nombre del contexto de la aplicacion:
                <%= request.getContextPath()%>
            </li>
            <li>Valor del parametro x: 
                <%= request.getParameter("x")%>
            </li>
        </ul>
    </body>
</html>
