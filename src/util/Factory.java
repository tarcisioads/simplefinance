package util;

import persistence.DAOLanc;
import service.ServiceLanc;
import control.ControlLanc;

public class Factory {
	
	private static final ControlLanc controllanc = new ControlLanc();;
	private static final ServiceLanc servicelanc = new ServiceLanc();
	private static final DAOLanc daolanc = new DAOLanc();
	
	public static ControlLanc getControlLanc(){
		return controllanc; 
	}
	
	public static ServiceLanc getServiceLanc(){
		return servicelanc;
	}
	
	public static DAOLanc getDAOLanc(){
		return daolanc;
	}

}
