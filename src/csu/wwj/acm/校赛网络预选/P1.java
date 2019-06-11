package csu.wwj.acm.Ð£ÈüÍøÂçÔ¤Ñ¡;

import java.util.Scanner;

public class P1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String r = "Rubik";
		String s = "Store";
		String m = "Music";
		String b = "Box";
		String g = "Good";
		String p = "Perfect";
		String f = "Fast";
		String w = "Wait";
		String n = "Nothing";
		String v = n;
		int sort = 0;
		String[] prestr = {"Nothing","Nothing","Nothing","Nothing"};
		int presort = 0;
		while(true) {
			String[] str = sc.nextLine().split(" ");
			if(!prestr[0].equals(n))
				if(Long.valueOf(str[0]) - Long.valueOf(prestr[0]) <= 1000)
					v = f;
				else if(Long.valueOf(str[0]) - Long.valueOf(prestr[0]) >= 2000)
					v = w;
				else
					v = n;
			
			if(prestr[2].equals(r) && v.equals(w)) {
				
				sort += 10;
			}
			else if(prestr[2].equals(s) && v.equals(w)) {
				
				sort += 20;
			}
			else if(prestr[2].equals(m) && v.equals(w)) {
				
				sort += 30;
			}	
			else if(prestr[2].equals(b))
				sort += 0;
			
			if((str[1]+str[2]).equals("GAMEOVER"))
				break;
			else if(str[1].equals(p) && prestr[1].equals(p)) {
				presort += 2;
				sort += presort;
			}
			else if(str[1].equals(p) && prestr[1].equals(g) && (prestr[3].equals(f) || v.equals(f))) {
				presort = 4;
				sort += presort;
			}
			else if(str[1].equals(p) && (prestr[1].equals(g) || prestr[1].equals(n)) && !v.equals(f)) {
				presort = 2;
				sort += presort;
			}
			else if(str[1].equals(g) && v.equals(f)) {
				presort = 2;
				sort += presort;
			}
			else {
				presort = 1;
				sort += presort;
			}
		
			for(int i = 0;i < prestr.length - 1;i++)
				prestr[i] = str[i];	
			prestr[3] = v;
		}
		System.out.println(sort);
	}

}
