
package Controller;
import DAO.UsuarioDAO;
import DAO.UsuarioDaoImplementar;
import Model.Usuario;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import Model.Usuario;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletResponse;

public class loggin extends HttpServlet {


    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
   
    }


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        String opcion = request.getParameter("opcion");
        
        System.out.println("La opción ingresada es:" + opcion);
        switch (opcion) {
            case "registrar":
                String aviso = request.getParameter("aviso");System.out.println("aviso");
                request.setAttribute("aviso", aviso);
                this.registrarUsuario(request, response);
                break;
            case "iniciarSession":
                this.cargarIndex(request, response);
                break;
            case "recuperarcuenta":
                this.recuperarCuenta(request, response);
                break;
            case "recuperarcontrasena":
                System.out.println("Se ejecuta el caso de recuperar contraseña");
                this.recuperarContraseña(request, response);
                break;
            case "modificarContrasena":
                this.modificarContraseña(request, response);
                break;
            default:
                break;
        }
        
                
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        UsuarioDAO usuario = new UsuarioDaoImplementar();
        Usuario usu = new Usuario();
        
        String opcion = request.getParameter("opcion");
      
        switch (opcion) {
            case "registrar":
                usu.setNombre(request.getParameter("txtNomUsuario"));
                usu.setApellido(request.getParameter("txtApellidoUsuario"));
                usu.setCorreo(request.getParameter("txtCorreoUsuario"));
                usu.setUsuario(request.getParameter("txtUsuUsuario"));
                usu.setClave(request.getParameter("txtClaveUsuario"));
                usu.setEstado(Integer.parseInt(request.getParameter("txtEstadoUsuario")));
                usu.setTipo(Integer.parseInt(request.getParameter("txtTipooUsuario")));
                usu.setPregunta(request.getParameter("txtPreguntaUsuario"));
                usu.setRespuesta(request.getParameter("txtRespuestaUsuario"));
                //Esta registrando un usuario
                if(usuario.verificarCorreo(usu.getCorreo()).equals(""))
                {
                    usuario.RegistrarUsuario(usu);
                    System.out.println("Cuenta creada");
                    this.cargarIndex(request, response);
                }
                else
                {
                    request.setAttribute("Message", "Correo electronico ya en uso, introducir un nuevo correo electronico");
                    request.setAttribute("aviso", "coincidenciaCorreo");
                    this.registrarUsuario(request, response);
                }
                
                break;
            case "login":
                //Creación de arraylist para cargar datos del método que consulta a la base de datos.
                ArrayList<Usuario> users = new ArrayList();
                //Creación de la variable de session. Esta permitira verificar si se ha iniciado sessión...
                HttpSession var_Session= request.getSession(true);
                usu.setCorreo(request.getParameter("txtCorreoUsuario"));
                usu.setClave(request.getParameter("txtClaveUsuario"));
                users = usuario.startSesion(usu.getCorreo(), usu.getClave());
                if(users.size() > 0)
                {
                    //Guardar datos recibidos para ser utilizados luego
                    String nombreCompleto = users.get(0).getNombre() + users.get(0).getApellido();
                    int tipo = users.get(0).getTipo();
                    String name_usuario = users.get(0).getUsuario();
                    String correo = users.get(0).getCorreo();
                    
                    //Declaración de variables globales para la session
                    var_Session.setAttribute("nombre_Completo", nombreCompleto);
                    var_Session.setAttribute("usuario_tipo", String.valueOf(tipo));
                    var_Session.setAttribute("nombreUsuario", name_usuario);
                    var_Session.setAttribute("correo_usuario", correo);
                    
                    var_Session.setAttribute("lista", users);
                    
                    this.verMenu(request, response);
                }
                else{
                    //Se ejecutara este bloque de codigo cuando no se encuentre ningún usuario en la base de datos
                    response.setContentType("text/html;charset=UTF-8");
                    try (PrintWriter out = response.getWriter()) {
                        
                        String url = "./";
                        out.println("<script>valor=confirm(\"Error. Usuario o Clave Incorrecto. " +"\\nNombre de Usuario: "  + usu.getCorreo() + " \\n\\nClic en aceptar para volver a intentarlo. \");valor;"
                                + "if (valor==true){"
                                + "location.href='"+ url + "';"
                                        + "}else{"
                                        + "location.href='"+ url + "';"
                                                + "}"
                                                + "</script>");
                    }
                }   
                break;
            case "recuperarcuenta":
                usu.setTelefono(Long.parseLong(request.getParameter("txtTelefonoUsuario")));
                String correo = usuario.recuperarCorreo(usu.getTelefono());
                System.out.println(correo);
                //Se ejecutara este código cuando se encuentre una cuenta asociada al numero de telefono dado
                response.setContentType("text/html;charset=UTF-8");
                if(correo != "")
                {
                    try (PrintWriter out = response.getWriter()) {
                     String url = "./";
                        out.println("<script>valor=confirm(\"Usuario encontrado. " +"\\nLa cuenta es: "  + correo + " \\n\\nClic en aceptar para Iniciar sesión. \");valor;"
                        + "if (valor==true){"
                        + "location.href='"+ url + "';"
                        + "}else{"
                        + "location.href='RecuperarCuenta.jsp ';"
                        + "}"
                        + "</script>");
                       }
                }
                else
                {
                    //Aqui deberia de mostrar un mensaje para cuando no se ingrese un telefono valido
                     try (PrintWriter out = response.getWriter()) {
                     String url = "RecuperarCuenta.jsp";
                        out.println("<script>valor=confirm(\"No existe un registro dentro de la base de datos. " +"\\nEl numero ingresado es: "  + usu.getTelefono() + " \\n\\nClic en aceptar para reintentar. \");valor;"
                        + "if (valor==true){"
                        + "location.href='"+ url + "';"
                        + "}else{"
                        + "location.href='RecuperarCuenta.jsp ';"
                        + "}"
                        + "</script>");
                       }
                }
                
                break;
            case "recuperarcontrasena":
                    String correoUsuario = request.getParameter("txtCorreoUsuario");
                    String pregunta = usuario.pregunta(correoUsuario);
                    if(pregunta != "")
                    {
                        System.out.println(pregunta);
                        System.out.println(correoUsuario);
                        
                        request.setAttribute("pregunta", pregunta);
                        request.setAttribute("correo", correoUsuario);
                        
                        this.recuperarContraseña(request, response);
                    }                    
                    
                break;
            case "recuperarContrasena/respuesta":
                System.out.println("Se ejecuta recuperarContraseña/respuesta ");
                String correoUsu = request.getParameter("correoUsuario");
                String preguntaUsu = request.getParameter("txtPregunta");
                String respuesta = request.getParameter("txtRespuesta");
                
                String respuestaDB = usuario.respuesta(correoUsu, preguntaUsu);
                
                System.out.println(respuestaDB + correoUsu + preguntaUsu + respuesta);
                 if(respuesta.equals(respuestaDB))
                {
                    String contraseña = usuario.recuperarContraseña(correoUsu);
                    try (PrintWriter out = response.getWriter()) {
                     String url = "./";
                        out.println("<script>valor=confirm(\"Usuario encontrado. " +"\\nLa cuenta es: "  + correoUsu + "\\nContraseña: " + contraseña  +" \\n\\nClic en aceptar para Iniciar sesión. \");valor;"
                        + "if (valor==true){"
                        + "location.href='"+ url + "';"
                        + "}else{"
                        + "location.href='RecuperarCuenta.jsp ';"
                        + "}"
                        + "</script>");
                       }
                }
                else
                {
                    //Aqui deberia de mostrar un mensaje para cuando no se ingrese un telefono valido
                     try (PrintWriter out = response.getWriter()) {
                     String url = "RecuperarContraseña.jsp";
                        out.println("<script>valor=confirm(\"Revise mayusculas y minusculas de su respuesta. " +"\\nLa respuesta ingresada es: "  + respuesta + " \\n\\nClic en aceptar para reintentar. \");valor;"
                        + "if (valor==true){"
                        + "location.href='"+ url + "';"
                        + "}else{"
                        + "location.href='" + url + "';"
                        + "}"
                        + "</script>");
                       }
                }
                
                break;
            case "modificarContrasena":
                String contraActual = request.getParameter("txtClaveUsuario");
                String correoUsua = request.getParameter("correoUsuario");
                String contraNueva = request.getParameter("txtNuevaClaveUsuario");
                System.out.println(contraActual + correoUsua + contraNueva);
                
                if(usuario.modificarContraseña(correoUsua, contraActual, contraNueva))
                {
                     try (PrintWriter out = response.getWriter()) {
                     String url = "menuprincipal.jsp";
                        out.println("<script>valor=confirm(\"Contraseña modificada con exto. \\n\\nClic en aceptar para seguir. \");valor;"
                        + "if (valor==true){"
                        + "location.href='"+ url + "';"
                        + "}else{"
                        + "location.href='" + url + "';"
                        + "}"
                        + "</script>");
                       }
                    
                }
                else
                {
                    try (PrintWriter out = response.getWriter()) {
                     String url = "menuprincipal.jsp";
                        out.println("<script>valor=confirm(\"Contraseña modificada sin exto.\\nContraseña actual erronea. \\n\\nClic en aceptar para reintentar. \");valor;"
                        + "if (valor==true){"
                        + "location.href='modificarContraseña.jsp';"
                        + "}else{"
                        + "location.href='" + url + "';"
                        + "}"
                        + "</script>");
                       }
                }
                break;
            default:
                break;
        }
    }


    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    public void registrarUsuario(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        response.setContentType("text/html;charset=utf-8");
        String pagina = "/Registro.jsp";
            RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(pagina);
            dispatcher.forward(request, response);
    }
    
    public void verMenu(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        response.setContentType("text/html;charset=utf-8");
        String pagina = "/menuprincipal.jsp";
            RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(pagina);
            dispatcher.forward(request, response);
    }
    
    public void cargarIndex(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        response.setContentType("text/html;charset=utf-8");
        String pagina = "/index.jsp";
            RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(pagina);
            dispatcher.forward(request, response);
    }
    
    public void recuperarCuenta(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        response.setContentType("text/html;charset=utf-8");
        String pagina = "/RecuperarCuenta.jsp";
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(pagina);
            dispatcher.forward(request, response);
    }
    
    public void recuperarContraseña(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
            
        response.setContentType("text/html;charset=utf-8");
        String pagina = "/RecuperarContraseña.jsp";
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(pagina);
            dispatcher.forward(request, response);
    }
    
    public void modificarContraseña(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        response.setContentType("text/html;charset=utf-8");
        String pagina = "/modificarContraseña.jsp";
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(pagina);
            dispatcher.forward(request, response);
    }
    
}
