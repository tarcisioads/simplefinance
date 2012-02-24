package service;

import java.util.List;

import bean.Lanc;
import util.Factory;

public class ServiceLanc {
	
	public boolean save(Lanc lanc){
		return Factory.getDAOLanc().save(lanc);
	}
	
	public List<Lanc> getAllLanc(){
		return Factory.getDAOLanc().getAllLanc();
	}

}
