package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import MasterClases.Producto;
import Globalpackage.GlobalVariables;
import MasterClases.Orden;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;

public final class Productos_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"styles/Style.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"styles/app.css\">\n");
      out.write("        <link href='http://fonts.googleapis.com/css?family=Lato&subset=latin,latin-ext' rel='stylesheet' type='text/css'>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css\" integrity=\"sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2\" crossorigin=\"anonymous\">\n");
      out.write("\n");
      out.write("        <title>Lista de productos</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <main class=\"listado orden\">\n");
      out.write("        <ul class=\" list-unstyled contenedor section\">\n");
      out.write("        ");

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
                traerDatos = traerDatos + "\"Productos\";";
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
                    
                    
      out.write("\n");
      out.write("                    <li class=\"media orden\">\n");
      out.write("                      <img class=\"tamañoprod\" src=\"IMAGES/productos/producto");
      out.print(+j);
      out.write(".jpg\" class=\"mr-3\" alt=\"...\">\n");
      out.write("                      <div class=\"media-body\">\n");
      out.write("                          <h5 class=\"mt-0 mb-1\">");
      out.print(producto.getIdProducto());
      out.write("</h5>\n");
      out.write("                          <h5 class=\"mt-0 mb-1\">");
      out.print(producto.getProducto() );
      out.write("</h5>\n");
      out.write("                          <h5 class=\"mt-0 \">");
      out.print(producto.getCantidad() );
      out.write("</h5>\n");
      out.write("                        Cras sit amet nibh libero, in gravida nulla. Nulla vel metus scelerisque ante sollicitudin. Cras purus odio, vestibulum in vulputate at, tempus viverra turpis. Fusce condimentum nunc ac nisi vulputate fringilla. Donec lacinia congue felis in faucibus.\n");
      out.write("                      </div>\n");
      out.write("                      <div class=\"contenido-anuncio\">\n");
      out.write("                            <a href=\"Editar.jsp?Prod_Id=");
      out.print(producto.getIdProducto());
      out.write("\" class=\"boton boton-amarillo d-block\">Dar de baja</a>\n");
      out.write("\n");
      out.write("                      </div>\n");
      out.write("                      <div class=\"contenido-anuncio\">\n");
      out.write("                            <a href=\"Verproducto.jsp?Prod_Id=");
      out.print(producto.getIdProducto());
      out.write("\" class=\"boton boton-amarillo d-block\">Ver producto</a>\n");
      out.write("                      </div>\n");
      out.write("                    </li>\n");
      out.write("                    ");

                }
                result.close();
                st.close();
            }catch(Exception e){
                System.out.println(e.getCause());
            }
        
      out.write("\n");
      out.write("          </ul>\n");
      out.write("        </main>\n");
      out.write("          \n");
      out.write("        <footer class=\"site-footer seccion\">\n");
      out.write("            <div class=\"contenedor contenedor-footer\">\n");
      out.write("                <nav class=\"navegacion\">\n");
      out.write("                    <a href=\"anuncios.html\">Anuncios</a>\n");
      out.write("                    <a href=\"blog.html\">Blog</a>\n");
      out.write("                    <a href=\"contacto.html\">Contacto</a>\n");
      out.write("                </nav>\n");
      out.write("                <p class=\"copyright\">Todos los derechos reservados 2019 &copy;</p>\n");
      out.write("            </div>\n");
      out.write("        </footer>\n");
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
