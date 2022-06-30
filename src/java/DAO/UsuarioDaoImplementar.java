package DAO;

import Factory.ConexionBD;
import Factory.FactoryConexionDB;
import Model.Categoria;
import Model.Usuario;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UsuarioDaoImplementar implements UsuarioDAO{
    
    ConexionBD conn;  //Crear el objeto tipo conexión.

    public UsuarioDaoImplementar() {
        @Override
    public ArrayList<Usuario> startSesion(String user, String clave) {
        this.conn = FactoryConexionDB.open(FactoryConexionDB.MYSQL);
        StringBuilder miSQL = new StringBuilder();
        miSQL.append("SELECT * FROM tb_usuario WHERE correo = '").append(user);
        miSQL.append("' and clave = '").append(clave);
        miSQL.append("';");  
        System.out.println(miSQL);
        //ArrayList<Usuario> user = new ArrayList(); // crear el array de almacenamiento en cada fial los registros encontrados
        ArrayList<Usuario> lista = new ArrayList<Usuario>();
        try{
        //Se crea el objeto ResultSet implementando el método (consultaSQL) creado para la consulta.
            ResultSet resultadoSQL = this.conn.consultaSQl(miSQL.toString());
            while(resultadoSQL.next()){
                Usuario usuario = new Usuario();
                //Asignar cada campo consultado al atributo en la clase.
                usuario.setId(resultadoSQL.getInt("id"));
                usuario.setNombre(resultadoSQL.getString("nombre"));
                usuario.setApellido(resultadoSQL.getString("apellido"));
                usuario.setCorreo(resultadoSQL.getString("correo"));
                usuario.setUsuario(resultadoSQL.getString("usuario"));
                usuario.setClave(resultadoSQL.getString("clave"));
                usuario.setTelefono(resultadoSQL.getLong("telefono"));
                usuario.setTipo(resultadoSQL.getInt("tipo"));
                usuario.setEstado(resultadoSQL.getInt("estado"));
                usuario.setPregunta(resultadoSQL.getString("pregunta"));
                usuario.setRespuesta(resultadoSQL.getString("respuesta"));
                usuario.setFecharegistro(resultadoSQL.getString("fecha_registro"));
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
        this.conn = FactoryConexionDB.open(FactoryConexionDB.MYSQL);
        Boolean registrar = false;
        try
        {
        StringBuilder miSQL = new StringBuilder();
        miSQL.append("insert into tb_usuario (nombre, apellido, correo, usuario, clave, telefono,  estado, tipo, pregunta, respuesta) ");
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
        miSQL.append(usuario.getTelefono());
        miSQL.append(", ");
        miSQL.append(usuario.getEstado());
        miSQL.append(", ");
        miSQL.append(usuario.getTipo());
        miSQL.append(", '");
        miSQL.append(usuario.getPregunta());
        miSQL.append("', '");
        miSQL.append(usuario.getRespuesta());
        miSQL.append("');");
        this.conn.ejecutarSQl(miSQL.toString());
        
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
    public String recuperarCorreo(long telefono) {
        this.conn = FactoryConexionDB.open(FactoryConexionDB.MYSQL);
        String correo = "";
        Usuario usu = new Usuario();
        StringBuilder miSQL = new StringBuilder();
            miSQL.append("Select correo from tb_usuario where telefono = ");
            miSQL.append(telefono);
            
        try
        {
            
            ResultSet rs = this.conn.consultaSQl(miSQL.toString());
            while(rs.next())
            {
                    usu.setCorreo(rs.getString("correo"));
            }
            
            correo = usu.getCorreo();
        }
        
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
        finally
        {
            this.conn.cerrarConexion();
        }
        return correo;
    }

    @Override
    public String recuperarContraseña(String correo) {
            this.conn = FactoryConexionDB.open(FactoryConexionDB.MYSQL);
        String contraseña = "";
        Usuario usu = new Usuario();
        StringBuilder miSQL = new StringBuilder();
            miSQL.append("Select clave from tb_usuario where correo = '");
            miSQL.append(correo);
            miSQL.append("';");
            
        try
        {
            
            ResultSet rs = this.conn.consultaSQl(miSQL.toString());
            while(rs.next())
            {
                    usu.setClave(rs.getString("clave"));
            }
            
            contraseña = usu.getClave();
        }
        
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
        finally
        {
            this.conn.cerrarConexion();
        }
        return contraseña;
    }

    @Override
    public boolean modificarContraseña(String correo, String contraseñaActual , String nuevaContraseña) {
        this.conn = FactoryConexionDB.open(FactoryConexionDB.MYSQL);
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
            
            if(this.conn.ejecutarSQl(miSQL.toString()))
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
    public String pregunta(String correo) {
        this.conn = FactoryConexionDB.open(FactoryConexionDB.MYSQL);
        StringBuilder miSQL = new StringBuilder();
        String pregunta = "";
        Usuario usu = new Usuario();
        try
        {
            ResultSet rs = null;
            miSQL.append("Select pregunta from tb_usuario where correo = '");
            miSQL.append(correo);
            miSQL.append("'; ");
            
            rs = this.conn.consultaSQl(miSQL.toString());
            
            
            while(rs.next())
            {
                usu.setPregunta(rs.getString("pregunta"));
                pregunta = usu.getPregunta();
                return pregunta;
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
        
        return pregunta;
    }
    
    @Override
    public String respuesta(String correo, String pregunta)
    {
       this.conn = FactoryConexionDB.open(FactoryConexionDB.MYSQL);
       StringBuilder miSQL = new StringBuilder();
       String respuesta = "";
       
       try
       {
           miSQL.append("Select respuesta from tb_usuario where correo = '");
           miSQL.append(correo);
           miSQL.append("' and pregunta = '");
           miSQL.append(pregunta);
           miSQL.append("'; ");
           
           ResultSet rs = this.conn.consultaSQl(miSQL.toString());
           while(rs.next())
           {
               respuesta = rs.getString("respuesta");
               return respuesta;
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
       
       return respuesta;
    }

    @Override
    public String verificarCorreo(String correo) {
        this.conn = FactoryConexionDB.open(FactoryConexionDB.MYSQL);
        StringBuilder miSQL = new StringBuilder();
        String Correov = "";
        try
        {
            miSQL.append("Select correo from tb_usuario where correo = '");
            miSQL.append(correo);
            miSQL.append("';");
            
            ResultSet rs = null;
            rs = this.conn.consultaSQl(miSQL.toString());
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
}
