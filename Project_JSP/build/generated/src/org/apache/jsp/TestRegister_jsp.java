package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class TestRegister_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <title>Login</title>\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"http://fonts.googleapis.com/css?family=Roboto:400,100,300,500\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"vendor/bootstrap/css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"vendor/font-awesome/css/font-awesome.min.css\">\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"css/form-elements.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/form-style.css\">\n");
      out.write("        <link href=\"css/agency.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <link rel=\"shortcut icon\" href=\"\">\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body id=\"page-top\" class=\"index\">\n");
      out.write("    \t<nav id=\"mainNav\" class=\"navbar navbar-default navbar-custom navbar-fixed-top\">\n");
      out.write("\t        <div class=\"container\">\n");
      out.write("\t            <div class=\"navbar-header page-scroll\">\n");
      out.write("\t                <a class=\"navbar-calcories page-scroll\" href=\"index.html\">Calcories</a>\n");
      out.write("\t            </div>\n");
      out.write("\n");
      out.write("\t            <div class=\"collapse navbar-collapse\" id=\"bs-example-navbar-collapse-1\">\n");
      out.write("                <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                    <li class=\"hidden\">\n");
      out.write("                        <a href=\"#page-top\"></a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a class=\"page-scroll\" href=\"index.html#about\">About</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a class=\"page-scroll\" href=\"index.html#portfolio\">Voucher</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a class=\"page-scroll\" href=\"index.html#team\">Team</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a class=\"page-scroll\" href=\"#\">Log in</a>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("        \t</div>\n");
      out.write("        </nav>\n");
      out.write("\n");
      out.write("        <div class=\"top-content\">\n");
      out.write("            <div class=\"inner-bg\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-sm-8 col-sm-offset-2 text\">\n");
      out.write("                            <h1><strong>Login</strong> to make your life better.</h1>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-sm-5\">\n");
      out.write("                        \t<div class=\"form-box\">\n");
      out.write("\t                        \t<div class=\"form-top\">\n");
      out.write("\t                        \t\t<div class=\"form-top-left\">\n");
      out.write("\t                        \t\t\t<h3>Log in</h3>\n");
      out.write("\t                            \t\t<p>Enter username and password</p>\n");
      out.write("\t                        \t\t</div>\n");
      out.write("\t                        \t\t<div class=\"form-top-right\">\n");
      out.write("\t                        \t\t\t<i class=\"fa fa-lock\"></i>\n");
      out.write("\t                        \t\t</div>\n");
      out.write("\t                            </div>\n");
      out.write("\t                            <div class=\"form-bottom\">\n");
      out.write("\t\t\t\t                    <form role=\"form\" action=\"\" method=\"post\" class=\"login-form\">\n");
      out.write("\t\t\t\t                    \t<div class=\"form-group\">\n");
      out.write("\t\t\t\t                    \t\t<label class=\"sr-only\" for=\"form-username\">Username</label>\n");
      out.write("\t\t\t\t                        \t<input type=\"text\" name=\"form-username\" placeholder=\"Username\" class=\"form-username form-control\" id=\"form-username\" required/>\n");
      out.write("\t\t\t\t                        </div>\n");
      out.write("\t\t\t\t                        <div class=\"form-group\">\n");
      out.write("\t\t\t\t                        \t<label class=\"sr-only\" for=\"form-password\">Password</label>\n");
      out.write("\t\t\t\t                        \t<input type=\"password\" name=\"form-password\" placeholder=\"Password\" class=\"form-password form-control\" id=\"form-password\" required/>\n");
      out.write("\t\t\t\t                        </div>\n");
      out.write("\t\t\t\t                        <button type=\"submit\" class=\"btn\">Log in</button>\n");
      out.write("\t\t\t\t                    </form>\n");
      out.write("\t\t\t                    </div>\n");
      out.write("\t\t                    </div>\n");
      out.write("\t                        \n");
      out.write("                        </div>\n");
      out.write("                        \n");
      out.write("                        <div class=\"col-sm-1 middle-border\"></div>\n");
      out.write("                        <div class=\"col-sm-1\"></div>\n");
      out.write("                        \t\n");
      out.write("                        <div class=\"col-sm-5\">\n");
      out.write("                        \t\n");
      out.write("                        \t<div class=\"form-box\">\n");
      out.write("                        \t\t<div class=\"form-top\">\n");
      out.write("\t                        \t\t<div class=\"form-top-left\">\n");
      out.write("\t                        \t\t\t<p>Don't have an account?</p>\n");
      out.write("\t                        \t\t\t<h3>Sign up now</h3>\n");
      out.write("\t                        \t\t</div>\n");
      out.write("\t                        \t\t<div class=\"form-top-right\">\n");
      out.write("\t                        \t\t\t<i class=\"fa fa-pencil\"></i>\n");
      out.write("\t                        \t\t</div>\n");
      out.write("\t                            </div>\n");
      out.write("\t                            <div class=\"form-bottom\">\n");
      out.write("\t\t\t\t                    <form role=\"form\" action=\"RegisterServlet\" method=\"post\" class=\"registration-form\">\n");
      out.write("\t\t\t\t                    \t<div class=\"form-group\">\n");
      out.write("\t\t\t\t                    \t\t<label class=\"sr-only\" for=\"form-username\">Username</label>\n");
      out.write("\t\t\t\t                        \t<input type=\"text\" name=\"form-username\" placeholder=\"Username\" class=\"form-username form-control\" id=\"form-username\" required/>\n");
      out.write("\t\t\t\t                        </div>\n");
      out.write("\t\t\t\t                        <div class=\"form-group\">\n");
      out.write("\t\t\t\t                    \t\t<label class=\"sr-only\" for=\"form-password\">Password</label>\n");
      out.write("\t\t\t\t                        \t<input type=\"password\" name=\"form-password\" placeholder=\"Password\" class=\"form-password form-control\" id=\"form-password\" required/>\n");
      out.write("\t\t\t\t                        </div>\n");
      out.write("\t\t\t\t                    \t<div class=\"form-group\">\n");
      out.write("\t\t\t\t                    \t\t<label class=\"sr-only\" for=\"form-first-name\">Full name</label>\n");
      out.write("\t\t\t\t                        \t<input type=\"text\" name=\"form-full-name\" placeholder=\"Full name\" class=\"form-full-name form-control\" id=\"form-full-name\" required/>\n");
      out.write("\t\t\t\t                        </div>\n");
      out.write("\t\t\t\t                        <div class=\"form-group\">\n");
      out.write("\t\t\t\t                        \t<label class=\"sr-only\" for=\"form-email\">Email</label>\n");
      out.write("\t\t\t\t                        \t<input type=\"email\" name=\"form-email\" placeholder=\"Email\" class=\"form-email form-control\" id=\"form-email\" required/>\n");
      out.write("\t\t\t\t                        </div>\n");
      out.write("\t\t\t\t                        <div class=\"form-group\">\n");
      out.write("\t\t\t\t                        \t<label class=\"sr-only\" for=\"form-tel\">Telephone Number</label>\n");
      out.write("\t\t\t\t                        \t<input type=\"text\" name=\"form-tel\" placeholder=\"Telephone Number\" class=\"form-tel form-control\" id=\"form-tel\" required/>\n");
      out.write("\t\t\t\t                        </div>\n");
      out.write("\t\t\t\t                        <div class=\"form-group\">\n");
      out.write("\t\t\t\t                        \t<label class=\"sr-only\" for=\"form-birthday\">Birthday</label>\n");
      out.write("\t\t\t\t                        \t<p>Birthday</p>\n");
      out.write("\t\t\t\t                        \t<input type=\"date\" name=\"form-date\" class=\"form-date form-control\" id=\"form-date\"/>\n");
      out.write("\t\t\t\t                        </div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t                        \t<label class=\"sr-only\" for=\"form-age\">Age</label>\n");
      out.write("\t\t\t\t                        \t<input type=\"number\" name=\"form-age\" class=\"form-age form-control\" id=\"form-age\" placeholder=\"Age\" />\n");
      out.write("\t\t\t\t                        </div>\n");
      out.write("\t\t\t\t                        <p>Personal Data</p>\n");
      out.write("\t\t\t\t                        <div class=\"form-group\">\n");
      out.write("\t\t\t\t                        \t<p>Gender:&nbsp;\n");
      out.write("\t\t\t\t                        \t<input type=\"radio\" name=\"form-gender\" placeholder=\"Male\" class=\"form-gender\" id=\"form-gender-male\" value=\"Male\" autofocus />\n");
      out.write("\t\t\t\t                        \t<label for=\"form-gender-male\">Male</label>&nbsp;\n");
      out.write("\t\t\t\t                        \t<input type=\"radio\" name=\"form-gender\" placeholder=\"Female\" class=\"form-gender\" value=\"Female\" id=\"form-gender-female\"/>\n");
      out.write("\t\t\t\t                        \t<label for=\"form-gender-female\">Female</label>&nbsp;\n");
      out.write("\t\t\t\t                        \t<input type=\"radio\" name=\"form-gender\" placeholder=\"Other\" class=\"form-gender\" value=\"Other\" id=\"form-gender-other\"/>\n");
      out.write("\t\t\t\t                        \t<label for=\"form-gender-other\">Other</label></p>\n");
      out.write("\t\t\t\t                        </div>\n");
      out.write("\t\t\t\t                        <div class=\"form-group\">\n");
      out.write("\t\t\t\t                        \t<label class=\"sr-only\" for=\"form-height\">Height</label>\n");
      out.write("\t\t\t\t                        \t<input type=\"text\" name=\"form-height\" placeholder=\"Height\" class=\"form-height form-control\" id=\"form-height\" required/>\n");
      out.write("\t\t\t\t                        </div>\n");
      out.write("\t\t\t\t                        <div class=\"form-group\">\n");
      out.write("\t\t\t\t                        \t<label class=\"sr-only\" for=\"form-weight\">Weight</label>\n");
      out.write("\t\t\t\t                        \t<input type=\"text\" name=\"form-weight\" placeholder=\"Weight\" class=\"form-weight form-control\" id=\"form-weight\" required/>\n");
      out.write("\t\t\t\t                        </div>\n");
      out.write("\t\t\t\t                        <button type=\"submit\" class=\"btn\">Sign up</button>\n");
      out.write("\t\t\t\t                    </form>\n");
      out.write("\t\t\t                    </div>\n");
      out.write("                        \t</div>\n");
      out.write("                        \t\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <!-- Footer -->\n");
      out.write("        <footer>\n");
      out.write("        \t<div class=\"container\">\n");
      out.write("        \t\t<div class=\"row\">\n");
      out.write("        \t\t\t\n");
      out.write("        \t\t\t<div class=\"col-sm-8 col-sm-offset-2\">\n");
      out.write("        \t\t\t\t<div class=\"footer-border\"></div>\n");
      out.write("        \t\t\t\t<p>Create with love in INT303. <i class=\"fa fa-heart\"></i></p>\n");
      out.write("        \t\t\t</div>\n");
      out.write("        \t\t\t\n");
      out.write("        \t\t</div>\n");
      out.write("        \t</div>\n");
      out.write("        </footer>\n");
      out.write("\n");
      out.write("        <script src=\"assets/js/jquery-1.11.1.min.js\"></script>\n");
      out.write("        <script src=\"assets/bootstrap/js/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"assets/js/jquery.backstretch.min.js\"></script>\n");
      out.write("        <script src=\"assets/js/scripts.js\"></script>\n");
      out.write("        <script src=\"vendor/jquery/jquery.min.js\"></script>\n");
      out.write("   \t\t<script src=\"vendor/bootstrap/js/bootstrap.min.js\"></script>\n");
      out.write("    \t<script src=\"https://cdnjs.cloudflare.com/ajax/libs/jquery-easing/1.3/jquery.easing.min.js\"></script>\n");
      out.write("    \t<script src=\"js/jqBootstrapValidation.js\"></script>\n");
      out.write("    \t<script src=\"js/contact_me.js\"></script>\n");
      out.write("    \t<script src=\"js/agency.min.js\"></script>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("\n");
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
