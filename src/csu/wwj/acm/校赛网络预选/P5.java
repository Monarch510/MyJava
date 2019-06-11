package csu.wwj.acm.Ð£ÈüÍøÂçÔ¤Ñ¡;

import java.util.Scanner;

public class P5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		long T = sc.nextInt();
		while(T-- > 0) {
			int N = sc.nextInt();
			System.out.println((9 * (long)Math.pow(N,2)- 7 * N + 2) / 2);
		}
	}

}
