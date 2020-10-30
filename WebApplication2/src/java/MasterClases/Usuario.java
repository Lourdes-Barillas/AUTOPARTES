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
public class Usuario {
    private int idUser;
    private String nombre;
    private String password;
    //public Usuario(String IdUsuarios, String Usuario_Nombre, String Usuario_Contrasenia){
    //    this.
  //  }

    public Usuario(int IdUsuarios, String Usuario_Nombre, String Usuario_Contrasenia) {
        this.idUser = IdUsuarios;
        this.nombre = Usuario_Nombre;
        this.password = Usuario_Contrasenia;
    }

    public int getIdUsuarios() {
        return idUser;
    }

    public void setIdUsuarios(int IdUsuarios) {
        this.idUser = IdUsuarios;
    }

    public String getUsuario_Nombre() {
        return nombre;
    }

    public void setUsuario_Nombre(String Usuario_Nombre) {
        this.nombre = Usuario_Nombre;
    }

    public String getUsuario_Contrasenia() {
        return password;
    }

    public void setUsuario_Contrasenia(String Usuario_Contrasenia) {
        this.password = Usuario_Contrasenia;
    }
    
}

