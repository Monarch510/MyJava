package LeetCode;
//ok
public class LC1 {
	
	public int[] twoSum(int[] nums, int target) {
      int[] result = new int[2];
      for(int i = 0;i < nums.length - 1;i++)
    	  for(int j = i + 1;j < nums.length;j++)
    		  if(nums[i] + nums[j] == target) {
    			  result[0] = i;
    			  result[1] = j;
    		  }
      return result;
  }
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LC1 lc = new LC1();
		int[] nums = {2, 7, 11, 15};
		int target = 9;
		System.out.println(lc.twoSum(nums,target)[0]);
		System.out.println(lc.twoSum(nums,target)[1]);
	}

}
