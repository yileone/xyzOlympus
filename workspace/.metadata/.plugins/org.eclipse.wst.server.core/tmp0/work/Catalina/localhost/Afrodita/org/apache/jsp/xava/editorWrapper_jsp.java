/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.50
 * Generated at: 2018-02-16 19:38:47 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.xava;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class editorWrapper_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/xava/imports.jsp", Long.valueOf(1518753921217L));
    _jspx_dependants.put("/WEB-INF/openxava.tld", Long.valueOf(1518753924007L));
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fxava_005feditor_0026_005fthrowPropertyChanged_005fproperty_005feditable_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fxava_005feditor_0026_005fthrowPropertyChanged_005fproperty_005feditable_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fxava_005feditor_0026_005fthrowPropertyChanged_005fproperty_005feditable_005fnobody.release();
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

      out.write('\n');
      out.write('\n');
      out.write('\n');
      out.write('\n');
      out.write('\n');
      //  xava:editor
      org.openxava.web.taglib.EditorTag _jspx_th_xava_005feditor_005f0 = (org.openxava.web.taglib.EditorTag) _005fjspx_005ftagPool_005fxava_005feditor_0026_005fthrowPropertyChanged_005fproperty_005feditable_005fnobody.get(org.openxava.web.taglib.EditorTag.class);
      _jspx_th_xava_005feditor_005f0.setPageContext(_jspx_page_context);
      _jspx_th_xava_005feditor_005f0.setParent(null);
      // /xava/editorWrapper.jsp(3,0) name = property type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_xava_005feditor_005f0.setProperty(request.getParameter("propertyName"));
      // /xava/editorWrapper.jsp(3,0) name = editable type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_xava_005feditor_005f0.setEditable(Boolean.valueOf(request.getParameter("editable")).booleanValue());
      // /xava/editorWrapper.jsp(3,0) name = throwPropertyChanged type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_xava_005feditor_005f0.setThrowPropertyChanged(Boolean.valueOf(request.getParameter("throwPropertyChanged")).booleanValue());
      int _jspx_eval_xava_005feditor_005f0 = _jspx_th_xava_005feditor_005f0.doStartTag();
      if (_jspx_th_xava_005feditor_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fxava_005feditor_0026_005fthrowPropertyChanged_005fproperty_005feditable_005fnobody.reuse(_jspx_th_xava_005feditor_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fxava_005feditor_0026_005fthrowPropertyChanged_005fproperty_005feditable_005fnobody.reuse(_jspx_th_xava_005feditor_005f0);
      out.write('\n');
      out.write('	');
      out.write('\n');
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
