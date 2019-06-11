package LeetCode;
//ok
public class LC7 {

	public int reverse(int x) {
		int nx = Math.abs(x);
	    String str = String.valueOf(nx);
	    char[] temp = str.toCharArray();
	    int swap = 0;
	    char c;
	    for(int i = 0;i < temp.length / 2;i++) {
	    	swap = temp.length - 1 - i;
	    	c = temp[swap];
	    	temp[swap] = temp[i];
	    	temp[i] = c;
	    }
	    str = String.valueOf(temp);
	    int num;
	    try{
	    	num = Integer.valueOf(str);
	    }
	    catch(NumberFormatException e){
	    	num = 0;
	    }
	    if(x < 0)
	    	num = -num;
	    return num;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LC7 lc = new LC7();
		int x = -111111200;
		System.out.println(lc.reverse(x));
	}

}
