package LeetCode;
//ok
public class LC13 {
	
	public int romanToInt(String s) {
	     int len = s.length();
	     int num = 0;
	     for(int i = 0;i < len;i++) {
	    	 if(i < len - 1) {
	    		 if(s.charAt(i) == 'I' && s.charAt(i + 1) == 'V') {
	    			 num += 4;
	    			 i++;
	    		 }
	    		 else if(s.charAt(i) == 'I' && s.charAt(i + 1) == 'X') {
	    			 num += 9;
	    			 i++;
	    		 }
	    		 else if(s.charAt(i) == 'X' && s.charAt(i + 1) == 'L') {
	    			 num += 40;
	    			 i++;
	    		 }
	    		 else if(s.charAt(i) == 'X' && s.charAt(i + 1) == 'C') {
	    			 num += 90;
	    			 i++;
	    		 }
	    		 else if(s.charAt(i) == 'C' && s.charAt(i + 1) == 'D') {
	    			 num += 400;
	    			 i++;
	    		 }
	    		 else if(s.charAt(i) == 'C' && s.charAt(i + 1) == 'M') {
	    			 num += 900;
	    			 i++;
	    		 }
	    		 else {
	    			 num += getValue(s.charAt(i));
	    		 }
	    	 }
	    	 else
	    		 num += getValue(s.charAt(i));
	     }
	     return num;
	}
	
	public int getValue(char c) {
		if(c == 'I')
			return 1;
		if(c == 'V')
			return 5;
		if(c == 'X')
			return 10;
		if(c == 'L')
			return 50;
		if(c == 'C')
			return 100;
		if(c == 'D')
			return 500;
		if(c == 'M')
			return 1000;
		else
			return 0;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LC13 lc = new LC13();
		String s = "MCMXCIV";
		System.out.println(lc.romanToInt(s));
	}

}
