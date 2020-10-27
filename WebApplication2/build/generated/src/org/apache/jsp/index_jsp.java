package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.Connection;
import java.util.ArrayList;
import MasterClases.Producto;
import CRUD.Read;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\" >\n");
      out.write("        <title>Auto Partes</title>\n");
      out.write("       \n");
      out.write("        <script src=\"https://kit.fontawesome.com/a076d05399.js\"></script>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"styles/Style.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write("  \n");
      out.write("        <header>\n");
      out.write("            <div class=\"wrapper\">\n");
      out.write("                <div align=\"center\">\n");
      out.write("                    <img src=\"IMAGES/ima.png\" id=\"ima\" >\n");
      out.write("                </div>\n");
      out.write("            <div class=\"logo\">AutoPartes</div> \n");
      out.write("                <nav>\n");
      out.write("                    \n");
      out.write("                    <a href=\"#\">Carrito</a>\n");
      out.write("                    <a href=\"#\">Ordenes</a>\n");
      out.write("                </nav>\n");
      out.write("            </div>\n");
      out.write("        </header>\n");
      out.write("        ");
      out.write("\n");
      out.write("        \n");
      out.write("     \n");
      out.write("    <main class=\"section contenedor\">\n");
      out.write("        <h2 class= \"fw-300 centrar-texto\">Productos en venta</h2>\n");
      out.write("        ");

            try {
                   Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Project3DB", "postgres", "JeSuisFort56");
                   Statement st = con.createStatement();
                   st.execute("SELECT * FROM PUBLIC.\"Productos\""); 
            } catch (Exception e) {
                System.out.println(e);
            }
            
            Read read = new Read();
            read.readProductos();
          
        
      out.write("\n");
      out.write("        <div class=\"contenedor-anuncios\">\n");
      out.write("            <div class = \"anuncio\">\n");
      out.write("                <img src=\"img/anuncio1.jpg\" alt=\"Anuncio en casa del lago\">\n");
      out.write("                <div class=\"contenido-anuncio\">\n");
      out.write("                    <h3>producto</h3>\n");
      out.write("                    <p>casa con alberca acabados de lujo a un \n");
      out.write("                        en la ciudad, excelente oportunidad\n");
      out.write("                    </p>\n");
      out.write("                    <p class=\"precio\">$200000000</p>\n");
      out.write("\n");
      out.write("                    <ul class = \"iconos-características\">\n");
      out.write("                        <li>\n");
      out.write("                            <img src=\"img/icono_wc.svg\" alt=\"icono wc\">\n");
      out.write("                            <p>3</p>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <img src=\"img/icono_estacionamiento.svg\" alt=\"icono autos\">\n");
      out.write("                            <p>3</p>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <img src=\"img/icono_dormitorio.svg\" alt=\"icono habitación\">\n");
      out.write("                            <p>4</p>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <a href=\"anuncio.html\" class=\"boton boton-amarillo d-block\">Ver propiedad</a>\n");
      out.write("                </div><!-- Contenido anuncio -->\n");
      out.write("            </div><!-- Anuncio -->\n");
      out.write("\n");
      out.write("            <div class = \"anuncio\">\n");
      out.write("                <img src=\"img/anuncio2.jpg\" alt=\"Anuncio en casa con alberca\">\n");
      out.write("                <div class=\"contenido-anuncio\">\n");
      out.write("                    <h3>Casa con alberca</h3>\n");
      out.write("                    <p>casa con alberca y acabados de lujo en la ciudad, excelente oportunidad\n");
      out.write("                    </p>\n");
      out.write("                    <p class=\"precio\">$300000000</p>\n");
      out.write("                    <ul class = \"iconos-características\">\n");
      out.write("                        <li>\n");
      out.write("                            <img src=\"img/icono_wc.svg\" alt=\"icono wc\">\n");
      out.write("                            <p>3</p>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <img src=\"img/icono_estacionamiento.svg\" alt=\"icono autos\">\n");
      out.write("                            <p>3</p>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <img src=\"img/icono_dormitorio.svg\" alt=\"icono habitación\">\n");
      out.write("                            <p>4</p>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("\n");
      out.write("                    <a href=\"anuncio.html\" class=\"boton boton-amarillo d-block\">Ver propiedad</a>\n");
      out.write("                </div><!-- Contenido anuncio -->\n");
      out.write("            </div><!-- Anuncio -->\n");
      out.write("\n");
      out.write("            <div class = \"anuncio\">\n");
      out.write("                <img src=\"img/anuncio3.jpg\" alt=\"Anuncio de casa de lujo\">\n");
      out.write("                <div class=\"contenido-anuncio\">\n");
      out.write("                    <h3>Casa de lujo en el lago</h3>\n");
      out.write("                    <p>casa en el lago con excelente vista, acabados de lujo a un \n");
      out.write("                        excelente precio\n");
      out.write("                    </p>\n");
      out.write("                    <p class=\"precio\">$300000000</p>\n");
      out.write("\n");
      out.write("                    <ul class = \"iconos-características\">\n");
      out.write("                        <li>\n");
      out.write("                            <img src=\"img/icono_wc.svg\" alt=\"icono wc\">\n");
      out.write("                            <p>3</p>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <img src=\"img/icono_estacionamiento.svg\" alt=\"icono autos\">\n");
      out.write("                            <p>3</p>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <img src=\"img/icono_dormitorio.svg\" alt=\"icono habitación\">\n");
      out.write("                            <p>4</p>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("\n");
      out.write("                    <a href=\"anuncio.html\" class=\"boton boton-amarillo d-block\">Ver propiedad</a>\n");
      out.write("                    <br>\n");
      out.write("                </div><!-- Contenido anuncio -->\n");
      out.write("            </div><!-- Anuncio -->\n");
      out.write("\n");
      out.write("\n");
      out.write("            <div class = \"anuncio\">\n");
      out.write("                <img src=\"img/anuncio4.jpg\" alt=\"Anuncio de casa de lujo\">\n");
      out.write("                <div class=\"contenido-anuncio\">\n");
      out.write("                    <h3>Casa fuera de la ciudad</h3>\n");
      out.write("                    <p>casa con alberca y acabados de lujo,\n");
      out.write("                        excelente oportunidad\n");
      out.write("                    </p>\n");
      out.write("                    <p class=\"precio\">$2,000,00000</p>\n");
      out.write("\n");
      out.write("                    <ul class = \"iconos-características\">\n");
      out.write("                        <li>\n");
      out.write("                            <img src=\"img/icono_wc.svg\" alt=\"icono wc\">\n");
      out.write("                            <p>2</p>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <img src=\"img/icono_estacionamiento.svg\" alt=\"icono autos\">\n");
      out.write("                            <p>2</p>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <img src=\"img/icono_dormitorio.svg\" alt=\"icono habitación\">\n");
      out.write("                            <p>4</p>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("\n");
      out.write("                    <a href=\"anuncio.html\" class=\"boton boton-amarillo d-block\">Ver propiedad</a>\n");
      out.write("                    <br>\n");
      out.write("                </div><!-- Contenido anuncio -->\n");
      out.write("            </div><!-- Anuncio -->\n");
      out.write("\n");
      out.write("            <div class = \"anuncio\">\n");
      out.write("                <img src=\"img/anuncio5.jpg\" alt=\"Anuncio de casa de lujo en el bosque\">\n");
      out.write("                <div class=\"contenido-anuncio\">\n");
      out.write("                    <h3>Casa frente al bosque</h3>\n");
      out.write("                    <p>casa con alberca frente al bosque, excelente oportunidad\n");
      out.write("                    </p>\n");
      out.write("                    <p class=\"precio\">$3,500,000</p>\n");
      out.write("\n");
      out.write("                    <ul class = \"iconos-características\">\n");
      out.write("                        <li>\n");
      out.write("                            <img src=\"img/icono_wc.svg\" alt=\"icono wc\">\n");
      out.write("                            <p>2</p>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <img src=\"img/icono_estacionamiento.svg\" alt=\"icono autos\">\n");
      out.write("                            <p>5</p>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <img src=\"img/icono_dormitorio.svg\" alt=\"icono habitación\">\n");
      out.write("                            <p>7</p>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("\n");
      out.write("                    <a href=\"anuncio.html\" class=\"boton boton-amarillo d-block\">Ver propiedad</a>\n");
      out.write("                    <br>\n");
      out.write("                </div><!-- Contenido anuncio -->\n");
      out.write("            </div><!-- Anuncio -->\n");
      out.write("\n");
      out.write("            <div class = \"anuncio\">\n");
      out.write("                <img src=\"img/anuncio6.jpg\" alt=\"Anuncio de con alberca\">\n");
      out.write("                <div class=\"contenido-anuncio\">\n");
      out.write("                    <h3>Casa de lujo en el lago</h3>\n");
      out.write("                    <p>casa en el lago con excelente vista, acabados de lujo a un \n");
      out.write("                        excelente precio\n");
      out.write("                    </p>\n");
      out.write("                    <p class=\"precio\">$300000000</p>\n");
      out.write("\n");
      out.write("                    <ul class = \"iconos-características\">\n");
      out.write("                        <li>\n");
      out.write("                            <img src=\"img/icono_wc.svg\" alt=\"icono wc\">\n");
      out.write("                            <p>3</p>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <img src=\"img/icono_estacionamiento.svg\" alt=\"icono autos\">\n");
      out.write("                            <p>3</p>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <img src=\"img/icono_dormitorio.svg\" alt=\"icono habitación\">\n");
      out.write("                            <p>4</p>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("\n");
      out.write("                    <a href=\"anuncio.html\" class=\"boton boton-amarillo d-block\">Ver propiedad</a>\n");
      out.write("                    <br>\n");
      out.write("                </div><!-- Contenido anuncio -->\n");
      out.write("            </div><!-- Anuncio -->\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("    </main>\n");
      out.write("        ");
    
           //}//cierre del for productos
            
        
      out.write("    \n");
      out.write("        ");
      out.write(" \n");
      out.write("        <footer>\n");
      out.write("            <div class=\"main_content\">\n");
      out.write("                <div class=\"left box\">\n");
      out.write("                    <h2> about us</h2>\n");
      out.write("                    <div class=\"content\">\n");
      out.write("                        <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mauris nec quam in nisl maximus ultrices. Ut congue pretium odio rutrum malesuada. Etiam nibh ipsum, condimentum et cursus ut, malesuada eget ligula. Nunc ut laoreet arcu, quis posuere erat. Phasellus commodo tincidunt velit non tempus.</p>\n");
      out.write("                        \n");
      out.write("                    </div>\n");
      out.write("               </div> \n");
      out.write("                <div class=\"center box\">\n");
      out.write("                    <h2>Contact us</h2>\n");
      out.write("                    <div class=\"phone\">\n");
      out.write("                        <span class=\"fas fa-phone-alt\"></span>\n");
      out.write("                        <span class=\"text\">+502 5646 5653</span>\n");
      out.write("                    </div>\n");
      out.write("                        <div class=\"mail\">\n");
      out.write("                        <span class=\"fas fa-envelope\"></span>\n");
      out.write("                        <span class=\"text\">sdeleonc7@miumg.edu.gt</span>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"mail\">\n");
      out.write("                        <span class=\"fas fa-envelope\"></span>\n");
      out.write("                        <span class=\"text\">sdeleonc7@miumg.edu.gt</span>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"social\">\n");
      out.write("                            <a href=\"#\"><span class=\"fab fa-facebook-f\"></span></a>\n");
      out.write("                            <a href=\"#\"><span class=\"fab fa-twitter\"></span></a>\n");
      out.write("                            <a href=\"#\"><span class=\"fab fa-instagram\"></span></a>\n");
      out.write("                            <a href=\"#\"><span class=\"fab fa-youtube\"></span></a>\n");
      out.write("                        </div>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("        </footer>\n");
      out.write("        ");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
