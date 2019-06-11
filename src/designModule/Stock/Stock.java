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
			System.out.println(((Consumer)observer).getName() + "购买" + this.getName() + "股票");
	}

	public void remove(Observer observer) {
		// TODO Auto-generated method stub
		if(IsHaveStock(observer)) {
			observerList.remove(observer);
			if(observer instanceof Observer)
				System.out.println(((Consumer)observer).getName() + "卖出" + this.getName() + "股票");
		}
		else {
			System.out.println("该股民没有购买该股票");
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
		System.out.println(this.getName() + "股票波动率为：" + this.getFluctual());
		System.out.println("波动超过百分之五，正在准备通知购买" + this.getName() + "此股票的股民们");
		for(Observer observer:observerList) {
			observer.response(this);
		}
	}

}
