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
    public ListNode deleteDuplicates(ListNode head) {
//         ListNode Dummy=new ListNode(-1);
//         Dummy.next=head;
//         ListNode temp=head;
// if(head==null){
//     return head;
// }

//         while(head.next!=null){
// if(head.val!=head.next.val){
//   temp.next=head.next;
//          temp=head.next;
// }

//       head=head.next;
//         }
//         temp.next=null;

//          return Dummy.next;





if(head==null){
return head;
}
ListNode temp=head;
ListNode Next=temp.next;


while(Next!=null){


if(temp.val!=Next.val){
temp.next=Next;
temp=Next;
}
  
Next=Next.next;

}
temp.next=null;


return head;
    }
   
}