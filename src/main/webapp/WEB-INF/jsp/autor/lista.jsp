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
        
        <div class="container">
            <c:if test="${not empty mensagem}">
                <div class="alert alert-danger">
                  <strong>Problema!</strong> ${mensagem}
                </div>
            </c:if>
        </div>
        
         <h3>Lista de Autores</h3>
        
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
        <c:if test="${empty autores}">
            <h3>Nenhum autor foi cadastrado!</h3>
        </c:if>
    </div>	
</body>
</html>