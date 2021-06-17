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
        
        <h1>Cadastro de Vídeos</h1>
        
        <form action="/video/incluir" method="post">
            
            <div class="form-group">
              <label>Titulo:</label>
              <input type="text" class="form-control" name="titulo" value="Vídeo Biologia">
            </div>
            
            <div class="form-group">
              <label>Descrição:</label>
              <input type="text" class="form-control" name="descricao" value="Vídeo de polvos">
            </div>			

            <div class="form-group">
                <label>Quanto desse recurso?</label>
              <input type="number" class="form-control" name="quantidade" value="1">
            </div>

            <div class="form-group">
              <label>Link do vídeo:</label>
              <input type="url" class="form-control" name="link" value="https://www.youtube.com/">
            </div>			

            <div class="form-group">
                <label>Duração</label>
                <input type="number" class="form-control" name="duracao" value="5.00">
            </div>
            
            <label>Está em MP4?</label>
                <div class="form-group">
                    <input type="radio" name="mp4" value="true"> Sim <br>
                    <input type="radio" name="mp4" value="false"> Não <br>
                </div>

            <button class="btn btn-primary" type="submit">Confirmar</button> 
        </form>
        <c:if test="${not empty videos}">
            <table class="table table-striped">
              <thead>
                <tr>
                    <th>ID</th>
                    <th>Título</th>
                    <th>Descrição</th>
                    <th>Quantidade do recurso?</th>
                    <th>Link do vídeo</th>
                    <th>Duração</th>
                    <th>MP4?</th>
                    <th></th>
                </tr>
              </thead>
              <tbody>
                <c:forEach var="v" items="${videos}">
                    <tr>
                        <td>${v.id}</td>
                        <td>${v.titulo}</td>
                        <td>${v.descricao}</td>
                        <td>${v.quantidade}</td>
                        <td>${v.link}</td>
                        <td>${v.duracao}</td>
                        <td>${v.mp4 ? 'Sim' : 'Não'}</td>
                        <td><a href="/video/${v.id}/excluir">Excluir</a></td>
                    </tr>
                </c:forEach>
              </tbody>
            </table>
        </c:if>
    </div>	
</body>
</html>