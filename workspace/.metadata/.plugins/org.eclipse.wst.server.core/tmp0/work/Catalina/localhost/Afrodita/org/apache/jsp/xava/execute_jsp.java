/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.50
 * Generated at: 2018-04-05 23:15:19 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.xava;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Map;
import java.util.Enumeration;
import java.util.StringTokenizer;
import org.openxava.web.Ids;
import java.awt.event.InputEvent;
import java.util.Collection;
import java.util.Iterator;
import javax.swing.KeyStroke;
import org.openxava.controller.meta.MetaAction;
import org.openxava.view.View;
import org.openxava.util.Is;
import org.openxava.util.Users;
import org.openxava.util.Locales;
import org.openxava.util.XavaResources;

public final class execute_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      org.openxava.util.Messages errors = null;
      errors = (org.openxava.util.Messages) _jspx_page_context.getAttribute("errors", javax.servlet.jsp.PageContext.REQUEST_SCOPE);
      if (errors == null){
        errors = new org.openxava.util.Messages();
        _jspx_page_context.setAttribute("errors", errors, javax.servlet.jsp.PageContext.REQUEST_SCOPE);
      }
      out.write('\n');
      org.openxava.util.Messages messages = null;
      messages = (org.openxava.util.Messages) _jspx_page_context.getAttribute("messages", javax.servlet.jsp.PageContext.REQUEST_SCOPE);
      if (messages == null){
        messages = new org.openxava.util.Messages();
        _jspx_page_context.setAttribute("messages", messages, javax.servlet.jsp.PageContext.REQUEST_SCOPE);
      }
      out.write('\n');
      org.openxava.controller.ModuleContext context = null;
      synchronized (session) {
        context = (org.openxava.controller.ModuleContext) _jspx_page_context.getAttribute("context", javax.servlet.jsp.PageContext.SESSION_SCOPE);
        if (context == null){
          context = new org.openxava.controller.ModuleContext();
          _jspx_page_context.setAttribute("context", context, javax.servlet.jsp.PageContext.SESSION_SCOPE);
        }
      }
      out.write('\n');
      out.write('\n');

String browser = (String) request.getAttribute("xava.portlet.user-agent");
if (browser == null) { 
	browser = request.getHeader("user-agent");
	request.setAttribute("xava.portlet.user-agent", browser);
}
Locales.setCurrent(request);

org.openxava.controller.ModuleManager manager = (org.openxava.controller.ModuleManager) context.get(request, "manager", "org.openxava.controller.ModuleManager");
manager.setSession(session);

org.openxava.tab.Tab t = (org.openxava.tab.Tab) context.get(request, "xava_tab");
request.setAttribute("tab", t);

      out.write('\n');
      org.openxava.tab.Tab tab = null;
      tab = (org.openxava.tab.Tab) _jspx_page_context.getAttribute("tab", javax.servlet.jsp.PageContext.REQUEST_SCOPE);
      if (tab == null){
        tab = new org.openxava.tab.Tab();
        _jspx_page_context.setAttribute("tab", tab, javax.servlet.jsp.PageContext.REQUEST_SCOPE);
      }
      out.write('\n');

View view = (View) context.get(request, "xava_view");
String[] deselected = request.getParameterValues("deselected");
if (deselected != null){
	for (int i = 0; i < deselected.length; i++){
		String d = deselected[i];
		if (d.contains("xava_tab")) tab.friendExecuteJspDeselect(d);
		else if (d.contains("xava_collectionTab")) {
			view.deselectCollection(d);
		}
	}	
}

      out.write('\n');
      out.write('\n');
 if (!"false".equals(request.getAttribute("xava.sendParametersToTab"))) { 
      out.write(' ');
      out.write(' ');
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.introspecthelper(_jspx_page_context.findAttribute("tab"), "selected", request.getParameter("selected"), request, "selected", false);
      out.write('\n');
 } 
      out.write('\n');
      out.write('\n');

manager.setApplicationName(request.getParameter("application"));
manager.setModuleName(request.getParameter("module"));
manager.executeBeforeEachRequestActions(request, errors, messages);
view.setRequest(request);
view.setErrors(errors);
view.setMessages(messages);

java.util.Stack previousViews = (java.util.Stack) context.get(request, "xava_previousViews");
for (Iterator it = previousViews.iterator(); it.hasNext(); ) {
	View previousView = (View) it.next();
	previousView.setRequest(request);
	previousView.setErrors(errors);
	previousView.setMessages(messages);	
}

tab.setRequest(request);
tab.setErrors(errors); 
if (manager.isListMode() || manager.isSplitMode() && manager.getDialogLevel() == 0) {   
	tab.setModelName(manager.getModelName());
	if (tab.getTabName() == null) { 
		tab.setTabName(manager.getTabName());
	}
}
boolean hasProcessRequest = manager.hasProcessRequest(request);
manager.preInitModule(request); 
if (manager.isXavaView(request)) { 
	if (hasProcessRequest) {	
		view.assignValuesToWebView();
	}
}
manager.initModule(request, errors, messages);
manager.executeOnEachRequestActions(request, errors, messages); 
if (hasProcessRequest) {
	manager.execute(request, errors, messages);	
	if (manager.isListMode() || manager.isSplitMode() && manager.getDialogLevel() == 0) { // here and before execute the action
		tab.setModelName(manager.getModelName());	
		if (tab.getTabName() == null) { 
			tab.setTabName(manager.getTabName());
		}
	}
}
//after-each-request
manager.executeAfterEachRequestActions(request, errors, messages);

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
