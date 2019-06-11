package designModule.Diary;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Work implements Subject{
	public void method() {
		System.out.println("执行某个方法");
	}

	@Override
	public void action() {
		// TODO Auto-generated method stub
		System.out.println("方法method()被调用，调用时间为" + (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(new Date()));
		try {
			method();
			System.out.println("方法method()调用成功");
		}
		catch(Exception e) {
			System.out.println("方法method()调用失败");
			e.printStackTrace();
		}
	}
	
}
