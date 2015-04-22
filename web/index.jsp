<%-- 
    Document   : index
    Created on : 10/09/2014, 20:49:28
    Author     : luiz
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Cadastro de Usuarios</h1>
        <form action="salvar" method="Post">
        Nome:<input type="text" name="nome"><br/>
        Senha:<input type="text" name="senha"><br/>
        <input type="submit" value="salvar">
        </form>
    </body>
</html>
