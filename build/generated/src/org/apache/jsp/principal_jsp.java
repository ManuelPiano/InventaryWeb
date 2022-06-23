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
      out.write("\r\n");
      out.write("<script src=\"js/bootstrap.bundle.min.js\" type=\"text/javascript\"></script>");
      out.write("\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        ");
      out.write("\r\n");
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
      out.write("                  <li class=\"nav-item\">\r\n");
      out.write("                    <a class=\"nav-link\" href=\"#\">Reportes</a>\r\n");
      out.write("                  </li>\r\n");
      out.write("                  <li class=\"nav-item\">\r\n");
      out.write("                    <a class=\"nav-link\" href=\"#\">Cerrar Sesión</a>\r\n");
      out.write("                  </li>\r\n");
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
      out.write("        <h3>Bienvenid@!</h3>\r\n");
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
