package designModule.Multition;
//����ģʽ
public class Client {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//���ǵ��������
//		Singleton s1 = Singleton.getInstance();
//		Singleton s2 = Singleton.getInstance();
//		System.out.println(s1 == s2);
		//���Ƕ��������
		Multiton s1 = Multiton.getInstance();
		Multiton s2 = Multiton.getInstance();
		Multiton s3 = Multiton.getInstance();
		Multiton s4 = Multiton.getInstance();
		Multiton s5 = Multiton.getInstance();
		Multiton s6 = Multiton.getInstance();
		System.out.println(s1.getRandomNum());
		System.out.println(s2.getRandomNum());
		System.out.println(s3.getRandomNum());
		System.out.println(s4.getRandomNum());
		System.out.println(s5.getRandomNum());
		System.out.println(s6.getRandomNum());
	}
}
