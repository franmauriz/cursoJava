<%-- 
    Document   : index
    Created on : 8 sept. 2019, 15:56:54
    Author     : franmp
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ejemplo MVC 2</title>
    </head>
    <body>
        <h1>Ejemplo MVC 2</h1>
        <div style="color:red"> 
            
            <p>${mensaje}</p>
        
        </div>
        <p>
            <a href="${pageContext.request.contextPath}/servletControlador">
                <b>
                    Link al servlet al controlador sin parametros.
                </b>
            </a>
        </p>
        <br/>
        <p>
            <a href="${pageContext.request.contextPath}/servletControlador?accion=agregarVariables">
                <b>
                    Link al servlet al controlador para agregar variables.
                </b>
            </a>
        </p>
        <br/>
        <p>
            <a href="${pageContext.request.contextPath}/servletControlador?accion=listarVariables">
                <b>
                    Link al servlet al controlador para listar variables.
                </b>
            </a>
        </p>
    </body>
</html>
