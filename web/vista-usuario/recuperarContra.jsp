<%-- 
    Document   : recuperarContra
    Created on : 07-07-2022, 04:35:10 AM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
        <%@include file = "/WEB-INF/Vistas-Parciales/encabezado.jspf" %>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">

    </head>
    <body oncontextmenu='return false' class='snippet-body'>
        <div class="container padding-bottom-3x mb-2 mt-5">
		<div class="row justify-content-center">
			<div class="col-lg-8 col-md-10">
				<div class="forgot">
					<h2>¿Quiere restaurar su contraseña?</h2>
					<p>Cambie su contraseña en 3 sencillos pasos de formas segura</p>
					<ol class="list-unstyled">
						<li><span class="text-primary text-medium">1. </span>Ingrese su correo electronico </li>
						<li><span class="text-primary text-medium">2. </span>El sistema le enviara un mensaje de confirmacion a u GMAIL</li>
						<li><span class="text-primary text-medium">3. </span>Ingrese el codigo en la siguiente pagina</li>
					</ol>
				</div>
				<form class="card mt-4" action="recuperarPass" method="POST">
					<div class="card-body">
						<div class="form-group">
							<label for="email-for-pass">Ingrese su correo electronico</label> <input
								class="form-control" type="text" name="email" id="email-for-pass" required=""><small
								class="form-text text-muted">Introduzca la dirección de correo electrónico registrada. Luego, enviaremos una OTP por correo electrónico a esta dirección.</small>
						</div>
					</div>
					<div class="card-footer">
						<button class="btn btn-success" type="submit">Obtener nueva contraseña</button>
                                                <button class="btn btn-danger" type="submit">Regresar al login</button>
					</div>
				</form>
			</div>
		</div>
	</div>
	<script type='text/javascript'
		src='https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.bundle.min.js'></script>
	<script type='text/javascript' src=''></script>
	<script type='text/javascript' src=''></script>
	<script type='text/Javascript'></script>
        
        
                <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>

    </body>
</html>
