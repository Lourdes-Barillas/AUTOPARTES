<%-- 
    Document   : listaUsuarios
    Created on : 27/10/2020, 05:12:50 PM
    Author     : Adriana P
--%>

<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="Globalpackage.GlobalVariables"%>
<%@page import="java.sql.Connection"%>
<%@page import="MasterClases.Orden"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="styles/app.css">
        <link rel="stylesheet" type="text/css" href="styles/Style.css">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
        
        <title>JSP Page</title>
    </head>
    
    
    <body>
        <main class="listado orden">
        <ul class=" list-unstyled contenedor section">
        <%
        String traerDatos = "SELECT * FROM PUBLIC.";
        GlobalVariables globalvariables = new GlobalVariables();
        String Orden_Id, Orden_ClienteId = null;
        String Orden_Fecha, Orden_PrecioDeEnvio = null;
        String Orden_TipoEnvio = null, Orden_Estado = null, Orden_DiasEnvio = null;
        Orden orden = null;
        try{
            Connection miConexion = null;
            Statement st = null;
            Class.forName("org.postgresql.Driver");
            miConexion = DriverManager.getConnection(globalvariables.db, globalvariables.user, globalvariables.password);
            
            st =  miConexion.createStatement();
            traerDatos = traerDatos + "\"Orden\";";
            ResultSet result = st.executeQuery(traerDatos);
            while(result.next()){
                Orden_Id = result.getString("Orden_Id");
                Orden_ClienteId = result.getString("Orden_ClienteId");
                Orden_Fecha = result.getString("Orden_Fecha");
                Orden_PrecioDeEnvio = result.getString("Orden_PrecioDeEnvio");
                Orden_TipoEnvio = result.getString("Orden_TipoEnvio");
                Orden_Estado = result.getString("Orden_Estado");
                Orden_DiasEnvio = result.getString("Orden_DiasEnvio");
                //--------------------------------------------------------------
                orden = new Orden(Integer.parseInt(Orden_ClienteId), 
                                    Double.parseDouble(Orden_PrecioDeEnvio), 
                                    Orden_TipoEnvio, 
                                    Integer.parseInt(Orden_Estado), 
                                    Integer.parseInt(Orden_DiasEnvio));
                orden.setFecha(Orden_Fecha);
                orden.setId(Integer.parseInt(Orden_Id));
            %>
            <li class="media orden">
              <img src="IMAGES/Aros.jpg" class="mr-3" alt="...">
              <div class="media-body">
                  <h5 class="mt-0 mb-1"><%=orden.getIdCliente() %></h5>
                  <h5 class="mt-0 "><%=orden.getTipoEnvio() %></h5>
                Cras sit amet nibh libero, in gravida nulla. Nulla vel metus scelerisque ante sollicitudin. Cras purus odio, vestibulum in vulputate at, tempus viverra turpis. Fusce condimentum nunc ac nisi vulputate fringilla. Donec lacinia congue felis in faucibus.
              </div>
            </li>
            <%
                }
                result.close();
                st.close();
            }catch(Exception e){
                System.out.println(e.getCause());
            }
            %>
          </ul>
        </main>
          
        <footer class="site-footer seccion">
            <div class="contenedor contenedor-footer">
                <nav class="navegacion">
                    <a href="anuncios.html">Anuncios</a>
                    <a href="blog.html">Blog</a>
                    <a href="contacto.html">Contacto</a>
                </nav>
                <p class="copyright">Todos los derechos reservados 2019 &copy;</p>
            </div>
        </footer>
    </body>
</html>
