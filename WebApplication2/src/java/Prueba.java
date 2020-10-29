
import CRUD.Create;
import CRUD.Read;
import Globalpackage.GlobalVariables;
import MasterClases.Children.Empresarial;
import MasterClases.Children.Individual;
import MasterClases.Children.ItemOrden;
import MasterClases.Cliente;
import MasterClases.Orden;
import MasterClases.Producto;
import MasterClases.TipoUsuario;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Adriana P
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Prueba main = new Prueba();
        //main.insertCliente(2, TipoUsuario.Cliente_Individual);
        //main.insertUsuario("@Esau");
        //main.insertClienteInd("33587825654124", 1);
        //main.insertClienteEmpresarial("vorgas@yahoo.com", 3);
        //GlobalVariables gg = new GlobalVariables();
        //System.out.println(gg.fecha);
        //main.insertOrden();
        //main.insertItemOrden();
        Read read = new Read();
        System.out.println(read.readProductos());
    }
    public List<Producto> productos(){
         Read read = new Read();
        System.out.println(read.readProductos());
        return read.readProductos();
    }
    
    /**
     * Este procedimiento sirve de prueba para insertar los productos con 
     * su nombre y su precio
     * @param productoNombre
     * @param precio 
     */
    public void insertProd(String productoNombre, Double precio){
        Producto producto = new Producto(productoNombre, precio);
        Create create = new Create();
        create.insertProducto(producto, 80);
    }
    
    /**
     * Este procedimiento sirve de prueba para insertar los productos con 
     * su nombre y su precio
     * @param productoNombre
     * @param precio 
     */
    public void insertCliente(int idUsuario, TipoUsuario tipocliente){
        Cliente cliente = new Cliente(idUsuario, tipocliente);
        Create create = new Create();
        create.insertCliente(cliente);
    }
    
    public void insertUsuario(String nombre){
        Create create = new Create();
        //create.insertUsuario(nombre);
    }
    
    public void insertClienteInd(String dpi, int idCliente){
        Individual cliente = new Individual(dpi, idCliente);
        Create create = new Create();
        create.insertClienteIndividual(cliente);
    }
    
    public void insertClienteEmpresarial(String contacto, int idCliente){
        Empresarial cliente = new Empresarial(contacto, idCliente);
        Create create = new Create();
        create.insertClienteEmpresarial(cliente);
    }
    
    public void insertOrden(){
        int _idCliente; Double _precioEnvio; String _tipoEnvio; int _estado; int _dias;
        _idCliente =1;
        _precioEnvio=2.30;
        _tipoEnvio= Orden.envioBodega;
        _estado = 1;
        _dias=2;
        Orden orden = new Orden(_idCliente, _precioEnvio, _tipoEnvio, _estado, _dias);
        Create create = new Create();
        create.insertOrden(orden);
    }
    
    public void insertItemOrden(){
        int id=3;int cantidad=2;int pIdProducto=1; double total=20.3;
        ItemOrden itemorden = new ItemOrden(id, cantidad, pIdProducto, total);
        Create create = new Create();
        create.insertItem(itemorden);
    }
}
