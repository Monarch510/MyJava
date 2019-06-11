package csu.wwj.acm;
//给指定数量的字符，全排列，可以出现重复的字符
import java.util.Scanner;

public class Rank {
	static String a = "";
	static String string = "";
	static int times = 0;
	
	static void rank(String str) {
		if(str.equals("")) {
			times++;
			System.out.println(times + " " + a);
			return ;
		}
		
		String temp = str;
		for(int i = 0;i < str.length();i++) {
			String s = String.valueOf(str.charAt(i));
			if(temp.contains(s)) {
				a = a + s;
				rank(str.substring(0,i) + str.substring(i + 1));
				a = a.substring(0,a.length() - 1);
				temp = temp.replace(s,"");
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		string = sc.next();		
		rank(string);
	}

}
