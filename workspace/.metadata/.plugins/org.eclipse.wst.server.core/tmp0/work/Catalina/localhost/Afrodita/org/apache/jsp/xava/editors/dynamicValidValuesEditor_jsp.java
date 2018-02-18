/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.50
 * Generated at: 2018-02-16 04:19:28 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.xava.editors;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Map;
import org.openxava.model.meta.MetaProperty;
import org.openxava.view.View;

public final class dynamicValidValuesEditor_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

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

String viewObject = request.getParameter("viewObject");
View view = (View) context.get(request, viewObject);
String collectionName = request.getParameter("collectionName");
if (!org.openxava.util.Is.emptyString(collectionName)) {
	view = view.getSubview(collectionName);
}
String propertyKey = request.getParameter("propertyKey");
MetaProperty p = (MetaProperty) request.getAttribute(propertyKey);
String script = request.getParameter("script"); 
boolean editable = "true".equals(request.getParameter("editable")); 
boolean label = org.openxava.util.XavaPreferences.getInstance().isReadOnlyAsLabel();
Object value = request.getAttribute(propertyKey + ".value");
Map<Object, Object> validValues = view.getValidValues(p.getName());
Object description = validValues.get(value);

      out.write("\r\n");
      out.write("\r\n");

if (editable) { 

      out.write("\r\n");
      out.write("<select id=\"");
      out.print(propertyKey);
      out.write("\" name=\"");
      out.print(propertyKey);
      out.write("\" tabindex=\"1\" class=");
      out.print(style.getEditor());
      out.write(' ');
      out.print(script);
      out.write(" title=\"");
      out.print(p.getDescription(request));
      out.write("\">\r\n");
      out.write("    <option value=\"\"></option>\r\n");

	for (Map.Entry e: validValues.entrySet()) {
		String selected = e.getKey().equals(value) ?"selected":"";

      out.write("\r\n");
      out.write("\t<option value=\"");
      out.print(e.getKey());
      out.write('"');
      out.write(' ');
      out.print(selected);
      out.write('>');
      out.print(e.getValue());
      out.write("</option>\r\n");

	} // while

      out.write("\r\n");
      out.write("</select>\t\r\n");
      out.write("\r\n");
      out.write("<input type=\"hidden\" name=\"");
      out.print(propertyKey);
      out.write("__DESCRIPTION__\" value=\"");
      out.print(description);
      out.write("\"/>\r\n");
 
} else { 
	if (label) {

      out.write('\r');
      out.write('\n');
      out.write('	');
      out.print(description);
      out.write('\r');
      out.write('\n');

	}
	else {

      out.write("\r\n");
      out.write("\t<input name = \"");
      out.print(propertyKey);
      out.write("_DESCRIPTION_\" class=");
      out.print(style.getEditor());
      out.write("\r\n");
      out.write("\ttype=\"text\" \r\n");
      out.write("\ttitle=\"");
      out.print(p.getDescription(request));
      out.write("\"\t\r\n");
      out.write("\tmaxlength=\"");
      out.print(p.getSize());
      out.write("\" \t\r\n");
      out.write("\tsize=\"");
      out.print(p.getSize());
      out.write("\" \r\n");
      out.write("\tvalue=\"");
      out.print(description);
      out.write("\"\r\n");
      out.write("\tdisabled\r\n");
      out.write("\t/>\r\n");
  } 
      out.write("\r\n");
      out.write("\t<input type=\"hidden\" name=\"");
      out.print(propertyKey);
      out.write("\" value=\"");
      out.print(value);
      out.write("\">\t\r\n");
 } 
      out.write("\t\t\t\r\n");
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
