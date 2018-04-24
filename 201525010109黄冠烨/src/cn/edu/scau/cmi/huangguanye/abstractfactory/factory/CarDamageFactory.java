package cn.edu.scau.cmi.huangguanye.abstractfactory.factory;

import cn.edu.scau.cmi.huangguanye.abstractfactory.domain.PiccCarDamage;
import cn.edu.scau.cmi.huangguanye.abstractfactory.domain.PingAnCarDamage;
import cn.edu.scau.cmi.huangguanye.abstractfactory.interfaces.CarDamageInsuranceFactory;
import cn.edu.scau.cmi.huangguanye.abstractfactory.interfaces.Picc;
import cn.edu.scau.cmi.huangguanye.abstractfactory.interfaces.PingAn;

public class CarDamageFactory implements CarDamageInsuranceFactory{

	@Override
	public Picc PiccCarDamages() {
		// TODO Auto-generated method stub
		return new PiccCarDamage();
	}

	@Override
	public PingAn PingAnCarDamages() {
		// TODO Auto-generated method stub
		return new PingAnCarDamage();
	}
	
}
