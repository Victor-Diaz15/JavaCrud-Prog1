package Database;

/**
 *
 * @author Victor Julio Diaz Arias 2021-0834
 */
public class Modelo {
    
    //atributos
    private String usuario;
    private String nombre;
    private String apellido;
    private String telefono;
    private String correo;
    private String contraseña;
    private String confirmPs;

    //metodo set y get de cada atributo de la clase
    public String getConfirmPs() {
        return confirmPs;
    }

    public void setConfirmPs(String confirmPs) {
        this.confirmPs = confirmPs;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
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

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    } 
}
