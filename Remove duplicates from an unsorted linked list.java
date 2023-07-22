//POTD
//
//
//
class Solution
{
    //Function to remove duplicates from unsorted linked list.
    public Node removeDuplicates(Node head) 
    {
          HashSet<Integer> hs = new HashSet<>(); 
         Node curr=head;
         Node prev=null;
         
         while(curr!=null)
         {
             int val = curr.data;
             if (hs.contains(val))
                     prev.next=curr.next;
                    
             else{
                 hs.add(val);
                 prev=curr;
                 }
                 
             curr=curr.next;
         }
       
        return head;
    }
}
