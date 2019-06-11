package csu.wwj.java;

import java.util.Scanner;

public class HelloLabel {
	
	public static String[] string(String str) {
		String[] result = new String[str.length()];
		for(int i = 0;i < str.length();i++) {
			result[i] = str.substring(i,i+1);
		}
		return result;
	}

	public static void main(String[] args){
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while(true) {
			String[] array = string(sc.nextLine());
			for(int i = 0;i < array.length;i++) {
				System.out.print(array[i]);
			}
		}
	}
	

}
