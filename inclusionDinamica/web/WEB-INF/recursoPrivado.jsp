<%-- 
    Document   : recursoPrivado
    Created on : 6 sept. 2019, 11:48:20
    Author     : ptl28sev000
--%>
<%
    String color = request.getParameter("colorFondo");
    if(color==null || color.trim().equals("")){
        color="green";
    }
%>



<body style="background-color:<%=color%>">        
        Inlcusion de informacion dinamica desde un archivo privado con parametro
        Valor Parametro colorFondo: <%= color  %>
</body>