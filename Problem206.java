/*
Given the head of a singly linked list, 
reverse the list, and return the reversed list.
*/
/*
I will do both iterative and recursive
*/
class Problem206 {
	public Node reverseLL(Node head) {
		/*
		I will do the two pointer method, assigning two null first
		i will traverse through the head, first i will assign the
		temporary variable to the next node of head, then i will
		put that the next node to head is the previous, then i will
		move the previous node to the head and assign the head with
		the value of temp that it was the next node at the beginning
		*/
		Node temp = null;
		Node prev = null;

		while(head!=null) {
			temp = head.next;
			head.next = prev;
			prev = head;
			head = temp;
		}
		return prev;
	}
	public Node reverseLL(Node head) {
		if(head == null) 
			return null;
		if(head.next = null)
			return head;

		Node nextNode = head.next;
		head.next = null;

		Node newHead = reverseLL(nextNode);

		nextNode.next = head;

		return newHead;

	}
}

