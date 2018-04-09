/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.50
 * Generated at: 2018-04-09 13:46:14 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.xava.editors;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.openxava.util.KeyAndDescription;
import org.openxava.util.Is;
import org.openxava.util.XavaResources;
import org.openxava.model.meta.MetaProperty;
import org.openxava.calculators.DescriptionsCalculator;
import org.openxava.formatters.IFormatter;
import org.openxava.filters.IFilter;
import org.openxava.filters.IRequestFilter;
import org.openxava.mapping.PropertyMapping;
import org.openxava.converters.IConverter;

public final class descriptionsEditor_jsp extends org.apache.jasper.runtime.HttpJspBase
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

String viewObject = request.getParameter("viewObject");
viewObject = (viewObject == null || viewObject.equals(""))?"xava_view":viewObject;
org.openxava.view.View view = (org.openxava.view.View) context.get(request, viewObject);
String propertyKey = request.getParameter("propertyKey");
String script = request.getParameter("script");
// conditionForId is for have a different cache for each condition
String conditionForId = request.getParameter("condition");
if (Is.emptyString(conditionForId)) conditionForId = request.getParameter("condicion");
conditionForId = Is.emptyString(conditionForId)?"":"." + conditionForId;
// orderByKeyForId is for have a different cache for each orderByKey
String orderByKeyForId = request.getParameter("orderByKey");
if (Is.emptyString(orderByKeyForId)) orderByKeyForId = request.getParameter("ordenadoPorClave");
orderByKeyForId = Is.emptyString(orderByKeyForId)?"":"." + orderByKeyForId;
//orderForId is for have a different cache for each order
String orderForId = request.getParameter("order");
if (Is.emptyString(orderForId)) orderForId = request.getParameter("orden");
orderForId = Is.emptyString(orderForId)?"":"." + orderForId;

String descriptionsCalculatorKey = propertyKey + conditionForId + orderByKeyForId + orderForId + ".descriptionsCalculator";
DescriptionsCalculator calculator = (DescriptionsCalculator) request.getSession().getAttribute(descriptionsCalculatorKey);	

IFilter filter = null;
String filterClass=request.getParameter("filter");
if (Is.emptyString(filterClass)) filterClass=request.getParameter("filtro"); 
if (!Is.emptyString(filterClass)) {
	String filterKey = propertyKey + ".filter";
	filter = (IFilter) request.getSession().getAttribute(filterKey);
	if (filter == null) {
		try {
			filter = (IFilter) Class.forName(filterClass).newInstance();
			request.getSession().setAttribute(filterKey, filter);	
		}
		catch (Exception ex) {
			ex.printStackTrace();
			System.err.println(XavaResources.getString("descriptionsEditor_filter_warning", propertyKey));
		}
	}
	if (filter instanceof IRequestFilter) {
		((IRequestFilter) filter).setRequest(request);
	}
}


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

