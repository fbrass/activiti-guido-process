package de.spqr;

import java.net.URL;
import java.util.ArrayList;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

public class EntityClient {

	/**
	 * @param args
	 */
	public static String getOrder() throws Exception{
		
		EntityServerImplService entityService = new EntityServerImplService();
		EntityServer es = entityService.getEntityServerImplPort();
		
		
		return es.orderParts();
		
	}
}

