package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Home_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    \n");
      out.write("    \n");
      out.write("    ");
 
        String state = (String)session.getAttribute("state");
        String city = (String) session.getAttribute("city");
    
    
      out.write("\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>Document</title>\n");
      out.write("    <link href=\"bootstrap.css\" rel=\"stylesheet\">\n");
      out.write("    <style>\n");
      out.write("        #img {\n");
      out.write("            width: 100%;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body class=\"bg-dark\">\n");
      out.write("    <div class=\"container-fluid\">\n");
      out.write("        <div>\n");
      out.write("            <nav class=\" navbar fixed-top navbar-dark navbar-expand-sm d-flex justify-content-center bg-danger\">\n");
      out.write("                <!--  <a href=\"#\" class=\"navbar-brand\">Shubham Rajput</a>-->\n");
      out.write("                <ul class=\"navbar-nav\">\n");
      out.write("                    <li class=\"navbar-item\">\n");
      out.write("                        <a href=\"#\" class=\"navbar-link mr-3 text-white\">Add Restuarant </a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"navbar-item\">\n");
      out.write("                        <a href=\"#\" class=\"navbar-link mr-3 text-white\">Your Cart</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"navbar-item\">\n");
      out.write("                        <a href=\"#\" class=\"navbar-link mr-3 text-white\">Wish List</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"navbar-item\">\n");
      out.write("                        <a href=\"#\" class=\"navbar-link mr-3 text-white\">Previous Orders</a>\n");
      out.write("                    </li>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                </ul>\n");
      out.write("\n");
      out.write("            </nav>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <img src=\"image5.jpeg\" id=\"img\" style=\"height: 400px;\">\n");
      out.write("    </div>\n");
      out.write("    <div class=\"h3 text-center mt-3 text-white\"><u>Your Location State:");
      out.print(state);
      out.write(" / City");
      out.print(city);
      out.write(" </u></div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    <div class=\"container-fluid mt-3\">\n");
      out.write("        <div class=\"row d-flex justify-content-center\">\n");
      out.write("\n");
      out.write("            <div class=\"card col-lg-3 col-md-6 col-sm-8 mt-3 bg-danger mr-3\">\n");
      out.write("                <img src=\"image5.jpeg\" class=\"card-img mt-3\">\n");
      out.write("                <div class=\" text-center text-white\">\n");
      out.write("                    <h4 class=\"card-title\">This Is Card Title</h4>\n");
      out.write("                    <p class=\"card-body \"> This is The Best product Of That Area. Definitely You Can Get The Best Of The Taste And Along with That get Anything more...</p>\n");
      out.write("                    <button class=\"btn btn-info mb-3\"> Add To WishList</button>\n");
      out.write("                    <button class=\"btn btn-info mb-3\"> Add To WishList</button>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"card col-lg-3 col-md-6 col-sm-8 mt-3 bg-danger mr-3\">\n");
      out.write("                <img src=\"image1.jpg\" class=\"card-img mt-3\">\n");
      out.write("                <div class=\" text-center text-white\">\n");
      out.write("                    <h4 class=\"card-title\">This Is Card Title</h4>\n");
      out.write("                    <p class=\"card-body \"> This is The Best product Of That Area. Definitely You Can Get The Best Of The Taste And Along with That get Anything more...</p>\n");
      out.write("                    <button class=\"btn btn-info mb-3\"> Add To WishList</button>\n");
      out.write("                    <button class=\"btn btn-info mb-3\"> Add To WishList</button>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"card col-lg-3 col-md-6 col-sm-8 mt-3 bg-danger mr-3\">\n");
      out.write("                <img src=\"image1.jpg\" class=\"card-img mt-3\">\n");
      out.write("                <div class=\" text-center text-white\">\n");
      out.write("                    <h4 class=\"card-title\">This Is Card Title</h4>\n");
      out.write("                    <p class=\"card-body \"> This is The Best product Of That Area. Definitely You Can Get The Best Of The Taste And Along with That get Anything more...</p>\n");
      out.write("                    <button class=\"btn btn-info mb-3\"> Add To WishList</button>\n");
      out.write("                    <button class=\"btn btn-info mb-3\"> Add To WishList</button>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"card col-lg-3 mr-3 col-md-6 col-sm-8 mt-3 bg-danger\">\n");
      out.write("                <img src=\"image1.jpg\" class=\"card-img mt-3\">\n");
      out.write("                <div class=\" text-center text-white\">\n");
      out.write("                    <h4 class=\"card-title\">This Is Card Title</h4>\n");
      out.write("                    <p class=\"card-body \"> This is The Best product Of That Area. Definitely You Can Get The Best Of The Taste And Along with That get Anything more...</p>\n");
      out.write("                    <button class=\"btn btn-info mb-3\"> Add To WishList</button>\n");
      out.write("                    <button class=\"btn btn-info mb-3\"> Add To WishList</button>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"card col-lg-3 mr-3 col-md-6 col-sm-8 mt-3 bg-danger\">\n");
      out.write("                <img src=\"image1.jpg\" class=\"card-img mt-3\">\n");
      out.write("                <div class=\" text-center text-white\">\n");
      out.write("                    <h4 class=\"card-title\">This Is Card Title</h4>\n");
      out.write("                    <p class=\"card-body \"> This is The Best product Of That Area. Definitely You Can Get The Best Of The Taste And Along with That get Anything more...</p>\n");
      out.write("                    <button class=\"btn btn-info mb-3\"> Add To WishList</button>\n");
      out.write("                    <button class=\"btn btn-info mb-3\"> Add To WishList</button>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"card col-lg-3 mr-3 col-md-6 col-sm-8 mt-3 bg-danger\">\n");
      out.write("                <img src=\"image1.jpg\" class=\"card-img mt-3\">\n");
      out.write("                <div class=\" text-center text-white\">\n");
      out.write("                    <h4 class=\"card-title\">This Is Card Title</h4>\n");
      out.write("                    <p class=\"card-body \"> This is The Best product Of That Area. Definitely You Can Get The Best Of The Taste And Along with That get Anything more...</p>\n");
      out.write("                    <button class=\"btn btn-info mb-3\"> Add To WishList</button>\n");
      out.write("                    <button class=\"btn btn-info mb-3\"> Add To WishList</button>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    <div class=\"text-white bg-warning text-center fixed-bottom\" style=\"opacity: 1;\">This Will Be fixed At The Bottom Of Our Application in All Pages....</div>\n");
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
