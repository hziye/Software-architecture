package cn.edu.scau.cmi.huangguanye.factory;

import cn.edu.scau.cmi.huangguanye.factory.domain.Insurance;
import cn.edu.scau.cmi.huangguanye.factory.domain.PhysicalInjury;

public class PhysicalInjuryFactory {
	
	public static Insurance getInstance() {
		return new PhysicalInjury();
	}
	
}
