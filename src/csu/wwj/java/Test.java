package csu.wwj.java;

public class Test {
	
	String str = "good";
	char[] ch = {'a','b','c'};
		
	
	public void change(String str,char[] ch) {
		str = "not good";
		ch[0] = 'g';
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test test = new Test();
		test.change(test.str,test.ch);
		System.out.println(test.str + " " + String.valueOf(test.ch));

	}

}
