<%-- 
    Document   : Inicio
    Created on : 27/03/2017, 11:16:56 PM
    Author     : Will
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <title>Inicio</title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <link rel="stylesheet" type="text/css" href="Css/Stilologin.css">
    </head>
    <body>

        <div class="container">
            <h2>Zip</h2>
            
            <p>Por favor ingrese su usario y contraseña recuerde que es personal e intransferible </p>
            <form action="Historia.jsp" method="POST">
                <div class="form-group">
                    <label for="usr">User:</label>
                    <input type="text" class="form-control" id="usr">
                </div>
                <div class="form-group">
                    <label for="pwd">Password:</label>
                    <input type="password" class="form-control" id="pwd">
                </div>

                <div class="form-group">
                    <div class="col-sm-offset-2 col-sm-10">
                        <input type="submit"   value="ingresar " class="btn btn-default" />

                    </div>
                </div>
            </form>
        </div>

    </body>
</html>

