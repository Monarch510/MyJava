package LeetCode;
//ok
class TreeNode {
	int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { 
    	val = x;
    }
}

public class LC543 {
	int len = 0;
	
	public int diameterOfBinaryTree(TreeNode root) {
		if(root == null)
			return 0;
		int nlen = DeepthOfBinaryTree(root.left) + DeepthOfBinaryTree(root.right);
		if(nlen > len)
			len = nlen;
		int left = caculateElements(root.left);
		int right = caculateElements(root.right);
		
		if(left > len) {
			int llen = diameterOfBinaryTree(root.left);
			if(llen > len)
				len = llen;
		}
		
		if(right > len) {
			int rlen = diameterOfBinaryTree(root.right);
			if(rlen > len)
				len = rlen;
		}
		
		return len;
	}
	
	public int DeepthOfBinaryTree(TreeNode root) {
		if(root == null)
			return 0;
		else
			return 1 + Math.max(DeepthOfBinaryTree(root.left),DeepthOfBinaryTree(root.right));
	}
	
	public int caculateElements(TreeNode root) {
		if(root == null)
			return 0;
		else
			return 1 + caculateElements(root.left) + caculateElements(root.right);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
