package cn.edu.scau.cmi.huangguanye.factory;

import cn.edu.scau.cmi.huangguanye.factory.domain.Insurance;
import cn.edu.scau.cmi.huangguanye.factory.domain.ManyAccident;

public class ManyAccidentFactory {
	
	public static Insurance getInstance() {
		return new ManyAccident();
	}
	
}
