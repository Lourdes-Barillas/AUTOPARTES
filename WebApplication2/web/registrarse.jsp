<%-- 
    Document   : registrarse
    Created on : 28/10/2020, 04:52:15 PM
    Author     : Adriana P
--%>

<%@page import="MasterClases.Children.Empresarial"%>
<%@page import="MasterClases.Children.Individual"%>
<%@page import="MasterClases.TipoUsuario"%>
<%@page import="MasterClases.Cliente"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="Globalpackage.GlobalVariables"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.Statement"%>
<%@page import="CRUD.Create"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="styles/Style.css">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
        <title>JSP Page</title>
    </head>
    <body>
        <main class="contenedor">
            <form action="registrarse.jsp">
                <div class="form-row">
                  <div class="form-group col-md-6">
                    <label for="inputEmail4">Usuario</label>
                    <input type="text" class="form-control" placeholder="Empieza con @" name="textUsuario" id="inputEmail4">
                  </div>
                  <div class="form-group col-md-6">
                    <label for="inputPassword4">Contraseña</label>
                    <input type="password" class="form-control" name="textContrasenia" id="inputPassword4">
                  </div>
                </div>
                <%--Checkboxes--%>
                <div class="form-group">
                  <div class="form-check">
                    <input class="form-check-input" name="checkboxAdmin" type="checkbox" id="gridCheck">
                    <label class="form-check-label" for="gridCheck">
                      Administrador
                    </label>
                  </div>
                  <div class="form-check">
                    <input class="form-check-input" name="checkboxPersona" type="checkbox" id="gridCheck">
                    <label class="form-check-label" for="gridCheck">
                      Persona como cliente
                    </label>
                  </div>
                  <div class="form-check">
                    <input class="form-check-input" name="checkboxEmpresa" type="checkbox" id="gridCheck">
                    <label class="form-check-label" for="gridCheck">
                      Empresa
                    </label>
                  </div><div class="form-group col-md-6">
                    <label for="inputEmail4">Dpi o Contacto</label>
                    <input type="text" class="form-control" name="textContD" placeholder="Si eres una empresa, escribe tu e-mail, sino tu DPI" id="inputEmail4">
                  </div>
                </div>
                <%--Checkboxes--%>
                <%
                int idcliente =0;
                Create create = new Create();
                try{
                    String usuario = null, contrasenia = null;
                    Cliente cliente;
                    if(request.getParameter("checkboxAdmin")!=null){
                        usuario = request.getParameter("textUsuario");
                        contrasenia = request.getParameter("textContrasenia");
                        create.insertUsuario(usuario, contrasenia);
                        %>
                        <h3>obtenido el checkbox <%=usuario %> </h3>
                        <%
                    }//if checkboxadmin
                        if(request.getParameter("checkboxPersona")!=null){
                            String idusuario = null;
                            usuario = request.getParameter("textUsuario");
                            contrasenia = request.getParameter("textContrasenia");
                            create.insertUsuario(usuario, contrasenia);
                            String id = null;
                            GlobalVariables globalvariables = new GlobalVariables();
                            Connection miConexion = globalvariables.connection();

                            Class.forName("org.postgresql.Driver");

                            Statement st = miConexion.createStatement();
                            String traerDatos = "SELECT * FROM PUBLIC.\"Usuarios\";", contacto=null;
                            ResultSet result = st.executeQuery(traerDatos);
                            int i = 0;
                            while(result.next()){
                                i++;
                                if( (result.getString("Usuario_Nombre")).equalsIgnoreCase(usuario)){
                                    idusuario = result.getString("Usuario_Id");
                                    cliente = new Cliente(Integer.parseInt(idusuario), TipoUsuario.Cliente_Individual);
                                    create.insertCliente(cliente, null, request.getParameter("textContD"));
                                }//fin if
                            }//fin while
                    }//fin if
                    String idusuario = null;
                    if(request.getParameter("checkboxEmpresa")!=null){
                            usuario = request.getParameter("textUsuario");
                            contrasenia = request.getParameter("textContrasenia");
                            create.insertUsuario(usuario, contrasenia);
                            String id = null;
                            GlobalVariables globalvariables = new GlobalVariables();
                            Connection miConexion = globalvariables.connection();

                            Class.forName("org.postgresql.Driver");

                            Statement st = miConexion.createStatement();
                            String traerDatos = "SELECT * FROM PUBLIC.\"Usuarios\";", contacto=null;
                            ResultSet result = st.executeQuery(traerDatos);
                            int i = 0;
                            while(result.next()){
                                i++;
                                if( (result.getString("Usuario_Nombre")).equalsIgnoreCase(usuario)){
                                    idusuario = result.getString("Usuario_Id");
                                    cliente = new Cliente(Integer.parseInt(idusuario), TipoUsuario.Cliente_Empresarial);
                                    create.insertCliente(cliente, request.getParameter("textContD"), null);
                                }//fin if
                            }//fin while
                    }//fin if
                }//fintry
                catch(Exception e){

                }//fin catch
                %>
                <button type="submit" class="btn btn-primary">Siguiente...</button>
                <%
                    
                %>
              </form>
        </main>
    </body>
</html>
