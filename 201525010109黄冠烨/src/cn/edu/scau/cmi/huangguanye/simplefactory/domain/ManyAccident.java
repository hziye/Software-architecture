package cn.edu.scau.cmi.huangguanye.simplefactory.domain;

public class ManyAccident implements Insurance{

	private String icName="多种事故";
	
	@Override
	public void insuranceC() {
		// TODO Auto-generated method stub
		System.out.println("这个保险为"+icName);
	}

}