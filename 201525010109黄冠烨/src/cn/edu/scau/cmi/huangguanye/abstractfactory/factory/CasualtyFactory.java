package cn.edu.scau.cmi.huangguanye.abstractfactory.factory;

import cn.edu.scau.cmi.huangguanye.abstractfactory.domain.PiccCasualty;
import cn.edu.scau.cmi.huangguanye.abstractfactory.domain.PingAnCasualty;
import cn.edu.scau.cmi.huangguanye.abstractfactory.interfaces.CasualtyInsuranceFactory;
import cn.edu.scau.cmi.huangguanye.abstractfactory.interfaces.Picc;
import cn.edu.scau.cmi.huangguanye.abstractfactory.interfaces.PingAn;

public class CasualtyFactory implements CasualtyInsuranceFactory{
	
	@Override
	public Picc PiccCasualtys() {
		// TODO Auto-generated method stub
		return new PiccCasualty();
	}

	@Override
	public PingAn PingAnCasualtys() {
		// TODO Auto-generated method stub
		return new PingAnCasualty();
	}
	
}
