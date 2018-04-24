package cn.edu.scau.cmi.huangguanye.factory.domain;

public class CarDamage implements Insurance{

	private String icName="汽车损坏";
	
	@Override
	public void insuranceC() {
		// TODO Auto-generated method stub
		System.out.println("这个保险为"+icName);
	}

}
