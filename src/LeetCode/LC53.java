package LeetCode;
//ok
public class LC53 {
	
    public int maxSubArray(int[] nums) {
        int len=nums.length;
        int[] sum=new int[len];
        int[] maxsubsum=new int[len];
        sum[0] = nums[0];
        maxsubsum[0] = nums[0];
        //所有的包含nums[i]的前i个元素的最大和。
        for(int i=1;i<len;i++){
            if(sum[i-1]<0)
                sum[i] = nums[i];
             else{
                sum[i] = sum[i-1]+nums[i];
             }
         }
        
         //从上面中找出最大的，即整个数组中的最大和
         for(int i=1;i<len;i++){
             maxsubsum[i]=Math.max(maxsubsum[i-1],sum[i]);
         }
         return maxsubsum[len-1];
     }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LC53 lc = new LC53();
		int[] a = {8,-19,5,-4,20};
		int result = lc.maxSubArray(a);
		System.out.println(result);		
	}

}
