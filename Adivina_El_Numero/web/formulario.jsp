<%-- 
    Document   : formulario
    Created on : 1/08/2016, 01:26:25 PM
    Author     : FABAME
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <style>

    </style>
</head>

<body>
    <form action="operacion.jsp" target="objetivo" method="post">

        <label for="nombre">Nombre completo</label>
        <input id="nombre" name="nombre" type="text" placeholder="Escribe tu nombre completo" required autofocus>
        </li>
        <li>
            <label for="email">edad</label>
            <input id="edad" name="edad" type="edad" required>
        </li>

        -------------------------------------------------
        <fieldset>
            <button type="submit">enviar</button>
        </fieldset>
    </form>
</body>
</html>
