package cn.edu.scau.cmi.huangguanye.abstractfactory.domain;

import cn.edu.scau.cmi.huangguanye.abstractfactory.interfaces.PingAn;

public class PingAnPhysicalInjury implements PingAn {

	private String icName="中国平安身体受伤";
	
	@Override
	public void insuranceC() {
		// TODO Auto-generated method stub
		System.out.println("这个保险为"+icName);
	}

}
