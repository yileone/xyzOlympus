/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.50
 * Generated at: 2018-01-04 22:49:53 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.xava;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.openxava.controller.meta.MetaControllers;
import org.openxava.controller.meta.MetaController;
import org.openxava.util.Is;
import org.openxava.web.Ids;
import org.openxava.util.Labels;
import java.util.Collection;
import org.openxava.controller.meta.MetaAction;
import org.openxava.controller.meta.MetaSubcontroller;

public final class subButton_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/xava/imports.jsp", Long.valueOf(1515105874817L));
    _jspx_dependants.put("/WEB-INF/openxava.tld", Long.valueOf(1515105878952L));
  }

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write('\n');
      out.write('\n');
      out.write('\n');
      out.write("\r\n");
      out.write("\r\n");
      org.openxava.web.style.Style style = null;
      style = (org.openxava.web.style.Style) _jspx_page_context.getAttribute("style", javax.servlet.jsp.PageContext.REQUEST_SCOPE);
      if (style == null){
        style = new org.openxava.web.style.Style();
        _jspx_page_context.setAttribute("style", style, javax.servlet.jsp.PageContext.REQUEST_SCOPE);
      }
      out.write('\r');
      out.write('\n');
      org.openxava.controller.ModuleContext context = null;
      synchronized (session) {
        context = (org.openxava.controller.ModuleContext) _jspx_page_context.getAttribute("context", javax.servlet.jsp.PageContext.SESSION_SCOPE);
        if (context == null){
          context = new org.openxava.controller.ModuleContext();
          _jspx_page_context.setAttribute("context", context, javax.servlet.jsp.PageContext.SESSION_SCOPE);
        }
      }
      out.write("\r\n");
      out.write("\r\n");

org.openxava.controller.ModuleManager manager = (org.openxava.controller.ModuleManager) context.get(request, "manager", "org.openxava.controller.ModuleManager");
manager.setSession(session);
String controllerName = request.getParameter("controller");
MetaController metaController = MetaControllers.getMetaController(controllerName);
String image = request.getParameter("image");
if (Is.empty(image)) image = metaController.getImage();
String icon = request.getParameter("icon"); 
if (Is.empty(icon)) icon = metaController.getIcon();
String mode = request.getParameter("xava_mode"); 
if (mode == null) mode = manager.isSplitMode()?"detail":manager.getModeName();
String argv = request.getParameter("argv");
if (Is.empty(argv)) argv = "";
// add the mode in the ids to fix problem on the split mode
String id = Ids.decorate(request, "sc-" + controllerName + "_" + mode);
String containerId = Ids.decorate(request, "sc-container-" + controllerName + "_" + mode);
String buttonId = Ids.decorate(request, "sc-button-" + controllerName + "_" + mode);
String imageId = Ids.decorate(request, "sc-image-" + controllerName + "_" + mode);
String aId = Ids.decorate(request, "sc-a-" + controllerName + "_" + mode);
String spanId = Ids.decorate(request, "sc-span-" + controllerName + "_" + mode);

      out.write("\r\n");
      out.write("<span id='");
      out.print(containerId);
      out.write("'>\r\n");
      out.write("\t<span id='");
      out.print(buttonId);
      out.write("' class=\"");
      out.print(style.getButtonBarButton());
      out.write(' ');
      out.print(style.getSubcontrollerButton());
      out.write("\">\r\n");
      out.write("\t\t<a \r\n");
      out.write("\t\t\tid ='");
      out.print(aId);
      out.write("'\r\n");
      out.write("\t\t\thref=\"javascript:openxava.subcontroller('");
      out.print(id);
      out.write('\'');
      out.write(',');
      out.write('\'');
      out.print(containerId);
      out.write('\'');
      out.write(',');
      out.write('\'');
      out.print(buttonId);
      out.write('\'');
      out.write(',');
      out.write('\'');
      out.print(imageId);
      out.write('\'');
      out.write(',');
      out.write('\'');
      out.print(aId);
      out.write('\'');
      out.write(',');
      out.write('\'');
      out.print(spanId);
      out.write("')\" \r\n");
      out.write("\t\t\t>\r\n");
      out.write("\t\t\t");
 if (!Is.emptyString(icon) && (style.isUseIconsInsteadOfImages() || Is.emptyString(image))) { 
      out.write("\r\n");
      out.write("\t\t\t<i class=\"mdi mdi-");
      out.print(icon);
      out.write("\"></i>\r\n");
      out.write("\t\t\t");
 } else { 
      out.write("\r\n");
      out.write("\t\t\t<span\r\n");
      out.write("\t\t\t\tid='");
      out.print(spanId);
      out.write("' \r\n");
      out.write("\t\t\t\tstyle=\"padding:4px; background: url(");
      out.print(request.getContextPath());
      out.write('/');
      out.print(style.getImagesFolder());
      out.write('/');
      out.print(image);
      out.write(") no-repeat 5px 50%;\">\t\t\t\t\r\n");
      out.write("\t\t\t&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("\t\t\t</span>\r\n");
      out.write("\t\t\t");
 } 
      out.write("\r\n");
      out.write("\t\t\t");
      out.print( Labels.get(controllerName));
      out.write("\r\n");
      out.write("\t\t\t<i id='");
      out.print(imageId);
      out.write("' class=\"mdi mdi-menu-down\"></i>&nbsp;\r\n");
      out.write("\t\t</a>\r\n");
      out.write("\t</span>\r\n");
      out.write("\t\r\n");
      out.write("\t<div id=\"");
      out.print(id);
      out.write("\" class=\"");
      out.print(style.getSubcontroller());
      out.write("\" style=\"display:none;\">\r\n");
      out.write("\t\t<table>\r\n");
      out.write("\t\t");

		Collection actions = manager.getSubcontrollerMetaActions(controllerName);
		java.util.Iterator actionsIt = actions.iterator();
		while(actionsIt.hasNext()){
			MetaAction action = (MetaAction)actionsIt.next();
			if (action.appliesToMode(mode)) {
		
      out.write("\t\r\n");
      out.write("\t\t\t<tr><td>\r\n");
      out.write("\t\t\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "barButton.jsp" + "?" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("action", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode(String.valueOf(action.getQualifiedName()), request.getCharacterEncoding()) + "&" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("addSpaceWithoutImage", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("true", request.getCharacterEncoding()) + "&" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("argv", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode(String.valueOf(argv), request.getCharacterEncoding()), out, false);
      out.write("\r\n");
      out.write("\t\t\t</td></tr>\r\n");
      out.write("\t\t");

			}
		}
		
      out.write("\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t</div>\r\n");
      out.write("</span>\t");
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
