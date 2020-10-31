package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.PreparedStatement;
import java.awt.Image;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.InputStream;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.util.List;
import java.sql.ResultSet;
import Globalpackage.GlobalVariables;
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\" >\r\n");
      out.write("        <title>Auto Partes</title>\r\n");
      out.write("       \r\n");
      out.write("        <script src=\"https://kit.fontawesome.com/a076d05399.js\"></script>\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"styles/app.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"styles/Style.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"styles/app.css\">\r\n");
      out.write("        \r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        ");
      out.write("  \r\n");
      out.write("        <header>\r\n");
      out.write("            <div class=\"wrapper\">\r\n");
      out.write("                <div align=\"center\">\r\n");
      out.write("                    <img src=\"IMAGES/ima.png\" id=\"ima\" >\r\n");
      out.write("                </div>\r\n");
      out.write("            <div class=\"logo\">AutoPartes</div> \r\n");
      out.write("                <nav>\r\n");
      out.write("                    \r\n");
      out.write("                    <a href=\"realizarCompra.jsp\">Carrito</a>\r\n");
      out.write("                    <a href=\"inicioSesion.jsp\">Ordenes</a>\r\n");
      out.write("                </nav>\r\n");
      out.write("            </div>\r\n");
      out.write("        </header>\r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("        \r\n");
      out.write("     \r\n");
      out.write("    <main class=\"section contenedor\">\r\n");
      out.write("        <a href=\"AgregarProducto.jsp\" class=\"boton boton-amarillo d-block\">Agregar un producto</a>\r\n");
      out.write("        <h2 class= \"fw-300 centrar-texto\">Productos en venta</h2>\r\n");
      out.write("        <div class=\"contenedor-anuncios\">\r\n");
      out.write("        ");

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
                    
        
      out.write("\r\n");
      out.write("        \r\n");
      out.write("        <form action=\"addOrden.jsp\">\r\n");
      out.write("            <div class = \"anuncio\"  align=\"center\">\r\n");
      out.write("                <img class=\"tamanioprod\" src=\"IMAGES/productos/producto");
      out.print(+i);
      out.write(".jpg\" alt=\"Anuncio de producto\">\r\n");
      out.write("                <div class=\"contenido-anuncio\">\r\n");
      out.write("                    <h3>");
      out.print(producto.getProducto() );
      out.write("</h3>\r\n");
      out.write("                    <p>producto de calidad. \r\n");
      out.write("                        \r\n");
      out.write("                    </p>\r\n");
      out.write("                    <p class=\"precio\">Q. ");
      out.print(Double.parseDouble(prod_Costo) );
      out.write("</p>\r\n");
      out.write("                    ");
      out.write("\r\n");
      out.write("                    <a href=\"addOrden.jsp?name=");
      out.print(result.getString("Prod_Nombre"));
      out.write("\" class=\"boton boton-amarillo d-block\">Comprar</a>\r\n");
      out.write("                </div><!-- Contenido anuncio -->\r\n");
      out.write("            </div><!-- Anuncio -->\r\n");
      out.write("            </form>\r\n");
      out.write("         ");
  
                }//while
                result.close();
                st.close();
                //JOptionPane.showMessageDialog(null, "Conexión correcta");
            } catch (Exception e) {
                System.out.println(e);
            }
            
        
      out.write(" \r\n");
      out.write("        </div>\r\n");
      out.write("    </main>\r\n");
      out.write("          \r\n");
      out.write("        ");
      out.write(" \r\n");
      out.write("        <footer class=\"site-footer seccion\">\r\n");
      out.write("            <div class=\"contenedor contenedor-footer\">\r\n");
      out.write("                <nav class=\"navegacion\">\r\n");
      out.write("                    <a href=\"anuncios.html\">Anuncios</a>\r\n");
      out.write("                    <a href=\"blog.html\">Blog</a>\r\n");
      out.write("                    <a href=\"contacto.html\">Contacto</a>\r\n");
      out.write("                </nav>\r\n");
      out.write("                <p class=\"copyright\">Todos los derechos reservados 2019 &copy;</p>\r\n");
      out.write("            </div>\r\n");
      out.write("        </footer>\r\n");
      out.write("    \r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
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
