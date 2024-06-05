
package Conexion_Mysql;

import java.sql.Types;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexion {
    
    Connection conectar;
    
    public Connection conectar (){
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conectar =  (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/consultorio","root","1173432056");
            System.out.println("Conexion Existosa");
            
        }catch (Exception e){
            System.err.println("No se pudo establecer conexion a la base de datos. Error: " + e);
            
        }
        return conectar;
    }
}
