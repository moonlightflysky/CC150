package chapter2;


public class Q5_2 {

	 public static class ListNode {
	     int val;
	     ListNode next;
	     ListNode(int x) {
	         val = x;
	         next = null;
	     }
	 }
	 
	 public class partialSum {
		 
		 ListNode digit = null;
		 int carry = 0;
	 }
	 
	 private int getLength(ListNode l1){
		 
		 ListNode cur = l1;
		 int cnt = 0;
		 while (cur != null){
			 cnt++;
			 cur = cur.next;
		 }
		 
		 return cnt;
	 }
	 
	 public ListNode addLists(ListNode l1, ListNode l2){
		 
		 int len1 = getLength(l1);
		 int len2 = getLength(l2);
		 
		 if (len2 < len1){
			 l2 = padList(l2, len1 - len2);
		 }
		 
		 else if(len1 < len2){
			 l1 = padList(l1, len2 - len1);
		 }
		 
		 partialSum sum = addHelper(l1, l2);
		 
		 if (sum.carry == 1){
			 sum.digit = insertHead(sum.digit, 1);
		 }
		 
		 return sum.digit;
		 
	 }
	 
	 
	 private ListNode padList(ListNode head, int n){
		 
		 for (int i = 0; i < n; i++){
			 ListNode pad = new ListNode(0);
			 pad.next = head;
			 head = pad;
		 }
		 
		 return head;
	 }
	 
	 private partialSum addHelper(ListNode l1, ListNode l2){
		 
		 if (l1 == null && l2 == null){
			 partialSum sum = new partialSum();
			 return sum;
		 }
		 
		 int digit1 = l1.val;
		 int digit2 = l2.val;
		 
		 partialSum sum = addHelper(l1.next, l2.next);
		 
		 int num = digit1 + digit2 + sum.carry;
		 System.out.println("digit1: " + digit1);
		 System.out.println("digit2: " + digit2);
		 
		 int digit = num % 10;
		 
		 sum.digit = insertHead(sum.digit, digit);
		 if (num / 10 > 0){
			 sum.carry = 1;
		 }
		 
		 else{
			 sum.carry = 0;
		 }
		 
		 return sum;
		 
	 }
	 
	 private ListNode insertHead(ListNode head, int digit){
		 
		 ListNode l = new ListNode(digit);
		 
		 l.next = head;
		 head = l;
		 
		 return head;
	 }
	 
	 
	 
	 public static void main(String argv[]){
		 
		 ListNode l1 = new ListNode(8);
		 l1.next = new ListNode(1);
		 l1.next.next = new ListNode(7);
		 ListNode l2 = new ListNode(2);
		 l2.next = new ListNode(9);
		 l2.next.next = new ListNode(5);
		 
		 Q5_2 test = new Q5_2();
		 ListNode res = test.addLists(l1, l2);
		 ListNode cur = res;
		 
		 while (cur != null){
			 System.out.print(cur.val + "= >  ");
			 cur = cur.next;
		 }
	 }
	
}
