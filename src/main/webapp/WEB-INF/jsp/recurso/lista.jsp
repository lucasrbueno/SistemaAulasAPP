<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
        
        <h3>Recursos no sistema</h3>
        
        <c:if test="${not empty recursos}">
            <table class="table table-striped">
              <thead>
                <tr>
                    <th>ID</th>
                    <th>Título</th>
                    <th>Descrição</th>
                    <th>Quantidade do recurso?</th>
                    <th></th>
                </tr>
              </thead>
              <tbody>
                <c:forEach var="r" items="${recursos}">
                    <tr>
                        <td>${r.id}</td>
                        <td>${r.titulo}</td>
                        <td>${r.descricao}</td>
                        <td>${r.quantidade}</td>
                        <td><a href="/recurso/${r.id}/excluir">Excluir</a></td>
                    </tr>
                </c:forEach>
              </tbody>
            </table>
        </c:if>
    </div>	
</body>
</html>