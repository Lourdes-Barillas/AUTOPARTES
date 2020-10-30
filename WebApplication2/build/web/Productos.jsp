<%-- 
    Document   : Productos.jsp
    Created on : 29/10/2020, 04:08:20 PM
    Author     : Adriana P
--%>

<%@page import="MasterClases.Producto"%>
<%@page import="Globalpackage.GlobalVariables"%>
<%@page import="MasterClases.Orden"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="styles/Style.css">
        <link rel="stylesheet" href="styles/app.css">
        <link href='http://fonts.googleapis.com/css?family=Lato&subset=latin,latin-ext' rel='stylesheet' type='text/css'>
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">

        <title>Lista de productos</title>
    </head>
    <body>
        <main class="listado orden">
        <ul class=" list-unstyled contenedor section">
        <%
            String traerDatos = "SELECT * FROM PUBLIC.";
            String prod_Id = "", prod_Nombre = "", prod_Costo = "", prod_Existencia = "";
            Producto producto = null;
            GlobalVariables globalvariables = new GlobalVariables();
            
            try{
                Connection miConexion = null;
                Statement st = null;
                Class.forName("org.postgresql.Driver");
                miConexion = DriverManager.getConnection(globalvariables.db, globalvariables.user, globalvariables.password);

                st =  miConexion.createStatement();
                traerDatos = traerDatos + "\"Productos\" ORDER BY \"Prod_Id\" ASC;";
                ResultSet result = st.executeQuery(traerDatos);
                int j = 0;
                while(result.next()){
                    j++;
                    prod_Id = result.getString("Prod_Id");
                    prod_Nombre = result.getString("Prod_Nombre");
                    prod_Costo = result.getString("Prod_Costo");
                    prod_Existencia = result.getString("Prod_Existencia");
                    //--------------------------------------------------------------
                    producto = new Producto(Integer.parseInt(prod_Id), prod_Nombre, Double.parseDouble(prod_Costo));
                    producto.setCantidad(Integer.parseInt(prod_Existencia));
                    //--------------------------------------------------------------
                    
                    %>
                    <li class="media orden">
                      <img class="tamañoprod" src="IMAGES/productos/producto<%=+j%>.jpg" class="mr-3" alt="...">
                      <div class="media-body">
                          <h5 class="mt-0 mb-1"><%=producto.getIdProducto()%></h5>
                          <h5 class="mt-0 mb-1"><%=producto.getProducto() %></h5>
                          <h5 class="mt-0 "><%=producto.getCantidad() %></h5>
                          <h5 class="mt-0 "><%=result.getString("Prod_Estado") %></h5>
                        Cras sit amet nibh libero, in gravida nulla. Nulla vel metus scelerisque ante sollicitudin. Cras purus odio, vestibulum in vulputate at, tempus viverra turpis. Fusce condimentum nunc ac nisi vulputate fringilla. Donec lacinia congue felis in faucibus.
                      </div>
                          <%
                              //si es 0 o si es 1
                              if(result.getString("Prod_Estado").equals("1")){
                          %>
                        <div class="contenido-anuncio">
                            <a href="Editar.jsp?Prod_Id=<%=producto.getIdProducto()%>" class="boton boton-amarillo d-block">Dar de baja</a>

                        </div>
                        <div class="contenido-anuncio">
                            <a href="Verproducto.jsp?Prod_Id=<%=producto.getIdProducto()%>" class="boton boton-amarillo d-block">Ver producto</a>
                        </div>
                          <%
                              }else if (result.getString("Prod_Estado").equals("0")){
                          %>
                        <div class="contenido-anuncio">
                            <a href="Dardebaja.jsp?Prod_Id=<%=producto.getIdProducto()%>" class="boton boton-amarillo d-block">Dar de alta</a>

                        </div>
                        <div class="contenido-anuncio">
                            <a href="index.jsp" class="boton boton-amarillo d-block">Ver publicación</a>
                        </div>
                    </li>
                    <%
                        }//fin if
                    %>
                      
                    
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
