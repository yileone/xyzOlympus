/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.50
 * Generated at: 2018-04-09 13:45:19 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.xava;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.File;
import java.util.Arrays;
import org.openxava.util.XavaResources;
import org.openxava.util.Locales;
import org.openxava.util.Users;
import org.openxava.util.XSystem;
import org.openxava.util.Strings;
import org.openxava.util.Is;
import org.openxava.web.dwr.Module;
import org.openxava.web.servlets.Servlets;
import org.openxava.web.Ids;
import org.apache.commons.logging.LogFactory;
import org.apache.commons.logging.Log;

public final class module_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

private static Log log = LogFactory.getLog("module.jsp");

	private String getAdditionalParameters(HttpServletRequest request) {
		StringBuffer result = new StringBuffer();
		for (java.util.Enumeration en = request.getParameterNames(); en
				.hasMoreElements();) {
			String name = (String) en.nextElement();
			if ("application".equals(name) || "module".equals(name)
					|| "xava.portlet.application".equals(name)
					|| "xava.portlet.module".equals(name))
				continue;
			String value = request.getParameter(name);
			result.append('&');
			result.append(name);
			result.append('=');
			result.append(value);
		}
		return result.toString();
	}
  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/xava/imports.jsp", Long.valueOf(1522971365000L));
    _jspx_dependants.put("/WEB-INF/openxava.tld", Long.valueOf(1522971365000L));
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fxava_005fid_0026_005fname_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fxava_005fmessage_0026_005fkey_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fxava_005fid_0026_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fxava_005fmessage_0026_005fkey_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fxava_005fid_0026_005fname_005fnobody.release();
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
      out.write(' ');
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
      out.write('\n');
      out.write('\n');

	request.setAttribute("style", org.openxava.web.style.Style.getInstance(request));

      out.write('\n');
      out.write('\n');
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
      org.openxava.web.style.Style style = null;
      style = (org.openxava.web.style.Style) _jspx_page_context.getAttribute("style", javax.servlet.jsp.PageContext.REQUEST_SCOPE);
      if (style == null){
        style = new org.openxava.web.style.Style();
        _jspx_page_context.setAttribute("style", style, javax.servlet.jsp.PageContext.REQUEST_SCOPE);
      }
      out.write('\n');

	String windowId = context.getWindowId(request);
	context.setCurrentWindowId(windowId);	
	Locales.setCurrent(request);	
	request.getSession().setAttribute("xava.user",
			request.getRemoteUser());
	Users.setCurrent(request); 
	String app = request.getParameter("application");
	String module = context.getCurrentModule(request);
	String contextPath = (String) request.getAttribute("xava.contextPath");
	if (contextPath == null) contextPath = request.getContextPath();

	org.openxava.controller.ModuleManager managerHome = (org.openxava.controller.ModuleManager) context
			.get(request, "manager",
					"org.openxava.controller.ModuleManager");
	org.openxava.controller.ModuleManager manager = (org.openxava.controller.ModuleManager) context
			.get(app, module, "manager",
					"org.openxava.controller.ModuleManager");

	manager.setSession(session);
	managerHome.setSession(session); 
	manager.setApplicationName(request.getParameter("application"));

	manager.setModuleName(module); // In order to show the correct description in head
	
	boolean restoreLastMessage = false;
	if (manager.isFormUpload()) {
		new Module().requestMultipart(request, response, app, module);
	}
	else {
		restoreLastMessage = true;
	}	

	boolean isPortlet = (session.getAttribute(Ids.decorate(app, request
			.getParameter("module"), "xava.portlet.uploadActionURL")) != null);

	Module.setPortlet(isPortlet);
	boolean htmlHead = isPortlet?false:!Is.equalAsStringIgnoreCase(request.getParameter("htmlHead"), "false");
	String version = org.openxava.controller.ModuleManager.getVersion();
	String realPath = request.getSession().getServletContext()
			.getRealPath("/");			
	manager.resetPersistence();
	org.openxava.util.SessionData.setCurrent(request); 

      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "execute.jsp", out, false);
      out.write('\n');

	if (htmlHead) {	

      out.write("\n");
      out.write(" \n");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("\t<title>");
      out.print(managerHome.getModuleDescription());
      out.write("</title>\n");
      out.write("\t\n");
      out.write("\t");
      out.print(style.getMetaTags());
      out.write("\n");
      out.write("\t\n");
      out.write("\t");

 		String[] jsFiles = style.getNoPortalModuleJsFiles();
 			if (jsFiles != null) {
 				for (int i = 0; i < jsFiles.length; i++) {
 	
      out.write("\n");
      out.write("\t<script src=\"");
      out.print(contextPath);
      out.write("/xava/style/");
      out.print(jsFiles[i]);
      out.write("?ox=");
      out.print(version);
      out.write("\" type=\"text/javascript\"></script>\n");
      out.write("\t");

				}
			}
	
      out.write('\n');
      out.write('\n');

	}

	if (style.getCssFile() != null) {

      out.write("\n");
      out.write("\t<link href=\"");
      out.print(contextPath);
      out.write("/xava/style/");
      out.print(style.getCssFile());
      out.write("?ox=");
      out.print(version);
      out.write("\" rel=\"stylesheet\" type=\"text/css\">\n");

	}

	for (java.util.Iterator it = style.getAdditionalCssFiles()
			.iterator(); it.hasNext();) {
		String cssFile = (String) it.next();

      out.write(" \n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" media=\"all\" href=\"");
      out.print(contextPath);
      out.print(cssFile);
      out.write("?ox=");
      out.print(version);
      out.write("\"/>\n");

	}

      out.write('\n');
      out.write('	');

		File styleEditorsFolder = new File(realPath + "/xava/editors/style");		
		String[] styleEditors = styleEditorsFolder.list();
		Arrays.sort(styleEditors);
		for (int i = 0; i < styleEditors.length; i++) {
			if (styleEditors[i].endsWith(".css")) {
	
      out.write("\n");
      out.write("\t<link href=\"");
      out.print(contextPath);
      out.write("/xava/editors/style/");
      out.print(styleEditors[i]);
      out.write("?ox=");
      out.print(version);
      out.write("\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("\t");

			}
		}
	
      out.write("\t\t\n");
      out.write("\t<script type='text/javascript' src='");
      out.print(contextPath);
      out.write("/xava/js/dwr-engine.js?ox=");
      out.print(version);
      out.write("'></script>\n");
      out.write("\t<script type='text/javascript' src='");
      out.print(contextPath);
      out.write("/dwr/util.js?ox=");
      out.print(version);
      out.write("'></script>\n");
      out.write("\t<script type='text/javascript' src='");
      out.print(contextPath);
      out.write("/dwr/interface/Module.js?ox=");
      out.print(version);
      out.write("'></script>\n");
      out.write("\t<script type='text/javascript' src='");
      out.print(contextPath);
      out.write("/dwr/interface/Tab.js?ox=");
      out.print(version);
      out.write("'></script>\n");
      out.write("\t<script type='text/javascript' src='");
      out.print(contextPath);
      out.write("/dwr/interface/View.js?ox=");
      out.print(version);
      out.write("'></script>\n");
      out.write("\t<script type='text/javascript' src='");
      out.print(contextPath);
      out.write("/xava/js/openxava.js?ox=");
      out.print(version);
      out.write("'></script> \n");
      out.write("\t<script type='text/javascript'>\n");
      out.write("\t\topenxava.lastApplication='");
      out.print(app);
      out.write("'; \t\t\n");
      out.write("\t\topenxava.lastModule='");
      out.print(module);
      out.write("'; \t\n");
      out.write("\t\topenxava.language='");
      out.print(request.getLocale().getLanguage());
      out.write("';\n");
      out.write("\t</script>\t\n");
      out.write("\t");

		if (style.isNeededToIncludeCalendar()) {
	
      out.write("\n");
      out.write("\t<script type=\"text/javascript\" src=\"");
      out.print(contextPath);
      out.write("/xava/editors/calendar/calendar.js?ox=");
      out.print(version);
      out.write("\"></script>\n");
      out.write("\t<script type=\"text/javascript\" src=\"");
      out.print(contextPath);
      out.write("/xava/editors/calendar/lang/calendar-");
      out.print(Locales.getCurrent().getLanguage());
      out.write(".js?ox=");
      out.print(version);
      out.write("\"></script>\t\n");
      out.write("\t");

			}
		
      out.write("\t\n");
      out.write("\t<script type='text/javascript' src='");
      out.print(contextPath);
      out.write("/xava/js/calendar.js?ox=");
      out.print(version);
      out.write("'></script>\n");
      out.write("\t");

		if (new File(realPath + "/xava/js/custom-editors.js").exists()) {
	
      out.write("\n");
      out.write("\t<script type='text/javascript' src='");
      out.print(contextPath);
      out.write("/xava/js/custom-editors.js?ox=");
      out.print(version);
      out.write("'></script>\n");
      out.write("\t");

		log.warn(XavaResources.getString("custom_editors_deprecated"));
		}
	
      out.write("\t\n");
      out.write("\t<script type=\"text/javascript\">\n");
      out.write("\t\tif (typeof jQuery != \"undefined\") {  \n");
      out.write("\t\t\tportalJQuery = jQuery;\n");
      out.write("\t\t}       \n");
      out.write("\t</script>\n");
      out.write("\t  \n");
      out.write("\t<script type=\"text/javascript\" src=\"");
      out.print(contextPath);
      out.write("/xava/js/jquery.js?ox=");
      out.print(version);
      out.write("\"></script>\t \n");
      out.write("\t<script type=\"text/javascript\" src=\"");
      out.print(contextPath);
      out.write("/xava/js/jquery-ui.js?ox=");
      out.print(version);
      out.write("\"></script>\n");
      out.write("\t<script type=\"text/javascript\" src=\"");
      out.print(contextPath);
      out.write("/xava/js/jquery.sorttable.js?ox=");
      out.print(version);
      out.write("\"></script>\t\n");
      out.write("\t<script type=\"text/javascript\" src=\"");
      out.print(contextPath);
      out.write("/xava/js/jquery.ui.touch-punch.js?ox=");
      out.print(version);
      out.write("\"></script>\n");
      out.write("\t<script type='text/javascript' src='");
      out.print(contextPath);
      out.write("/xava/js/typewatch.js?ox=");
      out.print(version);
      out.write("'></script>\n");
      out.write("\t");

		File jsEditorsFolder = new File(realPath + "/xava/editors/js");		
		String[] jsEditors = jsEditorsFolder.list();
		Arrays.sort(jsEditors);
		for (int i = 0; i < jsEditors.length; i++) {
			if (jsEditors[i].endsWith(".js")) {
	
      out.write("\n");
      out.write("\t<script type=\"text/javascript\" src=\"");
      out.print(contextPath);
      out.write("/xava/editors/js/");
      out.print(jsEditors[i]);
      out.write("?ox=");
      out.print(version);
      out.write("\"></script>\n");
      out.write("\t");

			}
		}
		
		String[] jsFiles = request.getParameterValues("jsFiles");
		if (jsFiles != null) {
			for (int i = 0; i < jsFiles.length; i++) {
				if (jsFiles[i].endsWith(".js")) {
	
      out.write("\n");
      out.write("\t<script type=\"text/javascript\" src=\"");
      out.print(contextPath);
      out.write('/');
      out.print(jsFiles[i]);
      out.write("?ox=");
      out.print(version);
      out.write("\"></script>\t\t\t\t\n");
      out.write("\t");
			}
			}
		}	
	
      out.write("\t\n");
      out.write("\t<script type=\"text/javascript\">\n");
      out.write("\t\t$ = jQuery;\n");
      out.write("\t\tif (typeof portalJQuery != \"undefined\") {  \n");
      out.write("\t\t\tjQuery = portalJQuery;    \n");
      out.write("\t\t}   \n");
      out.write("\t</script>\n");

	if (htmlHead) { 	

      out.write("\n");
      out.write("</head> \n");
      out.write("<body bgcolor=\"#ffffff\">\n");
      out.print(style.getNoPortalModuleStartDecoration(managerHome
						.getModuleDescription()));
      out.write('\n');

	}

      out.write(' ');
      out.write('\n');
 
boolean coreViaAJAX = !manager.getPreviousModules().isEmpty() || manager.getDialogLevel() > 0 || manager.hasInitForwardActions();
if (!coreViaAJAX && restoreLastMessage) {
	Module.restoreLastMessages(request, app, module);
}	

if (manager.isResetFormPostNeeded()) {	

      out.write("\t\t\n");
      out.write("\t<form id=\"xava_reset_form\">\n");
      out.write("\t\t");
 if (!"true".equals(request.getParameter("friendlyURL"))) { // To support old URL style (with xava/moduls.jsp?application=...) 
      out.write("\n");
      out.write("\t\t<input name=\"application\" type=\"hidden\" value=\"");
      out.print(request.getParameter("application"));
      out.write("\"/>\n");
      out.write("\t\t<input name=\"module\" type=\"hidden\" value=\"");
      out.print(request.getParameter("module"));
      out.write("\"/>\n");
      out.write("\t\t");
 } 
      out.write("\n");
      out.write("\t</form>\n");
 } else  { 
      out.write('\n');
      out.write('	');
 manager.executeBeforeLoadPage(request, errors, messages);  
      out.write("\n");
      out.write("\t<input id=\"xava_last_module_change\" type=\"hidden\" value=\"\"/>\n");
      out.write("\t<input id=\"xava_window_id\" type=\"hidden\" value=\"");
      out.print(windowId);
      out.write("\"/>\t\n");
      out.write("\t<input id=\"");
      if (_jspx_meth_xava_005fid_005f0(_jspx_page_context))
        return;
      out.write("\" type=\"hidden\" value=\"");
      out.print(coreViaAJAX);
      out.write("\"/>\n");
      out.write("\t<input id=\"");
      if (_jspx_meth_xava_005fid_005f1(_jspx_page_context))
        return;
      out.write("\" type=\"hidden\" value=\"\"/>\n");
      out.write("\t<input id=\"");
      if (_jspx_meth_xava_005fid_005f2(_jspx_page_context))
        return;
      out.write("\" type=\"hidden\" value=\"\"/>\n");
      out.write("\t\t\n");
      out.write("\t");
      out.write("\n");
      out.write("\t<div id='xava_processing_layer' style='display:none;'>\n");
      out.write("\t\t");
      out.print(XavaResources.getString(request, "processing"));
      out.write("<br/>\n");
      out.write("\t\t<img src='");
      out.print(contextPath);
      out.write('/');
      out.print(style.getProcessingImage());
      out.write("'/>\n");
      out.write("\t</div>\t\n");
      out.write("\t");
      out.print(style.getCoreStartDecoration());
      out.write("\n");
      out.write("\t<div id=\"");
      if (_jspx_meth_xava_005fid_005f3(_jspx_page_context))
        return;
      out.write("\" style=\"display: inline;\" class=\"");
      out.print(style.getModule());
      out.write("\">\n");
      out.write("\t\t");
			
			if (!coreViaAJAX) {
		
      out.write('\n');
      out.write('	');
      out.write('	');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "core.jsp", out, false);
      out.write('\n');
      out.write('	');
      out.write('	');

			}
		
      out.write("\t\t\n");
      out.write("\t</div>\n");
      out.write("\t");
      out.print(style.getCoreEndDecoration());
      out.write('\n');
      out.write('	');
      out.write('\n');
 } 
      out.write("\t\t\t\n");
      out.write("\t<div id=\"xava_console\" >\n");
      out.write("\t</div>\n");
      out.write("\t");
 String loadingImage=!style.getLoadingImage().startsWith("/")?contextPath + "/" + style.getLoadingImage():style.getLoadingImage();
      out.write("\n");
      out.write("\t<div id=\"xava_loading\">\t\t\t\t\n");
      out.write("\t\t<img src=\"");
      out.print(loadingImage);
      out.write("\" style=\"vertical-align: middle\"/>\n");
      out.write("\t\t&nbsp;");
      if (_jspx_meth_xava_005fmessage_005f0(_jspx_page_context))
        return;
      out.write("...\t\t \n");
      out.write("\t</div>\n");
      out.write("\t");
 if (!style.isFixedPositionSupported()) { 
      out.write("\n");
      out.write("\t<div id=\"xava_loading2\">\t\t\n");
      out.write("\t\t<img src=\"");
      out.print(loadingImage);
      out.write("\" style=\"vertical-align: middle\"/>\n");
      out.write("\t\t&nbsp;");
      if (_jspx_meth_xava_005fmessage_005f1(_jspx_page_context))
        return;
      out.write("...\n");
      out.write("\t</div>\t\n");
      out.write("\t");
 } 
      out.write('	');
      out.write('\n');

	if (htmlHead) { 	

      out.write('\n');
      out.print(style.getNoPortalModuleEndDecoration());
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");

	}

      out.write('\n');
      out.write('\n');
 
