/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.50
 * Generated at: 2018-04-05 23:17:18 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.xava;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.openxava.controller.meta.MetaAction;

public final class bottomButtons_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/xava/imports.jsp", Long.valueOf(1522882332000L));
    _jspx_dependants.put("/WEB-INF/openxava.tld", Long.valueOf(1522882334000L));
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fxava_005fbutton_0026_005faction_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fxava_005fbutton_0026_005faction_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fxava_005fbutton_0026_005faction_005fnobody.release();
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

org.openxava.controller.ModuleManager manager = (org.openxava.controller.ModuleManager) context.get(request, "manager", "org.openxava.controller.ModuleManager");
manager.setSession(session);
if (manager.isBottomButtonsVisible()) { 
	
	boolean buttonBar = !"false".equalsIgnoreCase(request.getParameter("buttonBar"));
	String mode = request.getParameter("xava_mode"); 
	if (mode == null) mode = manager.isSplitMode()?"detail":manager.getModeName(); 
	
	String defaultAction = null; 
	if (org.openxava.util.XavaPreferences.getInstance().isShowDefaultActionInBottom() && manager.isDetailMode()) { 	
		defaultAction = manager.getDefaultActionQualifiedName();
	
      out.write('\n');
      out.write('	');
      //  xava:button
      org.openxava.web.taglib.ButtonTag _jspx_th_xava_005fbutton_005f0 = (org.openxava.web.taglib.ButtonTag) _005fjspx_005ftagPool_005fxava_005fbutton_0026_005faction_005fnobody.get(org.openxava.web.taglib.ButtonTag.class);
      _jspx_th_xava_005fbutton_005f0.setPageContext(_jspx_page_context);
      _jspx_th_xava_005fbutton_005f0.setParent(null);
      // /xava/bottomButtons.jsp(20,1) name = action type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_xava_005fbutton_005f0.setAction(defaultAction);
      int _jspx_eval_xava_005fbutton_005f0 = _jspx_th_xava_005fbutton_005f0.doStartTag();
      if (_jspx_th_xava_005fbutton_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fxava_005fbutton_0026_005faction_005fnobody.reuse(_jspx_th_xava_005fbutton_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fxava_005fbutton_0026_005faction_005fnobody.reuse(_jspx_th_xava_005fbutton_005f0);
      out.write('\n');
      out.write('	');
 
	} 
	
      out.write("\n");
      out.write("\t\n");
      out.write("\t");

	java.util.Iterator it = manager.getMetaActions().iterator();
	while (it.hasNext()) {
		MetaAction action = (MetaAction) it.next();
		if (!manager.actionApplies(action)) continue; 
		if (action.getQualifiedName().equals(defaultAction)) continue;
		if (action.appliesToMode(mode) && (!buttonBar || !(action.hasImage() ||  action.hasIcon()))) { 	
		
      out.write('\n');
      out.write('	');
      out.write('	');
      //  xava:button
      org.openxava.web.taglib.ButtonTag _jspx_th_xava_005fbutton_005f1 = (org.openxava.web.taglib.ButtonTag) _005fjspx_005ftagPool_005fxava_005fbutton_0026_005faction_005fnobody.get(org.openxava.web.taglib.ButtonTag.class);
      _jspx_th_xava_005fbutton_005f1.setPageContext(_jspx_page_context);
      _jspx_th_xava_005fbutton_005f1.setParent(null);
      // /xava/bottomButtons.jsp(33,2) name = action type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_xava_005fbutton_005f1.setAction(action.getQualifiedName());
      int _jspx_eval_xava_005fbutton_005f1 = _jspx_th_xava_005fbutton_005f1.doStartTag();
      if (_jspx_th_xava_005fbutton_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fxava_005fbutton_0026_005faction_005fnobody.reuse(_jspx_th_xava_005fbutton_005f1);
        return;
      }
      _005fjspx_005ftagPool_005fxava_005fbutton_0026_005faction_005fnobody.reuse(_jspx_th_xava_005fbutton_005f1);
      out.write('\n');
      out.write('	');
      out.write('	');

		}
	}
	
      out.write("\n");
      out.write("\t\n");
      out.write("\t");
  
	MetaAction defaultMetaAction = manager.getDefaultMetaAction();
	if (defaultMetaAction != null) {
	
      out.write("\n");
      out.write("\t<button name=\"xava.DEFAULT_ACTION\" type=\"submit\" \n");
      out.write("\t\tonclick=\"openxava.executeAction('");
      out.print(request.getParameter("application"));
      out.write("', '");
      out.print(request.getParameter("module"));
      out.write("', '");
      out.print(defaultMetaAction.getConfirmMessage(request));
      out.write('\'');
      out.write(',');
      out.write(' ');
      out.print(defaultMetaAction.isConfirm());
      out.write(',');
      out.write(' ');
      out.write('\'');
      out.print(manager.getDefaultActionQualifiedName());
      out.write("')\"\n");
      out.write("\t\tstyle=\"padding: 0; border: none; background-color:transparent; size: 0\"></button>\n");
      out.write("\t");

	}
	
      out.write('	');
      out.write('\n');
      out.write('\n');
 } // if (manager.isBottomButtonsVisible()) { 
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
