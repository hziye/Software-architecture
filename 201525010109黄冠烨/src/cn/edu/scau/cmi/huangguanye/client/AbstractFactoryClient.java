package cn.edu.scau.cmi.huangguanye.client;

import cn.edu.scau.cmi.huangguanye.abstractfactory.factory.CarDamageFactory;
import cn.edu.scau.cmi.huangguanye.abstractfactory.interfaces.CarDamageInsuranceFactory;
import cn.edu.scau.cmi.huangguanye.abstractfactory.interfaces.Picc;
import cn.edu.scau.cmi.huangguanye.abstractfactory.interfaces.PingAn;

public class AbstractFactoryClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CarDamageInsuranceFactory cif=new CarDamageFactory();
		Picc carDamagec=cif.PiccCarDamages();
		PingAn carDamagen=cif.PingAnCarDamages();
		carDamagec.insuranceC();
		carDamagen.insuranceC();
	}

}
