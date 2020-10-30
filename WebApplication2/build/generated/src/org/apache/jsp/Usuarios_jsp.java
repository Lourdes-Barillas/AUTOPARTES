package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.Connection;
import Globalpackage.GlobalVariables;
import MasterClases.Cliente;

public final class Usuarios_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link rel=\"stylesheet\" href=\"styles/Style.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"styles/app.css\">\n");
      out.write("        <link href='http://fonts.googleapis.com/css?family=Lato&subset=latin,latin-ext' rel='stylesheet' type='text/css'>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css\" integrity=\"sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2\" crossorigin=\"anonymous\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <main class=\"listado orden\">\n");
      out.write("        <ul class=\" list-unstyled contenedor section\">\n");
      out.write("        ");

            String traerDatos = "SELECT * FROM PUBLIC.\"Clientes\";";
            String usuarioId, tipocliente, Cliente_Id;
            Cliente cliente = null;
            GlobalVariables globalvariables = new GlobalVariables();
            
            try{
                Connection miConexion = null;
                Statement st = null;
                Class.forName("org.postgresql.Driver");
                miConexion = DriverManager.getConnection(globalvariables.db, globalvariables.user, globalvariables.password);

                st =  miConexion.createStatement();
                ResultSet result = st.executeQuery(traerDatos);
                int i = 0;
                while(result.next()){
                    i++;
                    usuarioId = result.getString("Cliente_UsuarioId");
                    tipocliente = result.getString("Cliente_TipoCliente");
                    Cliente_Id = result.getString("Cliente_Id");
                    
      out.write("\n");
      out.write("                    <li class=\"media orden\">\n");
      out.write("                      <img src=\"IMAGES/usuarios/usuario");
      out.print(+i);
      out.write(".jpg\" class=\"mr-3\" alt=\"...\">\n");
      out.write("                      <div class=\"media-body\">\n");
      out.write("                          <h5 class=\"mt-0 mb-1\">");
      out.print(usuarioId);
      out.write("</h5>\n");
      out.write("                          <h5 class=\"mt-0 \">");
      out.print(tipocliente );
      out.write("</h5>\n");
      out.write("                        Cras sit amet nibh libero, in gravida nulla. Nulla vel metus scelerisque ante sollicitudin. Cras purus odio, vestibulum in vulputate at, tempus viverra turpis. Fusce condimentum nunc ac nisi vulputate fringilla. Donec lacinia congue felis in faucibus.\n");
      out.write("                      </div>\n");
      out.write("                        ");

                              //si es 0 o si es 1
                              if(result.getString("Cliente_Estado").equals("1")){
                          
      out.write("\n");
      out.write("                        <div class=\"contenido-anuncio\">\n");
      out.write("                            <a href=\"EditarUsuario.jsp?Cliente_Id=");
      out.print(Cliente_Id);
      out.write("\" class=\"boton boton-amarillo d-block\">Dar de baja</a>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                          ");

                              }else if (result.getString("Cliente_Estado").equals("0")){
                          
      out.write("\n");
      out.write("                        <div class=\"contenido-anuncio\">\n");
      out.write("                            <a href=\"DardebajaUsuario.jsp?Cliente_Id=");
      out.print(Cliente_Id);
      out.write("\" class=\"boton boton-amarillo d-block\">Dar de alta</a>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </li>\n");
      out.write("                    ");

                        }//fin if
                    
      out.write("\n");
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
