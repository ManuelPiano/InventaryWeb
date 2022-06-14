package Controller;

import DAO.CategoriaDAO;
import DAO.CategoriaDAOImplementar;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class Categorias extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Categorias</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Categorias at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         response.setContentType("text/html;charset=UTF-8");
         
         //this.listaCategorias(request, response);
         
         String estado = request.getParameter("opcion");
         String id_cat = request.getParameter("id");
         String nombre_cat = request.getParameter("nombre");
         String estado_cat = request.getParameter("estado");
         /*
         System.out.println("La opcion es: " + estado);
         System.out.println("El ID es: " + id_cat);
         System.out.println("El nombre es: " + nombre_cat);
         System.out.println("El estado es. " + estado_cat);
                 */
    
         if(estado.equals("listar")){
             this.listaCategorias(request, response);
         }else if(estado.equals("editar")){
             System.out.println("Vamos bien.");
             RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/Vistas-Categorias/editarCategorias.jsp?id="+id_cat+"&&nombre="+nombre_cat+"&&estado="+estado_cat);
            dispatcher.forward(request, response);
             
         }else if(estado.equals("eliminar")){
            
         }else{
              
         }
         
         
         
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
    
    protected void listaCategorias(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         CategoriaDAO categoria = new CategoriaDAOImplementar();
         HttpSession sesion = request.getSession(true);
         sesion.setAttribute("lista", categoria.Listar());
         RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/Vistas-Categorias/listarCategorias.jsp");
         dispatcher.forward(request, response);
    }

   
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
