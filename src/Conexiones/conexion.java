
package Conexiones;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author palmachris7
 */
public class conexion {
    static Connection contacto =null;
    public static String Usuario;
    public static String Contraseña;
    public static boolean status = false;
    public static Connection getConexion(){
       status=false;
    String url ="jdbc:sqlserver://localhost:1433;databaseName=Tienda";
    try {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
    }catch (ClassNotFoundException e){
        JOptionPane.showMessageDialog(null,"No se pudo obtener la conexion :'C"+ e.getMessage(),
                "Error de conexion ", JOptionPane.ERROR_MESSAGE);
    }
    try {
       // contacto = DriverManager.getConnection(url,"sa","123");
         contacto = DriverManager.getConnection(url,conexion.Usuario,conexion.Contraseña);
         status=true;
   
    }catch (SQLException e){
        JOptionPane.showMessageDialog(null,"Error"+ e.getMessage(),
                "Error de conexion ", JOptionPane.ERROR_MESSAGE);
    }
    return contacto;
}
    
    public static void setcuenta(String Usuario, String Contraseña ){
    conexion.Usuario=Usuario;
    conexion.Contraseña=Contraseña;
    
}
    
   public static boolean getstatus(){
       return status;
   }
   public static ResultSet consulta(String consulta){
     Connection con  = getConexion();
     Statement declara;
     try{
         declara =con.createStatement();
         ResultSet respuesta = declara.executeQuery(consulta);
         return respuesta;
     }  catch (SQLException e) {
           JOptionPane.showMessageDialog(null,"Error"+ e.getMessage(),
                "Error de conexion ", JOptionPane.ERROR_MESSAGE);
        }
     return null;
   }
}
