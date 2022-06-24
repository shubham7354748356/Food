package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class AddDish_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <title>Document</title>\n");
      out.write("    <link href=\"bootstrap.css\" rel=\"stylesheet\">\n");
      out.write("    <style>\n");
      out.write("         li {\n");
      out.write("            margin-left: 20px;\n");
      out.write("            margin-right: 20px;\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        body {\n");
      out.write("            background-image: url(bg8.jpg);\n");
      out.write("            background-repeat: no-repeat;\n");
      out.write("            background-position: center;\n");
      out.write("            background-size: cover;\n");
      out.write("            font-family: 'Dancing Script', cursive;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("    <script src=\"AddDish.js\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("     <nav class=\" fixed-top navbar  bg-warning navbar-expand-sm\">\n");
      out.write("        <a class=\"navbar-brand btn btn-danger \">Food Application</a>\n");
      out.write("        <ul class=\"navbar-nav ml-auto\">\n");
      out.write("            <li class=\"navbar-item active\"><a href=\"#\" class=\"navbar-link btn-danger btn\">Back</a></li>\n");
      out.write("            <li class=\"navbar-item\"><a href=\"#\" class=\"navbar-link btn btn-danger\">Logout</a></li>\n");
      out.write("\n");
      out.write("\n");
      out.write("        </ul>\n");
      out.write("\n");
      out.write("    </nav>\n");
      out.write("\n");
      out.write("    <div class=\"container col-lg-4 col-sm-12 bg-dark  pt-5 text-warning\" style=\"z-index: 2;\">\n");
      out.write("        <div class=\"text-center\"><img src=\"add_restuarant.jpg\" style=\"height:80px; width: 80px;\"></div>\n");
      out.write("        <h2 class=\"text-danger text-center\">Add Dish Details:</h2>\n");
      out.write("        <hr> Enter Dish Name:\n");
      out.write("\n");
      out.write("        <input type=\"text\" class=\"col-lg-12 form-control\" id=\"restuarant_name\">\n");
      out.write("       \n");
      out.write("        <br> Enter The Description About Dish:\n");
      out.write("        <textarea class=\"form-control col-lg-12\" cols=\"10\" rows=\"6\" id=\"desc\"></textarea>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <br> Upload Image Of The Restuarant:\n");
      out.write("        <div class=\"btn btn-success col-lg-12 mb-3\" style=\"text-align: left;\"><span>Select Image</span><input type=\"file\" class=\"\" value=\"Upload\" style=\"opacity: 0;\" id=\"image\" accept=\"image/jpeg\"></div>\n");
      out.write("        <input type=\"button\" class=\"btn btn-success col-lg-12 mb-3\" onclick=\"addRestuarant()\" value=\"Add Restuarant\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
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
