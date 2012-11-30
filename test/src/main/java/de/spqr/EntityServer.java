package de.spqr;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.ArrayList;


import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

/**
 *
 * @author said
 */
@WebService(name = "EntityServer", targetNamespace="http://activitiderbysoapservice.spqr.de/")
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface EntityServer {
    @WebMethod @WebResult(partName = "return")String getTimeAsString();
    @WebMethod @WebResult(partName = "return")long getTimeAsElapsed();
    @WebMethod @WebResult(partName = "return")String orderParts();
    
}