package de.spqr;

import java.io.Serializable;
import java.util.Date;


public class ComponentsOrder implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String componentName;
	private long requestedAmount;
	private long currentAmount;
	private boolean demanded;
	
	private Date orderDate;
	private String supplierName;
	
	public String getComponentName() {
		return componentName;
	}
	public void setComponentName(String componentName) {
		this.componentName = componentName;
	}
	public long getRequestedAmount() {
		return requestedAmount;
	}
	public void setRequestedAmount(long requestedAmount) {
		this.requestedAmount = requestedAmount;
	}
	public long getCurrentAmount() {
		return currentAmount;
	}
	public void setCurrentAmount(long currentAmount) {
		this.currentAmount = currentAmount;
	}
	public boolean isDemanded() {
		return demanded;
	}
	public void setDemanded(boolean demanded) {
		this.demanded = demanded;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	public String getSupplierName() {
		return supplierName;
	}
	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}

	
}
