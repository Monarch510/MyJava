package LeetCode;
//ok
public class LC28 {
	
	public int strStr(String haystack, String needle) {
		if(needle.equals(""))
			return 0;
		if(haystack.equals("") || haystack.length() < needle.length())
			return -1;
		int l = needle.length();
		int[] next = new int[l];
		next[0] = -1;
	    int k = -1;
	    for (int q = 1; q < l; q++)
	    {
	        while(k > -1 && needle.charAt(k+1) != needle.charAt(q))
	        {
	            k = next[k];
	        }
	        if(needle.charAt(k+1) == needle.charAt(q))
	        {
	            k++;
	        }
	        next[q] = k;
	    } 
	    
		int m = 0;
		int j = 0;
		while(j < haystack.length()) {
			for(;m < l;m++) {
				//System.out.println(j + " " + m);
				if(haystack.charAt(j) != needle.charAt(m)) {
					if(m > 0) {
						m = next[m - 1] + 1;
					}
					else {
						j++;
						m = 0;
					}
					break;
				}
				else {
					j++;
				}
				
				if(m == l - 1) {
					return j - l;
				}
				
				if(j >= haystack.length())
					break;
			}
		}
	    return -1;
	}
	
	   public int strStr2(String haystack, String needle) {

	        char []nee=needle.toCharArray();
	        char []hay=haystack.toCharArray();
	        int l1=hay.length;
	        int l2=nee.length;
	        if(l2==0)
	            return 0;
	        int next[]=new int[l2];
	        next[0]=-1;
	        for(int i=1;i<l2;i++){
	           int t=next[i-1];
	           while(nee[t+1]!=nee[i]&&t>=0) 
	               t=next[t];
	           if(nee[t+1]==nee[i])
	               next[i]=t+1;
	           else
	               next[i]=-1;
	        }
	        int i=0,j=0;
	        while(i<l1){
	           if(hay[i]==nee[j]){
	               i++;j++;
	               if(j==l2)
	                   return i-l2;
	           }
	           else{
	               if(j==0)
	                   i++;
	               else{
	                   j=next[j-1]+1;
	               }
	           }
	        }
	        return -1;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LC28 lc = new LC28();
		String haystack = "mississippi";
		String needle = "issip";
		System.out.println(lc.strStr(haystack, needle));
	}

}
