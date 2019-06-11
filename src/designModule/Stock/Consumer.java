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
		System.out.println("购买了" + stock.getName() + "股票的股民" + this.name + "已收到通知");
	}
	
}
