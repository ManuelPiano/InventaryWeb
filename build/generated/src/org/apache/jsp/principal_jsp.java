package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class principal_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/WEB-INF/Vistas-Parciales/css-js.jspf");
    _jspx_dependants.add("/WEB-INF/Vistas-Parciales/encabezado.jspf");
    _jspx_dependants.add("/WEB-INF/Vistas-Parciales/pie.jspf");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write('\r');
      out.write('\n');
 
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

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <title>TODO supply a title</title>\r\n");
      out.write("        <meta charset=\"UTF-8\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<link href=\"css/estilo-base.css\" rel=\"stylesheet\" type=\"text/css\"> \r\n");
      out.write("<link href=\"css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("\r\n");
      out.write("<link rel=\"icon\" href=\"assets/img/favicon.ico\" type=\"image/x-icon\">\r\n");
      out.write("\r\n");
      out.write(" <!-- Lib SweetAlert2 -->\r\n");
      out.write(" <script src=\"js/sweetalert2.all.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write(" <!-- Script librería de jquery -->\r\n");
      out.write(" <script src=\"js/jquery-3.3.1.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write(" <!--<script src=\"js/jquery-3.5.1.slim.min.js\" type=\"text/javascript\"></script>-->\r\n");
      out.write(" \r\n");
      out.write(" \r\n");
      out.write("<script src=\"js/bootstrap.bundle.min.js\" type=\"text/javascript\"></script>");
      out.write("\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("    /*\r\n");
      out.write("    $(document).ready(function(){\r\n");
      out.write("        \r\n");
      out.write("    });\r\n");
      out.write("     */\r\n");
      out.write("    \r\n");
      out.write("    function salir(){\r\n");
      out.write("        console.log(\"Entramos al método salir\");\r\n");
      out.write("        //INICIO:\r\n");
      out.write("        //document.getElementById('message').onclick = function() {\r\n");
      out.write("        $(\"#closesesion\").click(function(){\r\n");
      out.write("        swal({\r\n");
      out.write("         title: '¿Esta seguro de cerrar su sesion?',\r\n");
      out.write("         text: \"Puedes Iniciar Sesion Nuevamente Cuando lo Desee.\",\r\n");
      out.write("         type: 'warning',\r\n");
      out.write("         showCancelButton: true,\r\n");
      out.write("         confirmButtonColor: '#3085d6',\r\n");
      out.write("         cancelButtonColor: '#d33',\r\n");
      out.write("         confirmButtonText: 'Aceptar',\r\n");
      out.write("         cancelButtonText: 'Cancelar'\r\n");
      out.write("       }).then((result) => {\r\n");
      out.write("         if (result.value) {\r\n");
      out.write("           //swal('Congrats!','You are the winner!','success')\r\n");
      out.write("           location.href= \"salir\";\r\n");
      out.write("           //window.location = 'salir';\r\n");
      out.write("         }else{\r\n");
      out.write("           swal('EXCELENTE','Buena elección, continuas dentro del sistema.','success');\r\n");
      out.write("         }\r\n");
      out.write("       })\r\n");
      out.write("      });\r\n");
      out.write("      //FIN\r\n");
      out.write("    }\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<!--<script lenguage=\"javascript\">\r\n");
      out.write("    function salir(){\r\n");
      out.write("        var mensaje;\r\n");
      out.write("        var opcion = confirm(\"Advertencia!\\n\\n¿Confirme que desea cerrar su sesión?\");\r\n");
      out.write("        if(opcion == true){\r\n");
      out.write("            mensaje = \"Clic en botón aceptar\";\r\n");
      out.write("            location.href= \"salir\";\r\n");
      out.write("        }else{\r\n");
      out.write("            mensaje = \"Clic en botón cancelar\";\r\n");
      out.write("            //alert(mensaje);\r\n");
      out.write("        }\r\n");
      out.write("        //alert(mensaje);\r\n");
      out.write("        //Muestro en el elemento con id ejemplo el valor de la variable mensaje.\r\n");
      out.write("        //document.getElementById(\"ejemplo\").innerHTML = mensaje;\r\n");
      out.write("    }\r\n");
      out.write("</script>-->\r\n");
      out.write("\r\n");
      out.write("<div>\r\n");
      out.write("    <!--<div class=\"encabezado\">\r\n");
      out.write("        Sistema de Control de Inventario\r\n");
      out.write("        <a href=\"Index\" class=\"btn btn-primary\">Inicio</a>\r\n");
      out.write("        <a href=\"categorias?opcion=listar\" class=\"btn btn-success\">Catogias</a>\r\n");
      out.write("        <a href=\"productos?opcion=listar\" class=\"btn btn-success\">Productos</a>\r\n");
      out.write("        <a href=\"reportes?opcion=listar\" class=\"btn btn-success\">Reportes</a>\r\n");
      out.write("        <a href=\"salir?opcion=listar\" class=\"btn btn-success\">Cerrar Sesión</a>\r\n");
      out.write("    </div>-->\r\n");
      out.write("    \r\n");
      out.write("    <!--<nav class=\"navbar bg-light\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("          <a class=\"navbar-brand\" href=\"#\">\r\n");
      out.write("              <img src=\"assets/img/inventario.png\" alt=\"\" width=\"30\" height=\"24\"><strong>&nbsp;Inventario 2022</strong> \r\n");
      out.write("              <a href=\"Index\" class=\"btn btn-primary\">Inicio</a>\r\n");
      out.write("              <a href=\"categorias?opcion=listar\" class=\"btn btn-success\">Catogias</a>\r\n");
      out.write("              <a href=\"productos?opcion=listar\" class=\"btn btn-success\">Productos</a>\r\n");
      out.write("              <a href=\"reportes?opcion=listar\" class=\"btn btn-success\">Reportes</a>\r\n");
      out.write("              <a href=\"salir?opcion=listar\" class=\"btn btn-success\">Cerrar Sesión</a>\r\n");
      out.write("          </a>\r\n");
      out.write("        </div>\r\n");
      out.write("    </nav>-->\r\n");
      out.write("    \r\n");
      out.write("     <nav class=\"navbar navbar-expand-lg\" style=\"background-color: #ffc107;\">\r\n");
      out.write("        <div class=\"container-fluid\">\r\n");
      out.write("           <!--<a class=\"navbar-brand\" href=\"#\">Navbar</a>-->\r\n");
      out.write("              <img src=\"assets/img/inventario.png\" alt=\"\" width=\"30\" height=\"24\"><strong style=\"color: #fff;\">&nbsp;Inventario 2022</strong> \r\n");
      out.write("              \r\n");
      out.write("              <div class=\"collapse navbar-collapse d-grid gap-5 d-md-flex justify-content-md-end\" id=\"navbarNav\">\r\n");
      out.write("                <ul class=\"navbar-nav\">\r\n");
      out.write("                  <li class=\"nav-item\">\r\n");
      out.write("                      <a class=\"nav-link\" aria-current=\"page\" href=\"Index\">&nbsp;</a>\r\n");
      out.write("                  </li>\r\n");
      out.write("                  <li class=\"nav-item\">\r\n");
      out.write("                    <a class=\"nav-link active\" aria-current=\"page\" href=\"Index\">Inicio</a>\r\n");
      out.write("                  </li>\r\n");
      out.write("                  <li class=\"nav-item\">\r\n");
      out.write("                    <a class=\"nav-link\" href=\"categorias?opcion=listar\">Categorias</a>\r\n");
      out.write("                  </li>\r\n");
      out.write("                  <li class=\"nav-item\">\r\n");
      out.write("                    <a class=\"nav-link\" href=\"#\">Productos</a>\r\n");
      out.write("                  </li>\r\n");
      out.write("                  <li class=\"nav-item dropdown\">\r\n");
      out.write("                    <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\" role=\"button\" data-bs-toggle=\"dropdown\" aria-expanded=\"false\">\r\n");
      out.write("                      Usuarios\r\n");
      out.write("                    </a>\r\n");
      out.write("                    <ul class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\r\n");
      out.write("                      <li class=\"nav-item dropdown\"><a class=\"dropdown-item\" href=\"#\">Perfil</a></li>\r\n");
      out.write("                      <li class=\"nav-item dropdown\"><a class=\"dropdown-item\" href=\"#\">Seguridad</a></li>\r\n");
      out.write("                      <li class=\"nav-item dropdown\"><hr class=\"dropdown-divider\"></li>\r\n");
      out.write("                      <li class=\"nav-item dropdown\"><a class=\"dropdown-item\" href=\"javascript:void(0)\" id=\"closesesion\" name=\"closesesion\" onclick=\"salir();\">Cerrar</a></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                  </li>\r\n");
      out.write("                  <li class=\"nav-item\">\r\n");
      out.write("                    <a class=\"nav-link\" href=\"#\">Reportes</a>\r\n");
      out.write("                  </li>\r\n");
      out.write("                  <!--\r\n");
      out.write("                  <li class=\"nav-item\">\r\n");
      out.write("                    <a class=\"nav-link\" href=\"#\">Cerrar Sesión</a>\r\n");
      out.write("                  </li>-->\r\n");
      out.write("                  \r\n");
      out.write("                  <!--<li class=\"nav-item\">\r\n");
      out.write("                    <a class=\"nav-link disabled\">Disabled</a>\r\n");
      out.write("                  </li>-->\r\n");
      out.write("                </ul>\r\n");
      out.write("              </div>\r\n");
      out.write("              \r\n");
      out.write("        \r\n");
      out.write("        </div>\r\n");
      out.write("    </nav>\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    <div class=\"contenido\">");
      out.write("\r\n");
      out.write("        <h3 style=\"text-align: center; width: 100%;\">BIENVENID@S: ");
      out.print( nombres );
      out.write("</h3>\r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"pie\">\r\n");
      out.write("    &COPY; ITCA-FEPADE\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");

            }
               //Aca puede ir un mensaje para informar que no se ha iniciado sesión.
            }catch(Exception e){

            }
   
      out.write('\r');
      out.write('\n');
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
