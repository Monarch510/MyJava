package LeetCode;
//ok
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LC15 {
	
	 public List<List<Integer>> threeSum(int[] nums) {
		 List<List<Integer>> listInt = new ArrayList<List<Integer>>();
		 if(nums.length < 3)
			 return listInt;
		 Arrays.sort(nums);
		 int f = -1;
		 int z = nums.length;
		 for(int i = 0;i < nums.length;i++) {
			 if(nums[i] >= 0) {
				 f = i;
				 break;
			 }
		 }
		 
		 for(int i = nums.length - 1;i >= 0;i--) {
			 if(nums[i] <= 0) {
				 z = i;
				 break;
			 }
		 }
		 
		 if(f == -1 || z == nums.length)
			 return listInt;
		 
		 if(f == 0 && z == nums.length - 1) {
			 List<Integer> list = new ArrayList<Integer>();
			 list.add(0);
			 list.add(0);
			 list.add(0);
			 listInt.add(list);
			 return listInt;
		 }
			 
		 if(z - f > 1) {
			 List<Integer> list = new ArrayList<Integer>();
			 list.add(0);
			 list.add(0);
			 list.add(0);
			 listInt.add(list);
		 }
		 
		 for(int i = 0;i < f - 1;i++) {
			 if(i > 0 && nums[i] == nums[i - 1])
				 continue;
			 for(int j = i + 1;j < f;j++) {
				 if(j > i + 1 && nums[j] == nums[j - 1])
					 continue;
				 int index = find(z,nums.length - 1,nums,-nums[i]-nums[j]);
				 if(index != -1) {
						 List<Integer> list = new ArrayList<Integer>();
						 list.add(nums[i]);
						 list.add(nums[j]);
						 list.add(nums[index]);
						 listInt.add(list);
				}
			 }	
		 }
		 
		 for(int i = z + 1;i < nums.length - 1;i++) {
			 if(i > 0 && nums[i] == nums[i - 1])
				 continue;
			 for(int j = i + 1;j < nums.length;j++) {
				 if(j > i + 1 && nums[j] == nums[j - 1])
					 continue;
				 int index = find(0,f - 1,nums,-nums[i]-nums[j]);
				 if(index != -1) {
						 List<Integer> list = new ArrayList<Integer>();
						 list.add(nums[i]);
						 list.add(nums[j]);
						 list.add(nums[index]);
						 listInt.add(list);
					 }
			 }
		 }
		 
		 if(f <= z)
			 for(int i = 0;i < f;i++) {
				 if(i > 0 && nums[i] == nums[i - 1])
					 continue;
				 for(int j = z;j < nums.length;j++) {
					 if(j > 0  && nums[j] == nums[j - 1])
						 continue;
					 if(nums[i] + nums[j] == 0) {
						 List<Integer> list = new ArrayList<Integer>();
						 list.add(nums[i]);
						 list.add(0);
						 list.add(nums[j]);
						 listInt.add(list);
					 }
				 }
			 }
		 
	     return listInt;   
	 }
	 
	 public int find(int b,int e,int[] nums,int result) {
		 if(b >= e)
			 if(nums[b] == result)
				 return b;
			 else
				 return -1;
		 
		 int mid = (b + e) / 2;
		 if(nums[mid] == result)
			 return mid;
		 else if(nums[mid] > result)
			 return find(b,mid - 1,nums,result);
		 else
			 return find(mid + 1,e,nums,result);
	 }
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LC15 lc = new LC15();
		int[] nums = {-4,-2,-2,-2,0,1,2,2,2,3,3,4,4,6,6};
		System.out.println(lc.threeSum(nums).toString());
	}

}
