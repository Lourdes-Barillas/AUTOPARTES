<%-- 
    Document   : index
    Created on : 19/10/2020, 16:59:06
    Author 
: deleo
--%>
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
        <link rel="stylesheet" type="text/css" href="styles/Style.css">
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
                    
                    <a href="#">Carrito</a>
                    <a href="inicioSesion.jsp">Ordenes</a>
                </nav>
            </div>
        </header>
        <%--scroll productos --%>
        
     
    <main class="section contenedor">
        <h2 class= "fw-300 centrar-texto">Productos en venta</h2>
        <div class="contenedor-anuncios">
        <%
            String prod_Id = "", prod_Nombre = "", prod_Costo = "", prod_Existencia = "";
            Producto producto = null;
            try {
                String traerDatos = "SELECT * FROM PUBLIC.";
                GlobalVariables globalvariables = new GlobalVariables();
                //JOptionPane.showMessageDialog(null, "Conexión correcta");
                Connection miConexion = null;
                Statement st = null;
                
                Class.forName("org.postgresql.Driver");
                //JOptionPane.showMessageDialog(null, "Conexión correcta");
                miConexion = DriverManager.getConnection(globalvariables.db,globalvariables.user, globalvariables.password);
                
                st = miConexion.createStatement();
                traerDatos = traerDatos + "\"Productos\";";
                ResultSet result = st.executeQuery(traerDatos);
                while(result.next()){
                    prod_Id = result.getString("Prod_Id");
                    prod_Nombre = result.getString("Prod_Nombre");
                    prod_Costo = result.getString("Prod_Costo");
                    prod_Existencia = result.getString("Prod_Existencia");
                    //--------------------------------------------------------------
                    producto = new Producto(Integer.parseInt(prod_Id), prod_Nombre, Double.parseDouble(prod_Costo));
                    producto.setCantidad(Integer.parseInt(prod_Existencia));
                    //--------------------------------------------------------------
                    //productos.add(producto);
                    ImageIcon image = null;
                    InputStream input;
                    Image img = null;
                    try {
                            input = result.getBinaryStream(5);
                            BufferedImage bi = ImageIO.read(input);
                            image = new ImageIcon(bi);
                            img = image.getImage();
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                    
        %>
        
        
            <div class = "anuncio">
                <img src="IMAGES/Llanta.jpg" alt="Anuncio en casa del lago">
                <div class="contenido-anuncio">
                    <h3><%=producto.getProducto() %></h3>
                    <p>producto de calidad
                    </p>
                    <p class="precio"><%=producto.getPrecio()+"" %></p>

                    <ul class = "iconos-características">
                        <li>
                            <img src="img/icono_wc.svg" alt="icono wc">
                            <p>3</p>
                        </li>
                        <li>
                            <img src="img/icono_estacionamiento.svg" alt="icono autos">
                            <p>3</p>
                        </li>
                        <li>
                            <img src="img/icono_dormitorio.svg" alt="icono habitación">
                            <p>4</p>
                        </li>
                    </ul>


                    <a href="anuncio.html" class="boton boton-amarillo d-block">Ver propiedad</a>
                </div><!-- Contenido anuncio -->
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
    </main>
          
        <%-- pie de pagina--%> 
        <footer>
            <div class="main_content">
                <div class="left box">
                    <h2> about us</h2>
                    <div class="content">
                        <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mauris nec quam in nisl maximus ultrices. Ut congue pretium odio rutrum malesuada. Etiam nibh ipsum, condimentum et cursus ut, malesuada eget ligula. Nunc ut laoreet arcu, quis posuere erat. Phasellus commodo tincidunt velit non tempus.</p>
                        
                    </div>
               </div> 
                <div class="center box">
                    <h2>Contact us</h2>
                    <div class="phone">
                        <span class="fas fa-phone-alt"></span>
                        <span class="text">+502 5646 5653</span>
                    </div>
                        <div class="mail">
                        <span class="fas fa-envelope"></span>
                        <span class="text">sdeleonc7@miumg.edu.gt</span>
                    </div>
                    <div class="mail">
                        <span class="fas fa-envelope"></span>
                        <span class="text">sdeleonc7@miumg.edu.gt</span>
                    </div>
                    <div class="social">
                            <a href="#"><span class="fab fa-facebook-f"></span></a>
                            <a href="#"><span class="fab fa-twitter"></span></a>
                            <a href="#"><span class="fab fa-instagram"></span></a>
                            <a href="#"><span class="fab fa-youtube"></span></a>
                        </div>
                </div>
                
            </div>
        </footer>
        <%-- --%>
    </body>
</html>
