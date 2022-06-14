<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
   
    String id_cat = request.getParameter("id");
    String nombre_cat = request.getParameter("nombre");
    String estado_cat = request.getParameter("estado");
    
    /*out.print("El ID de la categoria es: " + id_cat);
    out.print("El nombre de la categoria es: " + nombre_cat);
    out.print("El estado de la categoria es: " + estado_cat);*/
 %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <%@include file = "../WEB-INF/Vistas-Parciales/css-js.jspf" %>
    </head>
    <body>
         <%@include file = "../WEB-INF/Vistas-Parciales/encabezado.jspf" %>
         <div style='width: 60%'>
        <h1 class='text-center'>Información de Categoria</h1>
        <!--<form action="Vistas-Categorias/editarCategorias.jsp" method="post">-->
        <form action="" method="post">
        <div class="mb-3 row">
            <label for="staticEmail" class="col-sm-2 col-form-label">ID Categoria:</label>
            <div class="col-sm-10">
              <input type="text" value='<%= id_cat %>' name="id1" id="id1" readonly class="form-control-plaintext" id="staticEmail" >
              <input type="hidden" value='<%= id_cat %>' name="id" id="id" readonly class="form-control-plaintext" id="staticEmail" >
            </div>
        </div>
            
        <div class="mb-3 row">
          <label for="inputPassword" class="col-sm-2 col-form-label">Nombre Categoria:</label>
          <div class="col-sm-10">
            <input type="text" value='<%= nombre_cat %>' name="nombre" id="nombre" class="form-control" id="inputPassword">
          </div>
        </div>
          
          <div class="mb-3 row">
          <label for="inputPassword" class="col-sm-2 col-form-label">Estado Categoria:</label>
          <div class="col-sm-10">
            <input type="text" value='<%= estado_cat %>' name="estado" id="estado" class="form-control" id="inputPassword">
          </div>
        </div>
          
          <div class="mb-3 row">
          <button type="submit" name="send" class="btn btn-success">Actualizar Categoria</button>
          </div>
        </form>
        </div>
         <%@include file = "../WEB-INF/Vistas-Parciales/pie.jspf" %>
    </body>
    
    <%
     String dato = request.getParameter("send");
     if(dato!=null){
         out.print("Entro....");
         System.out.println("End");
     }
    %>
</html>
