package csu.wwj.acm.Ð£ÈüÍøÂçÔ¤Ñ¡;

import java.util.Scanner;

public class P4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T-- > 0) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int[] array = new int[n];
			for(int i = 0;i < n;i++)
				array[i] = sc.nextInt();
			int s = 0;
			if(n < 3)
				System.out.println("Yes");
			else {
				for(int i = 1;i < n - 1;i++) {
					if(array[i] > array[i -1] && array[i] > array[i + 1]) {
						s++;
						i++;
					}
				}
				if(s == m)
					System.out.println("Yes");
				else
					System.out.println("No");
			}
		}
	}

}
