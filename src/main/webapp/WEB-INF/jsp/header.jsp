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
            <br>
            
            <h3>Bem vindo, ${user.nome}</h3>
            <h3>${user.email}</h3>  
            
            <a href="/home" class="btn btn-primary">Home</a>
    </body>
</html>