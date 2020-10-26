package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\" >\n");
      out.write("        <title>Auto Partes</title>\n");
      out.write("       \n");
      out.write("        <script src=\"https://kit.fontawesome.com/a076d05399.js\"></script>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"Style.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write("  \n");
      out.write("        <header>\n");
      out.write("            <div class=\"wrapper\">\n");
      out.write("                <div align=\"center\">\n");
      out.write("                    <img src=\"ima.png\" id=\"ima\" >\n");
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
      out.write("            ");
//codigo java
                //Producto p = new Producto();
                //array con los datos de producto
                String linkImg="https://www.inglestotal.com/wp-content/uploads/2011/02/vocabulario-carro-ingles.jpg";
                String producto="agua", marca="mojada";
                //cilco for hasta la longitud del arreglo obtenido de la base de datos
                for(int i=0;i<5;i++){
      out.write("\n");
      out.write("                <TABLE border=\"1\" id=\"tablaC\" class=\"tablWrapper\">\n");
      out.write("                    <TR>\n");
      out.write("                        <TD>\n");
      out.write("                            <div class=\"divp\">\n");
      out.write("                                <img class=\"imP\" src=\"");
      out.print(linkImg);
      out.write("\"/>\n");
      out.write("                            </div>\n");
      out.write("                        </TD> \n");
      out.write("                    </TR>\n");
      out.write("                    <tr>    \n");
      out.write("                        <TD>\n");
      out.write("                            <div class=\"divs\">\n");
      out.write("                                <h1>  Producto#");
      out.print(i);
      out.write("</h1>\n");
      out.write("                                <h2>  marca</h2><br>\n");
      out.write("                                <label  for=\"lcan\">cantidad:</label>\n");
      out.write("                                <input type=\"text\" id=\"cantidad\" name=\"cantidad\"/><br><br>\n");
      out.write("                                <center><button type=\"submit\" id=\"ButtonCompra\">Comprar</button></center>\n");
      out.write("                            </div>   \n");
      out.write("                        </TD>\n");
      out.write("                    </tr>\n");
      out.write("                </TABLE>\n");
      out.write("                <br>\n");
      out.write("            ");
}
      out.write("\n");
      out.write("\n");
      out.write("            <br><br><br><br><br><br><br><br>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
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
