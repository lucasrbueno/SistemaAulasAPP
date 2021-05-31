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
        
        <h1>Cadastro de V�deos</h1>
        
        <form action="/video/incluir" method="post">

            <div class="form-group">
              <label>Link do v�deo:</label>
              <input type="url" class="form-control" name="video" value="https://www.youtube.com/">
            </div>			

            <div class="form-group">
                <label>Dura��o</label>
                <input type="text" class="form-control" name="email" value="5:00">
            </div>
            
            <label>Est� em MP4?</label>
                <div class="form-group">
                    <input type="radio" name="mp4" value="true"> Sim <br>
                    <input type="radio" name="mp4" value="false"> N�o <br>
                </div>

            <button type="submit">Confirmar</button>
        </form>
    </div>	
</body>
</html>