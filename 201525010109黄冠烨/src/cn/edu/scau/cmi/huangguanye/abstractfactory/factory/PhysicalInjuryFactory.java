package cn.edu.scau.cmi.huangguanye.abstractfactory.factory;

import cn.edu.scau.cmi.huangguanye.abstractfactory.domain.PiccPhysicalInjury;
import cn.edu.scau.cmi.huangguanye.abstractfactory.domain.PingAnPhysicalInjury;
import cn.edu.scau.cmi.huangguanye.abstractfactory.interfaces.PhysicalInjuryInsuranceFactory;
import cn.edu.scau.cmi.huangguanye.abstractfactory.interfaces.Picc;
import cn.edu.scau.cmi.huangguanye.abstractfactory.interfaces.PingAn;

public class PhysicalInjuryFactory implements PhysicalInjuryInsuranceFactory{

	@Override
	public Picc PiccPhysicalInjurys() {
		// TODO Auto-generated method stub
		return new PiccPhysicalInjury();
	}

	@Override
	public PingAn PingAnPhysicalInjurys() {
		// TODO Auto-generated method stub
		return new PingAnPhysicalInjury();
	}
	
}
