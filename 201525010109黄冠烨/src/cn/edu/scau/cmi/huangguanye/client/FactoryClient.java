package cn.edu.scau.cmi.huangguanye.client;

import cn.edu.scau.cmi.huangguanye.factory.*;
import cn.edu.scau.cmi.huangguanye.factory.domain.Insurance;
public class FactoryClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Insurance i1=CarDamageFactory.getInstance();
		i1.insuranceC();
		
		Insurance i2=CasualtyFactory.getInstance();
		i2.insuranceC();
		
		Insurance i3=PhysicalInjuryFactory.getInstance();
		i3.insuranceC();
		
	}

}
