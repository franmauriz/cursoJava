<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP JavaBeans</title>
    </head>
    <body>
        <h1>Ejemplo JavaBeans</h1>
        <a href="setterJsp.jsp">Modificar valores de JavaBeans</a>
        <br/>
        <a href="getterJsp.jsp">Leer valores de JavaBeans</a>
        <br/>
        <hr/>
        <p>Formulario 1</p>
        <form name="form1" action="setterParamJsp.jsp">
            <p>Base:<input type="text" name="baseParam" /></p>
            <p>Altura:<input type="text" name="alturaParam"/></p>
            <p><input type="submit" value="Enviar"/></p>
        </form>
        <br/>
        <hr/>
        <p>Formulario 2</p>
        <form name="form2" action="setterAllParamJsp.jsp">
            <p>Base:<input type="text" name="base" /></p>
            <p>Altura:<input type="text" name="altura"/></p>
            <p><input type="submit" value="Enviar"/></p>
        </form>
        
    </body>
</html>
