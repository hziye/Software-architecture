package cn.edu.scau.cmi.huangguanye.abstractfactory.domain;

import cn.edu.scau.cmi.huangguanye.abstractfactory.interfaces.Picc;

public class PiccCarDamage implements Picc{

	private String icName="人寿保险汽车损坏";
	
	@Override
	public void insuranceC() {
		// TODO Auto-generated method stub
		System.out.println("这个保险为"+icName);
	}

}
