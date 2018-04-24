package cn.edu.scau.cmi.huangguanye.factory;

import cn.edu.scau.cmi.huangguanye.factory.domain.Casualty;
import cn.edu.scau.cmi.huangguanye.factory.domain.Insurance;

public class CasualtyFactory {
	
	public static Insurance getInstance() {
		return new Casualty();
	}
	
}
