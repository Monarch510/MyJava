package designModule.MessageSystem;

import designModule.MessageSystem.XMLUtil;
//抽象外观模式
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FacadeImp facade = (FacadeImp)XMLUtil.getClassBean();
		facade.dataHanding();
	}
	
}
