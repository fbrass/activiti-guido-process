package de.spqr;



import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
 



@WebServiceClient(name = "EntityServerImplService", 
		targetNamespace="http://activitiderbysoapservice.spqr.de/", 
		wsdlLocation = "http://localhost:9876/es?wsdl")
public class EntityServerImplService extends Service {
	

	 
    private final static URL ENTITYSERVERIMPLSERVICE_WSDL_LOCATION;
    static {
        URL url = null;
        try {
            url = new URL("http://localhost:9876/es?wsdl");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        ENTITYSERVERIMPLSERVICE_WSDL_LOCATION = url;
    }
 

	public EntityServerImplService(URL wsdlDocumentLocation,
			QName serviceName) {
		super(wsdlDocumentLocation, serviceName);
	}
	
	public EntityServerImplService() {
		super(ENTITYSERVERIMPLSERVICE_WSDL_LOCATION,
				new QName("http://activitiderbysoapservice.spqr.de/","EntityServerImplService"));
	}


	@WebEndpoint(name="EntityServerImplPort")
	public EntityServer getEntityServerImplPort(){
		return (EntityServer) super.getPort(new QName("http://activitiderbysoapservice.spqr.de/","EntityServerImplPort"),EntityServer.class);
	}
	
	@WebEndpoint(name="EntityServerImplPort")
	public EntityServer getEntityServerImplPort(WebServiceFeature...features){
		return (EntityServer) super.getPort(new QName("http://activitiderbysoapservice.spqr.de/","EntityServerImplport"),EntityServer.class,features);
	}

}
