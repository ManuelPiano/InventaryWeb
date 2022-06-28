/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Controller;
import DAO.ProductoDAO;
import DAO.ProductoDAOImplementar;
import Model.Producto;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

public class Productos extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Productos</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Productos at " + request.getContextPath() + "</h1>");
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
         String id_pro = request.getParameter("id");
         String nombre_pro = request.getParameter("nombre");
         String estado_pro = request.getParameter("estado");
         String Stock = request.getParameter("stock");
         String precio = request.getParameter("precio");
         String unidad_medida = request.getParameter("unidad_de_medida");
         
         System.out.println("La opcion es: " + estado);
         //System.out.println("El ID es: " + id_pro);
         //System.out.println("El nombre es: " + nombre_pro);
         //System.out.println("El estado es. " + estado_pro);
         
    
         if(estado.equals("listar")){
             this.listaProductos(request, response);
         }else if(estado.equals("editar")){
             System.out.println("Editando Productos....");
             RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/Vistas-Productos/editarProductos.jsp?id="+id_pro+"&&nombre="+nombre_pro+"&&estado="+estado_pro+"&&stock="+Stock+"&&precio"+precio+"&&unidad_de_medida"+unidad_medida);
             dispatcher.forward(request, response);
         }else if(estado.equals("eliminar")){
             System.out.println("Baja de categorias...");
             RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/Vistas-Categorias/bajaProductos.jsp?id="+id_pro+"&&nombre="+nombre_pro);
             dispatcher.forward(request, response);
         }else if(estado.equals("crear")){
             System.out.println("Crear Productos...");
             String pagina = "/Vistas-Productos/crearProductos.jsp";
             RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(pagina);
             dispatcher.forward(request, response);
         }else{
             
         }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Producto producto = new Producto();
        producto.setId_producto(Integer.parseInt(request.getParameter("id_producto")));
        producto.setNom_producto(request.getParameter("txtNomProducto"));
        producto.setEstado(Integer.parseInt(request.getParameter("txtEstado")));
        producto.setPrecio(Double.parseDouble(request.getParameter("txtprecio")));
        producto.setStock(Double.parseDouble(request.getParameter("txtstock")));
        producto.setUnidadMedida(request.getParameter("txtunidad"));
        ProductoDAO guardaProducto = new ProductoDAOImplementar();
        guardaProducto.guardarPro(producto);
        this.listaProductos(request, response);
    }
    

    protected void listaProductos(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         ProductoDAO producto = new ProductoDAOImplementar();
         HttpSession sesion = request.getSession(true);
         sesion.setAttribute("lista", producto.Listar());
         RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/Vistas-Productos/listarProductos.jsp");
         dispatcher.forward(request, response);
         
    
    }
@Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
