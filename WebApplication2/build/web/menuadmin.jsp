<%-- 
    Document   : menuadmin
    Created on : 29/10/2020, 03:09:51 PM
    Author     : Adriana P
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
        <link href='http://fonts.googleapis.com/css?family=Lato&subset=latin,latin-ext' rel='stylesheet' type='text/css'>
        <link rel="stylesheet" href="styles/app.css">
        <title>JSP Page</title>
    </head>
    <body>
        
    <header class="site-header inicio">
        <div class="contenedor contenido-header">

            <div class="barra">
                <a href="index.html">
                    <img class="fondoLogo" src="IMAGES/ima.png" alt="Logotipo de Bienes raices">
                </a>
                <nav class="navegacion">
                    <a href="index.jsp">Inicio</a>
                    <a href="listaOrdenes.jsp">Ordenes</a>
                    <a href="blog.html">Productos</a>
                    <a href="contacto.html">Clientes</a>
                </nav>
            </div> 
            

            <h1>Organización AutoPartes</h1>
        
        </div><!--Cierre del contenedor-->
    </header>

    <main class="section contenedor">
        <h2 class= "fw-300 centrar-texto">Administración</h2>

        <div class="contenedor-anuncios">
            <div class = "anuncio2">
                <img src="IMAGES/Productos.jpg" alt="imagenProducto">
                <div class="contenido-anuncio">
                    <a href="Productos.jsp" class="boton boton-amarillo d-block">Ver reporte</a>
                </div>
            </div>

            <div class = "anuncio2">
                <img src="IMAGES/Usuarios.jpg" alt="imagenUsuarios">
                <div class="contenido-anuncio">
                    <a href="Usuarios.jsp" class="boton boton-amarillo d-block">Ver reporte</a>
                </div>
            </div>
        </div>
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
