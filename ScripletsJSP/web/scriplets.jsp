<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page con Scriplets</title>
    </head>
    <body>
        <h1>JSP con Scriplets!</h1>
        <br/>
        <%
            out.println("Saludos desde un scriplet");            
        %>
        <br/>
        <% 
            String nombreAplicacion=request.getContextPath();
            out.println("nombreAplicacion:" + nombreAplicacion);
        %>
        <br/>
        <%
            if(session!=null && session.isNew()){
        %>
                <b>La sesión SI es nueva</b>
        <%
            }else if(session!=null){
        %>
                <b>La sesión SI es nueva</b>
        <%
            }
        %>
    </body>
</html>
