package cn.edu.scau.cmi.huangguanye.client;

import cn.edu.scau.cmi.huangguanye.factory.domain.Insurance;
import cn.edu.scau.cmi.huangguanye.simplefactory.InsuranceFactory;

import java.util.Scanner;
public class SimpleFactoryClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("请输入保险种类");
		
		Scanner sc=new Scanner(System.in);
		String icName=sc.nextLine();
		Insurance i=InsuranceFactory.getInstance(icName);
		i.insuranceC();
		sc.close();
		
	}

}
