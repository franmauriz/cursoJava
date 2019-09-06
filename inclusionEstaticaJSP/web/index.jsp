<%-- 
    Document   : index
    Created on : 4 sept. 2019, 16:54:12
    Author     : franmp
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Inclusion Estatica</title>
        <script type="text/javascript" src="recursos/funciones.js"></script>
        <link type="text/css" href="recursos/estilo.css" rel="stylesheet">
    </head>
    <body>
        <h1>Inclusi&oacute;n de Archivos Estaticos</h1>
        <br>
        <span class="noticias" align="left">
            <a href="javascript:desplegar('noticias');">
                <img boder='0' src="https://s2.qwant.com/thumbr/0x0/c/f/cb9aeb2b902f6d0c35cb71bad08335408bcc5b914928672eebf94f67a137e6/icono_noticias.png?u=http%3A%2F%2Fwww.ayuntamientodemoclin.com%2Ftemplates%2Fimagenes%2Ficono_noticias.png&q=0&b=1&p=0&a=1">
            </a>
        </span>
        <span id="noticias" class="ocultar_menu">
            <ul>
                <li>
                    <%@include file="pages/noticia1.html" %>
                </li>
                <li>
                    <%@include file="pages/noticia2.html" %>
                </li>
            </ul>
        </span>
        <br>
        <span class="videos" aling="left">
            <a href="javascript:desplegar('videos');">
                <img border='0' src="https://s2.qwant.com/thumbr/0x0/5/8/4a1fb611ef3814de0aa97269e8a511f2e788001154a54cdd03557a39a55b71/icono_youtube.png?u=http%3A%2F%2Fbiblioteca.ulpgc.es%2Ffiles%2Frepositorio_de_docum152%2Fnoticias%2Ficono_youtube.png&q=0&b=1&p=0&a=1">
            </a>
        </span>
        <span id="videos" class="ocultar_menu">
            <ul>
                <li>
                    <%@include file="pages/video1.html" %>
                </li>
            </ul>
        </span>
    </body>
</html>
