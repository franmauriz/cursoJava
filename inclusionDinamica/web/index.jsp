<%-- 
    Document   : index
    Created on : 6 sept. 2019, 11:45:13
    Author     : ptl28sev000
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Inclusion Dinamica</title>
    </head>
    <body>
        <h1>Inclusión dinamica</h1>
        <jsp:include page="WEB-INF/recursoPrivado.jsp">
            <jsp:param name="colorFondo" value="yellow"/>
        </jsp:include>
        <br>
        <hr/>
        <br>
        <jsp:include page="recursoPublico.jsp"/>
    </body>
</html>
