package cn.edu.scau.cmi.huangguanye.factory;

import cn.edu.scau.cmi.huangguanye.factory.domain.CarDamage;
import cn.edu.scau.cmi.huangguanye.factory.domain.Insurance;

public class CarDamageFactory {
	
	public static Insurance getInstance() {
		return new CarDamage();
	}
	
}
