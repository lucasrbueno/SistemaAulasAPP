<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>APP AT PB</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    </head>
    <body>
        <header><c:import url="/WEB-INF/jsp/header.jsp"/></header>
        <div class="container">

            <h1>Cadastro de Autores</h1>

            <form action="/autor/incluir" method="post"> 
                <div class="form-group">
                    <label>Nome:</label>
                    <input type="text" class="form-control" name="nome">
                </div>
                
                <div class="form-group">
                    <label>Cargo</label>
                    <input type="text" class="form-control" name="cargo">
                </div>
                
                <label>Empregado?</label>
                <div class="form-group">
                    <input type="radio" name="empregado" value="true"> Sim <br>
                    <input type="radio" name="empregado" value="false"> Não <br>
                </div>
                
                <button class="btn btn-primary" type="submit">Confirmar</button> 
            </form>
            <br>
            
        </div>        
    </body>
</html>