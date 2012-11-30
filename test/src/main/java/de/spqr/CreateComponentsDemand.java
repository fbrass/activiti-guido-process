package de.spqr;

import java.util.Date;
import java.util.StringTokenizer;

import org.activiti.engine.delegate.DelegateExecution;
import org.activiti.engine.delegate.JavaDelegate;

public class CreateComponentsDemand implements JavaDelegate {
	public void execute(DelegateExecution execution) {

		/*
		 * Daten einlesen aus einem Formular
		 * 
		 * cd.setDemanded((Boolean) execution.getVariable("true"));
		 * cd.setComponentName((String) execution.getVariable("name"));
		 * cd.setCurrentAmount((Long) execution.getVariable("currentAmount"));
		 * cd.setRequestedAmount((Long)
		 * execution.getVariable("requestedAmount"));
		 */

		/*
		 * Hardcoded: Benötigte Komponente: Tür Derzeitige Menge: 1 Benötigte
		 * Menge: 3 Bedarf: true *
		 */

		String list = "";
		try {
			list = EntityClient.getOrder();
		} catch (Exception e) {
			list = e.getMessage();
		}
		if (list.equals("Alle Teile vorhanden")){
			//es werden keine Teile gebraucht
		}
		int door = 0;
		int backWindow = 0;
		int engine = 0;
		int frontWindow = 0;
		int tire = 0;
		int wheel = 0;
		// string = list;
		StringTokenizer st = new StringTokenizer(list);
		while (st.hasMoreElements()) {
			String s = st.nextToken();
			if (s.equals("BackWindow"))
				backWindow++;
			if (s.equals("Door"))
				door++;
			if (s.equals("Engine"))
				engine++;
			if (s.equals("FrontWindow"))
				frontWindow++;
			if (s.equals("Tire"))
				tire++;
			if (s.equals("/BackWindow"))
				backWindow++;
			if (s.equals("/Door"))
				door++;
			if (s.equals("/Engine"))
				engine++;
			if (s.equals("/FrontWindow"))
				frontWindow++;
			if (s.equals("/Tire"))
				tire++;
			if (s.equals("/Wheel"))
				wheel++;
			if (s.equals("Wheel"))
				wheel++;
		}
		ComponentsDemand cd = new ComponentsDemand();
		String requested=(String) execution.getVariable("Requested");
		if (requested.equals("Doors")) {			
			cd.setComponentName("Door");
			cd.setCurrentAmount(10 - door);
			cd.setRequestedAmount(door);
			cd.setDemanded(true);
		}
		if (requested.equals("Wheels")) {			
			cd.setComponentName("Wheels");
			cd.setCurrentAmount(10 - wheel);
			cd.setRequestedAmount(wheel);
			cd.setDemanded(true);
		}
		if (requested.equals("Tires")) {
			cd.setComponentName("Tire");
			cd.setCurrentAmount(10 - tire);
			cd.setRequestedAmount(tire);
			cd.setDemanded(true);
		}
		if (requested.equals("BackWindow")) {
			cd.setComponentName("BackWindow");
			cd.setCurrentAmount(10 - backWindow);
			cd.setRequestedAmount(backWindow);
			cd.setDemanded(true);
		}
		if (requested.equals("FrontWindow")) {
			cd.setComponentName("FrontWindow");
			cd.setCurrentAmount(10 - frontWindow);
			cd.setRequestedAmount(frontWindow);
			cd.setDemanded(true);
		}
		if (requested.equals("Engine")) {
			cd.setComponentName("Engine");
			cd.setCurrentAmount(10 - engine);
			cd.setRequestedAmount(engine);
			cd.setDemanded(true);
		}
		if(cd.getCurrentAmount()==0){
			cd.setDemanded(false);
		}

		execution.setVariable("componentsDemand", cd);
		System.out.println(cd.getComponentName());


	}
}
