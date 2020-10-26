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
public class Cliente {
    protected TipoUsuario tipoCliente;
    protected int id;
    protected int idUsuario;

    public void setId(int id) {
        this.id = id;
    }
    public int getIdCliente(){
        return id;
    }
    //public String getDato(){ return dato;}

    public Cliente(int idDeUsuario, TipoUsuario cliente){
        this.tipoCliente = cliente;
        this.idUsuario = idDeUsuario;
    }
    public Cliente(){
        //Todos los parámetros
    }

    public String getNombreClase(){
        String clase = this.tipoCliente.toString();
        return clase;
    }
    public TipoUsuario getTipoCliente(){
        return this.tipoCliente;
    }

    public int getIdDeUsuario() {
        return this.idUsuario;
    }
    
    
    public void setTipoUsuario(TipoUsuario tipoCliente) {
        this.tipoCliente = tipoCliente;
    }
    
    @Override
    public String toString(){
        return tipoCliente.toString();
    }
}
