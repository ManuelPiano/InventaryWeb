<%@page import="DAO.UsuarioDAOImplementar"%>
<%@page import="DAO.UsuarioDAO"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>

<jsp:useBean id="Usuario" scope="session" class="Model.Usuario" />


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <!-- Latest compiled and minified CSS -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">

<!-- Latest compiled JavaScript -->

    </head>
                       
    <body>

        <%@include file = "/WEB-INF/Vistas-Parciales/encabezado.jspf" %>
        <div class="container " style="padding-top: 25px">
            <div class="container" style="border-color: #000; background-color:#979bf7 ; border-top-width: 25px; padding-top: 50px"  >
        <form action="<%= request.getContextPath() %>/InicioSesion" class="container custom-container " style="height: 85vh;">
                    <%
               
                String aviso = (String)request.getAttribute("aviso");
                System.out.println("aviso");
                aviso = "";
                if(aviso.equals("nuevo"))
                {
                
                }
                else if (aviso.equals("coincidenciaCorreo"))
                {
                 String mensaje = (String)request.getParameter("Message");
                 System.out.println(mensaje);
            %>
            <h4><b>Correo elctronico ya en uso, por favor utilice un correo nuevo</b></h4>
            <%
                }
            %>
                      
 <input type="hidden" name="opcion" value="registrar">
  <div class="mb-3 mt-3 d-flex justify-content-center" >
      <h4 class="form-label " style="width: 125px">Nombre:</h4>
      <input type="text" class="form-control" id="txtNombres" value="<%= Usuario.getNombre()%>" placeholder="Porfavor ingrese sus nombres" name="txtNombres" style="width: 600px; border-color: #25cff2; border-width: 5px; border-style: groove">
  </div>
  <div class="mb-3 mt-3 d-flex justify-content-center" >
      <h4 class="form-label " style="width: 125px">Apellidos:</h4>
      <input type="text" class="form-control" id="txtApellidos" value="<%= Usuario.getApellido()%>" placeholder="Porfavor ingrese sus apellidos" name="txtApellidos" style="width: 600px; border-color: #25cff2; border-width: 5px; border-style: groove">
  </div>
              <div class="mb-3 mt-3 d-flex justify-content-center" >
      <h4 for="usuario" class="form-label " style="width: 125px">Usuario:</h4>
      <input type="text" class="form-control" id="txtUsuario" value="<%= Usuario.getUsuario()%>" placeholder="Porfavor ingrese su nombre de usuario" name="txtUsuario" style="width: 600px; border-color: #25cff2; border-width: 5px; border-style: groove">
  </div>
          <div class="mb-3 mt-3 d-flex justify-content-center" >
      <h4 for="correo" class="form-label " style="width: 125px">Correo:</h4>
      <input type="email" class="form-control" id="txtCorreo" value="<%= Usuario.getCorreo()%>" placeholder="Porfavor ingrese su correo electronico" name="txtCorreo" style="width: 600px; border-color: #25cff2; border-width: 5px; border-style: groove">
  </div>    
              <div class="mb-3 mt-3 d-flex justify-content-center" >
      <h4 for="contraseña" class="form-label " style="width: 135px">Contraseña:</h4>
      <input type="password" class="form-control" id="txtContraseña" value="<%= Usuario.getClave()%>" placeholder="Porfavor ingrese su contraseña" name="txtContraseña" style="width: 600px; border-color: #25cff2; border-width: 5px; border-style: groove">
  </div>
            <div class="mb-3 mt-3 d-flex justify-content-center" >
      <h4 for="contra" class="form-label " style="width: 135px">Contraseña:</h4>
      <input type="password" class="form-control" id="txtContraseña2" placeholder="Porfavor ingrese su contraseña nuevamente" name="txtContraseña2" style="width: 600px; border-color: #25cff2; border-width: 5px; border-style: groove">
  </div>
<div class="mb-3 mt-3 d-flex justify-content-center" >
      <h4 for="cotra" class="form-label " style="width: 135px">Estado:</h4>        
      <select class="form-select" type="text" name="txtEstado" value="<%= Usuario.getEstado()%>" style="width: 600px; border-color: #25cff2; border-width: 5px; border-style: groove">
  <option>Activo</option>
  <option>Inactivo</option>
</select>
                </div>
            <div class="mb-3 mt-3 d-flex justify-content-center" >
      <h4 for="cotra" class="form-label " style="width: 135px">Tipo:</h4>        
      <select class="form-select" type="text" name="txTipo" value="<%= Usuario.getTipo()%>" style="width: 600px; border-color: #25cff2; border-width: 5px; border-style: groove">
  <option>Administrador</option>
  <option>Vendedor</option>
  <option>Sistemas</option>

</select>      
 </div>

            <div class="mb-3 mt-3 d-flex justify-content-center">
  <button type="submit" class="btn btn-primary" value="Crear Cuenta">Registrar Usuario</button>
            </div>
</form>
            </div>
        </div>
        <%@include file = "/WEB-INF/Vistas-Parciales/pie.jspf" %>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
    </body>
</html>
