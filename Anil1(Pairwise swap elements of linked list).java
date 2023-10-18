class Solution {
    // Function to pairwise swap elements of a linked list.
    // It should returns head of the modified list
    public Node pairwiseSwap(Node head)
    {
        // code here
       if(head == null || head.next == null){
           return head;
       }
       Node prev = null;
       Node curr = head;
       
       while(curr!=null && curr.next!=null){
           // swap the node , not only element 
           Node temp = curr.next;
           curr.next = curr.next.next;
           temp.next = curr;
           
           if(prev!=null){
               prev.next = temp;
           }
           else{
               head = temp;
           }
           prev = curr;
           curr = curr.next;
       }
       return head;
    }
