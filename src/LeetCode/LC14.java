package LeetCode;

public class LC14 {
	public String longestCommonPrefix(String[] strs) {
		int len = strs.length;
		if(len == 0)
			return "";
        String comstr = strs[0];
        for(int i = 1;i < len;i++) {
        	int num = 0;
        	int a = comstr.length();
        	int b = strs[i].length();
        	for(int j = 0;j < a && j < b;j++) {
        		if(comstr.charAt(j) == strs[i].charAt(j))
        			num++;
        		else
        			break;
        	}
        	comstr = comstr.substring(0, num);
        }
        return comstr;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LC14 lc = new LC14();
		//String[] strs = {"flower","flow","flight"};
		String[] strs = {"dog","racecar","car"};
		System.out.println(lc.longestCommonPrefix(strs));
	}

}
