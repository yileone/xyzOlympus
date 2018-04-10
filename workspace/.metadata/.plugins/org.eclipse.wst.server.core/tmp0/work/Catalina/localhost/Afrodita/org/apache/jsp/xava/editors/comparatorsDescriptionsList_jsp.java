/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.50
 * Generated at: 2018-04-10 13:20:53 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.xava.editors;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.openxava.filters.IFilter;
import org.openxava.filters.IRequestFilter;
import org.openxava.component.MetaComponent;
import org.openxava.tab.Tab;
import org.openxava.tab.meta.MetaTab;
import org.openxava.util.KeyAndDescription;
import org.openxava.util.Is;
import org.openxava.util.XavaResources;
import org.openxava.model.meta.MetaProperty;
import org.openxava.calculators.DescriptionsCalculator;
import org.openxava.formatters.IFormatter;

public final class comparatorsDescriptionsList_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/xava/editors/../imports.jsp", Long.valueOf(1523283761000L));
    _jspx_dependants.put("/WEB-INF/openxava.tld", Long.valueOf(1523283762000L));
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fxava_005fid_0026_005fname_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fxava_005fid_0026_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fxava_005fid_0026_005fname_005fnobody.release();
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

String propertyKey = request.getParameter("propertyKey");
int index = Integer.parseInt(request.getParameter("index"));
String prefix = request.getParameter("prefix");
if (prefix == null) prefix = "";
String value = index < 0?(String) request.getAttribute(propertyKey + ".fvalue"):request.getParameter("value"); 
IFormatter formatter = null;
String descriptionsFormatterClass=request.getParameter("descriptionsFormatter");
if (descriptionsFormatterClass == null) {
	descriptionsFormatterClass=request.getParameter("formateadorDescripciones");
}
if (descriptionsFormatterClass != null) {
	String descriptionsFormatterKey = propertyKey + ".descriptionsFormatter";
	formatter = (IFormatter) request.getSession().getAttribute(descriptionsFormatterKey);	
	if (formatter == null) {
		try {
			formatter = (IFormatter) Class.forName(descriptionsFormatterClass).newInstance();
			request.getSession().setAttribute(descriptionsFormatterKey, formatter);	
		}
		catch (Exception ex) {
			ex.printStackTrace();
			System.err.println(XavaResources.getString("descriptionsEditor_descriptions_formatter_warning", propertyKey));
		}
	}
}

DescriptionsCalculator calculator = new DescriptionsCalculator();
// The arguments in English and Spanish for compatibility with
// a big amount of stereotypes made in spanish using this editor
String model = request.getParameter("model");
if (model == null) model = request.getParameter("modelo");
MetaTab metaTab = MetaComponent.get(model).getMetaTab();
if (metaTab.getMetaFilter() != null){
	if (metaTab.getMetaFilter().getFilter() != null) {
		IFilter filter = metaTab.getMetaFilter().getFilter();
		if (filter instanceof IRequestFilter) {
			((IRequestFilter) filter).setRequest(request);
		}
		calculator.setParameters(null, filter);
	}
}
calculator.setModel(model);
String condition = metaTab.getBaseCondition();
if (!Is.empty(condition) && !Is.empty(request.getParameter("condition"))) condition = condition + " AND ";
condition = condition + request.getParameter("condition");
calculator.setCondition(condition);
String order = request.getParameter("order");
calculator.setOrder(order == null?metaTab.getDefaultOrder():order);
calculator.setUseConvertersInKeys(true);
String keyProperty = request.getParameter("keyProperty");
if (keyProperty == null) keyProperty = request.getParameter("propiedadClave");
calculator.setKeyProperty(keyProperty);
String keyProperties = request.getParameter("keyProperties");
if (keyProperties == null) keyProperties = request.getParameter("propiedadesClave");
calculator.setKeyProperties(keyProperties);
String descriptionProperty = request.getParameter("descriptionProperty");
if (descriptionProperty == null) descriptionProperty = request.getParameter("propiedadDescripcion");
calculator.setDescriptionProperty(descriptionProperty);
String descriptionProperties = request.getParameter("descriptionProperties");
if (descriptionProperties == null) descriptionProperties = request.getParameter("propiedadesDescripcion");
calculator.setDescriptionProperties(descriptionProperties);
String orderByKey = request.getParameter("orderByKey");
if (orderByKey == null) orderByKey = request.getParameter("ordenadoPorClave");
calculator.setOrderByKey(orderByKey);

