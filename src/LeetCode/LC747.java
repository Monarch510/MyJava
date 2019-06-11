package LeetCode;
//ok
public class LC747 {
	
	public int dominantIndex(int[] nums) {
		if(nums.length == 1)
			return 0;
		int max = 0;
		int submax = 1;
		if(nums[0] < nums[1]) {
			max = 1;
			submax = 0;
		}
		for(int i = 2;i < nums.length;i++) {
			if(nums[i] > nums[max]) {
				submax = max;
				max = i;
			}
			else if(nums[i] > nums[submax])
				submax = i;
		}
		if(2 * nums[submax] <= nums[max])
			return max;
        return -1;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LC747 lc = new LC747();
		int[] nums = {3,6,1,0};
		System.out.print(lc.dominantIndex(nums));
	}

}
