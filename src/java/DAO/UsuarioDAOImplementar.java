
package DAO;

import Factory.ConexionBD;
import Factory.FactoryConexionDB;
import java.sql.ResultSet;
import java.util.ArrayList;
import Model.Usuario;


public class UsuarioDAOImplementar implements UsuarioDAO {

    ConexionBD conn;
    
    @Override
    public ArrayList<Usuario> startSesion(String user, String clave) {
        this.conn = FactoryConexionDB.open(FactoryConexionDB.MySQL);
        StringBuilder miSQL = new StringBuilder();
        miSQL.append("SELECT * FROM tb_usuario WHERE correo = '").append(user);
        miSQL.append("' and clave = '").append(clave);
        miSQL.append("';");  
        System.out.println(miSQL);
        //ArrayList<Usuario> user = new ArrayList(); // crear el array de almacenamiento en cada fial los registros encontrados
        ArrayList<Usuario> lista = new ArrayList<Usuario>();
        try{
        //Se crea el objeto ResultSet implementando el método (consultaSQL) creado para la consulta.
            ResultSet resultadoSQL = this.conn.consultaSQL(miSQL.toString());
            while(resultadoSQL.next()){
                Usuario usuario = new Usuario();
                //Asignar cada campo consultado al atributo en la clase.
                usuario.setId(resultadoSQL.getInt("id"));
                usuario.setNombre(resultadoSQL.getString("nombre"));
                usuario.setApellido(resultadoSQL.getString("apellido"));
                usuario.setCorreo(resultadoSQL.getString("correo"));
                usuario.setUsuario(resultadoSQL.getString("usuario"));
                usuario.setClave(resultadoSQL.getString("clave"));
                usuario.setTipo(resultadoSQL.getInt("tipo"));
                usuario.setEstado(resultadoSQL.getInt("estado"));
                usuario.setFecha(resultadoSQL.getString("fecha_registro"));
                lista.add(usuario); //Agregar al array cada registro encontrado.
            }
        }catch(Exception ex)
        {
            ex.printStackTrace();
        }
        finally{
            this.conn.cerrarConexion();
        }
        return lista;
    }

    @Override
    public boolean RegistrarUsuario(Usuario usuario) {
       this.conn = FactoryConexionDB.open(FactoryConexionDB.MySQL);
        Boolean registrar = false;
        try
        {
        StringBuilder miSQL = new StringBuilder();
        miSQL.append("insert into tb_usuario (nombre, apellido, correo, usuario, clave, tipo, estado) ");
        miSQL.append("values ('");
        miSQL.append(usuario.getNombre());
        miSQL.append("', '");
        miSQL.append(usuario.getApellido());
        miSQL.append("', '");
        miSQL.append(usuario.getCorreo());
        miSQL.append("', '");
        miSQL.append(usuario.getUsuario());
        miSQL.append("', '");
        miSQL.append(usuario.getClave());
        miSQL.append("', ");
        miSQL.append(usuario.getEstado());
        miSQL.append(", ");
        miSQL.append(usuario.getTipo());
        miSQL.append(", '");
        this.conn.ejecutarSQL(miSQL.toString());
        
        registrar = true;
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
        finally
        {
            this.conn.cerrarConexion();
        }
        return registrar;
    }

    @Override
    public boolean modificarContraseña(String correo, String contraseñaActual, String nuevaContraseña) {
        this.conn = FactoryConexionDB.open(FactoryConexionDB.MySQL);
        StringBuilder miSQL = new StringBuilder();
        
        boolean modificar = false;
        try
        {
            miSQL.append("Update tb_usuario set clave = '");
            miSQL.append(nuevaContraseña);
            miSQL.append("' where correo = '");
            miSQL.append(correo);
            miSQL.append("' and clave = '");
            miSQL.append(contraseñaActual);
            miSQL.append("'; ");
            
            if(this.conn.ejecutarSQL(miSQL.toString()))
            {
            modificar = true;
            }
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
        finally
        {
            this.conn.cerrarConexion();
        }
        return modificar;
    }


    @Override
    public String verificarCorreo(String correo) {
        this.conn = FactoryConexionDB.open(FactoryConexionDB.MySQL);
        StringBuilder miSQL = new StringBuilder();
        String Correov = "";
        try
        {
            miSQL.append("Select correo from tb_usuario where correo = '");
            miSQL.append(correo);
            miSQL.append("';");
            
            ResultSet rs = null;
            rs = this.conn.consultaSQL(miSQL.toString());
            while(rs.next())
            {
                Correov = rs.getString("correo");
                return Correov;
            }
            
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
        finally
        {
            this.conn.cerrarConexion();
        }
       return Correov;
    }
    
}
