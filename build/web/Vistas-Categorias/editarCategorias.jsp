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
    </head>
    <body>
        <h1>Información de Categoria</h1>
        <form action="#" method="post">
            ID categoria:<input type='text' value='<%= id_cat %>'>
            Nombre categoria:<input type='text' value='<%= nombre_cat %>'>
            Estado categoria:<input type='text' value='<%= estado_cat %>'>
        </form>
    </body>
</html>
