package Model;

public class Usuario {
    int id;
    String nombre;
    String apellido;
    String correo;
    String usuario;
    String clave;
    String tipo;
    String estado;
    String fecha;

    public Usuario() {
        this.id = 0;
        this.nombre = "";
        this.apellido = "";
        this.correo = "";
        this.usuario = "";
        this.clave = "";
        this.tipo = "";
        this.estado = "";
        this.fecha = "";
    }
    
    public Usuario(int id, String nombre, String apellido, String correo, String usuario, String clave, String tipo, String estado, String fecha) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.usuario = usuario;
        this.clave = clave;
        this.tipo = tipo;
        this.estado = estado;
  
        this.fecha = fecha;
    }

    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    
    
    
}
