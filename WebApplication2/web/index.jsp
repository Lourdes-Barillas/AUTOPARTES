<%-- 
    Document   : index
    Created on : 19/10/2020, 16:59:06
    Author 
: deleo
--%>
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
            <%//codigo java
                //Producto p = new Producto();
                //array con los datos de producto
                String linkImg="https://www.inglestotal.com/wp-content/uploads/2011/02/vocabulario-carro-ingles.jpg";
                String producto="agua", marca="mojada";
                //cilco for hasta la longitud del arreglo obtenido de la base de datos
                for(int i=0;i<5;i++){%>
                <TABLE border="1" id="tablaC" class="tablWrapper">
                    <TR>
                        <TD>
                            <div class="divp">
                                <img class="imP" src="<%=linkImg%>"/>
                            </div>
                        </TD> 
                    </TR>
                    <tr>    
                        <TD>
                            <div class="divs">
                                <h1>  Producto#<%=i%></h1>
                                <h2>  marca</h2><br>
                                <label  for="lcan">cantidad:</label>
                                <input type="text" id="cantidad" name="cantidad"/><br><br>
                                <center><button type="submit" id="ButtonCompra">Comprar</button></center>
                            </div>   
                        </TD>
                    </tr>
                </TABLE>
                <br>
            <%}%>

            <br><br><br><br><br><br><br><br>
            
            
            
            
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
