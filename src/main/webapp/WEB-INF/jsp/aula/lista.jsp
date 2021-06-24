<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>APP-AT-PB</title>
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
</head>
<body>
    <header><c:import url="/WEB-INF/jsp/header.jsp"/></header>
    <div class="container">
        
         <h3>Lista de Aulas</h3>
        
        <c:if test="${not empty aulas}">
                <table class="table table-striped">
                  <thead>
                    <tr>
                        <th>ID</th>
                        <th>Matéria</th>
                        <th>Dia da Semana</th>
                        <th>Arquivo</th>
                        <th>Autor</th>
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
                            <td>${au.autor.nome}</td>
                            <td><a href="/aula/${au.id}/excluir">Excluir</a></td>
                        </tr>
                    </c:forEach>
                  </tbody>
                </table>
            </c:if>    
            <c:if test="${empty aulas}">
                <h3>Nenhum aula foi cadastrada!</h3>
            </c:if>
    </div>	
</body>
</html>