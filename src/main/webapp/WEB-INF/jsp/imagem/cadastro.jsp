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
    <div class="container">
        
        <h1>Cadastro de Imagens</h1>
        
        <form action="/imagem/incluir" method="post"> 
            <label>Está em PNG?</label> 
            <div class="form-group">   
                <input type="radio" name="png" value="true"> Sim <br>
                <input type="radio" name="png" value="false"> Não <br>
            </div>

            <div class="form-group">
              <label>Tamanho:</label>
              <input type="number" class="form-control" name="tamanho" value="5.00">
            </div>			

            <div class="form-group">
                    <label>Texto para caso a imagem não carregue:</label>
                    <input type="text" class="form-control" name="placeholder" value="PNG descrição">
            </div>

            <button class="btn btn-primary" type="submit">Confirmar</button> 
        </form>
        <br>
            <c:if test="${not empty imagens}">
                <table class="table table-striped">
                  <thead>
                    <tr>
                        <th>ID</th>
                        <th>Tamanho</th>
                        <th>Texto para a imagem</th>
                        <th>PNG</th>
                        <th></th>
                    </tr>
                  </thead>
                  <tbody>
                    <c:forEach var="i" items="${imagens}">
                        <tr>
                            <td>${i.id}</td>
                            <td>${i.tamanho}</td>
                            <td>${i.placeholder}</td>
                            <td>${i.png ? 'Sim' : 'Não'}</td>
                            <td><a href="/imagem/${i.id}/excluir">Excluir</a></td>
                        </tr>
                    </c:forEach>
                  </tbody>
                </table>
            </c:if>
    </div>
	
</body>
</html>