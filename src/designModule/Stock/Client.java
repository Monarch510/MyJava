package designModule.Stock;
//观察者模式
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stock s1 = new Stock("腾讯",98);
		Stock s2 = new Stock("网易",90);		
		
		Consumer c1 = new Consumer("胡开阳");
		Consumer c2 = new Consumer("兰鹏");
		Consumer c3 = new Consumer("张国铭");
		Consumer c4 = new Consumer("伍文君");
		
		s1.add(c1);
		s1.add(c2);
		s1.add(c3);
		s2.add(c2);
		s2.add(c3);
		s2.add(c4);
		
		s1.setPrice(110);
		s2.setPrice(88);
	}

}
