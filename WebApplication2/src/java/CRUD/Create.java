/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CRUD;

import Globalpackage.GlobalVariables;
import MasterClases.*;
import MasterClases.Children.Empresarial;
import MasterClases.Children.Individual;
import MasterClases.Children.ItemOrden;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *Esta clase tiene la propiedad de insertar registros. Se llama create en honor del 
 * acrónimo CRUD, Create, Read, Update, Delete
 * @author Adriana P
 */
public class Create {
    private int insertado;
    private String insert = "INSERT INTO ";
    private String values = " VALUES(?,?);";
    GlobalVariables globalvariables = new GlobalVariables();
    
    /**
     * Procedimiento de insertar en Productos. El orden de insersión es
     * Prod_Id, Prod_Nombre, Prod_Costo, es decir: smallint, character varying, double presicion
     * @param producto
     * 
     * RECORDAR QUE INSERTA SÓLO "Prod_Nombre y Prod_Costo", YA QUE Prod_Id ES AUTOINCREMENT
     */
    public void insertProducto(Producto producto,int cantidad) {
        values = " VALUES(?,?,?);";
        String consulta = insert + "public.\"Productos\" (\"Prod_Nombre\", \"Prod_Costo\", \"Prod_Existencia\") " + values;
        //la consulta será INSERT INTO PRODUCTOS VALUES('PROD_NOMBRE', 'PROD_PRECIO');
        try {
            //1. Crear la conexión
            Connection miConexion = DriverManager.getConnection(globalvariables.db, globalvariables.user, globalvariables.password);
            Class.forName("org.postgresql.Driver");
            PreparedStatement miStatement = miConexion.prepareStatement(consulta);
            miStatement.setString(1, producto.getProducto());
            miStatement.setDouble(2, producto.getPrecio());
            miStatement.setInt(3, cantidad);
            //Si fue insertado, busquemos el uno
            insertado = miStatement.executeUpdate();
            miStatement.close();
            miConexion.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//fin insertproducto
    
    /**
     * Procedimiento de insertar en Productos. El orden de insersión es
     * Prod_Id, Prod_Nombre, Prod_Costo, es decir: smallint, character varying, double presicion
     * @param cliente
     * RECORDAR QUE INSERTA SÓLO "Prod_Nombre y Prod_Costo", YA QUE Prod_Id ES AUTOINCREMENT
     */
    public void insertCliente(Cliente cliente, String contacto, String dpi) {
        //Insertamos el cliente
        values = (" VALUES(?,?,?,?)");
        String consulta = insert 
                + "public.\"Clientes\" (\"Cliente_UsuarioId\", \"Cliente_TipoCliente\", \"Cliente_Contacto\", \"Cliente_DPI\")" 
                + values;
        //la consulta será INSERT INTO PRODUCTOS VALUES('PROD_NOMBRE', 'PROD_PRECIO');
        try {
            //1. Crear la conexión
            Connection miConexion = globalvariables.connection();
            Class.forName("org.postgresql.Driver");
            PreparedStatement miStatement = miConexion.prepareStatement(consulta);
            miStatement.setInt(1, cliente.getIdDeUsuario());
            miStatement.setString(2, cliente.getTipoCliente().toString());
            miStatement.setString(3, contacto);
            miStatement.setString(4, dpi);
            //Si fue insertado, busquemos el uno
            insertado = miStatement.executeUpdate();
            miConexion.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//fin insertcliente
    /**
     * Inserta un cliente individual detrás de un cliente general
     * @param cliente 
     */
    public void insertClienteIndividual(Individual cliente) {
        //Insertamos el cliente individual
        String consulta = insert 
                + "public.\"ClientesIndividuales\" (\"CI_DPI\", \"CI_ClienteId\")" 
                + values;
        //la consulta será INSERT INTO PRODUCTOS VALUES('PROD_NOMBRE', 'PROD_PRECIO');
        try {
            //1. Crear la conexión
            Connection miConexion = globalvariables.connection();
            Class.forName("org.postgresql.Driver");
            PreparedStatement miStatement = miConexion.prepareStatement(consulta);
            miStatement.setString(1, cliente.getDpi());
            miStatement.setInt(2, cliente.getIdCliente());
            //Si fue insertado, busquemos el uno
            insertado = miStatement.executeUpdate();
            miStatement.close();
            miConexion.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//fin insertclienteindividual
    
    
    /**
     * Inserta un cliente Empresarial detrás de un cliente general
     * @param cliente 
     */
    public void insertClienteEmpresarial(Empresarial cliente) {
        //Insertamos el cliente
        String consulta = insert 
                + " public.\"ClientesEmpresariales\" (\"CE_Contacto\", \"CE_ClienteId\")" 
                + values;
        //la consulta será INSERT INTO PRODUCTOS VALUES('PROD_NOMBRE', 'PROD_PRECIO');
        try {
            //1. Crear la conexión
            Connection miConexion = globalvariables.connection();
            Class.forName("org.postgresql.Driver");
            PreparedStatement miStatement = miConexion.prepareStatement(consulta);
            miStatement.setString(1, cliente.getContacto());
            miStatement.setInt(2, cliente.getIdCliente());
            //Si fue insertado, busquemos el uno
            insertado = miStatement.executeUpdate();
            miStatement.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//fin insertclienteempresarial
    
    
    /**
     * Inserta un usuario antes de ingresar el cliente
     * @param nombre es el nombre de usuario
     */
    public void insertUsuario(String nombre, String contrasenia) {
        values = " VALUES(?,?);";
        //Insertamos el cliente
        String consulta = insert 
                + "public.\"Usuarios\" (\"Usuario_Nombre\", \"Usuario_Contrasenia\")" 
                + values;
        //la consulta será INSERT INTO PRODUCTOS VALUES('PROD_NOMBRE', 'PROD_PRECIO');
        try {
            //1. Crear la conexión
            Connection miConexion = globalvariables.connection();
            Class.forName("org.postgresql.Driver");
            PreparedStatement miStatement = miConexion.prepareStatement(consulta);
            miStatement.setString(1, nombre);
            miStatement.setString(2, contrasenia);
            //Si fue insertado, busquemos el uno
            insertado = miStatement.executeUpdate();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//fin de insertusuario
    
    /**
     * para un nuevo item necesitamos la cantidad, el id del producto, el total y el id de orden.
     * @param item
     */
    public void insertItem(ItemOrden item) {
        values = " VALUES(?,?,?,?);";
        //Insertamos el cliente
        String consulta = insert 
                + "public.\"Item\" (\"Item_Cantidad\",\"Item_ProductoId\",\"Item_Total\", \"Item_OrdenId\")" 
                + values;
        //la consulta será INSERT INTO PRODUCTOS VALUES('PROD_NOMBRE', 'PROD_PRECIO');
        try {
            //1. Crear la conexión
            Connection miConexion = globalvariables.connection();
            Class.forName("org.postgresql.Driver");
            PreparedStatement miStatement = miConexion.prepareStatement(consulta);
            miStatement.setInt(1, item.getCantidad());
            miStatement.setInt(2, item.getProducto().getIdProducto());
            miStatement.setDouble(3, item.getTotal());
            miStatement.setInt(4, item.getId());
            //Si fue insertado, busquemos el uno
            insertado = miStatement.executeUpdate();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    /**
     * 
     * @param item 
     */
    public void insertOrden(Orden orden, String producto) {
        //Insertamos la orden
        
        //la consulta será INSERT INTO PRODUCTOS VALUES
        //(Orden_ClienteId, Orden_Fecha, Orden_PrecioDeEnvio, Orden_TipoEnvio, Orden_Estado, Orden_DiasEnvio);
        try {
            //1. Crear la conexión
            Connection miConexion = globalvariables.connection();
            Class.forName("org.postgresql.Driver");
            Statement miStatement = miConexion.createStatement();
            values = " VALUES ("+orden.getIdCliente()+", ";//1
            values = values + "'"+orden.getTipoEnvio()+"',";//2
            values = values + ""+orden.getEstado()+ ", ";//3
            values = values + ""+orden.getdiasEnvio()+ ", ";//4
            values = values + "'" + orden.getFecha() + "', ";//5
            values = values + "'" + producto + "', ";//6
            values = values + "" + orden.getPrecioDeEnvio() + ");";//7
            String consulta = "INSERT INTO " 
                + "public.\"Orden\" "
                    + "(\"Orden_ClienteId\","//1
                    + "\"Orden_TipoEnvio\", "//2
                    + "\"Orden_Estado\", "//3
                    + "\"Orden_DiasEnvio\", "//4
                    + "\"Orden_Fecha\", "//5
                    + "\"Orden_Producto\", "//6
                    + "\"Orden_PrecioDeEnvio\") " //7
                + values;
            boolean insertado = miStatement.execute(consulta);
        } catch (Exception e) {
            //System.out.println(e.getMessage());
            Logger.getLogger(GlobalVariables.class.getName()).log(Level.SEVERE, null, e);
        }
    }
}
