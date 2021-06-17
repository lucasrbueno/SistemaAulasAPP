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
<!--        <div class="jumbotron text-center">
            <h1>Projeto de Bloco - AT</h1>
            <h2>Lucas Ramalho Bueno</h2>
            <br>
            
            <h3>Bem vindo, ${user.nome}</h3>
            <h3>${user.email}</h3>
            
        </div>-->

        <header><c:import url="/WEB-INF/jsp/header.jsp"/></header>
        
        <div class="container">
            <div class="row">
              <div class="col-sm-4">
                <h3>LinkedIn</h3>
                <p><a href="https://www.linkedin.com/in/lucas-ramalho-bueno/" target="blank">Visite meu LinkedIn</a></p>
              </div>
              <div class="col-sm-4">
                <h3>GitHub</h3>
                <p><a href="https://github.com/lucasrbueno" target="blank">Visite meu GitHub</a></p>
              </div>
              <div class="col-sm-4">
                <h3>Cadastros</h3>   
                ${usuarioQtd} :: <a href="/usuario">Realize o cadastro de usuários</a> <br>
                ${autorQtd} :: <a href="/autor">Realize o cadastro de autores</a> <br>
                ${aulaQtd} :: <a href="/aula">Realize o cadastro de aulas</a> <br>
                ${imagemQtd} :: <a href="/imagem">Realize o cadastro de imagens</a> <br>
                ${videoQtd} :: <a href="/video">Realize o cadastro de videos</a> <br>
                ${textoQtd} :: <a href="/texto">Realize o cadastro de textos</a> <br>
              </div>
            </div>
        </div>       
    </body>
</html>