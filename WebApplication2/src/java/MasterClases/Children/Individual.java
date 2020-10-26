/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MasterClases.Children;

import MasterClases.Cliente;
import MasterClases.TipoUsuario;

/**
 *
 * @author Adriana P
 */
public class Individual extends Cliente{
    private String dpi;

    /**
     * El id es el general, ya que el id del cliente individual se inserta automáticamente
     * @param dpi
     * @param id 
     */
    public Individual(String dpi, int id){
        this.dpi = dpi;
        this.id = id;
    }
    public  Individual(Cliente cliente, String dpi){
        this.dpi = dpi;
        this.id = cliente.getIdCliente();
    }
    public  Individual(Cliente cliente){
        this.id = cliente.getIdCliente();
    }

    public Individual(){
        this.dpi="";
        this.id=0;
        this.idUsuario=0;
        this.tipoCliente=TipoUsuario.Cliente_Individual;
    }
    public String getDpi() {
        return dpi;
    }

    @Override
    public String toString() {
        return "Individual{" +
                "dpi='" + dpi + '\'' +
                ", id=" + id +
                '}';
    }

}
