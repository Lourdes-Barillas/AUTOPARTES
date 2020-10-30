<%-- 
    Document   : inicioSesion
    Created on : 27/10/2020, 09:38:36 PM
    Author     : Adriana P
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="Globalpackage.GlobalVariables"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
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
        
        <div class="orden contenedor listado centrado" align="center">
            <h1 class="texto-centrado">Iniciar sesión</h1>
                <form class="orden form-alineado" action="menuadmin.jsp" >
                    <div class="form-group row">
                      <label for="inputEmail3" class="col-sm-2 col-form-label texto-alineado">Usuario</label>
                      <div class="col-sm-10">
                        <input type="text" name="usuario" class="form-control" id="inputEmail3">
                      </div>
                    </div>
                    <div class="form-group row">
                      <label for="inputPassword3" class="col-sm-2 col-form-label">Contraseña</label>
                      <div class="col-sm-10">
                        <input type="password" name="contrasenia" class="form-control" id="inputPassword3">
                      </div>
                    </div>
                    <a href="registrarse.jsp">¿No tienes una cuenta?</a>
                    <div class="form-group row boton-iniciar" align="center">
                      <div class="col-sm-10" align="center">
                        <button type="submit" name="enviar" class="btn btn-primary">Ingresar</button>
                      </div>
                    </div>
                </form>
            
          </div>
        
        <%
            if(request.getParameter("enviar")!=null){
                System.out.println("boton presionado");
                String usuario = request.getParameter("usuario");
                String contrasenia = request.getParameter("contrasenia");
                String consulta = "SELECT * FROM PUBLIC.\"Usuarios\"";/* WHERE \"Usuario_Contrasenia\" = " + contrasenia +
                                  " AND \"Usuario_Nombre\" = " + usuario + ";";*/
                try {
                    Connection con = null;
                    Statement statement = null;
                    Class.forName("org.postgresql.Driver");
                    GlobalVariables globalv = new GlobalVariables();
                    con = DriverManager.getConnection(globalv.db, globalv.user, globalv.password);
                    statement = con.createStatement();
                    ResultSet result = statement.executeQuery(consulta);
                    while(result.next()){
                        if(result.getString("Usuario_Nombre").equals(usuario) 
                                && result.getString("Usuario_Contrasenia").equals(contrasenia)){
                            %>
                            <h5>usuario encontrado</h5>
                            <%
                        }else{
                            %>
                            <h5>usuario no encontrado</h5>
                            <%
}
                    }
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        %>
        
    </body>
    
    
</html>
