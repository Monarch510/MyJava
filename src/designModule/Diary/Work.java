package designModule.Diary;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Work implements Subject{
	public void method() {
		System.out.println("ִ��ĳ������");
	}

	@Override
	public void action() {
		// TODO Auto-generated method stub
		System.out.println("����method()�����ã�����ʱ��Ϊ" + (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(new Date()));
		try {
			method();
			System.out.println("����method()���óɹ�");
		}
		catch(Exception e) {
			System.out.println("����method()����ʧ��");
			e.printStackTrace();
		}
	}
	
}
