/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CRUD;

import Globalpackage.GlobalVariables;
import MasterClases.Orden;
import MasterClases.Producto;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Adriana P
 */
public class Read {
    private String traerDatos = "SELECT * FROM PUBLIC.";
    GlobalVariables globalvariables = new GlobalVariables();
    
    public ArrayList<Orden> readOrden(){
        String Orden_Id, Orden_ClienteId = null;
        String Orden_Fecha, Orden_PrecioDeEnvio = null;
        String Orden_TipoEnvio = null, Orden_Estado = null, Orden_DiasEnvio = null;
        ArrayList<Orden> ordenes = new ArrayList<Orden>();
        Orden orden = null;
        try{
            Connection miConexion = globalvariables.connection();
            Class.forName("org.postgresql.Driver");
            Statement st = miConexion.createStatement();
            traerDatos = traerDatos + "\"Orden\";";
            ResultSet result = st.executeQuery(traerDatos);
            while(result.next()){
                Orden_Id = result.getString("Orden_Id");
                Orden_ClienteId = result.getString("Orden_ClienteId");
                Orden_Fecha = result.getString("Orden_Fecha");
                Orden_PrecioDeEnvio = result.getString("Orden_PrecioDeEnvio");
                Orden_TipoEnvio = result.getString("Orden_TipoEnvio");
                Orden_Estado = result.getString("Orden_Estado");
                Orden_DiasEnvio = result.getString("Orden_DiasEnvio");
                //--------------------------------------------------------------
                orden = new Orden(Integer.parseInt(Orden_ClienteId), 
                                    Double.parseDouble(Orden_PrecioDeEnvio), 
                                    Orden_TipoEnvio, 
                                    Integer.parseInt(Orden_Estado), 
                                    Integer.parseInt(Orden_DiasEnvio));
                orden.setFecha(Orden_Fecha);
                orden.setId(Integer.parseInt(Orden_Id));
                //--------------------------------------------------------------
                ordenes.add(orden);
            }
            result.close();
            st.close();
        }catch(Exception e){
            System.out.println(e.getCause());
        }
        return ordenes;
    }//fin getData
    
    public ArrayList<Producto> readProductos(){
        //seteando datos
        
        String prod_Id = "", prod_Nombre = "", prod_Costo = "", prod_Existencia = "";
        ArrayList<Producto> productos = new ArrayList<Producto>();
        Producto producto = null;
        try{
            Connection miConexion = DriverManager.getConnection(globalvariables.db,globalvariables.user, globalvariables.password);
            
            Class.forName("org.postgresql.Driver");
            Statement st = miConexion.createStatement();
            traerDatos = traerDatos + "\"Productos\";";
            ResultSet result = st.executeQuery(traerDatos);
            while(result.next()){
                prod_Id = result.getString("Prod_Id");
                prod_Nombre = result.getString("Prod_Nombre");
                prod_Costo = result.getString("Prod_Costo");
                prod_Existencia = result.getString("Prod_Existencia");
                //--------------------------------------------------------------
                producto = new Producto(Integer.parseInt(prod_Id), prod_Nombre, Double.parseDouble(prod_Costo));
                producto.setCantidad(Integer.parseInt(prod_Existencia));
                //--------------------------------------------------------------
                productos.add(producto);
            }
            result.close();
            st.close();
        }catch(Exception e){
            System.out.println(e.getCause());
        }
        return productos;
    }//fin getData
}
