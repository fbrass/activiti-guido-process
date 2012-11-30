package de.spqr;


import java.io.Serializable;

public class ComponentsDemand implements Serializable {

	private static final long serialVersionUID = 1L;

	private String componentName;
	private long requestedAmount;
	private long currentAmount;
	private boolean demanded;

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

}
