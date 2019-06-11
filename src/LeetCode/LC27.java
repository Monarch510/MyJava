package LeetCode;
//ok
public class LC27 {
	
    public int removeElement(int[] nums, int val) {
    	if(nums == null || nums.length == 0)
    		return 0;
        int len = 0;
        for(int i = 0;i < nums.length;i++) {
        	if(val != nums[i]) {
        		nums[len++] = nums[i];
        	}
        }
        return len;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LC27 lc = new LC27();
		int[] array = {0,0,1,1,1,1,2,2,3,3,4};
		System.out.println(lc.removeElement(array,2));
	}

}
