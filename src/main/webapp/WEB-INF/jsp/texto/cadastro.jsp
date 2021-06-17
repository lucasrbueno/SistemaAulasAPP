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
        
        <h1>Cadastro de Textos</h1>
        
        <form action="/texto/incluir" method="post">	
            
            <div class="form-group">
              <label>Titulo:</label>
              <input type="text" class="form-control" name="titulo" value="Texto Matemática">
            </div>
            
            <div class="form-group">
              <label>Descrição:</label>
              <input type="text" class="form-control" name="descricao" value="Contas de mais e menos">
            </div>			

            <div class="form-group">
                <label>Quanto desse recurso?</label>
              <input type="number" class="form-control" name="quantidade" value="1">
            </div>
            
            <div class="form-group">
              <label>Quantidade de linhas:</label>
              <input type="number" class="form-control" name="quantidadeLinhas" value="20">
            </div>			

            <div class="form-group">
              <label>Fonte da letra:</label>
              <input type="text" class="form-control" name="fonteLetra" value="Arial">
            </div>
            
            <div class="form-group">
                <label>Link de referência:</label>
                <input type="url" class="form-control" name="linkReferencia" value="https://g1.globo.com/">
            </div>

            <button class="btn btn-primary" type="submit">Confirmar</button> 
        </form>
        <br>
        <c:if test="${not empty textos}">
            <table class="table table-striped">
              <thead>
                <tr>
                    <th>ID</th>
                    <th>Título</th>
                    <th>Descrição</th>
                    <th>Quantidade do recurso?</th>
                    <th>Quantidade de linhas</th>
                    <th>Fonte Usada</th>
                    <th>Link</th>
                    <th></th>
                </tr>
              </thead>
              <tbody>
                <c:forEach var="t" items="${textos}">
                    <tr>
                        <td>${t.id}</td>
                        <td>${t.titulo}</td>
                        <td>${t.descricao}</td>
                        <td>${t.quantidade}</td>
                        <td>${t.quantidadeLinhas}</td>
                        <td>${t.fonteLetra}</td>
                        <td>${t.linkReferencia}</td>
                        <td><a href="/texto/${t.id}/excluir">Excluir</a></td>
                    </tr>
                </c:forEach>
              </tbody>
            </table>
        </c:if>
    </div>	
</body>
</html>