java.util.Collection descriptions = calculator.getDescriptions();
MetaProperty p = (MetaProperty) request.getAttribute(propertyKey);
boolean filterOnChange = org.openxava.util.XavaPreferences.getInstance().isFilterOnChange();
String collection = request.getParameter("collection"); 
String collectionArgv = Is.emptyString(collection)?"":"collection="+collection;

      out.write("\n");
      out.write("<div>\n");
      out.write("\t<input type=\"hidden\" name=\"");
      //  xava:id
      org.openxava.web.taglib.IdTag _jspx_th_xava_005fid_005f0 = (org.openxava.web.taglib.IdTag) _005fjspx_005ftagPool_005fxava_005fid_0026_005fname_005fnobody.get(org.openxava.web.taglib.IdTag.class);
      _jspx_th_xava_005fid_005f0.setPageContext(_jspx_page_context);
      _jspx_th_xava_005fid_005f0.setParent(null);
      // /xava/editors/comparatorsDescriptionsList.jsp(90,28) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_xava_005fid_005f0.setName(prefix  + "conditionComparator."  + index);
      int _jspx_eval_xava_005fid_005f0 = _jspx_th_xava_005fid_005f0.doStartTag();
      if (_jspx_th_xava_005fid_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fxava_005fid_0026_005fname_005fnobody.reuse(_jspx_th_xava_005fid_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fxava_005fid_0026_005fname_005fnobody.reuse(_jspx_th_xava_005fid_005f0);
      out.write("\" value=\"");
      out.print(Tab.EQ_COMPARATOR);
      out.write("\">\n");
      out.write("\t<input type=\"hidden\" name=\"");
      //  xava:id
      org.openxava.web.taglib.IdTag _jspx_th_xava_005fid_005f1 = (org.openxava.web.taglib.IdTag) _005fjspx_005ftagPool_005fxava_005fid_0026_005fname_005fnobody.get(org.openxava.web.taglib.IdTag.class);
      _jspx_th_xava_005fid_005f1.setPageContext(_jspx_page_context);
      _jspx_th_xava_005fid_005f1.setParent(null);
      // /xava/editors/comparatorsDescriptionsList.jsp(91,28) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_xava_005fid_005f1.setName(prefix  + "conditionValueTo."  + index);
      int _jspx_eval_xava_005fid_005f1 = _jspx_th_xava_005fid_005f1.doStartTag();
      if (_jspx_th_xava_005fid_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fxava_005fid_0026_005fname_005fnobody.reuse(_jspx_th_xava_005fid_005f1);
        return;
      }
      _005fjspx_005ftagPool_005fxava_005fid_0026_005fname_005fnobody.reuse(_jspx_th_xava_005fid_005f1);
      out.write("\" >\n");
      out.write("\t<!-- conditionValueTo: we need all indexes to implement the range filters -->\n");
      out.write("</div>\n");
 if (index < 0) { 
      out.write("\n");
      out.write("<select id=\"");
      out.print(propertyKey);
      out.write("\" name=\"");
      out.print(propertyKey);
      out.write("\" tabindex=\"1\" style=\"width: 100%;\" class=");
      out.print(style.getEditor());
      out.write('>');
      out.write('\n');
 } else {  
      out.write("\n");
      out.write("<select name=\"");
      //  xava:id
      org.openxava.web.taglib.IdTag _jspx_th_xava_005fid_005f2 = (org.openxava.web.taglib.IdTag) _005fjspx_005ftagPool_005fxava_005fid_0026_005fname_005fnobody.get(org.openxava.web.taglib.IdTag.class);
      _jspx_th_xava_005fid_005f2.setPageContext(_jspx_page_context);
      _jspx_th_xava_005fid_005f2.setParent(null);
      // /xava/editors/comparatorsDescriptionsList.jsp(97,14) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_xava_005fid_005f2.setName(prefix + "conditionValue." + index);
      int _jspx_eval_xava_005fid_005f2 = _jspx_th_xava_005fid_005f2.doStartTag();
      if (_jspx_th_xava_005fid_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fxava_005fid_0026_005fname_005fnobody.reuse(_jspx_th_xava_005fid_005f2);
        return;
      }
      _005fjspx_005ftagPool_005fxava_005fid_0026_005fname_005fnobody.reuse(_jspx_th_xava_005fid_005f2);
      out.write("\" style=\"width: 100%;\" class=");
      out.print(style.getEditor());
      out.write('\n');
 if(filterOnChange) { 
      out.write("\n");
      out.write("\tonchange=\"openxava.executeAction('");
      out.print(request.getParameter("application"));
      out.write("', '");
      out.print(request.getParameter("module"));
      out.write("', '', false, 'List.filter','");
      out.print(collectionArgv);
      out.write("')\"\n");
 } 
      out.write("\n");
      out.write(">\n");
      out.write("\n");
 } 
      out.write("\n");
      out.write("\t<option value=\"\"></option>\n");

	java.util.Iterator it = descriptions.iterator();
	String selectedDescription = "";	
	while (it.hasNext()) {
		KeyAndDescription cl = (KeyAndDescription) it.next();	
		String selected = "";
		String description = formatter==null?cl.getDescription().toString():formatter.format(request, cl.getDescription());
		// Intead of asking index < 0 it would better to use a specific parameter such as descriptionInKey or so
		Object key =cl.getKey() + Tab.DESCRIPTIONS_LIST_SEPARATOR + description;
		if (Is.equalAsStringIgnoreCase(value, key)) {
			selected = "selected"; 
			selectedDescription = description;
		} 		

      out.write("\n");
      out.write("\t<option value=\"");
      out.print(key);
      out.write('"');
      out.write(' ');
      out.print(selected);
      out.write('>');
      out.print(description);
      out.write("</option>\n");

	} // del while

      out.write("\n");
      out.write("</select>\n");
 if (index < 0) { 
      out.write("\n");
      out.write("<input type=\"hidden\" name=\"");
      out.print(propertyKey);
      out.write("__DESCRIPTION__\" value=\"");
      out.print(selectedDescription);
      out.write("\"/>\n");
 } 
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
