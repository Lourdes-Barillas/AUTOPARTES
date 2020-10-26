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
public class Empresarial extends Cliente{
    private String contacto;

    public Empresarial(String contacto, int id){
        this.contacto = contacto;
        this.id = id;
    }

    @Override
    public int getIdCliente() {
        return super.getIdCliente();
    }

    public String getContacto() {
        return contacto;
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "contacto='" + contacto + '\'' +
                ", id=" + id +
                '}';
    }

    public Empresarial(Cliente cliente, String contacto){
        this.contacto = contacto;
        this.id = cliente.getIdCliente();
    }

    public Empresarial(){
        this.contacto="";
        this.id=0;
        this.idUsuario=0;
        this.tipoCliente=TipoUsuario.Cliente_Empresarial;
    }


    public  Empresarial(Cliente cliente){
        this.id = cliente.getIdCliente();
    }
}
