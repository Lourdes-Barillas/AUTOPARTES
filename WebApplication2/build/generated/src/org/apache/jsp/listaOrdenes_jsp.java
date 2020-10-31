package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import Globalpackage.GlobalVariables;
import java.sql.Connection;
import MasterClases.Orden;

public final class listaOrdenes_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"styles/app.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"styles/Style.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css\" integrity=\"sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2\" crossorigin=\"anonymous\">\n");
      out.write("        \n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    <body>\n");
      out.write("        <main class=\"orden\">\n");
      out.write("        <ul class=\" list-unstyled contenedor section\">\n");
      out.write("            <table class=\"table\">\n");
      out.write("        ");

        String traerDatos = "SELECT * FROM PUBLIC.";
        GlobalVariables globalvariables = new GlobalVariables();
        String Orden_Id, Orden_ClienteId = null;
        String Orden_Fecha, Orden_PrecioDeEnvio = null;
        String Orden_TipoEnvio = null, Orden_Estado = null, Orden_DiasEnvio = null;
        Orden orden = null;
        try{
            Connection miConexion = null;
            Statement st = null;
            Class.forName("org.postgresql.Driver");
            miConexion = DriverManager.getConnection(globalvariables.db, globalvariables.user, globalvariables.password);
            
            st =  miConexion.createStatement();
            traerDatos = traerDatos + "\"Orden\";";
            ResultSet result = st.executeQuery(traerDatos);
            while(result.next()){
                Orden_Id = result.getString("Orden_Id");
                Orden_ClienteId = result.getString("Orden_ClienteId");
                Orden_Fecha = result.getString("Orden_Fecha");
                Orden_PrecioDeEnvio = result.getString("Orden_PrecioDeEnvio");
                Orden_TipoEnvio = result.getString("Orden_TipoEnvio");
                Orden_Estado = result.getString("Orden_Estado");
                Orden_DiasEnvio = result.getString("Orden_DiasEnvio");
                //--------------------------------------------------------------
                orden = new Orden(Integer.parseInt(Orden_ClienteId), 
                                    Double.parseDouble(Orden_PrecioDeEnvio), 
                                    Orden_TipoEnvio, 
                                    Integer.parseInt(Orden_Estado), 
                                    Integer.parseInt(Orden_DiasEnvio));
                orden.setFecha(Orden_Fecha);
                orden.setId(Integer.parseInt(Orden_Id));
            
      out.write("\n");
      out.write("            \n");
      out.write("            \n");
      out.write("                <tr class=\"\">\n");
      out.write("                    <td>jsfamsfdajsd</td>\n");
      out.write("                    <td>jsfamsfdajsd</td>\n");
      out.write("                      <td class=\"\">\n");
      out.write("                          <div class=\"contenido-anuncio\">\n");
      out.write("                          <h5 class=\"\">");
      out.print(orden.getIdCliente() );
      out.write("</h5>\n");
      out.write("                          <h5 class=\"\">");
      out.print(orden.getTipoEnvio() );
      out.write("</h5>\n");
      out.write("                          <h5 class=\"\">");
      out.print(orden.getFecha() );
      out.write("</h5>\n");
      out.write("                          <h5 class=\"\">");
      out.print(result.getString("Orden_Producto") );
      out.write("</h5>\n");
      out.write("                          <h5 class=\"\">");
      out.print("" );
      out.write("</h5>\n");
      out.write("                          </div>\n");
      out.write("                      </td>\n");
      out.write("                </tr>\n");
      out.write("            \n");
      out.write("            ");

                }
                result.close();
                st.close();
            }catch(Exception e){
                System.out.println(e.getCause());
            }
            
      out.write("\n");
      out.write("            </table>\n");
      out.write("          </ul>\n");
      out.write("          \n");
      out.write("        </main>\n");
      out.write("          \n");
      out.write("        ");
      out.write(" \n");
      out.write("        <footer class=\"site-footer seccion\">\n");
      out.write("            <div class=\"contenedor contenedor-footer\">\n");
      out.write("                <nav class=\"navegacion\">\n");
      out.write("                    <a href=\"menuadmin.jsp\">Menú de administrador</a>\n");
      out.write("                    \n");
      out.write("                </nav>\n");
      out.write("                <p class=\"copyright\">Todos los derechos reservados 2019 &copy;</p>\n");
      out.write("                <p class=\"copyright\">Lourdes Pérez y Esaú de León</p>\n");
      out.write("            </div>\n");
      out.write("        </footer>\n");
      out.write("    \n");
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
