package designModule.Stock;
//�۲���ģʽ
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stock s1 = new Stock("��Ѷ",98);
		Stock s2 = new Stock("����",90);		
		
		Consumer c1 = new Consumer("������");
		Consumer c2 = new Consumer("����");
		Consumer c3 = new Consumer("�Ź���");
		Consumer c4 = new Consumer("���ľ�");
		
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
