<%--
/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */
--%>

<%@page import="javax.portlet.ActionRequest"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui"%>
<portlet:defineObjects />

<portlet:actionURL var="calcular">
	<portlet:param name="<%=ActionRequest.ACTION_NAME %>" value="calcular"/>
</portlet:actionURL>

<aui:form action="${calcular}" method="post" style="max-height: 300px; max-width: 100px; border: 1px;">
	<aui:input type="number" name="numero1" label="Número 1:"/>
	<aui:input type="number" name="numero2" label="Número 2:"/>
	<aui:select name="operacion">
		<aui:option value="1">Suma</aui:option>
		<aui:option value="2">Resta</aui:option>
		<aui:option value="3">Multiplicación</aui:option>
		<aui:option value="4">División</aui:option>
	</aui:select>
	<aui:button type="submmit" value="Calcular"></aui:button>
</aui:form>



