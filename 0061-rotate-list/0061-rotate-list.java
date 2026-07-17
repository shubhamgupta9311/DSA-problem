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
    public ListNode rotateRight(ListNode head, int k) {
         //finding size
ListNode temp=head;
int size=0;
ListNode last=head;
while(temp!=null){
size++;
last=temp;
temp=temp.next;
}
//edge case
if(size==0){
return null;
}


k=k%size;
if(k==0 ||size==1){
return head;
}
temp=head;
for (int i=1;i<size-k;i++){
temp=temp.next;
}

last.next=head;
head=temp.next;
temp.next=null;


return head;
    }
}