package LeetCode;
//ok
public class LC20 {
	
	public boolean isValid(String s) {
		int len = s.length();
        int[] cha = new int[len];
        for(int i = 0;i < len;i++) {
        	char c = s.charAt(i);
        	switch(c){
        		case '(' : 
        			cha[i] = 1;break;
        		case '[' : 
        			cha[i] = 2;break;
        		case '{' : 
        			cha[i] = 3;break;
        		case ')' : 
        			cha[i] = -1;break;
        		case ']' : 
        			cha[i] = -2;break;
        		case '}' : 
        			cha[i] = -3;break;
        	}
        }
        
       
        
        int j = 0;
        for(int i = 0;i < len;i++) {
    		if(cha[i] > 0)
    			j = i;
    		else if(cha[i] < 0) {
    			if((cha[i] + cha[j]) == 0) {
    				
    				cha[i] = cha[j] = 0;
    				for(int k = j - 1;k >= 0;k--) {
    					if(cha[k] > 0) {
    						j = k;
    						break;
    					}
    				}
    			}
    			else {
    				return false;
    			}
    		}
    	}
        
        for(int i = 0;i < len;i++) {
        	if(cha[i] != 0)
        		return false;
        }
        
        return true;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LC20 lc = new LC20();
		String s = "{";
		System.out.println(lc.isValid(s));
	}

}
