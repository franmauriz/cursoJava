<html>
    <head>
        <meta charset="UTF-8">
        <title>Despliegue de Variables</title>
    </head>
    <body>
        <h1>Despliegue de Variables</h1>

        Variable en alcance request:
        ${mensaje}

        <br><br>

        Variable en alcance session:
        <br>
        Rectangulo:
        Base: ${rectangulo.base}
        Altura: ${rectangulo.altura}
        Area: ${rectangulo.area}
        <br>
        <br>
        <a href="${pageContext.request.contextPath}/index.jsp">
            Regresar al Inicio
        </a>
    </body>
</html>