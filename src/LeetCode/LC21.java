package LeetCode;
//ok使用并归更好
public class LC21 {
	
	public class ListNode {
	      int val;
	      ListNode next;
	      ListNode(int x) { val = x; }
	}
	
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		if(l1 == null)
			return l2;
		if(l2 == null)
			return l1;
		
    	ListNode result = null;
    	ListNode cl1 = l1;
    	ListNode cl2 = l2;
    	if(l1.val < l2.val) {
    		result = l1;
    		cl1 = l1.next;
    	}
    	else {
    		result = l2;
    		cl2 = l2.next;
    	}
    	ListNode temp = result;
    	while(cl1 != null && cl2 != null) {
    		if(cl1.val < cl2.val) {
    			temp.next = cl1;
    			cl1 = cl1.next;
    		}
    		else {
    			temp.next = cl2;
    			cl2 = cl2.next;
    		}
    		temp = temp.next;
    	}
    	
		if(cl1 == null) {
			temp.next = cl2;
		}
		if(cl2 == null) {
			temp.next = cl1;
		}
    	return result;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}
