<%@page import="org.openxava.view.View"%>
<%@page import="java.math.BigDecimal"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*"%>
<%@page import="java.util.*"%>
<%@page import="com.google.gson.*"%>
<%@page import="fusioncharts.FusionCharts"%>
<%@page import="org.openxava.*"%>
<%@page import="com.jayktec.persistencia.BdManager"%>
<%@page import="com.jayktec.traductor.ToJson"%>
<%@page import="com.jayktec.controlador.Constantes"%>
<%@page import="com.jayktec.controlador.Constantes.CampoRegistro"%>
<%@ include file="../xava/imports.jsp"%>

<jsp:useBean id="context" class="org.openxava.controller.ModuleContext" scope="session"/>
<%


String viewObject = request.getParameter("viewObject");
viewObject = (viewObject == null || viewObject.equals(""))?"xava_view":viewObject;
View view = (org.openxava.view.View) context.get(request,viewObject);
	   
String sensor = (String)view.getValue("sensor.oid");
String origen = (String)view.getValue("origen.oid");
System.out.print("ORIGEN: ");
System.out.println(origen);
System.out.print("SENSOR: ");
System.out.println(sensor);

ToJson tjMsLine = new ToJson(origen,sensor);

System.out.println("BUSCAR CREAR Y BUSCAR: ");
//String grafico = BdManager.buscarJson(20);
String grafico = BdManager.buscarJson(tjMsLine.crearJson());
System.out.println("******* GRAFICO *********");
System.out.println(grafico);
System.out.println("******* GRAFICO *********");		
		FusionCharts mslineChat = new FusionCharts("column2d", // chartType
				"chart1", // chartId
				"90%", "600", // chartWidth, chartHeight
				"chart", // chartContainer
				"json", // dataFormat
				grafico//dataSource
		);
	
	%>
	<div id="chart"></div>
	<input type="button" value="Actualizar Pagina" onclick="window.location='/Afrodita/m/VerOrigen'">
	<%=mslineChat.render()%>
	
