<%-- 
    Document   : Usuarios
    Created on : 29/10/2020, 04:37:15 PM
    Author     : Adriana P
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="Globalpackage.GlobalVariables"%>
<%@page import="MasterClases.Cliente"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="styles/Style.css">
        <link rel="stylesheet" href="styles/app.css">
        <link href='http://fonts.googleapis.com/css?family=Lato&subset=latin,latin-ext' rel='stylesheet' type='text/css'>
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
        <title>JSP Page</title>
    </head>
    <body>
        <main class="listado orden">
        <ul class=" list-unstyled contenedor section">
        <%
            String traerDatos = "SELECT * FROM PUBLIC.\"Clientes\";";
            String usuarioId, tipocliente;
            Cliente cliente = null;
            GlobalVariables globalvariables = new GlobalVariables();
            
            try{
                Connection miConexion = null;
                Statement st = null;
                Class.forName("org.postgresql.Driver");
                miConexion = DriverManager.getConnection(globalvariables.db, globalvariables.user, globalvariables.password);

                st =  miConexion.createStatement();
                ResultSet result = st.executeQuery(traerDatos);
                int i = 0;
                while(result.next()){
                    i++;
                    usuarioId = result.getString("Cliente_UsuarioId");
                    tipocliente = result.getString("Cliente_TipoCliente");
                    %>
                    <li class="media orden">
                      <img src="IMAGES/usuarios/usuario<%=+i%>.jpg" class="mr-3" alt="...">
                      <div class="media-body">
                          <h5 class="mt-0 mb-1"><%=usuarioId%></h5>
                          <h5 class="mt-0 "><%=tipocliente %></h5>
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
