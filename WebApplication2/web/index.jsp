<%-- 
    Document   : index
    Created on : 19/10/2020, 16:59:06
    Author 
: deleo
--%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.awt.Image"%>
<%@page import="javax.imageio.ImageIO"%>
<%@page import="java.awt.image.BufferedImage"%>
<%@page import="java.io.InputStream"%>
<%@page import="javax.swing.ImageIcon"%>
<%@page import="javax.swing.JOptionPane"%>
<%@page import="java.util.List"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="Globalpackage.GlobalVariables"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.util.ArrayList"%>
<%@page import="MasterClases.Producto"%>
<%@page import="CRUD.Read"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" >
        <title>Auto Partes</title>
       
        <script src="https://kit.fontawesome.com/a076d05399.js"></script>
        <link rel="stylesheet" type="text/css" href="styles/app.css">
        <link rel="stylesheet" type="text/css" href="styles/Style.css">
        <link rel="stylesheet" type="text/css" href="styles/app.css">
        
    </head>
    <body>
        <%--header --%>  
        <header>
            <div class="wrapper">
                <div align="center">
                    <img src="IMAGES/ima.png" id="ima" >
                </div>
            <div class="logo">AutoPartes</div> 
                <nav>
                    <a href="inicioSesion.jsp">Ordenes</a>
                </nav>
            </div>
        </header>
        <%--scroll productos --%>
        
     
    <main class="section contenedor">
        <a href="AgregarProducto.jsp" class="boton boton-amarillo d-block">Agregar un producto</a>
        <h2 class= "fw-300 centrar-texto">Productos en venta</h2>
        
        <form action="addOrden.jsp">
            <div class="contenedor-anuncios">
        <%
            String prod_Id = "", prod_Nombre = "", prod_Costo = "", prod_Existencia = "",name;
            Producto producto = null;
            try {
                String traerDatos = "SELECT * FROM PUBLIC.";
                GlobalVariables globalvariables = new GlobalVariables();
                //JOptionPane.showMessageDialog(null, "Conexión correcta");
                Connection miConexion = null;
                Statement st = null;
                PreparedStatement ps;
                Class.forName("org.postgresql.Driver");
                //JOptionPane.showMessageDialog(null, "Conexión correcta");
                miConexion = DriverManager.getConnection(globalvariables.db,globalvariables.user, globalvariables.password);
                
                st = miConexion.createStatement();
                traerDatos = traerDatos + "\"Productos\" ORDER BY \"Prod_Id\" ASC;";
                ResultSet result = st.executeQuery(traerDatos);
                int i = 0;
                while(result.next()){
                    i++;
                    prod_Id = result.getString("Prod_Id");
                    prod_Nombre = result.getString("Prod_Nombre");
                    prod_Costo = result.getString("Prod_Costo");
                    prod_Existencia = result.getString("Prod_Existencia");
                    //--------------------------------------------------------------
                    producto = new Producto(Integer.parseInt(prod_Id), prod_Nombre, Double.parseDouble(prod_Costo));
                    producto.setCantidad(Integer.parseInt(prod_Existencia));
                    //--------------------------------------------------------------
                    
        %>
        
        
            <div class = "anuncio"  align="center">
                <img class="tamanioprod" src="IMAGES/productos/producto<%=+i%>.jpg" alt="Anuncio de producto">
                <div class="contenido-anuncio">
                    <h3><%=producto.getProducto() %></h3>
                    <p>producto de calidad. 
                        
                    </p>
                    <p class="precio">Q. <%=Double.parseDouble(prod_Costo) %></p>
                    <%--<button class="boton boton-amarillo d-block" type="submit">agregar </button>  --%>
                    <div class="contenido-anuncio">
                            <a href="addOrden.jsp?Prod_Nombre=<%=producto.getProducto()%>" class="boton boton-amarillo d-block">Comprar</a>

                    </div>                </div><!-- Contenido anuncio -->
            </div><!-- Anuncio -->
            
         <%  
                }//while
                result.close();
                st.close();
                //JOptionPane.showMessageDialog(null, "Conexión correcta");
            } catch (Exception e) {
                System.out.println(e);
            }
            
        %> 
            </div>
        </form>
        
    </main>
          
        <%-- pie de pagina--%> 
        <footer class="site-footer seccion">
            <div class="contenedor contenedor-footer">
                <nav class="navegacion">
                    <a href="inicioSesion.jsp">Ordenes</a>
                    
                </nav>
                <p class="copyright">Todos los derechos reservados 2019 &copy;</p>
                <p class="copyright">Lourdes Pérez y Esaú de León</p>
            </div>
        </footer>
    
        <%-- --%>
    </body>
</html>
