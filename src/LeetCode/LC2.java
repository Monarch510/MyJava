package LeetCode;
//ok
class ListNode{
	int val;
	ListNode next;
	
	public ListNode(int i) {
		val = i;
	}
	
	public void print() {
		if(next == null)
			System.out.print(val);
		else {
			next.print();
			System.out.print(val);
		}
	}
}

public class LC2 {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode preHead = new ListNode(0);
	    ListNode p = preHead;
	    int carry = 0;
	    while (l1 != null || l2 != null || carry != 0) {
	    	int sum = (l1 != null ? l1.val : 0) + (l2 != null ? l2.val : 0) + carry;
	        carry = sum / 10;
	        p.next = new ListNode(sum % 10);
	        p = p.next;
	        l1 = l1 != null ? l1.next : l1;
	        l2 = l2 != null ? l2.next : l2;
	    }
	    return preHead.next;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LC2 lc = new LC2();
		ListNode l1 = new ListNode(2);
		ListNode l2 = new ListNode(5);
		l1.next = new ListNode(4);
		l1.next.next = new ListNode(3);
		l2.next = new ListNode(6);
		l2.next.next = new ListNode(4);
		ListNode result = lc.addTwoNumbers(l1,l2);
		result.print();
	}

}
