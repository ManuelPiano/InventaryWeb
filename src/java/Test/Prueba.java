
package Test;

import DAO.CategoriaDAO;
import DAO.CategoriaDAOImplementar;
import Model.Categoria;
import java.util.List;


public class Prueba {
    
    public static void main(String[] args) {
        Prueba evaluar = new Prueba();
        //evaluar.listarcategorias();
        evaluar.editarCategoria();
        
    }
    
    
    public void listarcategorias(){
        CategoriaDAO categoria = new CategoriaDAOImplementar();        
        //Prueba Listar
        /*
        List<Categoria> listar = categoria.Listar();
        System.out.println("Listado de categorias");
        for(Categoria categoriaListar: listar){
            System.out.println("ID: " + categoriaListar.getId_categoria() +
                    "Nombre: " + categoriaListar.getNom_categoria() +
                    "Estado: " + categoriaListar.getEstado_categoria());
        }
        */
        
        
    }
    
    
    public void editarCategoria(){
         CategoriaDAO categoria = new CategoriaDAOImplementar();
         Categoria cat_edit = categoria.editarCat(200);
         System.out.println("CATEGORIA A MODIFICAR");
         System.out.println("ID: " + cat_edit.getId_categoria() + "\n" +
                    "Nombre: " + cat_edit.getNom_categoria() + "\n" +
                    "Estado: " + cat_edit.getEstado_categoria());
    }
    
}
