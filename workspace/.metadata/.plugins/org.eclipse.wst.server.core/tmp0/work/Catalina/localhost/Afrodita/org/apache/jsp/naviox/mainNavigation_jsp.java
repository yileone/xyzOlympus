/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.50
 * Generated at: 2018-04-05 23:15:18 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.naviox;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Iterator;
import org.openxava.application.meta.MetaModule;
import org.openxava.util.Users;
import org.openxava.util.Is;
import com.openxava.naviox.Modules;
import com.openxava.naviox.util.NaviOXPreferences;
import com.openxava.naviox.util.Organizations;

public final class mainNavigation_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/openxava.tld", Long.valueOf(1522882334000L));
    _jspx_dependants.put("/naviox/../xava/imports.jsp", Long.valueOf(1522882332000L));
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

      out.write('\n');
      out.write('\n');
      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
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
 if (modules.hasModules()) { 
      out.write("\n");
      out.write("<a id=\"show_modules\" href=\"\">");
      if (_jspx_meth_xava_005fmessage_005f0(_jspx_page_context))
        return;
      out.write("</a>\t\n");
 } 
      out.write('\n');
      out.write('\n');

String allModulesClass = modules.hasModules()?"main-navigation-left-with-all-modules":"main-navigation-left-without-all-modules";
boolean showsIndexLink = modules.showsIndexLink();

      out.write("\n");
      out.write("\n");
      out.write("&nbsp; \n");
      out.write("<div id=\"main_navigation_left\" class=\"");
      out.print(allModulesClass);
      out.write("\">\n");
      out.write("<nobr>\n");
      out.write("&nbsp; \n");
 if (Users.getCurrent() != null && showsIndexLink) { 
      out.write("\n");
      out.write("\t<div id=\"organizations_link_place\"></div>\t\n");
      out.write("\t<a id=\"organizations_link\" href=\"");
      out.print(request.getContextPath());
      out.write("/m/Index\" class='");
      out.print("Index".equals(request.getParameter("module"))?"selected":"");
      out.write("'>\n");
      out.write("\t\t<i class=\"mdi mdi-apps\"></i>\n");
      out.write("\t</a> \n");
 } 
      out.write('\n');
 
for (Iterator it= modules.getTopModules().iterator(); it.hasNext();) {
	MetaModule module = (MetaModule) it.next();
	if (module.getName().equals("SignIn")) continue;
	if (showsIndexLink && module.getName().equals("Index")) continue; 
	String selected = module.getName().equals(request.getParameter("module"))?"selected":"";

      out.write("\t\t\n");
      out.write("\t<a  href=\"");
      out.print(modules.getModuleURI(request, module));
      out.write("?retainOrder=true\" class=\"");
      out.print(selected);
      out.write("\">\n");
      out.write("\t\t");
      out.print(module.getLabel(request.getLocale()));
      out.write("\n");
      out.write("\t</a>\n");
      out.write("\t\n");

}

      out.write("\n");
      out.write("</nobr>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<span id=\"main_navigation_right\">\n");
      out.write("<nobr>\n");
      out.write("<span \n");
      out.write("\tid=\"main_navigation_right_bridge1\">&nbsp;&nbsp;&nbsp;</span><span \n");
      out.write("\tid=\"main_navigation_right_bridge2\">&nbsp;&nbsp;&nbsp;</span><span \n");
      out.write("\tid=\"main_navigation_right_content\">\n");

if (Is.emptyString(NaviOXPreferences.getInstance().getAutologinUser())) {
	String userName = Users.getCurrent();
	String currentModule = request.getParameter("module");
	boolean showSignIn = userName == null && !currentModule.equals("SignIn");
	
	if (showSignIn) {
		String selected = "SignIn".equals(currentModule)?"selected":"";

      out.write("\n");
      out.write("<a href=\"");
      out.print(request.getContextPath());
      out.write("/m/SignIn\" class=\"sign-in ");
      out.print(selected);
      out.write("\">\n");
      out.write("\t\t");
      if (_jspx_meth_xava_005fmessage_005f1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("</a>\n");

	}
	if (userName != null) {
		String organization = Organizations.getCurrent(request);
		if (organization == null) organization = "";

      out.write("\n");
      out.write("<a  href=\"");
      out.print(request.getContextPath());
      out.write("/naviox/signOut.jsp?organization=");
      out.print(organization);
      out.write("\" class=\"sign-in\">");
      if (_jspx_meth_xava_005fmessage_005f2(_jspx_page_context))
        return;
      out.write(' ');
      out.write('(');
      out.print(userName);
      out.write(")</a>\n");

	}
} 

      out.write("\n");
      out.write("</span></nobr></span>");
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

  private boolean _jspx_meth_xava_005fmessage_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  xava:message
    org.openxava.web.taglib.MessageTag _jspx_th_xava_005fmessage_005f0 = (org.openxava.web.taglib.MessageTag) _005fjspx_005ftagPool_005fxava_005fmessage_0026_005fkey_005fnobody.get(org.openxava.web.taglib.MessageTag.class);
    _jspx_th_xava_005fmessage_005f0.setPageContext(_jspx_page_context);
    _jspx_th_xava_005fmessage_005f0.setParent(null);
    // /naviox/mainNavigation.jsp(14,29) name = key type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_xava_005fmessage_005f0.setKey("all_modules");
    int _jspx_eval_xava_005fmessage_005f0 = _jspx_th_xava_005fmessage_005f0.doStartTag();
    if (_jspx_th_xava_005fmessage_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fxava_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_xava_005fmessage_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fxava_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_xava_005fmessage_005f0);
    return false;
  }

  private boolean _jspx_meth_xava_005fmessage_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  xava:message
    org.openxava.web.taglib.MessageTag _jspx_th_xava_005fmessage_005f1 = (org.openxava.web.taglib.MessageTag) _005fjspx_005ftagPool_005fxava_005fmessage_0026_005fkey_005fnobody.get(org.openxava.web.taglib.MessageTag.class);
    _jspx_th_xava_005fmessage_005f1.setPageContext(_jspx_page_context);
    _jspx_th_xava_005fmessage_005f1.setParent(null);
    // /naviox/mainNavigation.jsp(65,2) name = key type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_xava_005fmessage_005f1.setKey("signin");
    int _jspx_eval_xava_005fmessage_005f1 = _jspx_th_xava_005fmessage_005f1.doStartTag();
    if (_jspx_th_xava_005fmessage_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fxava_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_xava_005fmessage_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fxava_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_xava_005fmessage_005f1);
    return false;
  }

  private boolean _jspx_meth_xava_005fmessage_005f2(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  xava:message
    org.openxava.web.taglib.MessageTag _jspx_th_xava_005fmessage_005f2 = (org.openxava.web.taglib.MessageTag) _005fjspx_005ftagPool_005fxava_005fmessage_0026_005fkey_005fnobody.get(org.openxava.web.taglib.MessageTag.class);
    _jspx_th_xava_005fmessage_005f2.setPageContext(_jspx_page_context);
    _jspx_th_xava_005fmessage_005f2.setParent(null);
    // /naviox/mainNavigation.jsp(73,107) name = key type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_xava_005fmessage_005f2.setKey("signout");
    int _jspx_eval_xava_005fmessage_005f2 = _jspx_th_xava_005fmessage_005f2.doStartTag();
    if (_jspx_th_xava_005fmessage_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fxava_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_xava_005fmessage_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fxava_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_xava_005fmessage_005f2);
    return false;
  }
}
