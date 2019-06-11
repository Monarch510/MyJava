package designModule.Stock;

import java.util.ArrayList;

public class Stock {
	private String name;
	public String getName() {
		return name;
	}

	private ArrayList<Observer> observerList = new ArrayList<Observer>();
	private double price = 0;
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		double flu = (price - this.price)/this.price;
		flu = (double)Math.round(flu * 1000)/10;
		this.setFluctual(flu);
		this.price = price;
	}

	private double fluctual;
	
	public double getFluctual() {
		return fluctual;
	}
	public void setFluctual(double fluctual) {
		this.fluctual = fluctual;
		if(fluctual < 0) {
			if(Math.abs(fluctual) >= 5) 
				this.updateConsumer();
		}
		else {
			if(fluctual >= 5)
				this.updateConsumer();
		}
	}
	public Stock(String name,double price) {
		this.name = name;
		this.price = price;
	}
	public void add(Observer observer) {
		// TODO Auto-generated method stub
		observerList.add(observer);
		if(observer instanceof Observer)
			System.out.println(((Consumer)observer).getName() + "����" + this.getName() + "��Ʊ");
	}

	public void remove(Observer observer) {
		// TODO Auto-generated method stub
		if(IsHaveStock(observer)) {
			observerList.remove(observer);
			if(observer instanceof Observer)
				System.out.println(((Consumer)observer).getName() + "����" + this.getName() + "��Ʊ");
		}
		else {
			System.out.println("�ù���û�й���ù�Ʊ");
		}
	}
	
	private boolean IsHaveStock(Observer observer) {
		for(Observer in:observerList) {
			if(in.equals(observer))
				return true;
		}
		return false;
	}
	
	public void updateConsumer() {
		System.out.println(this.getName() + "��Ʊ������Ϊ��" + this.getFluctual());
		System.out.println("���������ٷ�֮�壬����׼��֪ͨ����" + this.getName() + "�˹�Ʊ�Ĺ�����");
		for(Observer observer:observerList) {
			observer.response(this);
		}
	}

}
