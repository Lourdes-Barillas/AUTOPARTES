/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MasterClases;

import Globalpackage.GlobalVariables;
import java.sql.Date;

/**
 *
 * @author Adriana P
 */
public class Orden {
    public static String envioBodega = "Envio a bodega";
    public static String envioDomicilio = "Envio a domicilio";
    
    private int id;
    private Orden orden;
    private static Cliente cliente  = new Cliente();;
    private String fecha;
    private Double precioEnvio;
    private String tipoEnvio;
    private int estado;
    private int diasEnvio;
    
    /**
     * idCliente, Double _precioEnvio, String _tipoEnvio, int _estado, int _dias
     * Orden_ClienteId, Orden_PrecioDeEnvio, Orden_TipoEnvio, Orden_Estado, Orden_DiasEnvio
     * @param _idCliente
     * @param _precioEnvio
     * @param _tipoEnvio
     * @param _estado
     * @param _dias 
     */
    public Orden(int _idCliente, Double _precioEnvio, String _tipoEnvio, int _estado, int _dias){
        this.cliente.setId(_idCliente);
        this.precioEnvio = _precioEnvio;
        this.tipoEnvio = _tipoEnvio;
        this.estado = _estado;
        this.diasEnvio = _dias;
        //fecha = new java.sql.Date(id, id, id)
    }
    public Orden(){
        
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
    
    public int getIdCliente() {
        return this.cliente.getIdCliente();
    }

    public String getFecha() {
        return this.fecha = GlobalVariables.fecha;
    }

    public double getPrecioDeEnvio() {
        return this.precioEnvio;
    }

    public String getTipoEnvio() {
        return this.tipoEnvio;
    }

    public int getEstado() {
        return this.estado;
    }

    public int getdiasEnvio() {
        return this.diasEnvio;
    }

    @Override
    public String toString() {
        return this.fecha + " " + this.tipoEnvio + " " + this.diasEnvio + " " + this.estado + " id:" + this.id + " " + this.precioEnvio; //To change body of generated methods, choose Tools | Templates.
    }

}
