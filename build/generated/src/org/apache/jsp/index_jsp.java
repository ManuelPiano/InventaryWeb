package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/WEB-INF/Vistas-Parciales/css-js.jspf");
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

      out.write("\n");
      out.write("<!doctype html>\n");
      out.write("<html lang=\"es\">\n");
      out.write("  <head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("    <meta name=\"description\" content=\"\">\n");
      out.write("    <title>Sign-in Inventario</title>\n");
      out.write("    <link rel=\"icon\" href=\"assets/img/favicon3.ico\" type=\"image/x-icon\">\n");
      out.write("    <!-- Bootstrap core CSS -->\n");
      out.write("    <!-- <link href=\"../assets/dist/css/bootstrap.css\" rel=\"stylesheet\">-->\n");
      out.write("    <!--<link href=\"css/bootstrap.css\" type=\"text/css\" rel=\"stylesheet\">-->\n");
      out.write("    ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<link href=\"css/estilo-base.css\" rel=\"stylesheet\" type=\"text/css\"> \r\n");
      out.write("<link href=\"css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script src=\"js/bootstrap.bundle.min.js\" type=\"text/javascript\"></script>");
      out.write("\n");
      out.write("    <style>\n");
      out.write("      .bd-placeholder-img {\n");
      out.write("        font-size: 1.125rem;\n");
      out.write("        text-anchor: middle;\n");
      out.write("        -webkit-user-select: none;\n");
      out.write("        -moz-user-select: none;\n");
      out.write("        -ms-user-select: none;\n");
      out.write("        user-select: none;\n");
      out.write("      }\n");
      out.write("\n");
      out.write("      @media (min-width: 768px) {\n");
      out.write("        .bd-placeholder-img-lg {\n");
      out.write("          font-size: 3.5rem;\n");
      out.write("        }\n");
      out.write("      }\n");
      out.write("    </style>\n");
      out.write("    <!-- Custom styles for this template -->\n");
      out.write("    <link href=\"css/signin.css\" type=\"text/css\" rel=\"stylesheet\">\n");
      out.write("  </head>\n");
      out.write("  <body class=\"text-center\">\n");
      out.write("      \n");
      out.write("      <form class=\"form-signin\" action=\"sesion\" method=\"POST\">\n");
      out.write("      <img class=\"mb-4\" src=\"assets/img/login.png\" alt=\"\" width=\"72\" height=\"72\">\n");
      out.write("      <h1 class=\"h3 mb-3 font-weight-normal\">Iniciar Sesión</h1>\n");
      out.write("      <label for=\"inputEmail\" class=\"sr-only\">Email address</label>\n");
      out.write("      <input type=\"email\" name=\"txtEmail\" id=\"inputEmail\" class=\"form-control\" placeholder=\"Email address\" required autofocus>\n");
      out.write("      <label for=\"inputPassword\" class=\"sr-only\">Password</label>\n");
      out.write("      <input type=\"password\" name=\"txtPassword\" id=\"inputPassword\" class=\"form-control\" placeholder=\"Password\" required>\n");
      out.write("      <div class=\"checkbox mb-3\">\n");
      out.write("        <label>\n");
      out.write("          <!--<input type=\"checkbox\" value=\"remember-me\"> Remember me -->\n");
      out.write("          <a href=\"#\" title=\"¿No tienes cuenta?\">¿No tienes cuenta? | </a>\n");
      out.write("          <a href=\"#\" title=\"Olvide mi contraseña\">Olvidé mi contraseña</a>\n");
      out.write("        </label>\n");
      out.write("      </div>\n");
      out.write("      <button class=\"btn btn-lg btn-primary btn-block\" type=\"submit\">Ingresar</button>\n");
      out.write("      <p class=\"mt-5 mb-3 text-muted\">MEGATEC-ZACATECOLUCA &copy; 2022</p>\n");
      out.write("    </form>\n");
      out.write("    ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"pie\">\r\n");
      out.write("    &COPY; ITCA-FEPADE\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
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
