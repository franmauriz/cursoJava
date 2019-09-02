<%-- Agregamos una declaracion --%>
<%! 
    //Declaramos una variable con su metodo get
    private String usuario ="Alberto";
    
    public String getUsuario(){
        return this.usuario;
    }

    //Declaramos un contador de visitas
    private int contadorVisitas=1;
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Uso de Declaraciones</title>
    </head>
    <body>
        <h1>Uso de Declaraciones!</h1>
        Usuario por medio del atributo: <%= this.usuario %>
        <br>
        Usuario por medio del metodo: <%= this.getUsuario() %>
        <br>
        Contador de visitas desde que se reinicio el servidor:<%= this.contadorVisitas++%>
                
    </body>
</html>
