<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!doctype html>
<html lang="es">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <title>Sign-in Inventario</title>
    <link rel="icon" href="assets/img/favicon3.ico" type="image/x-icon">
    <!-- Bootstrap core CSS -->
    <!-- <link href="../assets/dist/css/bootstrap.css" rel="stylesheet">-->
    <!--<link href="css/bootstrap.css" type="text/css" rel="stylesheet">-->
    <%@include file = "WEB-INF/Vistas-Parciales/css-js.jspf" %>
    <style>
      .bd-placeholder-img {
        font-size: 1.125rem;
        text-anchor: middle;
        -webkit-user-select: none;
        -moz-user-select: none;
        -ms-user-select: none;
        user-select: none;
      }

      @media (min-width: 768px) {
        .bd-placeholder-img-lg {
          font-size: 3.5rem;
        }
      }
    </style>
    <!-- Custom styles for this template -->
    <link href="css/signin.css" type="text/css" rel="stylesheet">
  </head>
  <body class="text-center">
      <main class="form-signin w-100 m-auto">
      <form class="form-signin" action="sesion" method="POST">
      <img class="mb-4" src="assets/img/login.png" alt="" width="72" height="72">
      <h1 class="h3 mb-3 font-weight-normal">Iniciar Sesión</h1>
      <label for="inputEmail" class="sr-only">Email address</label>
      <input type="email" name="txtEmail" id="inputEmail" class="form-control" placeholder="Email address" required autofocus>
      <label for="inputPassword" class="sr-only">Password</label>
      <input type="password" name="txtPassword" id="inputPassword" class="form-control" placeholder="Password" required>
      <div class="checkbox mb-3">
        <label>
          <!--<input type="checkbox" value="remember-me"> Remember me -->
          <a href="#" title="¿No tienes cuenta?">¿No tienes cuenta? | </a>
          <a href="#" title="Olvide mi contraseña">Olvidé mi contraseña</a>
        </label>
      </div>
      <button class="btn btn-lg btn-primary btn-block" type="submit">Ingresar</button>
      <p class="mt-5 mb-3 text-muted">MEGATEC-ZACATECOLUCA &copy; 2022</p>
    </form>
          </main>
</body>
</html>