String parameterValuesProperties=request.getParameter("parameterValuesProperties");	
if (parameterValuesProperties == null) {
	parameterValuesProperties=request.getParameter("propiedadesValoresParametros");	
}
String parameterValuesStereotypes=request.getParameter("parameterValuesStereotypes");
if (parameterValuesStereotypes == null) {
	parameterValuesStereotypes=request.getParameter("estereotiposValoresParametros");
}
if (calculator == null) { 
	calculator = new DescriptionsCalculator();
	// The arguments in English and Spanish for compatibility with
	// a big amount of stereotypes made in spanish using this editor
	String condition = request.getParameter("condition");
	if (condition == null) condition = request.getParameter("condicion");
	calculator.setCondition(condition);
	String order = request.getParameter("order");
	if (order == null) order = request.getParameter("orden");
	calculator.setOrder(order);
	calculator.setUseConvertersInKeys(true);
	String model = request.getParameter("model");
	if (model == null) model = request.getParameter("modelo");
	calculator.setModel(model);
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
	request.getSession().setAttribute(descriptionsCalculatorKey, calculator);
}
if (parameterValuesStereotypes != null || parameterValuesProperties != null) {	
	java.util.Iterator it = null;
	if (parameterValuesStereotypes != null) {
		it = view.getPropertiesNamesFromStereotypesList(parameterValuesStereotypes).iterator();		
	}
	else  {
		it = view.getPropertiesNamesFromPropertiesList(parameterValuesProperties).iterator();		
	}
	java.util.Collection p = new java.util.ArrayList();
	while (it.hasNext()) {
		String parameterValueKey = (String) it.next();		
		org.openxava.view.View v = null;
		if (parameterValueKey != null && parameterValueKey.startsWith("this.")) {
			parameterValueKey = parameterValueKey.substring(5);
			v = view;
		}
		else {
			v = view.getRoot();
		}
		Object parameterValue = parameterValueKey==null?null:v.getValue(parameterValueKey);
		
		if (parameterValueKey != null) { 
			PropertyMapping mapping = v.getMetaProperty(parameterValueKey).getMapping();
			if (mapping != null) {
				IConverter converter = mapping.getConverter();
				if (converter != null) {
					parameterValue = converter.toDB(parameterValue);
				}
			}
		}

		p.add(parameterValue);
	}
	calculator.setParameters(p, filter);
}
else if (filter != null) {
	calculator.setParameters(null, filter);
}
java.util.Collection descriptions = calculator.getDescriptions();
MetaProperty p = (MetaProperty) request.getAttribute(propertyKey);
String title = (p == null)?"":p.getDescription(request);
String fvalue = (String) request.getAttribute(propertyKey + ".fvalue");
boolean editable = "true".equals(request.getParameter("editable"));
boolean label = org.openxava.util.XavaPreferences.getInstance().isReadOnlyAsLabel() || "true".equalsIgnoreCase(request.getParameter("readOnlyAsLabel"));
if (editable) {
		java.util.Iterator it = descriptions.iterator();
		String selectedDescription = "";
		String selectedKey = "";
		StringBuffer values = new StringBuffer("[");
		int maxDescriptionLength = 0;
		while (it.hasNext()) {
			KeyAndDescription cl = (KeyAndDescription) it.next();	
			String selected = "";
			String description = formatter==null?cl.getDescription().toString():formatter.format(request, cl.getDescription());
			if (description.length() > maxDescriptionLength) maxDescriptionLength = description.length();
			if (Is.equalAsStringIgnoreCase(fvalue, cl.getKey())) {
				selected = "selected"; 
				selectedDescription = description;
				selectedKey = cl.getKey().toString();
			} 		
			values.append("{label:\"");
			values.append(description.replaceAll("'", "&apos;").replaceAll("\"", "&Prime;")); 
			values.append("\",value:\"");
			values.append(cl.getKey().toString().replaceAll("'", "&apos;").replaceAll("\"", "&Prime;")); 
			values.append("\"}");
			if (it.hasNext()) values.append(",");
		} 
		values.append("]");
		String browser = request.getHeader("user-agent");
		maxDescriptionLength += 5;
	
      out.write("\n");
      out.write("\t<span class=\"");
      out.print(style.getDescriptionsList());
      out.write("\">\n");
      out.write("\t");
      out.write("\n");
      out.write("\t<input name=\"");
      out.print(propertyKey);
      out.write("__CONTROL__\" type=\"text\" tabindex=\"1\" class=\"xava_select ");
      out.print(style.getEditor());
      out.write("\" size=\"");
      out.print(maxDescriptionLength);
      out.write('"');
      out.write(' ');
      out.print(script);
      out.write(" title=\"");
      out.print(title);
      out.write("\" \n");
      out.write("\t\tdata-values='");
      out.print(values);
      out.write("' value=\"");
      out.print(selectedDescription);
      out.write("\"/> \n");
      out.write("\t<input id=\"");
      out.print(propertyKey);
      out.write("\" type=\"hidden\" name=\"");
      out.print(propertyKey);
      out.write("\" value=\"");
      out.print(selectedKey);
      out.write("\"/>\n");
      out.write("\t<input type=\"hidden\" name=\"");
      out.print(propertyKey);
      out.write("__DESCRIPTION__\" value=\"");
      out.print(selectedDescription);
      out.write("\"/>\n");
      out.write("\t<a class=\"ox-layout-descriptions-editor-handler\" href=\"javascript:descriptionsEditor.open('");
      out.print(propertyKey);
      out.write("')\"><i class=\"mdi mdi-menu-down\"></i></a> \t\t\n");
      out.write("\t<a class=\"ox-layout-descriptions-editor-handler\" href=\"javascript:descriptionsEditor.close('");
      out.print(propertyKey);
      out.write("')\" style=\"display: none\"><i class=\"mdi mdi-menu-up\"></i></a>\n");
      out.write("\t</span>\n");
      out.write("\t");
 	
} else { 
	Object description = "";
	java.util.Iterator it = descriptions.iterator();
	while (it.hasNext()) {
		KeyAndDescription cl = (KeyAndDescription) it.next();
		if (Is.equalAsString(fvalue, cl.getKey())) {							
			description = formatter==null?cl.getDescription().toString():formatter.format(request, cl.getDescription());
			break;
		}
	}	
	if (label) {

      out.write('\n');
      out.write('\n');

Object b = (Object) request.getParameter("bold");
boolean bold = b == null ? false : new Boolean(b.toString()).booleanValue();
if (bold) { 
      out.write(" <b> ");
}
      out.write(" \n");
      out.write("\n");
      out.write("\t");
      out.print(description);
      out.write("&nbsp;\n");
 if (bold) { 
      out.write(" </b> ");
} 
      out.write('\n');

	}
	else {	

      out.write("\n");
      out.write("\t<input name=\"");
      out.print(propertyKey);
      out.write("__DESCRIPTION__\" class=");
      out.print(style.getEditor());
      out.write("\n");
      out.write("\t\ttype=\"text\" \n");
      out.write("\t\ttitle=\"");
      out.print(title);
      out.write("\"\n");
      out.write("\t\tmaxlength=\"");
      out.print(description.toString().length());
      out.write("\" \n");
      out.write("\t\tsize=\"");
      out.print(description.toString().length() + 5);
      out.write("\" \n");
      out.write("\t\tvalue=\"");
      out.print(description);
      out.write("\"\n");
      out.write("\t\tdisabled\n");
      out.write("\t/>\n");
  } 
      out.write("\t\n");
      out.write("\t<input type=\"hidden\" name=\"");
      out.print(propertyKey);
      out.write("\" value=\"");
      out.print(fvalue);
      out.write("\"/>\t\n");
 } 
      out.write("\t\t\t\n");
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
