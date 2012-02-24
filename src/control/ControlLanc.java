package control;

import java.util.List;

import util.Factory;
import bean.Lanc;

public class ControlLanc {

	public boolean save(int day, int month, int year, double value, String desc){
		Lanc lanc = new Lanc();
		lanc.setDay(day);
		lanc.setMonth(month);
		lanc.setYear(year);
		lanc.setValue(value);
		lanc.setDesc(desc);
		return Factory.getServiceLanc().save(lanc);
	}
	
	public List<Lanc> getAllLanc(){
		return Factory.getServiceLanc().getAllLanc();
	}
	
}
