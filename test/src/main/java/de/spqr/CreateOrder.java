package de.spqr;

import java.util.Date;

import org.activiti.engine.delegate.DelegateExecution;
import org.activiti.engine.delegate.JavaDelegate;



/**
 * Es wird automatisch ein Lieferant ausgewählt und die finale Bestellung erstellt.
 * 
 * @author gupstar
 *
 */
public class CreateOrder implements JavaDelegate{
	public void execute(DelegateExecution execution){
		ComponentsOrder co = new ComponentsOrder();/*
		co.setComponentName((String) execution.getVariable("name"));
		co.setCurrentAmount((Long) execution.getVariable("currentAmount"));
		co.setRequestedAmount((Long) execution.getVariable("requestedAmount"));
		co.setOrderDate((Date) execution.getVariable("orderDate"));
		//...
		 * 
		 * 
*/	
		ComponentsDemand cd = new ComponentsDemand();
		cd = (ComponentsDemand) execution.getVariable("componentsDemand");
		
		System.out.println("cd" + cd.getComponentName());
		
		//Properties setzen
		co.setComponentName(cd.getComponentName());
		co.setCurrentAmount(cd.getCurrentAmount());
		co.setRequestedAmount(cd.getRequestedAmount());
		co.setDemanded(cd.isDemanded());
		
		Date orderDate = new Date();
		co.setOrderDate(orderDate);
		
		/*
		 * Hardcoded: Möglicher Lieferant ist Continental
		 */
		co.setSupplierName("Continental");
		
		execution.setVariable("componentsOrder",co);
	}

}
