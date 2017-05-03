<%-- 
    Document   : Patologias
    Created on : 4/04/2017, 10:13:08 AM
    Author     : Will
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    </head>
        <title>Patologia</title>
    </head>
    <body>
        <div class="container">
            <div class="form-group">
                <label for="pwd">Nombre</label>
                <input type="password" class="form-control" id="pwd">
            </div>
            <div class="form-group">
                <label for="comment">Descripció</label>
                <textarea class="form-control" rows="5" id="comment"></textarea>
            </div>

            <a href="#" class="btn btn-info" role="button">Agregar </a>
            
        </div>
        
        
    </body>
</html>
