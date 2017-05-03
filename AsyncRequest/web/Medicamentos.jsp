<%-- 
    Document   : Medicamentos
    Created on : 24/04/2017, 07:39:51 PM
    Author     : Will
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <link rel="stylesheet" type="text/css" href="Css/Style.css">

        <title>Medicamentos</title>
    </head>
    <body>


        <div class="container">

            <form action="#" method="POST"> 
                <h3>Medicamentos</h3>
                <div class="form-group">
                    <label for="pwd">Nombre </label>
                    <input type="password" class="form-control" id="pwd">
                </div>
                <div class="form-group">
                    <label for="comment">Descripción</label>
                    <textarea class="form-control" rows="5" id="comment"></textarea>
                </div>

                <input type="submit"   value="Agregar " class="btn btn-default" />
            </form>
        </div>

    </body>
</html>
