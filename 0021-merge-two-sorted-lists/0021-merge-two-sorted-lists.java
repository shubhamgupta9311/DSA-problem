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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode Dummy = new ListNode(-1);
        ListNode temp=Dummy;
        ListNode L1 = list1;
        ListNode L2 = list2;
    

        while (L1 != null && L2 != null) {

            // if (L1.val == L2.val) {
            //     temp.next = L1;
            //     temp=temp.next;
            //     temp.next = L2;
            //     temp=temp.next;
            //     L1 = L1.next;
            //     L2 = L2.next;
            // }

             if (L1.val > L2.val) {
                temp.next = L2;
                temp=temp.next;
                L2 = L2.next;
            } else {
                temp.next = L1;
                temp=temp.next;
                L1 = L1.next;
            }

        }

        //if L1 ends first
if(L1==null &&  L2!=null){
    temp.next=L2;
}
//if L2 ends first
if(L1!=null && L2==null){
    temp.next=L1;
}


 return Dummy.next;



    }

}