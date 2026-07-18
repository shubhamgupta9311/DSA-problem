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
    public ListNode partition(ListNode head, int x) {
        if(head==null){
            return null;
        }
ListNode dum1=new ListNode(-1);
ListNode dum2=new ListNode(-1);
ListNode dum1Temp=dum1;
ListNode dum2Temp=dum2;

ListNode trav=head;

while(trav!=null){
if(trav.val<x){
dum1Temp.next=trav;
dum1Temp=trav;
}
else{

dum2Temp.next=trav;
dum2Temp=trav;
}

 trav=trav.next;

}

dum1Temp.next=dum2.next;
dum2Temp.next=null;

return dum1.next;

    }
}