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
        
        <h1>Cadastro de Textos</h1>
        
        <form action="/texto/incluir" method="post">		
            <div class="form-group">
              <label>Quantidade de linhas:</label>
              <input type="number" class="form-control" name="qtd" value="20">
            </div>			

            <div class="form-group">
              <label>Fonte da letra:</label>
              <input type="text" class="form-control" name="fonte" value="Arial">
            </div>
            
            <div class="form-group">
                <label>Link de referência:</label>
                <input type="url" class="form-control" name="link" value="https://g1.globo.com/">
            </div>

            <button type="submit">Confirmar</button>
        </form>
    </div>	
</body>
</html>