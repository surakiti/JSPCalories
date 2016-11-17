package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class FoodLists_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <title>Food List</title>\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"http://fonts.googleapis.com/css?family=Roboto:400,100,300,500\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"vendor/bootstrap/css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"vendor/font-awesome/css/font-awesome.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"vendor/others/profile.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/calcories.css\">\n");
      out.write("        <link href=\"css/agency.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <link rel=\"shortcut icon\" href=\"\">\n");
      out.write("</head>\n");
      out.write("<body id=\"page-top\" class=\"index\">\n");
      out.write("        <nav id=\"mainNav\" class=\"navbar navbar-default navbar-custom navbar-fixed-top\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"navbar-header page-scroll\">\n");
      out.write("                        <a class=\"navbar-calcories page-scroll\" href=\"index.html\" style=\"color:#F27935;\">Calcories</a>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"collapse navbar-collapse\" id=\"bs-example-navbar-collapse-1\">\n");
      out.write("                        <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                            <li class=\"hidden\">\n");
      out.write("                                <a href=\"#page-top\"></a>\n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                                <a class=\"page-scroll\" href=\"index.html#about\" style=\"color:#F27935;\">About</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                                <a class=\"page-scroll\" href=\"index.html#portfolio\" style=\"color:#F27935;\">Voucher</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                                <a class=\"page-scroll\" href=\"index.html#team\" style=\"color:#F27935;\">Team</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                                <a class=\"page-scroll\" href=\"Profile.html\" style=\"color:#F27935;\">Mickey</a>\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>  \n");
      out.write("                </div> \n");
      out.write("        </nav>\n");
      out.write("    <div class=\"paddingprofile\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-sm-8\">\n");
      out.write("                    <h1>Food</h1>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-4\">\n");
      out.write("                    <form class=\"form-inline\" action=\"FoodListServlet\" method=\"post\" style=\"margin-top: 5%\">\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <div class=\"input-group\">\n");
      out.write("                                <div class=\"input-group-addon\">\n");
      out.write("                                    <img src=\"img/magnifying-glass-browser.png\">\n");
      out.write("                                </div>\n");
      out.write("                                <input type=\"text\" class=\"form-control\" name='searchParam' placeholder = \"Enter the Menu\">   \n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <button type=\"submit\" class=\"btn btn-default\">Search</button>\n");
      out.write("                    </form> \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        <table class=\"table\" style=\"text-align: center\">\n");
      out.write("            \n");
      out.write("            <tr style=\"background-color: orange; color: white\">\n");
      out.write("                <td>No.</td>\n");
      out.write("                <td>Menu</td>\n");
      out.write("                <td>Unit</td>\n");
      out.write("                <td>Calories</td>\n");
      out.write("                <td>Qty</td>\n");
      out.write("                <td>Add to my calories</td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>1.</td>\n");
      out.write("                <td>Rice</td>\n");
      out.write("                <td>1</td>\n");
      out.write("                <td>15 cal</td>\n");
      out.write("                <td><input type=\"number\" value=\"0\" id=\"qty\" maxlength=\"2\" size=\"2\" min=\"0\" align=\"center\"></td>\n");
      out.write("                <td>\n");
      out.write("                    <input type=\"checkbox\" name=\"fid\" title=\"Add to my calories\"/>\n");
      out.write("                </td>                           \n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>2.</td>\n");
      out.write("                <td>Rice</td>\n");
      out.write("                <td>1</td>\n");
      out.write("                <td>15 cal</td>\n");
      out.write("                <td><input type=\"number\" value=\"0\" id=\"qty\" maxlength=\"2\" size=\"2\" min=\"0\" align=\"center\"></td>\n");
      out.write("                <td>\n");
      out.write("                    <input type=\"checkbox\" name=\"fid\" title=\"Add to my calories\"/>\n");
      out.write("                </td>                           \n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>3.</td>\n");
      out.write("                <td>Rice</td>\n");
      out.write("                <td>1</td>\n");
      out.write("                <td>15 cal</td>\n");
      out.write("                <td><input type=\"number\" value=\"0\" id=\"qty\" maxlength=\"2\" size=\"2\" min=\"0\" align=\"center\"></td>\n");
      out.write("                <td>\n");
      out.write("                    <input type=\"checkbox\" name=\"fid\" title=\"Add to my calories\"/>\n");
      out.write("                </td>                           \n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>4.</td>\n");
      out.write("                <td>Rice</td>\n");
      out.write("                <td>1</td>\n");
      out.write("                <td>15 cal</td>\n");
      out.write("                <td><input type=\"number\" value=\"0\" id=\"qty\" maxlength=\"2\" size=\"2\" min=\"0\" align=\"center\"></td>\n");
      out.write("                <td>\n");
      out.write("                    <input type=\"checkbox\" name=\"fid\" title=\"Add to my calories\"/>\n");
      out.write("                </td>                           \n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>5.</td>\n");
      out.write("                <td>Rice</td>\n");
      out.write("                <td>1</td>\n");
      out.write("                <td>15 cal</td>\n");
      out.write("                <td><input type=\"number\" value=\"0\" id=\"qty\" maxlength=\"2\" size=\"2\" min=\"0\" align=\"center\"></td>\n");
      out.write("                <td>\n");
      out.write("                    <input type=\"checkbox\" name=\"fid\" title=\"Add to my calories\"/>\n");
      out.write("                </td>                           \n");
      out.write("            </tr>\n");
      out.write("        </table>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        <div style=\"text-align: right; padding-right: 5%\">\n");
      out.write("            <button type=\"submit\" class=\"btn btn-warning\">Add to my calories</button>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    </div>\n");
      out.write("    </div>\n");
      out.write("        <script src=\"assets/js/jquery-3.1.1.js\"></script>\n");
      out.write("        <script src=\"assets/bootstrap/js/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"assets/js/jquery.backstretch.min.js\"></script>\n");
      out.write("        <script src=\"assets/js/scripts.js\"></script>\n");
      out.write("        <script src=\"vendor/jquery/jquery.min.js\"></script>\n");
      out.write("        <script src=\"vendor/bootstrap/js/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/jquery-easing/1.3/jquery.easing.min.js\"></script>\n");
      out.write("        <script src=\"js/jqBootstrapValidation.js\"></script>\n");
      out.write("        <script src=\"js/contact_me.js\"></script>\n");
      out.write("        <script src=\"js/agency.min.js\"></script>\n");
      out.write("        <script src=\"vendor/icheck/icheck.js\"></script>\n");
      out.write("        <link href=\"vendor/icheck/skins/flat/orange.css\" rel=\"stylesheet\">\n");
      out.write("        <script src=\"vendor/icheck/icheck.js\"></script>\n");
      out.write("        <script>\n");
      out.write("            $(document).ready(function(){\n");
      out.write("              $('input').iCheck({\n");
      out.write("                checkboxClass: 'icheckbox_flat-orange',\n");
      out.write("                radioClass: 'iradio_flat-orange'\n");
      out.write("              });\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("        <script src=\"js/calcories.js\"></script>\n");
      out.write("</body>\n");
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
