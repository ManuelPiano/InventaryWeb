
package Test;

import DAO.CategoriaDAO;
import DAO.CategoriaDAOImplementar;
import Model.Categoria;
import java.util.List;


public class Prueba {
    
    public static void main(String[] args) {
        Prueba evaluar = new Prueba();
        evaluar.listarcategorias();
    }
    
    
    public void listarcategorias(){
        CategoriaDAO categoria = new CategoriaDAOImplementar();
        List<Categoria> listar = categoria.Listar();
        
        System.out.println("Listado de categorias");
        for(Categoria categoriaListar: listar){
            System.out.println("ID: " + categoriaListar.getId_categoria() +
                    "Nombre: " + categoriaListar.getNom_categoria() +
                    "Estado: " + categoriaListar.getEstado_categoria());
        }
        
        
    }
    
}