if (manager.isResetFormPostNeeded()) {  
	manager.setResetFormPostNeeded(false);		

      out.write("\t\t\n");
      out.write("\t<script type=\"text/javascript\">\n");
      out.write("\t$(\"#xava_reset_form\").submit();\n");
      out.write("\t</script>\t\t\n");
 } else  { 		
		String browser = request.getHeader("user-agent"); 

      out.write("\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\">\n");
String prefix = Strings.change(manager.getApplicationName(), "-",
					"_")
					+ "_" + Strings.change(manager.getModuleName(), "-", "_");
			String onLoadFunction = prefix + "_openxavaOnLoad";
			String initiated = prefix + "_initiated";
      out.write('\n');
      out.print(onLoadFunction);
      out.write(" = function() { \n");
      out.write("\tif (openxava != null && openxava.");
      out.print(initiated);
      out.write(" == null) {\n");
      out.write("\t\topenxava.showFiltersMessage = '");
      if (_jspx_meth_xava_005fmessage_005f2(_jspx_page_context))
        return;
      out.write("';\n");
      out.write("\t\topenxava.hideFiltersMessage = '");
      if (_jspx_meth_xava_005fmessage_005f3(_jspx_page_context))
        return;
      out.write("';\n");
      out.write("\t\topenxava.selectedRowClass = '");
      out.print(style.getSelectedRow());
      out.write("';\n");
      out.write("\t\topenxava.currentRowClass = '");
      out.print(style.getCurrentRow());
      out.write("';\n");
      out.write("\t\topenxava.currentRowCellClass = '");
      out.print(style.getCurrentRowCell());
      out.write("';\n");
      out.write("\t\topenxava.selectedListFormatClass = '");
      out.print(style.getSelectedListFormat());
      out.write("'; \n");
      out.write("\t\topenxava.customizeControlsClass = '");
      out.print(style.getCustomizeControls());
      out.write("'; \n");
      out.write("\t\topenxava.listAdjustment = ");
      out.print(style.getListAdjustment());
      out.write(";\n");
      out.write("\t\topenxava.collectionAdjustment = ");
      out.print(style.getCollectionAdjustment());
      out.write(";\n");
      out.write("\t\topenxava.closeDialogOnEscape = ");
      out.print(browser != null && browser.indexOf("Firefox") >= 0 ? "false":"true");
      out.write(";\t\t  \n");
      out.write("\t\topenxava.calendarAlign = '");
      out.print(browser != null && browser.indexOf("MSIE 6") >= 0 ? "tr":"Br");
      out.write("';\n");
      out.write("\t\t");
 java.text.DecimalFormatSymbols symbols = java.text.DecimalFormatSymbols.getInstance(Locales.getCurrent()); 
      out.write("\n");
      out.write("\t\topenxava.decimalSeparator = '");
      out.print(symbols.getDecimalSeparator());
      out.write("';\n");
      out.write("\t\topenxava.groupingSeparator = '");
      out.print(symbols.getGroupingSeparator());
      out.write("';\n");
      out.write("\t\topenxava.setHtml = ");
      out.print(style.getSetHtmlFunction());
      out.write(";\t\t\t\n");
      out.write("\t\t");
String initThemeScript = style.getInitThemeScript();
			if (initThemeScript != null) {
      out.write("\n");
      out.write("\t\topenxava.initTheme = function () { ");
      out.print(style.getInitThemeScript());
      out.write(" }; \n");
      out.write("\t\t");
}
      out.write("\n");
      out.write("\t\topenxava.init(\"");
      out.print(manager.getApplicationName());
      out.write("\", \"");
      out.print(manager.getModuleName());
      out.write("\");\n");
      out.write("\t\t");
if (coreViaAJAX) {
      out.write("\n");
      out.write("\t\topenxava.ajaxRequest(\"");
      out.print(manager.getApplicationName());
      out.write("\", \"");
      out.print(manager.getModuleName());
      out.write("\", true);\t\n");
      out.write("\t\t");
} else {
      out.write("\n");
      out.write("\t\topenxava.setFocus(\"");
      out.print(manager.getApplicationName());
      out.write("\", \"");
      out.print(manager.getModuleName());
      out.write("\"); \n");
      out.write("\t\t");
}
      out.write("\n");
      out.write("\t\topenxava.");
      out.print(initiated);
      out.write(" = true;\n");
      out.write("\t}\t\n");
      out.write("}\n");
      out.print(onLoadFunction);
      out.write("();\n");
      out.write("document.additionalParameters=\"");
      out.print(getAdditionalParameters(request));
      out.write("\";\n");
      out.write("</script>\n");
 }
