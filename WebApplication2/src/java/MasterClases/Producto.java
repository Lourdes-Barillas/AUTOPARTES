/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MasterClases;

/**
 *
 * @author Adriana P
 */
public class Producto {
    private int idProducto;
    private String producto;
    private Double precio;
    private int cantidad;
    public Producto(){
      //se inicializa el sigId aquí
        //getIdProducto
        this.producto = "";
        this.precio = 0.00;
    }
    
    public Producto(int idProducto, String producto, Double precio){
        //todos los parámetros
        this.idProducto = idProducto;
        this.producto = producto;
        this.precio = precio;
    }
    
    public Producto(String producto, Double precio){
        //todos los parámetros
        this.idProducto = idProducto;
        this.producto = producto;
        this.precio = precio;
    }
    

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    public int getIdProducto() {
        return idProducto;
    }
    
    

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getProducto() {
        return producto;
    }


    public Double getPrecio(){
        return this.precio;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }
    
    public String toString(){ return "["+getNombreClase()+"]id="+idProducto+", producto="+producto+", precio="+precio; }

    public String getNombreClase(){ return this.getClass().getSimpleName(); }
    
}
