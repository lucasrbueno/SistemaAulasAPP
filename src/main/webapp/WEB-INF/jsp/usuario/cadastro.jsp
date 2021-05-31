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
        <form action="/usuario/incluir" method="post">

            <div class="form-group">
              <label>Nome:</label>
              <input type="text" class="form-control" name="nome" value="Lucas">
            </div>			

            <div class="form-group">
                    <label>E-mail:</label>
                    <input type="email" class="form-control" name="email" value="lucas.bueno@prof.infnet.edu.br">
            </div>

            <button type="submit">Confirmar</button>
        </form>
    </div>
	
</body>
</html>