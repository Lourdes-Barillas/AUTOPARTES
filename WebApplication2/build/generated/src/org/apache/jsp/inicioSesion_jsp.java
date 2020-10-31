package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.DriverManager;
import Globalpackage.GlobalVariables;
import java.sql.Statement;
import java.sql.Connection;

public final class inicioSesion_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"styles/Style.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css\" integrity=\"sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2\" crossorigin=\"anonymous\">\n");
      out.write("        \n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        <div class=\"orden contenedor listado centrado\" align=\"center\">\n");
      out.write("            <h1 class=\"texto-centrado\">Iniciar sesión</h1>\n");
      out.write("                <form class=\"orden form-alineado\" action=\"menuadmin.jsp\" >\n");
      out.write("                    <div class=\"form-group row\">\n");
      out.write("                      <label for=\"inputEmail3\" class=\"col-sm-2 col-form-label texto-alineado\">Usuario</label>\n");
      out.write("                      <div class=\"col-sm-10\">\n");
      out.write("                        <input type=\"text\" name=\"usuario\" class=\"form-control\" id=\"inputEmail3\">\n");
      out.write("                      </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group row\">\n");
      out.write("                      <label for=\"inputPassword3\" class=\"col-sm-2 col-form-label\">Contraseña</label>\n");
      out.write("                      <div class=\"col-sm-10\">\n");
      out.write("                        <input type=\"password\" name=\"contrasenia\" class=\"form-control\" id=\"inputPassword3\">\n");
      out.write("                      </div>\n");
      out.write("                    </div>\n");
      out.write("                    <a href=\"registrarse.jsp\">¿No tienes una cuenta?</a>\n");
      out.write("                    <div class=\"form-group row boton-iniciar\" align=\"center\">\n");
      out.write("                      <div class=\"col-sm-10\" align=\"center\">\n");
      out.write("                        <button type=\"submit\" name=\"enviar\" class=\"btn btn-primary\">Ingresar</button>\n");
      out.write("                      </div>\n");
      out.write("                    </div>\n");
      out.write("                </form>\n");
      out.write("            \n");
      out.write("          </div>\n");
      out.write("        \n");
      out.write("        ");

            if(request.getParameter("enviar")!=null){
                System.out.println("boton presionado");
                String usuario = request.getParameter("usuario");
                String contrasenia = request.getParameter("contrasenia");
                String consulta = "SELECT * FROM PUBLIC.\"Usuarios\"";/* WHERE \"Usuario_Contrasenia\" = " + contrasenia +
                                  " AND \"Usuario_Nombre\" = " + usuario + ";";*/
                try {
                    Connection con = null;
                    Statement statement = null;
                    Class.forName("org.postgresql.Driver");
                    GlobalVariables globalv = new GlobalVariables();
                    con = DriverManager.getConnection(globalv.db, globalv.user, globalv.password);
                    statement = con.createStatement();
                    ResultSet result = statement.executeQuery(consulta);
                    while(result.next()){
                        if(result.getString("Usuario_Nombre").equals(usuario) 
                                && result.getString("Usuario_Contrasenia").equals(contrasenia)){
                            
      out.write("\n");
      out.write("                            <h5>usuario encontrado</h5>\n");
      out.write("                            ");

                        }else{
                            
      out.write("\n");
      out.write("                            <h5>usuario no encontrado</h5>\n");
      out.write("                            ");

}
                    }
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        
      out.write("\n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("    \n");
      out.write("    \n");
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
