/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MasterClases.Children;

import MasterClases.Orden;
import MasterClases.Producto;

/**
 *
 * @author Adriana P
 */
public class ItemOrden {
    private static Orden orden = new Orden();//id de la orden
    private int cantidad;
    private double total;
    private Producto producto;
    
    public ItemOrden(int id,int cantidad,int pIdProducto, double total){
        this.producto = new Producto();
        this.orden.setId(id);
        this.cantidad=cantidad;
        this.producto.setIdProducto(pIdProducto);
        this.total = total;
    }
  

    public Producto getProducto() {
        return producto;
    }
    
    

    public double getTotal() {
        return total;
    }

    public int getId() {
        return orden.getId();
    }

    public int getCantidad() {
        return cantidad;
    }
    @Override
    public String toString(){
        return "";
    }
}
