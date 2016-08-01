<%-- 
    Document   : tabla
    Created on : 1/08/2016, 01:26:33 PM
    Author     : FABAME
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Formulario</title>
        <link rel="stylesheet" type="text/css" href="formulario.css" media="all" />
    </head>
    <body>
        <form action="operacion.jsp" target="objetivo" method="post">
            <table border="1">
                <tr>
                    <td>Ingrese nombre </td>
                    <td><input type="text" name="num1" /></td>
                </tr>
                <tr><td>Ingrese la edad </td>
                    <td><input type="text" name="num1" /></td>
                </tr>
                <tr>
                    <td colspan="2"><input type="submit" onClick="location.href = 'formulario.jsp'" value="Generar" /></td>
                </tr>
            </table>
        </form>
        <iframe name="objetivo" id="objetivo"  height="200" width="400" style="border:0;" />
    </body>
</html>



