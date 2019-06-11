package LeetCode;
//ok
public class LC9 {
	public boolean isPalindrome(int x) {
	    if(x < 0)
	    	return false;
	    else {
	    	int len = 1;
	    	int temp = x;
	    	while(temp > 9) {
	    		temp = temp / 10;
	    		len++;
	    	}
	    	int a;
    		int b;
    		int ltemp = len;
    		for(int i = 0;i < len / 2;i++) {
	    		a = x % 10;
	    		b = x / (int)Math.pow(10, ltemp - 1);
	    		if(a != b) {
	    			return false;
	    		}
	    		ltemp = ltemp - 2;
	    		x = ((x / 10) % (int)Math.pow(10, ltemp));
	    	}
	    	return true;
	    }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LC9 lc = new LC9();
		System.out.println(lc.isPalindrome(1));
	}

}
