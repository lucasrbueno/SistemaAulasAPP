<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
    <head>
        <title>Tela Inicial</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">    
    </head>
    <body>
        <div class="jumbotron text-center">
            <h1>Projeto de Bloco - AT</h1>
            <h2>Lucas Ramalho Bueno</h2>          
            <h3>Bem vindo, ${user.nome} (${user.email})!</h3>
            
            <a href="/home" class="btn btn-primary">Home</a>
            <a href="/usuario/lista" class="btn btn-primary">Usuários</a>
            <a href="/autor/lista" class="btn btn-primary">Autores</a>
            <a href="/aula/lista" class="btn btn-primary">Aulas</a>
            <a href="/recurso/lista" class="btn btn-primary">Recursos</a>      
            <a href="/logout" class="btn btn-danger">Sair</a>
            
    </body>
</html>