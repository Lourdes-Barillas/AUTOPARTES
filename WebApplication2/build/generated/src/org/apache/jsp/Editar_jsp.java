package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.PreparedStatement;
import Globalpackage.GlobalVariables;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.Connection;

public final class Editar_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form action=\"Editar.jsp\">\n");
      out.write("            ");
      out.print(request.getParameter("Prod_Id") );
      out.write("\n");
      out.write("        ");

            try{
                GlobalVariables globalvariables = new GlobalVariables();
                Connection miConexion = null;
                PreparedStatement st = null;
                Class.forName("org.postgresql.Driver");
                miConexion = DriverManager.getConnection(globalvariables.db, globalvariables.user, globalvariables.password);
                //obtengamos el id
                int prod_Id = Integer.parseInt(request.getParameter("Prod_Id"));
                
      out.write("\n");
      out.write("                ");
      out.print(prod_Id+"" );
      out.write("\n");
      out.write("                ");

                String traerDatos = "SELECT * FROM PUBLIC.\"Clientes\" WHERE \"Prod_ID\" = " + prod_Id + ";";
                st =  miConexion.prepareStatement(traerDatos);
                ResultSet result = st.executeQuery(); 
                
      out.write("\n");
      out.write("                ");
      out.print(prod_Id+"" );
      out.write("\n");
      out.write("                ");

                while(result.next()){
                   
      out.write("\n");
      out.write("        \n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                  <label for=\"formGroupExampleInput\">Nombre del producto</label>\n");
      out.write("                  <input class=\"form-control\" type=\"text\" readonly=\"\" value=\"");
      out.print(result.getString("Prod_Nombre"));
      out.write("\"/>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                  <label for=\"formGroupExampleInput2\">Costo</label>\n");
      out.write("                  <input  readonly=\"\"  type=\"text\" class=\"form-control\" value=\"");
      out.print(result.getString("Prod_Costo"));
      out.write("\"/>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                  <label for=\"formGroupExampleInput2\">Existencia</label>\n");
      out.write("                  <input  readonly=\"\"  type=\"text\" class=\"form-control\" value=\"");
      out.print(result.getString("Prod_Existencia"));
      out.write("\"/>\n");
      out.write("                </div>\n");
      out.write("                <button type=\"submit\" class=\"btn btn-primary\">Agregar</button>\n");
      out.write("        </form>\n");
      out.write("        ");
  }//fin while
        }//fin try
        catch(Exception e){
        
      out.write("\n");
      out.write("        <h3>Error</h3>\n");
      out.write("        ");

        }
        
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
