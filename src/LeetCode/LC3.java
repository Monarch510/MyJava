package LeetCode;
//ok
public class LC3 {
	
	public int lengthOfLongestSubstring(String s) {
		int len = s.length();
		if(len == 0)
			return len;
		int[] array = new int[len];
		for(int i = len - 1;i > 0;i--) {
			for(int j = i - 1;j >= 0;j--) {
				if(s.charAt(i) == s.charAt(j)) {
					array[i] = j;
					break;
				}
				if(j == 0)
					array[i] = -1;
			}
		}
		array[0] = -1;
		
		int start = 0;
		int num = 0;
		int temp = 0;
		for(int i = 0;i < len;i++) {
			if(array[i] >= start) {
				start = array[i] + 1;
				i = start - 1;
				if(temp > num)
					num = temp;
				temp = 0;
			}
			else {
				temp++;
			}
		}
		if(temp > num)
			num = temp;
		return num;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LC3 lc = new LC3();
		String string = "au";
		System.out.println(lc.lengthOfLongestSubstring(string));
	}

}
