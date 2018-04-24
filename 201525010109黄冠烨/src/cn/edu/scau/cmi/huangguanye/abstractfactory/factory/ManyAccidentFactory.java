package cn.edu.scau.cmi.huangguanye.abstractfactory.factory;

import cn.edu.scau.cmi.huangguanye.abstractfactory.domain.PiccManyAccident;
import cn.edu.scau.cmi.huangguanye.abstractfactory.domain.PingAnManyAccident;
import cn.edu.scau.cmi.huangguanye.abstractfactory.interfaces.ManyAccidentInsuranceFactory;
import cn.edu.scau.cmi.huangguanye.abstractfactory.interfaces.Picc;
import cn.edu.scau.cmi.huangguanye.abstractfactory.interfaces.PingAn;

public class ManyAccidentFactory  implements ManyAccidentInsuranceFactory{

	@Override
	public Picc PiccManyAccidents() {
		// TODO Auto-generated method stub
		return new PiccManyAccident();
	}

	@Override
	public PingAn PingAnManyAccidents() {
		// TODO Auto-generated method stub
		return new PingAnManyAccident();
	}
	
}
