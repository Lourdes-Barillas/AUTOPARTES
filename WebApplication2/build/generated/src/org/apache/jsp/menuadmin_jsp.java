package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class menuadmin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        \n");
      out.write("        <link href='http://fonts.googleapis.com/css?family=Lato&subset=latin,latin-ext' rel='stylesheet' type='text/css'>\n");
      out.write("        <link rel=\"stylesheet\" href=\"styles/app.css\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("    <header class=\"site-header inicio\">\n");
      out.write("        <div class=\"contenedor contenido-header\">\n");
      out.write("\n");
      out.write("            <div class=\"barra\">\n");
      out.write("                <a href=\"index.html\">\n");
      out.write("                    <img class=\"fondoLogo\" src=\"IMAGES/ima.png\" alt=\"Logotipo de Bienes raices\">\n");
      out.write("                </a>\n");
      out.write("                <nav class=\"navegacion\">\n");
      out.write("                    <a href=\"index.jsp\">Inicio</a>\n");
      out.write("                    <a href=\"listaOrdenes.jsp\">Ordenes</a>\n");
      out.write("                    <a href=\"blog.html\">Productos</a>\n");
      out.write("                    <a href=\"contacto.html\">Clientes</a>\n");
      out.write("                </nav>\n");
      out.write("            </div> \n");
      out.write("            \n");
      out.write("\n");
      out.write("            <h1>Organización AutoPartes</h1>\n");
      out.write("        \n");
      out.write("        </div><!--Cierre del contenedor-->\n");
      out.write("    </header>\n");
      out.write("\n");
      out.write("    <main class=\"section contenedor\">\n");
      out.write("        <h2 class= \"fw-300 centrar-texto\">Administración</h2>\n");
      out.write("\n");
      out.write("        <div class=\"contenedor-anuncios\">\n");
      out.write("            <div class = \"anuncio2\">\n");
      out.write("                <img src=\"IMAGES/Productos.jpg\" alt=\"imagenProducto\">\n");
      out.write("                <div class=\"contenido-anuncio\">\n");
      out.write("                    <a href=\"Productos.jsp\" class=\"boton boton-amarillo d-block\">Ver reporte</a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class = \"anuncio2\">\n");
      out.write("                <img src=\"IMAGES/Usuarios.jpg\" alt=\"imagenUsuarios\">\n");
      out.write("                <div class=\"contenido-anuncio\">\n");
      out.write("                    <a href=\"Usuarios.jsp\" class=\"boton boton-amarillo d-block\">Ver reporte</a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </main>\n");
      out.write("\n");
      out.write("    <footer class=\"site-footer seccion\">\n");
      out.write("        <div class=\"contenedor contenedor-footer\">\n");
      out.write("            <nav class=\"navegacion\">\n");
      out.write("                <a href=\"anuncios.html\">Anuncios</a>\n");
      out.write("                <a href=\"blog.html\">Blog</a>\n");
      out.write("                <a href=\"contacto.html\">Contacto</a>\n");
      out.write("            </nav>\n");
      out.write("            <p class=\"copyright\">Todos los derechos reservados 2019 &copy;</p>\n");
      out.write("        </div>\n");
      out.write("    </footer>\n");
      out.write("\n");
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
