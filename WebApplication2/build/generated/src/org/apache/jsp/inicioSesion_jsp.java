package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"styles/Style.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css\" integrity=\"sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2\" crossorigin=\"anonymous\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form>\n");
      out.write("            <div class=\"form-group row\">\n");
      out.write("              <label for=\"inputEmail3\" class=\"col-sm-2 col-form-label\">Email</label>\n");
      out.write("              <div class=\"col-sm-10\">\n");
      out.write("                <input type=\"email\" class=\"form-control\" id=\"inputEmail3\">\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group row\">\n");
      out.write("              <label for=\"inputPassword3\" class=\"col-sm-2 col-form-label\">Password</label>\n");
      out.write("              <div class=\"col-sm-10\">\n");
      out.write("                <input type=\"password\" class=\"form-control\" id=\"inputPassword3\">\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("            <fieldset class=\"form-group\">\n");
      out.write("              <div class=\"row\">\n");
      out.write("                <legend class=\"col-form-label col-sm-2 pt-0\">Radios</legend>\n");
      out.write("                <div class=\"col-sm-10\">\n");
      out.write("                  <div class=\"form-check\">\n");
      out.write("                    <input class=\"form-check-input\" type=\"radio\" name=\"gridRadios\" id=\"gridRadios1\" value=\"option1\" checked>\n");
      out.write("                    <label class=\"form-check-label\" for=\"gridRadios1\">\n");
      out.write("                      First radio\n");
      out.write("                    </label>\n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"form-check\">\n");
      out.write("                    <input class=\"form-check-input\" type=\"radio\" name=\"gridRadios\" id=\"gridRadios2\" value=\"option2\">\n");
      out.write("                    <label class=\"form-check-label\" for=\"gridRadios2\">\n");
      out.write("                      Second radio\n");
      out.write("                    </label>\n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"form-check disabled\">\n");
      out.write("                    <input class=\"form-check-input\" type=\"radio\" name=\"gridRadios\" id=\"gridRadios3\" value=\"option3\" disabled>\n");
      out.write("                    <label class=\"form-check-label\" for=\"gridRadios3\">\n");
      out.write("                      Third disabled radio\n");
      out.write("                    </label>\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("            </fieldset>\n");
      out.write("            <div class=\"form-group row\">\n");
      out.write("              <div class=\"col-sm-2\">Checkbox</div>\n");
      out.write("              <div class=\"col-sm-10\">\n");
      out.write("                <div class=\"form-check\">\n");
      out.write("                  <input class=\"form-check-input\" type=\"checkbox\" id=\"gridCheck1\">\n");
      out.write("                  <label class=\"form-check-label\" for=\"gridCheck1\">\n");
      out.write("                    Example checkbox\n");
      out.write("                  </label>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group row\">\n");
      out.write("              <div class=\"col-sm-10\">\n");
      out.write("                <button type=\"submit\" class=\"btn btn-primary\">Sign in</button>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </form>\n");
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
