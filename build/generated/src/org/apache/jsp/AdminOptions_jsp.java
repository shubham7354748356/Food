package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class AdminOptions_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>Admin Options Page</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"bootstrap.css\">\n");
      out.write("    <style>\n");
      out.write("        img {\n");
      out.write("            height: 80%;\n");
      out.write("            border: 3px solid black;\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        body {\n");
      out.write("            background-image: url(bg8.jpg);\n");
      out.write("            background-repeat: no-repeat;\n");
      out.write("            background-position: center;\n");
      out.write("            background-size: cover;\n");
      out.write("            font-family: 'Dancing Script', cursive;\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        img {\n");
      out.write("            opacity: 1;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("    <script src=\"AdminOptions.js\">\n");
      out.write("    </script>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    <div class=\"container mt-5\">\n");
      out.write("\n");
      out.write("        <div class=\"row  d-flex justify-content-center  mt-5 pt-3\">\n");
      out.write("            <div class=\"col-lg-5 mt-5\" onclick=\"verify()\"> <img src=\"verify1.jpeg\" class=\"col-lg-12 \">\n");
      out.write("                <h2 class=\"caption text-center bg-dark text-warning\">Verify Restuarant</h2>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-lg-5 mt-5\" onclick=\"del()\"><img src=\"delete.jpg\" class=\"col-lg-12 \">\n");
      out.write("                <h2 class=\"caption text-center text-warning bg-dark\">Delete User</h2>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("    <script src=\"Jquery.js\"></script>\n");
      out.write("    <script src=\"bootstrap.bundle.js\"></script>\n");
      out.write("</body>\n");
      out.write("\n");
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
