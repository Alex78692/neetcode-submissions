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

              if(list1==null){
                return list2;
              }
              if(list2==null){
                return list1;
              }
              ListNode  n1= list1 ;
              ListNode n2 =list2;
              
              ListNode n3  = new ListNode (); 
            //   while()
            ListNode n4 = n3;
            while(n1!=null && n2!=null){
                  if(n1.val <= n2.val){
                     n3.next = n1;
                      
                     n1= n1.next;
                    

                  }
                  else{
                    n3.next = n2;
                   
                    n2=n2.next;
                  }
                  
                  n3 =n3.next ;
            }
            if(n1==null){
                n3.next = n2;
            }
            else{
                n3.next = n1;
            }
          return n4.next;
    }
}