<%@ include file="../imports.jsp"%>
<%@ page import="org.openxava.model.meta.MetaProperty" %>
<jsp:useBean id="style" class="org.openxava.web.style.Style" scope="request"/>
<%
String propertyKey = request.getParameter("propertyKey");
MetaProperty p = (MetaProperty) request.getAttribute(propertyKey);
String fTime = (String) request.getAttribute(propertyKey + ".fvalue");
String align = p.isNumber()?"right":"left";
boolean editable="true".equals(request.getParameter("editable"));
String disabled=editable?"":"disabled";
String script = request.getParameter("script");
boolean label = org.openxava.util.XavaPreferences.getInstance().isReadOnlyAsLabel();
if (editable || !label) {
%>
    <input name="<%=propertyKey%>" class=<%=style.getEditor()%>
    type="time" 
    step="1"
    max="24:00:00" 
    min="00:00:00"
    title="<%=p.getDescription(request)%>"
    align='<%=align%>'
    maxlength="8" 
    size="8" 
    value="<%=fTime%>"
    <%=disabled%>
    <%=script%> />
<%
} else {
%>
<%=fTime%>&nbsp;    
<%
}
%>
<% if (!editable) { %>
    <input type="hidden" name="<%=propertyKey%>" value="<%=fTime%>">
<% } %>