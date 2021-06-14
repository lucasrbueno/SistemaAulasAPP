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

            <h1>Cadastro de Aulas</h1>

            <form action="/aula/incluir" method="post"> 
                <div class="form-group">
                    <label>Matéria:</label>
                    <input type="text" class="form-control" name="materia" value="Matemática">
                </div>
                
                <div class="form-group">
                    <label>Dia da Semana</label>
                    <input type="text" class="form-control" name="diaDaSemana" value="Quarta-Feira">
                </div>
                
                <label>Possui arquivo?</label>
                <div class="form-group">
                    <input type="radio" name="arquivo" value="true"> Sim <br>
                    <input type="radio" name="arquivo" value="false"> Não <br>
                </div>
                
                <button class="btn btn-primary" type="submit">Confirmar</button> 
            </form>
            <br>
            <c:if test="${not empty aulas}">
                <table class="table table-striped">
                  <thead>
                    <tr>
                        <th>ID</th>
                        <th>Matéria</th>
                        <th>Dia da Semana</th>
                        <th>Arquivo</th>
                        <th></th>
                    </tr>
                  </thead>
                  <tbody>
                    <c:forEach var="au" items="${aulas}">
                        <tr>
                            <td>${au.id}</td>
                            <td>${au.materia}</td>
                            <td>${au.diaDaSemana}</td>
                            <td>${au.arquivo ? 'Sim' : 'Não'}</td>
                            <td><a href="/aula/${au.id}/excluir">Excluir</a></td>
                        </tr>
                    </c:forEach>
                  </tbody>
                </table>
            </c:if>
            
        </div>        
    </body>
</html>