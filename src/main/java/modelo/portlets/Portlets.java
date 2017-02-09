package modelo.portlets;


import java.io.IOException;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

public class Portlets extends MVCPortlet{
	
	private static final Log log = LogFactoryUtil.getLog(Portlets.class);
	
	@Override
	public void doView(RenderRequest renderRequest, RenderResponse renderResponse)
			throws IOException, PortletException {
		log.info("doview -> Introducir número");
		super.doView(renderRequest, renderResponse);
	}
	

	public void calcular(ActionRequest actionRequest, ActionResponse actionResponse)
			throws IOException, PortletException {
		String sNumero1 = ParamUtil.get(actionRequest,"numero1","0");
		int numero1 = Integer.parseInt(sNumero1);
		log.info("calcular -> Numero1 =" + numero1);
		String sNumero2 = ParamUtil.get(actionRequest,"numero2","0");
		int numero2 = Integer.parseInt(sNumero2);
		log.info("calcular -> Numero2 =" + numero2);
		String sOperacion = ParamUtil.get(actionRequest,"operacion","1");
		int operacion = Integer.parseInt(sOperacion);
		log.info("calcular -> Operación =" + operacion);
		int resultado = 0;
		String tipoDeOperacion = null;
		String simboloOperacion = null;
		switch (operacion) {
        case 1:
        	tipoDeOperacion = "Suma";
        	simboloOperacion = "+";
        	resultado=numero1+numero2;
                break;
        case 2:
        	tipoDeOperacion = "Resta";
        	simboloOperacion = "-";
        	resultado=numero1-numero2;
        	break;
        case 3:
        	tipoDeOperacion = "Multiplicación";
        	simboloOperacion = "X";
        	resultado=numero1*numero2;
        	break;
        case 4:
        	tipoDeOperacion = "División";
        	simboloOperacion = "/";
        	resultado=numero1/numero2;
        	break;
		}
		log.info("calcular -> Resultado =" + resultado);
		log.info("calcular -> Tipo de operación =" + tipoDeOperacion);
		log.info("calcular -> Símbolo de operación =" + simboloOperacion);
		
		actionRequest.setAttribute("simboloOperacion", simboloOperacion);
		actionRequest.setAttribute("tipoDeOperacion", tipoDeOperacion);
		actionRequest.setAttribute("resultado", resultado);
		actionResponse.setRenderParameter("mvcPath", "/Resultado_view.jsp");
	}
	
	

	
	
}
