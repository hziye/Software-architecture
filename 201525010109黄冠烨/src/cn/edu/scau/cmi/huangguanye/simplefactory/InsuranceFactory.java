package cn.edu.scau.cmi.huangguanye.simplefactory;

import cn.edu.scau.cmi.huangguanye.factory.domain.CarDamage;
import cn.edu.scau.cmi.huangguanye.factory.domain.Casualty;
import cn.edu.scau.cmi.huangguanye.factory.domain.Insurance;
import cn.edu.scau.cmi.huangguanye.factory.domain.PhysicalInjury;

public class InsuranceFactory {
	
	public static Insurance getInstance(String insuranceName) {
		
		switch(insuranceName) {
		case "physicalInjury": return new PhysicalInjury();
		case "carDamage": return new CarDamage();
		case "casualty": return new Casualty();
		default:return null;
		}
	}
	
}
