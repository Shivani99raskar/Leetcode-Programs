/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode modifiedList(int[] nums, ListNode head) {
      if(head==null) return null;
        Set<Integer>set=new HashSet<>();
        for(int number:nums)
        {
            set.add(number);
        }
        
        ListNode dummyList=new ListNode(0);
        dummyList.next=head;
        ListNode current=dummyList;
        while(current.next!=null)
        {
            if(set.contains(current.next.val))
            {
                current.next=current.next.next;
            }
            else
            {
                current=current.next;
            }
        }
        return dummyList.next;
    }
}