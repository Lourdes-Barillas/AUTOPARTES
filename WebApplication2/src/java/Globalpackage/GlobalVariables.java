package Globalpackage;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *Esta clase representa las variables globales requeridas a lo largo del programa
 * @author Adriana P
 */
public class GlobalVariables {
    
    //Adriana datos
    /*
    public static final String db = "jdbc:postgresql://localhost:5432/Project3DB";
    public static final String user = "postgres";
    public static final String password = "JeSuisFort56";
    public static Connection cn;
    */
    public static final String db = "jdbc:postgresql://localhost:5432/Project3DB";
    public static final String user = "postgres";
    public static final String password = "JeSuisFort56";
    public static final String passwordEsau = "JeSuisFort56";
    public static String fecha;
    public static Connection cn;
    
    public Connection connection(){
        try {
            cn = DriverManager.getConnection(db, user, password);
        } catch (SQLException ex) {
            //Logger.getLogger(GlobalVariables.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error al conectarse a la base de datos");
        }
        return cn;
    }
    
    public GlobalVariables(){
        connection();
        fecha();
    }
    
    private String fecha(){
        Date fecha = new Date();
        DateFormat formatofecha = new SimpleDateFormat("yyyy/MM/dd");
        return this.fecha = formatofecha.format(fecha);
    }
    
}
