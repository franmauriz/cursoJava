<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <p>
            <c:set var="nombre" value="Ernesto" />
            Variable nombre: <c:out value="${nombre}" />
        </p>
        <br>
        <p>
            Variable con codigo html:
            <c:out value="<h1>Hola</h1>" escapeXml="true" />
        </p>
        <br/>
        <p>
            <c:set var="bandera" value="true"/>
            <c:if test="${bandera}">
                <b>La bandera es verdadera</b>
            </c:if>
        </p>
        <br/>
        <p>
            <c:if test="${param.opcion != null}">
                <c:choose>
                    <c:when test="${param.opcion==1}">
                        <br>
                            Opcion 1 proporcionada
                        <br/>
                    </c:when>
                    <c:when test="${param.opcion==2}">
                        <br>
                            Opcion 2 proporcionada
                        <br/>
                    </c:when>
                    <c:otherwise>
                        <br>
                            Opcion proporcionada desconocida: ${param.opcion}
                        <br/>
                    </c:otherwise>
                </c:choose>
            </c:if>
        </p>
        <br/>
        <p>
            <!-- iteracion de un arreglo -->
            <%
                String [] nombres = {"juan","pedro","felipe","esther"};
                request.setAttribute("nombres", nombres);
            %>
            <b>Lista de nombres:</b>
        </p>
            <ul>
                <c:forEach varStatus="status" var="persona" items="${nombres}">
                    <li>
                        ${status.count} - Nombre: ${persona}
                    </li>
                </c:forEach>
            </ul>
        <p>
            <a href="index.jsp">Volver al inicio</a>
        </p>
    </body>
</html>
