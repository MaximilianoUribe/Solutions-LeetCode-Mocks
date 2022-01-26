/*
You are given the heads of two sorted linked lists list1 and list2.

Merge the two lists in a one sorted list. 
The list should be made by splicing together the nodes of the first two lists.

Return the head of the merged linked list.
*/

class Problem21 {
	public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode temp = new ListNode(-1);
        ListNode prev = temp;
        
        while(list1!=null && list2!=null) {
            if(list1.val>list2.val){
                temp.next = list2;
                list2 = list2.next;
            }else{
                temp.next = list1;
                list1 = list1.next;
            }
            temp = temp.next;
        }
        if(list1!=null){
            temp.next = list1;
        }else if(list2!=null) {
            temp.next = list2;
        }
        return prev.next;
    }
}