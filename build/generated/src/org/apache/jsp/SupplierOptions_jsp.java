package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import daoPackage.RestuarantDao;

public final class SupplierOptions_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>Supplier Options</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"bootstrap.css\">\n");
      out.write("    <style>\n");
      out.write("        li {\n");
      out.write("            margin-left: 20px;\n");
      out.write("            margin-right: 20px;\n");
      out.write("        }\n");
      out.write("        \n");
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
      out.write("        a:hover {\n");
      out.write("            text-decoration: none;\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("       \n");
      out.write("         ");

             String value="none";
                     
            String username = (String )session.getAttribute("username");
            int status = RestuarantDao.isRestuarantPresent(username);
            if(status!=-1)
            {
                System.out.println("In The SupplierOption.jsp The Restuarant is already Present status: "+status);
                out.println("#add{opacity:0.5;pointer-events:none}");
                if(status==0)
                {
                    
                      System.out.println("The Restuarant Is Present But The Admin Has not Verified The Restuarant!!!!!");
                     out.println("#manage,#orders{opacity:0.5;pointer-events:none}");
                     value="block";
                }
                
               
              
            }
            else
            {
                System.out.println("In The SuppplierOptions.jsp The Restuarant is not Present");
                out.println("#manage,#orders{opacity:0.5;pointer-events:none}");
            }
         
            
        
      out.write("\n");
      out.write("         \n");
      out.write("    </style>\n");
      out.write("    </script>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    \n");
      out.write("      \n");
      out.write("   \n");
      out.write("    <nav class=\" fixed-top navbar  bg-warning navbar-expand-sm\">\n");
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
      out.write("    <div class=\"container mt-5\">\n");
      out.write("\n");
      out.write("        <div class=\"row  d-flex justify-content-center  mt-5 pt-3\">\n");
      out.write("            <div class=\"col-lg-4 mt-5\" id=\"add\">\n");
      out.write("                <a href=\"AddRestuarant.jsp\">\n");
      out.write("                    <img src=\"SupplierAddRestuarant.png\" class=\"col-lg-12\">\n");
      out.write("                    <h2 class=\"caption text-center bg-dark text-warning\">Add Restuarant</h2>\n");
      out.write("\n");
      out.write("                </a>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"col-lg-4 mt-5\" id=\"manage\">\n");
      out.write("                <a href=\"SupplierManageRestuarant.jsp\">\n");
      out.write("                    <img src=\"SupplierManageRestuarant.jpg\" class=\"col-lg-12\">\n");
      out.write("                    <h2 class=\"caption text-center bg-dark text-warning\">Manage Restuarant</h2>\n");
      out.write("\n");
      out.write("                </a>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"col-lg-4 mt-5 \" id=\"orders\">\n");
      out.write("                <a href=\"#\">\n");
      out.write("                    <img src=\"SupplierOrders.png\" class=\"col-lg-12\">\n");
      out.write("                    <h2 class=\"caption text-center bg-dark text-warning\">Orders</h2>\n");
      out.write("\n");
      out.write("                </a>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("           \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    <div class=\"bg-warning text-center  mb-3 container\" id=\"message\" style='display:");
      out.print(value);
      out.write(";'>Your Restuarant Appliction Is Still Pending For The Verification.</div>\n");
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
