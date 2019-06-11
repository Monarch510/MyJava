package csu.wwj.algorithms;

import java.util.Arrays;
import java.util.Comparator;

class Cat {
	private String name;
	private float weight;
	
	public Cat(String name, float weight) {
		setName(name);
		setWeight(weight);
	}
	
	public Cat() {
	
	}
	
	public String getName() {
		return name;
	}
	
	public float getWeight() {
		return weight;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setWeight(float weight) {
		this.weight = weight;
	}
}

//创建一个比较器
class ByWeightComparator implements Comparator<Object> {
	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		// return o1 - o2 即位默认从小到大排序。
		if(((Cat)o1).getWeight() > ((Cat)o2).getWeight()) {
			return 1;
		} else if(((Cat)o1).getWeight() == ((Cat)o2).getWeight()) {
					return 0;
		} else return -1;
	}
}

public class ExampleForArraysSort {

	public static void main(String[] args) {
		Cat c1 = new Cat("w", 100);
		Cat c2 = new Cat("d", 50);
		Cat c3 = new Cat("a", 80);
		Cat[] c = new Cat[]{c1, c2, c3};
		
		System.out.println("排序前:");
		for( Cat c4 : c) {
			System.out.print(c4.getName() + "," + c4.getWeight() + "\t");
		}

		Arrays.sort(c,new ByWeightComparator());

		System.out.println("\n排序后:");
		for( Cat c4 : c) {
			System.out.print(c4.getName() + "," + c4.getWeight() + "\t");
		}
	}

}