manager.commit();
context.cleanCurrentWindowId(); 
org.openxava.util.SessionData.clean(); 

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

  private boolean _jspx_meth_xava_005fid_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  xava:id
    org.openxava.web.taglib.IdTag _jspx_th_xava_005fid_005f0 = (org.openxava.web.taglib.IdTag) _005fjspx_005ftagPool_005fxava_005fid_0026_005fname_005fnobody.get(org.openxava.web.taglib.IdTag.class);
    _jspx_th_xava_005fid_005f0.setPageContext(_jspx_page_context);
    _jspx_th_xava_005fid_005f0.setParent(null);
    // /xava/module.jsp(239,12) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_xava_005fid_005f0.setName("loading");
    int _jspx_eval_xava_005fid_005f0 = _jspx_th_xava_005fid_005f0.doStartTag();
    if (_jspx_th_xava_005fid_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fxava_005fid_0026_005fname_005fnobody.reuse(_jspx_th_xava_005fid_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fxava_005fid_0026_005fname_005fnobody.reuse(_jspx_th_xava_005fid_005f0);
    return false;
  }

  private boolean _jspx_meth_xava_005fid_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  xava:id
    org.openxava.web.taglib.IdTag _jspx_th_xava_005fid_005f1 = (org.openxava.web.taglib.IdTag) _005fjspx_005ftagPool_005fxava_005fid_0026_005fname_005fnobody.get(org.openxava.web.taglib.IdTag.class);
    _jspx_th_xava_005fid_005f1.setPageContext(_jspx_page_context);
    _jspx_th_xava_005fid_005f1.setParent(null);
    // /xava/module.jsp(240,12) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_xava_005fid_005f1.setName("loaded_parts");
    int _jspx_eval_xava_005fid_005f1 = _jspx_th_xava_005fid_005f1.doStartTag();
    if (_jspx_th_xava_005fid_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fxava_005fid_0026_005fname_005fnobody.reuse(_jspx_th_xava_005fid_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fxava_005fid_0026_005fname_005fnobody.reuse(_jspx_th_xava_005fid_005f1);
    return false;
  }

  private boolean _jspx_meth_xava_005fid_005f2(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  xava:id
    org.openxava.web.taglib.IdTag _jspx_th_xava_005fid_005f2 = (org.openxava.web.taglib.IdTag) _005fjspx_005ftagPool_005fxava_005fid_0026_005fname_005fnobody.get(org.openxava.web.taglib.IdTag.class);
    _jspx_th_xava_005fid_005f2.setPageContext(_jspx_page_context);
    _jspx_th_xava_005fid_005f2.setParent(null);
    // /xava/module.jsp(241,12) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_xava_005fid_005f2.setName("view_member");
    int _jspx_eval_xava_005fid_005f2 = _jspx_th_xava_005fid_005f2.doStartTag();
    if (_jspx_th_xava_005fid_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fxava_005fid_0026_005fname_005fnobody.reuse(_jspx_th_xava_005fid_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fxava_005fid_0026_005fname_005fnobody.reuse(_jspx_th_xava_005fid_005f2);
    return false;
  }

  private boolean _jspx_meth_xava_005fid_005f3(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  xava:id
    org.openxava.web.taglib.IdTag _jspx_th_xava_005fid_005f3 = (org.openxava.web.taglib.IdTag) _005fjspx_005ftagPool_005fxava_005fid_0026_005fname_005fnobody.get(org.openxava.web.taglib.IdTag.class);
    _jspx_th_xava_005fid_005f3.setPageContext(_jspx_page_context);
    _jspx_th_xava_005fid_005f3.setParent(null);
    // /xava/module.jsp(249,10) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_xava_005fid_005f3.setName("core");
    int _jspx_eval_xava_005fid_005f3 = _jspx_th_xava_005fid_005f3.doStartTag();
    if (_jspx_th_xava_005fid_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fxava_005fid_0026_005fname_005fnobody.reuse(_jspx_th_xava_005fid_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fxava_005fid_0026_005fname_005fnobody.reuse(_jspx_th_xava_005fid_005f3);
    return false;
  }

  private boolean _jspx_meth_xava_005fmessage_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  xava:message
    org.openxava.web.taglib.MessageTag _jspx_th_xava_005fmessage_005f0 = (org.openxava.web.taglib.MessageTag) _005fjspx_005ftagPool_005fxava_005fmessage_0026_005fkey_005fnobody.get(org.openxava.web.taglib.MessageTag.class);
    _jspx_th_xava_005fmessage_005f0.setPageContext(_jspx_page_context);
    _jspx_th_xava_005fmessage_005f0.setParent(null);
    // /xava/module.jsp(266,8) name = key type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_xava_005fmessage_005f0.setKey("loading");
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
    // /xava/module.jsp(271,8) name = key type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_xava_005fmessage_005f1.setKey("loading");
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
    // /xava/module.jsp(303,33) name = key type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_xava_005fmessage_005f2.setKey("show_filters");
    int _jspx_eval_xava_005fmessage_005f2 = _jspx_th_xava_005fmessage_005f2.doStartTag();
    if (_jspx_th_xava_005fmessage_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fxava_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_xava_005fmessage_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fxava_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_xava_005fmessage_005f2);
    return false;
  }

  private boolean _jspx_meth_xava_005fmessage_005f3(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  xava:message
    org.openxava.web.taglib.MessageTag _jspx_th_xava_005fmessage_005f3 = (org.openxava.web.taglib.MessageTag) _005fjspx_005ftagPool_005fxava_005fmessage_0026_005fkey_005fnobody.get(org.openxava.web.taglib.MessageTag.class);
    _jspx_th_xava_005fmessage_005f3.setPageContext(_jspx_page_context);
    _jspx_th_xava_005fmessage_005f3.setParent(null);
    // /xava/module.jsp(304,33) name = key type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_xava_005fmessage_005f3.setKey("hide_filters");
    int _jspx_eval_xava_005fmessage_005f3 = _jspx_th_xava_005fmessage_005f3.doStartTag();
    if (_jspx_th_xava_005fmessage_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fxava_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_xava_005fmessage_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fxava_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_xava_005fmessage_005f3);
    return false;
  }
}
