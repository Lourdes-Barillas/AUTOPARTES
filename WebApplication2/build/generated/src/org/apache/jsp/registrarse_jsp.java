package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import MasterClases.Children.Empresarial;
import MasterClases.Children.Individual;
import MasterClases.TipoUsuario;
import MasterClases.Cliente;
import java.sql.ResultSet;
import Globalpackage.GlobalVariables;
import java.sql.Connection;
import java.sql.Statement;
import CRUD.Create;

public final class registrarse_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"styles/Style.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css\" integrity=\"sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2\" crossorigin=\"anonymous\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <main class=\"orden contenedor listado centrado\" align=\"left\">\n");
      out.write("            <h1 align=\"center\">Registrarse</h1>\n");
      out.write("            <form class=\"orden form-alineado\" action=\"registrarse.jsp\">\n");
      out.write("                <div class=\"form-row\">\n");
      out.write("                  <div class=\"form-group col-md-6\">\n");
      out.write("                    <label for=\"inputEmail4\">Usuario</label>\n");
      out.write("                    <input type=\"text\" class=\"form-control\" placeholder=\"Empieza con @\" name=\"textUsuario\" id=\"inputEmail4\">\n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"form-group col-md-6\">\n");
      out.write("                    <label for=\"inputPassword4\">Contraseña</label>\n");
      out.write("                    <input type=\"password\" class=\"form-control\" name=\"textContrasenia\" id=\"inputPassword4\">\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("                ");
      out.write("\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                  <div class=\"form-check\">\n");
      out.write("                    <input class=\"form-check-input\" name=\"checkboxAdmin\" type=\"checkbox\" id=\"gridCheck\">\n");
      out.write("                    <label class=\"form-check-label\" for=\"gridCheck\">\n");
      out.write("                      Administrador\n");
      out.write("                    </label>\n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"form-check\">\n");
      out.write("                    <input class=\"form-check-input\" name=\"checkboxPersona\" type=\"checkbox\" id=\"gridCheck\">\n");
      out.write("                    <label class=\"form-check-label\" for=\"gridCheck\">\n");
      out.write("                      Persona como cliente\n");
      out.write("                    </label>\n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"form-check listado\">\n");
      out.write("                    <input class=\"form-check-input\" name=\"checkboxEmpresa\" type=\"checkbox\" id=\"gridCheck\">\n");
      out.write("                    <label class=\"form-check-label\" for=\"gridCheck\">\n");
      out.write("                      Empresa\n");
      out.write("                    </label>\n");
      out.write("                  </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label class=\"espa\" for=\"inputEmail4\">Dpi o Contacto</label>\n");
      out.write("                    \n");
      out.write("                    <div class=\"\">\n");
      out.write("                        <input type=\"text\" class=\"form-control\" name=\"textContD\" placeholder=\"Si eres una empresa, escribe tu e-mail, sino tu DPI\" id=\"inputEmail4\">\n");
      out.write("                    </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                ");
      out.write("\n");
      out.write("                ");

                int idcliente =0;
                Create create = new Create();
                try{
                    String usuario = null, contrasenia = null;
                    Cliente cliente;
                    if(request.getParameter("checkboxAdmin")!=null){
                        usuario = request.getParameter("textUsuario");
                        contrasenia = request.getParameter("textContrasenia");
                        create.insertUsuario(usuario, contrasenia);
                        
      out.write("\n");
      out.write("                        <h3>obtenido el checkbox ");
      out.print(usuario );
      out.write(" </h3>\n");
      out.write("                        ");

                    }//if checkboxadmin
                        if(request.getParameter("checkboxPersona")!=null){
                            String idusuario = null;
                            usuario = request.getParameter("textUsuario");
                            contrasenia = request.getParameter("textContrasenia");
                            create.insertUsuario(usuario, contrasenia);
                            String id = null;
                            GlobalVariables globalvariables = new GlobalVariables();
                            Connection miConexion = globalvariables.connection();
                            Class.forName("org.postgresql.Driver");
                            Statement st = miConexion.createStatement();
                            String traerDatos = "SELECT * FROM PUBLIC.\"Usuarios\";", contacto=null;
                            ResultSet result = st.executeQuery(traerDatos);
                            int i = 0;
                            while(result.next()){
                                i++;
                                if( (result.getString("Usuario_Nombre")).equalsIgnoreCase(usuario)){
                                    idusuario = result.getString("Usuario_Id");
                                    cliente = new Cliente(Integer.parseInt(idusuario), TipoUsuario.Cliente_Individual);
                                    create.insertCliente(cliente, null, request.getParameter("textContD"));
                                }//fin if
                            }//fin while
                    }//fin if
                    String idusuario = null;
                    if(request.getParameter("checkboxEmpresa")!=null){
                            usuario = request.getParameter("textUsuario");
                            contrasenia = request.getParameter("textContrasenia");
                            create.insertUsuario(usuario, contrasenia);
                            String id = null;
                            GlobalVariables globalvariables = new GlobalVariables();
                            Connection miConexion = globalvariables.connection();
                            Class.forName("org.postgresql.Driver");
                            Statement st = miConexion.createStatement();
                            String traerDatos = "SELECT * FROM PUBLIC.\"Usuarios\";", contacto=null;
                            ResultSet result = st.executeQuery(traerDatos);
                            int i = 0;
                            while(result.next()){
                                i++;
                                if( (result.getString("Usuario_Nombre")).equalsIgnoreCase(usuario)){
                                    idusuario = result.getString("Usuario_Id");
                                    cliente = new Cliente(Integer.parseInt(idusuario), TipoUsuario.Cliente_Empresarial);
                                    create.insertCliente(cliente, request.getParameter("textContD"), null);
                                }//fin if
                            }//fin while
                    }//fin if
                }//fintry
                catch(Exception e){
                }//fin catch
                
      out.write("\n");
      out.write("                <div align=\"center\">\n");
      out.write("                    <button type=\"submit\" class=\"btn btn-primary\">Siguiente...</button>\n");
      out.write("                </div>\n");
      out.write("                ");

                    
                
      out.write("\n");
      out.write("              </form>\n");
      out.write("        </main>\n");
      out.write("    </body>\n");
      out.write("</html>");
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
