package Database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Victor Julio Diaz Arias 2021-0834
 */
public class Conexion {
    //atributos
    private static final String URL = "jdbc:mysql://localhost:3306/javacrud"; //localizacion de la db
    private static final String USER = "root"; //usuario actual 
    private static final String CLAVE = ""; //clave del usuario
    
    //metodo para hacer la conexion a la base de datos
    public Connection getConexion(){
        Connection con = null;
        try{
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            }
            con = (Connection) DriverManager.getConnection(URL, USER, CLAVE);
        }catch(SQLException e){
            System.out.println("Error: " + e.getMessage());
        }
        return con;
    }
}
