package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Globalpackage.GlobalVariables;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Connection;
import CRUD.Create;
import MasterClases.Producto;

public final class AgregarProducto_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"styles/Style.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css\" integrity=\"sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2\" crossorigin=\"anonymous\">\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <title>Autopartes</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <main>\n");
      out.write("            <div class=\"centrado listado orden pad\" align=\"center\">\n");
      out.write("                <form action=\"AgregarProducto.jsp\" class=\"orden form-alineado\">\n");
      out.write("                <h1>Agregar Producto</h1>\n");
      out.write("                <div class=\"form-group row\">\n");
      out.write("                  <label align=\"left\" for=\"formGroupExampleInput\">Nombre del producto</label>\n");
      out.write("                  <input align=\"right\" name=\"txtnombre\" type=\"text\" class=\"form-control\" >\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group row\">\n");
      out.write("                  <label align=\"left\" for=\"formGroupExampleInput2\">Costo</label>\n");
      out.write("                  <input align=\"right\"  placeholder=\"Puedes escribir en decimal\" name=\"txtcosto\" type=\"text\" class=\"form-control\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group row\">\n");
      out.write("                  <label align=\"left\" for=\"formGroupExampleInput2\">Existencia</label>\n");
      out.write("                  <input align=\"right\" placeholder=\"No escribas en decimal\" name=\"txtexistencia\" type=\"text\" class=\"form-control\">\n");
      out.write("                </div>\n");
      out.write("                ");

                    try {
                            Double precio = Double.parseDouble(request.getParameter("txtcosto"));
                            String nombre = request.getParameter("txtnombre");
                            String costo = request.getParameter("txtcosto");
                            String existencia = request.getParameter("txtexistencia");
                            GlobalVariables globalvariables = new GlobalVariables();
                            String values = " VALUES(?,?,?);";
                            String consulta = "INSERT INTO public.\"Productos\" (\"Prod_Nombre\", \"Prod_Costo\", \"Prod_Existencia\") " + values;
                            //la consulta será INSERT INTO PRODUCTOS VALUES('PROD_NOMBRE', 'PROD_PRECIO');
                                try {
                                    //1. Crear la conexión
                                    Connection miConexion = null;
                                    PreparedStatement miStatement = null;
                                    Class.forName("org.postgresql.Driver");
                                    miConexion = DriverManager.getConnection(globalvariables.db, globalvariables.user, globalvariables.password);

                                    miStatement =  miConexion.prepareStatement(consulta);
                                    miStatement.setString(1, nombre);
                                    miStatement.setDouble(2, Double.parseDouble(costo));
                                    miStatement.setInt(3, Integer.parseInt(existencia));
                                    //Si fue insertado, busquemos el uno
                                    miStatement.executeUpdate();
                                    miStatement.close();
                                } catch (Exception e) {
                                    System.out.println(e.getMessage());
                                }//fin catch 2
                            } catch (Exception e) {
                            }//fin catch 1
                
      out.write("\n");
      out.write("                <div class=\"col-sm-10\" align=\"center\">\n");
      out.write("                    <button align=\"center\" type=\"submit\" class=\"btn btn-primary\">Agregar</button>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("            </form>\n");
      out.write("            </div>    \n");
      out.write("        </main>\n");
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
