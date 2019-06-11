package LeetCode;
//ok
public class LC26 {
	//只针对顺序排好的数组
	public int removeDuplicates(int[] nums) {
		 if(nums == null || nums.length == 0) return 0;
	        int count = 1;
	        for(int i = 1;i < nums.length;i++)	{
	            if(nums[i - 1] != nums[i])  {
	                nums[count++] = nums[i];
	            }
	            print(nums);
	            System.out.println();
	        }
	        
	     return count;
	}
	//顺序随机数组
	public int removeDuplicates2(int[] nums) {
        if(nums.length == 0)
			return 0;
		boolean repetition;
		int temp = 0;
		int index = 1;
		int last = nums.length;
		while(index < nums.length) {
			if(index >= last)
				break;
			repetition = false;
			for(int i = 0;i < index;i++) {
				if(nums[i] == nums[index]) {
					repetition = true;
					temp = nums[index];
					for(int j = index;j < nums.length - 1;j++) {
						nums[j] = nums[j + 1];
					}
					nums[nums.length - 1] = temp;
					last--;
					break;
				}
			}
			
			if(!repetition)
				index++;
				
		}
	
		return index;
	}
	
	public void print(int[] nums) {
		for(int i = 0;i < nums.length;i++) {
			System.out.print(nums[i] + " ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LC26 lc = new LC26();
		int[] array = {0,0,1,1,1,1,2,2,3,3,4};
		System.out.println(lc.removeDuplicates(array));
		
	}

}
