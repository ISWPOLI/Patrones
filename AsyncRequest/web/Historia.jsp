<!DOCTYPE html>
<html>
    <head>
        <title>Historia</title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <link rel="stylesheet" type="text/css" href="Css/Style.css">

    </head>
    <body>

        <div class="container">
            <form>
                <div class="form-group">
                    <label for="usr">Nombre:</label>
                    <input type="text" class="form-control" id="usr">
                </div>
                <div class="form-group">
                    <label for="pwd">Edad:</label>
                    <input type="password" class="form-control" id="pwd">
                </div>

                <div class="dropdown">
                    <button class="btn btn-primary dropdown-toggle" type="button" data-toggle="dropdown">Sexo
                        <span class="caret"></span></button>
                    <ul class="dropdown-menu">
                        <li><a href="#">Masculino </a></li>
                        <li><a href="#">Femenino</a></li>

                    </ul>   
                </div>


                <div class="form-group">
                    <label for="pwd">N id:</label>
                    <input type="password" class="form-control" id="pwd">
                </div>
                <div class="form-group">
                    <label for="pwd">Patologia:</label>
                    <input type="password" class="form-control" id="pwd">
                </div>
                <form class="form-inline">
                    

                    <div class="form-group">
                        <label for="pwd">Medicamentos:</label>
                        <input type="password" class="form-control" id="pwd">
                        <button type="submit" class="btn">Basic</button>
                    </div>
                </form>


            </form>






            <div class="form-group">
                <label for="comment">Indicación:</label>
                <textarea class="form-control" rows="5" id="comment"></textarea>
            </div>


            <div class="form-group">
                <label for="comment">Conclución:</label>
                <textarea class="form-control" rows="5" id="comment"></textarea>
            </div>

        </div>

        <footer class="container-fluid text-center">
            <div class="container">
                <a href="#" class="btn btn-info" role="button">Holter </a>


                <a href="#" class="btn btn-info" role="button">Resultado </a>
            </div>

        </footer>
    </body>
</html>
