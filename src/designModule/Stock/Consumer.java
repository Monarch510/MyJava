package designModule.Stock;

public class Consumer extends Observer{
	private String name;
	
	public String getName() {
		return name;
	}

	public Consumer(String name) {
		this.name = name;
	}

	@Override
	public void response(Stock stock) {
		// TODO Auto-generated method stub
		System.out.println("������" + stock.getName() + "��Ʊ�Ĺ���" + this.name + "���յ�֪ͨ");
	}
	
}
