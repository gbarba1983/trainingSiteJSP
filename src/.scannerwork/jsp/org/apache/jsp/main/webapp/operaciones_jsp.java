/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: JspC/ApacheTomcat9
 * Generated at: 2024-02-12 17:21:05 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.main.webapp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class operaciones_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd\">\r\n<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n    <head>\r\n        <!-- General meta information -->\r\n        <title>Operaciones</title>\r\n        <meta name=\"keywords\" content=\"\" />\r\n        <meta name=\"description\" content=\"\" />\r\n        <meta name=\"robots\" content=\"index, follow\" />\r\n        <meta charset=\"utf-8\" />\r\n        <!-- // General meta information -->\r\n        <!-- Load Javascript -->\r\n        <script type=\"text/javascript\" src=\"./js/jquery.js\"></script>\r\n        <script type=\"text/javascript\" src=\"./js/jquery.query-2.1.7.js\"></script>\r\n        <script type=\"text/javascript\" src=\"./js/rainbows.js\"></script>\r\n        <script type=\"text/javascript\" src=\"./js/operaciones.js\"></script>\r\n        <!-- // Load Javascipt -->\r\n        <!-- Load stylesheets -->\r\n        <link type=\"text/css\" rel=\"stylesheet\" href=\"css/style.css\" media=\"screen\" />\r\n        <!-- // Load stylesheets -->\r\n\r\n        <!--Esta funcion permite opacar el boton con un hover\r\n");
      out.write("        <script>\r\n                $(document).ready(function(){ \r\n                $(\"#submit1\").hover(\r\n                        function() {\r\n                        $(this).animate({\"opacity\": \"0\"}, \"slow\");\r\n                        },\r\n                        function() {\r\n                        $(this).animate({\"opacity\": \"1\"}, \"slow\");\r\n                        });\r\n                });\r\n        </script>	-->\r\n    </head>\r\n    <body>\r\n        <div id=\"wrapperOperaciones\">                     \r\n            <div id=\"existentes\">\r\n                <h2>Libros Existentes</h2>\r\n                <form action=\"#\" method=\"post\">\r\n                    <table class=\"tablaExistentes\">\r\n                        <tbody><tr>\r\n                                <td>Titulo</td><td>En stock</td><td>Valor</td><td>Agregar Cantidad al Carro</td>\r\n                            </tr>\r\n                            <tr>\r\n                                <td>Core Java</td><td>5</td><td>USD. 30</td><td><input type=\"text\" name=\"q\" value=\"0\"></td>\r\n");
      out.write("                            </tr>\r\n                            <tr>\r\n                                <td>Ruby for Rails</td><td>12</td><td>USD. 20</td><td><input type=\"text\" name=\"q\" value=\"0\"></td>\r\n                            </tr>\r\n                            <tr>\r\n                                <td>Python Cookbook</td><td>7</td><td>USD. 35</td><td><input type=\"text\" name=\"q\" value=\"0\"></td>\r\n                            </tr>\r\n                        </tbody>\r\n                    </table>\r\n                    <br/>\r\n                    <div align=\"center\">\r\n                        <input type=\"button\" class=\"btnOperaciones\" value=\"Agregar\" onclick=\"addToCart()\"/> \r\n                        <input type=\"button\" class=\"btnOperaciones\" value=\"Limpiar\" onclick=\"clearCart()\"/>\r\n                        <input type=\"button\" class=\"btnOperaciones\" value=\"Salir\" onclick=\"location.href = 'index.jsp'\"/>\r\n                    </div>\r\n                </form>                \r\n            </div>\r\n            <div id=\"miCarro\">\r\n");
      out.write("                <h2>Mi Carro de Compras</h2>\r\n                <div id=\"tablaCarro\">\r\n                    <table class=\"tablaExistentes\">\r\n                        <tbody>\r\n                            <tr>\r\n                                <td>Titulo</td>\r\n                                <td>Cantidad</td>\r\n                                <td>Valor Unidad</td>\r\n                                <td>Valor Total</td>\r\n                            </tr>\r\n                        </tbody>\r\n                    </table>\r\n                </div>    \r\n                <br/>\r\n                <br/>\r\n                <div align=\"center\">\r\n                    Grand Total: <input type=\"text\" id=\"total\" value=\"0\"/> \r\n                </div>\r\n            </div>\r\n            <div id=\"powered\">\r\n                <p><a href=\"http://www.qvision.us/index.php/\">Q-Vision Technologies</a></p>\r\n            </div>            \r\n        </div>        \r\n    </body>\r\n</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
