/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.50
 * Generated at: 2018-04-05 23:15:17 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.naviox;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.openxava.web.servlets.Servlets;
import org.openxava.util.Locales;
import com.openxava.naviox.web.NaviOXStyle;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("/WEB-INF/openxava.tld", Long.valueOf(1522882334000L));
    _jspx_dependants.put("/naviox/../xava/imports.jsp", Long.valueOf(1522882332000L));
    _jspx_dependants.put("/naviox/indexExt.jsp", Long.valueOf(1518997090000L));
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fxava_005fmessage_0026_005fkey_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fxava_005fmessage_0026_005fkey_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fxava_005fmessage_0026_005fkey_005fnobody.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

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

 Servlets.setCharacterEncoding(request, response); 
      out.write('\n');
      out.write('\n');
      out.write('\n');
      out.write('\n');
      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      org.openxava.controller.ModuleContext context = null;
      synchronized (session) {
        context = (org.openxava.controller.ModuleContext) _jspx_page_context.getAttribute("context", javax.servlet.jsp.PageContext.SESSION_SCOPE);
        if (context == null){
          context = new org.openxava.controller.ModuleContext();
          _jspx_page_context.setAttribute("context", context, javax.servlet.jsp.PageContext.SESSION_SCOPE);
        }
      }
      out.write('\n');
      com.openxava.naviox.Modules modules = null;
      synchronized (session) {
        modules = (com.openxava.naviox.Modules) _jspx_page_context.getAttribute("modules", javax.servlet.jsp.PageContext.SESSION_SCOPE);
        if (modules == null){
          modules = new com.openxava.naviox.Modules();
          _jspx_page_context.setAttribute("modules", modules, javax.servlet.jsp.PageContext.SESSION_SCOPE);
        }
      }
      out.write('\n');
      out.write('\n');

