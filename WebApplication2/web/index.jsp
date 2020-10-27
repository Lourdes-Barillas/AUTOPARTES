<%-- 
    Document   : index
    Created on : 19/10/2020, 16:59:06
    Author 
: deleo
--%>
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
                    <a href="#">Ordenes</a>
                </nav>
            </div>
        </header>
        <%--scroll productos --%>
        
     
    <main class="section contenedor">
        <h2 class= "fw-300 centrar-texto">Productos en venta</h2>
        <%
            String prod_Id = "", prod_Nombre = "", prod_Costo = "", prod_Existencia = "";
            List<Producto> productos = new ArrayList<Producto>();
            Producto producto = null;
            try {
                String traerDatos = "SELECT * FROM PUBLIC.";
                GlobalVariables globalvariables = new GlobalVariables();
                Connection miConexion = DriverManager.getConnection(globalvariables.db,globalvariables.user, globalvariables.password);
                Statement st = miConexion.createStatement();
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
                    productos.add(producto);
                }
                result.close();
                st.close();
                JOptionPane.showMessageDialog(null, "Conexión correcta");
            } catch (Exception e) {
                System.out.println(e);
            }
            
          for(Producto p: productos){
        %>
        <div class="contenedor-anuncios">
            <div class = "anuncio">
                <img src="img/anuncio1.jpg" alt="Anuncio en casa del lago">
                <div class="contenido-anuncio">
                    <h3>producto</h3>
                    <p>casa con alberca acabados de lujo a un 
                        en la ciudad, excelente oportunidad
                    </p>
                    <p class="precio">$200000000</p>

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

            <div class = "anuncio">
                <img src="img/anuncio2.jpg" alt="Anuncio en casa con alberca">
                <div class="contenido-anuncio">
                    <h3>Casa con alberca</h3>
                    <p>casa con alberca y acabados de lujo en la ciudad, excelente oportunidad
                    </p>
                    <p class="precio">$300000000</p>
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

            <div class = "anuncio">
                <img src="img/anuncio3.jpg" alt="Anuncio de casa de lujo">
                <div class="contenido-anuncio">
                    <h3>Casa de lujo en el lago</h3>
                    <p>casa en el lago con excelente vista, acabados de lujo a un 
                        excelente precio
                    </p>
                    <p class="precio">$300000000</p>

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
                    <br>
                </div><!-- Contenido anuncio -->
            </div><!-- Anuncio -->


            <div class = "anuncio">
                <img src="img/anuncio4.jpg" alt="Anuncio de casa de lujo">
                <div class="contenido-anuncio">
                    <h3>Casa fuera de la ciudad</h3>
                    <p>casa con alberca y acabados de lujo,
                        excelente oportunidad
                    </p>
                    <p class="precio">$2,000,00000</p>

                    <ul class = "iconos-características">
                        <li>
                            <img src="img/icono_wc.svg" alt="icono wc">
                            <p>2</p>
                        </li>
                        <li>
                            <img src="img/icono_estacionamiento.svg" alt="icono autos">
                            <p>2</p>
                        </li>
                        <li>
                            <img src="img/icono_dormitorio.svg" alt="icono habitación">
                            <p>4</p>
                        </li>
                    </ul>

                    <a href="anuncio.html" class="boton boton-amarillo d-block">Ver propiedad</a>
                    <br>
                </div><!-- Contenido anuncio -->
            </div><!-- Anuncio -->

            <div class = "anuncio">
                <img src="img/anuncio5.jpg" alt="Anuncio de casa de lujo en el bosque">
                <div class="contenido-anuncio">
                    <h3>Casa frente al bosque</h3>
                    <p>casa con alberca frente al bosque, excelente oportunidad
                    </p>
                    <p class="precio">$3,500,000</p>

                    <ul class = "iconos-características">
                        <li>
                            <img src="img/icono_wc.svg" alt="icono wc">
                            <p>2</p>
                        </li>
                        <li>
                            <img src="img/icono_estacionamiento.svg" alt="icono autos">
                            <p>5</p>
                        </li>
                        <li>
                            <img src="img/icono_dormitorio.svg" alt="icono habitación">
                            <p>7</p>
                        </li>
                    </ul>

                    <a href="anuncio.html" class="boton boton-amarillo d-block">Ver propiedad</a>
                    <br>
                </div><!-- Contenido anuncio -->
            </div><!-- Anuncio -->

            <div class = "anuncio">
                <img src="img/anuncio6.jpg" alt="Anuncio de con alberca">
                <div class="contenido-anuncio">
                    <h3>Casa de lujo en el lago</h3>
                    <p>casa en el lago con excelente vista, acabados de lujo a un 
                        excelente precio
                    </p>
                    <p class="precio">$300000000</p>

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
                    <br>
                </div><!-- Contenido anuncio -->
            </div><!-- Anuncio -->
        </div>
         <%    
           }//cierre del for productos
            
        %>  
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
