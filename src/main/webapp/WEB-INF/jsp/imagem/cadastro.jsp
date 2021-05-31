<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
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
              <input type="number" class="form-control" name="nome" value="5.00">
            </div>			

            <div class="form-group">
                    <label>Texto para caso a imagem não carregue:</label>
                    <input type="text" class="form-control" name="placeholder" value="PNG descrição">
            </div>

            <button type="submit">Confirmar</button>
        </form>
    </div>
	
</body>
</html>