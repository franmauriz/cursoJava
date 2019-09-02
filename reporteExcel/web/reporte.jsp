<%@ page import="utilerias.Conversion, java.util.Date" %>
<%@ page contentType="application/vnd.ms-excel" %>
<%
    String nombreArchivo="reporte.xls";
    response.setHeader("Content-Disposition", "inline; filename=" + nombreArchivo);
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Reporte Excel</h1>
        <table border="1">
            <tr>
                <th>Curso</th>
                <th>Descripción</th>
                <th>Fecha</th>
            </tr>
            <tr>
                <td>
                    1. java
                </td>
                <td>
                    Curso de java basico
                </td>
                <td>
                    <%= Conversion.format( new Date() ) %>
                </td>
            </tr>
        </table>
    </body>
</html>
