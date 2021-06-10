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
            <c:if test="${not empty autores}">
                <table class="table table-striped">
                  <thead>
                    <tr>
                        <th>ID</th>
                        <th>Nome</th>
                        <th>Cargo</th>
                        <th>Empregado</th>
                        <th></th>
                    </tr>
                  </thead>
                  <tbody>
                    <c:forEach var="s" items="${autores}">
                        <tr>
                            <td>${s.id}</td>
                            <td>${s.nome}</td>
                            <td>${s.cargo}</td>
                            <td>${s.empregado ? 'Sim' : 'Não'}</td>
                            <td><a href="/autor/${s.id}/excluir">Excluir</a></td>
                        </tr>
                    </c:forEach>
                  </tbody>
                </table>
            </c:if>
            
        </div>        
    </body>
</html>