String app = request.getParameter("application");
String module = context.getCurrentModule(request);
Locales.setCurrent(request);
String sretainOrder = request.getParameter("retainOrder");
boolean retainOrder = "true".equals(sretainOrder);
modules.setCurrent(request.getParameter("application"), request.getParameter("module"), retainOrder);
String oxVersion = org.openxava.controller.ModuleManager.getVersion();
String title = (String) request.getAttribute("naviox.pageTitle");
if (title == null) title = modules.getCurrentModuleDescription(request);

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("\t<title>");
      out.print(title);
      out.write("</title>\n");
      out.write("\t<link href=\"");
      out.print(request.getContextPath());
      out.write("/xava/style/layout.css?ox=");
      out.print(oxVersion);
      out.write("\" rel=\"stylesheet\" type=\"text/css\"> \n");
      out.write("\t<link href=\"");
      out.print(request.getContextPath());
      out.write("/naviox/style/naviox.css?ox=");
      out.print(oxVersion);
      out.write("\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("\t<link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath());
      out.write("/xava/style/materialdesignicons.css?ox=");
      out.print(oxVersion);
      out.write("\">\n");
      out.write("\t<script type='text/javascript' src='");
      out.print(request.getContextPath());
      out.write("/xava/js/dwr-engine.js?ox=");
      out.print(oxVersion);
      out.write("'></script>\n");
      out.write("\t<script type='text/javascript' src='");
      out.print(request.getContextPath());
      out.write("/dwr/interface/Modules.js?ox=");
      out.print(oxVersion);
      out.write("'></script>\n");
      out.write("\t<script type='text/javascript' src='");
      out.print(request.getContextPath());
      out.write("/dwr/interface/Folders.js?ox=");
      out.print(oxVersion);
      out.write("'></script>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body ");
      out.print(NaviOXStyle.getBodyClass(request));
      out.write(">\n");
      out.write("\n");
      out.write("\t<div id=\"main_navigation\">\n");
      out.write("\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "mainNavigation.jsp", out, false);
      out.write("\n");
      out.write("\t</div>\n");
      out.write("\t\n");
      out.write("\t<table width=\"100%\">\n");
      out.write("\t\t<tr>\n");
      out.write("\t\t\t<td id=\"modules_list\">\t\t\t\t\n");
      out.write("\t\t\t\t<div id=\"modules_list_popup\" >\n");
      out.write("\t\t\t\t\t<img id=\"modules_list_corner\" src=\"");
      out.print(request.getContextPath());
      out.write("/naviox/images/corner.png\"/>\n");
      out.write("\t\t\t\t\t<div id=\"modules_list_outbox\">\n");
      out.write("\t\t\t\t\t\t<table id=\"modules_list_box\">\n");
      out.write("\t\t\t\t\t\t\t<tr id=\"modules_list_content\">\n");
      out.write("\t\t\t\t\t\t\t\t<td>\n");
      out.write("\t\t\t\t\t\t\t\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "modulesMenu.jsp", out, false);
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t</td>\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t</table>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</td>\n");
      out.write("\t\n");
      out.write("\t\t\t<td valign=\"top\">\n");
      out.write("\t\t\t\t<div class=\"module-wrapper\">\n");
      out.write("\t\t\t\t\t");
 if ("SignIn".equals(module)) {  
      out.write("\n");
      out.write("\t\t\t\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "signIn.jsp", out, false);
      out.write("\n");
      out.write("\t\t\t\t\t");
 } else { 
      out.write("\n");
      out.write("\t\t\t\t\t<div id=\"module_description\">\n");
      out.write("\t\t\t\t\t\t");
      out.print(modules.getCurrentModuleDescription(request));
      out.write(" \n");
      out.write("\t\t\t\t\t\t<a href=\"javascript:naviox.bookmark()\" title=\"");
      //  xava:message
      org.openxava.web.taglib.MessageTag _jspx_th_xava_005fmessage_005f0 = (org.openxava.web.taglib.MessageTag) _005fjspx_005ftagPool_005fxava_005fmessage_0026_005fkey_005fnobody.get(org.openxava.web.taglib.MessageTag.class);
      _jspx_th_xava_005fmessage_005f0.setPageContext(_jspx_page_context);
      _jspx_th_xava_005fmessage_005f0.setParent(null);
      // /naviox/index.jsp(66,52) name = key type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_xava_005fmessage_005f0.setKey(modules.isCurrentBookmarked()?"unbookmark_module":"bookmark_module");
      int _jspx_eval_xava_005fmessage_005f0 = _jspx_th_xava_005fmessage_005f0.doStartTag();
      if (_jspx_th_xava_005fmessage_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fxava_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_xava_005fmessage_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fxava_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_xava_005fmessage_005f0);
      out.write("\">\n");
      out.write("\t\t\t\t\t\t\t<img id=\"bookmark\" src=\"");
      out.print(request.getContextPath());
      out.write("/naviox/images/bookmark-");
      out.print(modules.isCurrentBookmarked()?"on":"off");
      out.write(".png\"/>\n");
      out.write("\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t</div>\t\t\t\t\n");
      out.write("\t\t\t\t\t<div id=\"module\"> \t\n");
      out.write("\t\t\t\t\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../xava/module.jsp?application=" + app + "&module=" + module + "&htmlHead=false", out, false);
      out.write("\n");
      out.write("\t\t\t\t\t</div> \n");
      out.write("\t\t\t\t\t");
 } 
      out.write("\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</td>\n");
      out.write("\t\t</tr>\n");
      out.write("\t</table>\n");
      out.write("\t\n");
      out.write("\t");
      out.write("\n");
      out.write("\n");
      out.write("<div id=\"beta\">BETA</div>");
      out.write("\n");
      out.write("\n");
      out.write("\t<script type='text/javascript' src='");
      out.print(request.getContextPath());
      out.write("/naviox/js/naviox.js?ox=");
      out.print(oxVersion);
      out.write("'></script> \n");
      out.write("\t\n");
      out.write("\t<script>\n");
      out.write("\t$(function() {\n");
      out.write("\t\tnaviox.lockSessionMilliseconds = ");
      out.print(com.openxava.naviox.model.Configuration.getInstance().getLockSessionMilliseconds());
      out.write("; \n");
      out.write("\t\tnaviox.application = \"");
      out.print(app);
      out.write("\";\n");
      out.write("\t\tnaviox.module = \"");
      out.print(module);
      out.write("\";\n");
      out.write("\t\tnaviox.locked = ");
      out.print(context.get(request, "naviox_locked"));
      out.write(";\n");
      out.write("\t\tnaviox.init();\n");
      out.write("\t});\n");
      out.write("\t</script>\n");
      out.write("\t\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
