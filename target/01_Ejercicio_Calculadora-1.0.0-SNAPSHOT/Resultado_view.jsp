
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="javax.portlet.ActionRequest"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui"%>
<portlet:defineObjects />

<%
	String numero1 = ParamUtil.get(request,"numero1","");
	String numero2 = ParamUtil.get(request,"numero2","");
	String tipoDeOperacion = (String)request.getAttribute("tipoDeOperacion");
	String simboloOperacion = (String)request.getAttribute("simboloOperacion");
	int resultado = (Integer)request.getAttribute("resultado");
%>

<p>Ha escogido <%=tipoDeOperacion %></p>
<p><%=numero1 %> <%=simboloOperacion %> <%=numero2 %> = <%=resultado %></p>

<portlet:renderURL var="volver">
	<portlet:param name="mvcPath" value="/IntroducirNumero_view.jsp"/>
</portlet:renderURL>
<a href="${volver}">Volver</a>
