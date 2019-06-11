package LeetCode;
//ok
public class LC845 {
//寻找数组中的最长山脉
    public int longestMountain(int[] A) {
    	int len = 0;
    	int alen = A.length;
    	int[] increase = new int[alen];
    	int[] decrease = new int[alen];
    	int iclen = 0;
    	int dclen = 0;
    	for(int i = 0;i < alen;i++) {
    		if(i == alen - 1) {
    			increase[i] = iclen;
    			decrease[i - dclen] = dclen;
    			break;
    		}
    		
    		if(A[i + 1] > A[i]) {
    			iclen++;
    			decrease[i - dclen] = dclen;
    			dclen = 0;
    		}
    		else if(A[i + 1] < A[i]){
    			dclen++;
    			increase[i] = iclen;
    			iclen = 0;
    		}
    		else {
    			increase[i] = iclen;
    			decrease[i - dclen] = dclen;
    			iclen = 0;
    	    	dclen = 0;
    		}
    	}
    	
//    	for(int i = 0;i < alen;i++) {
//    		System.out.print(increase[i] + " ");
//    	}
//    	System.out.println();
//    	
//    	for(int i = 0;i < alen;i++) {
//    		System.out.print(decrease[i] + " ");
//    	}
//    	System.out.println();
    	
    	for(int i = 0;i < alen;i++) {
    		if(increase[i] > 0 && decrease[i] > 0) {
    			len = (increase[i] + decrease[i] + 1) > len ? (increase[i] + decrease[i] + 1) : len;
    		}
    	}
    	
        return len;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LC845 lc = new LC845();
		int[] a = {2,3,3,2,0,2} ;
		System.out.println(lc.longestMountain(a));
	}

}
