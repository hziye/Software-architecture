package cn.edu.scau.cmi.huangguanye.factory.domain;

public class Casualty implements Insurance{

	private String icName="人员伤亡";
	
	@Override
	public void insuranceC() {
		// TODO Auto-generated method stub
		System.out.println("这个保险为"+icName);
	}

}
