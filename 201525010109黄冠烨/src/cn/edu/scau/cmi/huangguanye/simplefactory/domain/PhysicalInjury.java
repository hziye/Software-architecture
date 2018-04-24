package cn.edu.scau.cmi.huangguanye.simplefactory.domain;

public class PhysicalInjury implements Insurance {

	private String icName="身体受伤";
	
	@Override
	public void insuranceC() {
		// TODO Auto-generated method stub
		System.out.println("这个保险为"+icName);
	}

}
