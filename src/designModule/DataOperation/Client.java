package designModule.DataOperation;
//������ģʽ
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] list = new int[] {10,60,30,50,90,80,20,70,40};
		Adapter adapter = new Adapter();
		System.out.println("����ǰ���");
		for(int i = 0;i < list.length;i++) {
			System.out.print(list[i] + " ");
		}
		System.out.println("");
		
		adapter.sort(list);
		
		System.out.println("�������");
		for(int i = 0;i < list.length;i++) {
			System.out.print(list[i] + " ");
		}
		System.out.println("");
		
		int k = 60;
		System.out.println("����" + k + "�±�Ϊ" + adapter.search(list, k) + "��");
	}

}
