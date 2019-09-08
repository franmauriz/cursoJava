<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Lee valores JavaBeans</title>
    </head>
    <body>
        <h1>Jsp que lee valores del JavaBean</h1>
        
        <jsp:useBean id="rectangulo" class="beans.Rectangulo" scope="session" />
        
        <br/>
        <p>
            Valor Base: ${rectangulo.base}
        </p>
        <p>
            Valor Altura: ${rectangulo.area}
        </p>
        <br/>
        <p>
            Valor &Aacute;rea: ${rectangulo.area}
        </p>
        <br/>
        <p>
            <a href="index.jsp">Regresar al inicio</a>
        </p>
    </body>
</html>
