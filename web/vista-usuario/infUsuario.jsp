<%-- 
    Document   : infUsuario
    Created on : 07-07-2022, 05:49:02 AM
    Author     : Admin
--%>

<%@page import="Model.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<% 
   try{
        HttpSession var_Session = request.getSession(false);
        String nombres = (String) var_Session.getAttribute("sessionNombres");
        String user = (String) var_Session.getAttribute("sessionUsuario");
        String tipo = (String) var_Session.getAttribute("sessionTipo");
        String correo = (String) var_Session.getAttribute("sessionEmail");
 
        if(user == null){
            out.print("<center><h2><font color='blue'>Debe de haber iniciado Sesion para poder ingresar a esta pagina.</font><br><hr><font color='blue'>Intentelo de Nuevo</font><hr><h2></center><br>");
            out.print("<center><h2><font color='blue'> Por Favor Epere...</font><hr><h2></center>");
            //out.print("<meta http-equiv='refresh' content='4; url=http:sesion'/ >");
            //out.print("<meta http-equiv='refresh' content='4; url=http:./'/ >");
            response.sendRedirect("./");
        }else if(user!=null){
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
                <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">

    </head>
    <body>
<%@include file = "/WEB-INF/Vistas-Parciales/encabezado.jspf" %>
        <div class="container " style="padding-top: 25px">
            <div class="container"   style="border-color: #000;  background-color:#979bf7 ; border-top-width: 25px; padding-top: 50px; height: 85vh"  >
        

  <div class="mb-3 mt-3 d-flex justify-content-center" >
      <h4 class="form-label " style="width: 150px">Nombre completo:</h4>
      <input type="text" class="form-control" id="txtNombres" placeholder="<%= nombres %>"  name="txtNombres" style="width: 250px; border-color: #25cff2; border-width: 5px; border-style: groove">
  </div>
  <div class="mb-3 mt-3 d-flex justify-content-center" >
      <h4 class="form-label " style="width: 150px">Nombre de usuario:</h4>
      <input type="text" class="form-control" id="txtNombres" placeholder="<%= user %>"  name="txtNombres" style="width: 250px; border-color: #25cff2; border-width: 5px; border-style: groove">
  </div>
  <div class="mb-3 mt-3 d-flex justify-content-center" >
      <h4 class="form-label " style="width: 150px">Correo electronico:</h4>
      <input type="text" class="form-control" id="txtNombres" placeholder="<%= correo %>"  name="txtNombres" style="width: 250px; border-color: #25cff2; border-width: 5px; border-style: groove">
  </div>
  <div class="mb-3 mt-3 d-flex justify-content-center" >
      <h4 class="form-label " style="width: 150px">Tipo de usuario:</h4>
      <input type="text" class="form-control" id="txtNombres" placeholder="<%= tipo %>"  name="txtNombres" style="width: 250px; border-color: #25cff2; border-width: 5px; border-style: groove">
  </div>  

            <div class="mb-3 mt-3 d-flex justify-content-center">
  <input type="submit" class="btn btn-primary" href="./principal.jsp" value="regresar"></input>
            </div>

            </div>
        </div>
        <%@include file = "/WEB-INF/Vistas-Parciales/pie.jspf" %>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
        
        

    </body>
</html>
<%
            }
               //Aca puede ir un mensaje para informar que no se ha iniciado sesión.
            }catch(Exception e){

            }
   %>
