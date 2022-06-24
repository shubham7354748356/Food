package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class SupplierSeeMenu_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        body,\n");
      out.write("        html {\n");
      out.write("            height: 100%;\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        body {\n");
      out.write("            background-image: url(bg8.jpg);\n");
      out.write("            background-repeat: no-repeat;\n");
      out.write("            background-position: center;\n");
      out.write("            background-size: cover;\n");
      out.write("            background-attachment: fixed;\n");
      out.write("            font-family: 'Dancing Script', cursive;\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        img {\n");
      out.write("            height: 250px;\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        .card-img-top {\n");
      out.write("            width: 100%;\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        .card {\n");
      out.write("            background-color: #f1f1f1;\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        button {\n");
      out.write("            margin: 2px;\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        .card-text {\n");
      out.write("            text-align: center;\n");
      out.write("            height: 200px;\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        li {\n");
      out.write("            margin-left: 20px;\n");
      out.write("            margin-right: 20px;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("    <script>\n");
      out.write("        function del(a) {\n");
      out.write("            document.getElementById(a).remove();\n");
      out.write("        }\n");
      out.write("    </script>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
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
      out.write("    \n");
      out.write("    \n");
      out.write(" <div class=\"card container-fluid bg-dark mt-5\">\n");
      out.write("        <div class=\"row\" style=\"\">\n");
      out.write("            <div class=\"col-lg-7 pt-4\"> <img class=\"card-img\" src=\"images/bg2.jpg\"></div>\n");
      out.write("            <div class=\"col-lg-5 pt-5\">\n");
      out.write("                <div class=\"card-body text-warning\">\n");
      out.write("                    <div class=\"card-title text-center\">There Will Come The Card-Title</div>\n");
      out.write("                    <div class=\"card-subtitle text-muted text-center\">Here Will Come The Address</div>\n");
      out.write("                    <div class=\"card-text\">Here Will Come The Description About The card</div>\n");
      out.write("                        \n");
      out.write("                </div>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    <div class=\"container d-flex justify-content-center mt-5\">\n");
      out.write("        <div class=\"row justify-content-center\">\n");
      out.write("\n");
      out.write("\n");
      out.write("            <div class=\" col-lg-4 mt-3 d-flex justify-content-center \" id=\"1\">\n");
      out.write("                <div class=\"card col-lg-12 bg-dark\">\n");
      out.write("                    <img class=\"card-img-top rounded-circle\" src=\"delete.jpg\">\n");
      out.write("                    <div class=\"card-body text-warning\">\n");
      out.write("                        <div class=\"card-title text-center text-danger\">This Is The Title Of The Card</div>\n");
      out.write("                        <div class=\"card-subtitle text-muted mb-3 text-center\">This Is The Subtitle Of The Card</div>\n");
      out.write("                        <div class=\"card-text\">This is the extra text for the card . This will Increase The Size Of The Card Lorem ipsum dolor sit, amet consectetur adipisicing elit. Obcaecati accusantium eaque excepturi ut tempora nostrum velit, dolorem facere suscipit officia\n");
      out.write("                            porro aliquid quisquam harum at unde nesciunt quibusdam tempore. Esse!</div>\n");
      out.write("                        <div class=\"text-center\"> <button class=\"btn  mt-3 text-center btn-primary\" onclick=\"del('1')\">Click Me</button><button class=\"btn btn-primary mt-3 text-center\" onclick=\"del('1')\">Click Me</button></div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\" col-lg-4 mt-3 d-flex justify-content-center \" id=\"1\">\n");
      out.write("                <div class=\"card col-lg-12 bg-dark\">\n");
      out.write("                    <img class=\"card-img-top rounded-circle\" src=\"delete.jpg\">\n");
      out.write("                    <div class=\"card-body text-warning\">\n");
      out.write("                        <div class=\"card-title text-center text-danger\">This Is The Title Of The Card</div>\n");
      out.write("                        <div class=\"card-subtitle text-muted mb-3 text-center\">This Is The Subtitle Of The Card</div>\n");
      out.write("                        <div class=\"card-text\">Lorem ipsum dolor sit, amet consectetur adipisicing elit. Obcaecati accusantium eaque excepturi ut tempora nostrum velit, dolorem facere suscipit officia porro aliquid quisquam harum at unde nesciunt quibusdam tempore. Esse!</div>\n");
      out.write("                        <div class=\"text-center\"> <button class=\"btn  mt-3 text-center btn-primary\" onclick=\"del('1')\">Click Me</button><button class=\"btn btn-primary mt-3 text-center\" onclick=\"del('1')\">Click Me</button></div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\" col-lg-4 mt-3 d-flex justify-content-center \" id=\"1\">\n");
      out.write("                <div class=\"card col-lg-12 bg-dark\">\n");
      out.write("                    <img class=\"card-img-top rounded-circle\" src=\"delete.jpg\">\n");
      out.write("                    <div class=\"card-body text-warning\">\n");
      out.write("                        <div class=\"card-title text-center text-danger\">This Is The Title Of The Card</div>\n");
      out.write("                        <div class=\"card-subtitle text-muted mb-3 text-center\">This Is The Subtitle Of The Card</div>\n");
      out.write("                        <div class=\"card-text\">Lorem ipsum dolor sit, amet consectetur adipisicing elit. Obcaecati accusantium eaque excepturi ut tempora nostrum velit, dolorem facere suscipit officia porro aliquid quisquam harum at unde nesciunt quibusdam tempore. Esse!</div>\n");
      out.write("                        <div class=\"text-center\"> <button class=\"btn  mt-3 text-center btn-primary\" onclick=\"del('1')\">Click Me</button><button class=\"btn btn-primary mt-3 text-center\" onclick=\"del('1')\">Click Me</button></div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\" col-lg-4 mt-3 d-flex justify-content-center \" id=\"1\">\n");
      out.write("                <div class=\"card col-lg-12 bg-dark\">\n");
      out.write("                    <img class=\"card-img-top rounded-circle\" src=\"delete.jpg\">\n");
      out.write("                    <div class=\"card-body text-warning\">\n");
      out.write("                        <div class=\"card-title text-center text-danger\">This Is The Title Of The Card</div>\n");
      out.write("                        <div class=\"card-subtitle text-muted mb-3 text-center\">This Is The Subtitle Of The Card</div>\n");
      out.write("                        <div class=\"card-text\">Lorem ipsum dolor sit, amet consectetur adipisicing elit. Obcaecati accusantium eaque excepturi ut tempora nostrum velit, dolorem facere suscipit officia porro aliquid quisquam harum at unde nesciunt quibusdam tempore. Esse!</div>\n");
      out.write("                        <div class=\"text-center\"> <button class=\"btn  mt-3 text-center btn-primary\" onclick=\"del('1')\">Click Me</button><button class=\"btn btn-primary mt-3 text-center\" onclick=\"del('1')\">Click Me</button></div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\" col-lg-4 mt-3 d-flex justify-content-center \" id=\"1\">\n");
      out.write("                <div class=\"card col-lg-12 bg-dark\">\n");
      out.write("                    <img class=\"card-img-top rounded-circle\" src=\"delete.jpg\">\n");
      out.write("                    <div class=\"card-body text-warning\">\n");
      out.write("                        <div class=\"card-title text-center text-danger\">This Is The Title Of The Card</div>\n");
      out.write("                        <div class=\"card-subtitle text-muted mb-3 text-center\">This Is The Subtitle Of The Card</div>\n");
      out.write("                        <div class=\"card-text\">Lorem ipsum dolor sit, amet consectetur adipisicing elit. Obcaecati accusantium eaque excepturi ut tempora nostrum velit, dolorem facere suscipit officia porro aliquid quisquam harum at unde nesciunt quibusdam tempore. Esse!</div>\n");
      out.write("                        <div class=\"text-center\"> <button class=\"btn  mt-3 text-center btn-primary\" onclick=\"del('1')\">Click Me</button><button class=\"btn btn-primary mt-3 text-center\" onclick=\"del('1')\">Click Me</button></div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\" col-lg-4 mt-3 d-flex justify-content-center \" id=\"1\">\n");
      out.write("                <div class=\"card col-lg-12 bg-dark\">\n");
      out.write("                    <img class=\"card-img-top rounded-circle\" src=\"delete.jpg\">\n");
      out.write("                    <div class=\"card-body text-warning\">\n");
      out.write("                        <div class=\"card-title text-center text-danger\">This Is The Title Of The Card</div>\n");
      out.write("                        <div class=\"card-subtitle text-muted mb-3 text-center\">This Is The Subtitle Of The Card</div>\n");
      out.write("                        <div class=\"card-text\">Lorem ipsum dolor sit, amet consectetur adipisicing elit. Obcaecati accusantium eaque excepturi ut tempora nostrum velit, dolorem facere suscipit officia porro aliquid quisquam harum at unde nesciunt quibusdam tempore. Esse!</div>\n");
      out.write("                        <div class=\"text-center\"> <button class=\"btn  mt-3 text-center btn-primary\" onclick=\"del('1')\">Click Me</button><button class=\"btn btn-primary mt-3 text-center\" onclick=\"del('1')\">Click Me</button></div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\" col-lg-4 mt-3 d-flex justify-content-center \" id=\"1\">\n");
      out.write("                <div class=\"card col-lg-12 bg-dark\">\n");
      out.write("                    <img class=\"card-img-top rounded-circle\" src=\"delete.jpg\">\n");
      out.write("                    <div class=\"card-body text-warning\">\n");
      out.write("                        <div class=\"card-title text-center text-danger\">This Is The Title Of The Card</div>\n");
      out.write("                        <div class=\"card-subtitle text-muted mb-3 text-center\">This Is The Subtitle Of The Card</div>\n");
      out.write("                        <div class=\"card-text\">Lorem ipsum dolor sit, amet consectetur adipisicing elit. Obcaecati accusantium eaque excepturi ut tempora nostrum velit, dolorem facere suscipit officia porro aliquid quisquam harum at unde nesciunt quibusdam tempore. Esse!</div>\n");
      out.write("                        <div class=\"text-center\"> <button class=\"btn  mt-3 text-center btn-primary\" onclick=\"del('1')\">Click Me</button><button class=\"btn btn-primary mt-3 text-center\" onclick=\"del('1')\">Click Me</button></div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("   \n");
      out.write("\n");
      out.write("    <script src=\"Jquery.js\">\n");
      out.write("    </script>\n");
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
