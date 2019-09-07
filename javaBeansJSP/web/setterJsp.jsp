<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP que modifica JavaBean</title>
    </head>
    <body>
        <h1>JSP que modifica JavaBean</h1>
        <jsp:useBean id="rectangulo" class="beans.Rectangulo" scope="session" />
        <br/>
        <p>Modificamos los atributos:</p>
        <% 
            int baseValor = 5;
            int alturaValor = 10;
        %>
        
        <jsp:setProperty name="rectangulo" property="base" value="<%=baseValor%>" />
        <jsp:setProperty name="rectangulo" property="altura" value="<%=alturaValor%>" />
        <p>Nuevo valor base: <%= baseValor %></p>
        <p>Nuevo valor altura: <%=alturaValor%></p>
        <br/>
        <hr/>
        <p><a href="index.jsp">Regresar al inicio</a></p>
    </body>
</html>
