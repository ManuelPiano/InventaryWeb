/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Model.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class UsuarioDAO {
    
    Connection conn;
    
    public boolean registrarUsuario(Usuario usuario){
    boolean set = false;
    try{
    String query = "insert into tb_usuario (nombre, apellido, correo, usuario, clave, tipo, estado) values(?,?,?,?,?,?,?)";
   PreparedStatement pt = this.conn.prepareStatement(query);
   pt.setString(1, usuario.getNombre());
   pt.setString(2, usuario.getApellido());
   pt.setString(3, usuario.getCorreo());
   pt.setString(4, usuario.getUsuario());
   pt.setString(5, usuario.getClave());
   pt.setString(6, usuario.getTipo());
   pt.setString(7, usuario.getEstado());
   
   pt.executeUpdate();
   set = true;
    }catch(Exception ex)
    {
    ex.printStackTrace();
    }
        return set;
    
    }
    
    public boolean loginUsuario(String correo, String contraseña){
    Usuario usuario = null;
    try{
    String query = "select * from tb_usuario where correo=? and clave=?";
    PreparedStatement ps = this.conn.prepareStatement(query);
    ps.setString(1, correo);
    ps.setString(2, contraseña);
    ResultSet rs = ps.executeQuery();
    
    if(rs.next()){
    usuario = new Usuario();
    usuario.setId(rs.getInt("id"));
    usuario.setNombre(rs.getString("nombre"));
    usuario.setApellido(rs.getString("apellido"));
    usuario.setCorreo(rs.getString("correo"));
    usuario.setUsuario(rs.getString("usuario"));
    usuario.setClave(rs.getString("clave"));
    usuario.setTipo(rs.getString("tipo"));
    usuario.setEstado(rs.getString("estado"));
    
    }
            
    }catch (Exception ex){
        ex.printStackTrace();
    }
        return false;
    
    }
    
}
