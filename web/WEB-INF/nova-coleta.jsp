<%-- 
    Document   : nova-coleta
    Created on : 22/05/2017, 19:56:16
    Author     : RafaelaEmília
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cadastrar nova coleta</title>
    </head>
    <body>
        <h1>Cadastrar nova coleta</h1>
        <form method="post">
            <table>
                <tr>
                    <td>Descrição da coleta: </td>
                    <td><input type="text" name="descricao" size="35" /></td>
                </tr>
                <tr>
                    <td colspan="2" align="right">
                        <button type="submit">Enviar</button>
                    </td>
                </tr>
            </table>
        </form>
    </body>
</html>
