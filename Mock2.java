/*
It is halloween and our parents drop us in a specific 
neighborhood, and they tell us how many houses we can visit in 
the neighborhood.

Each house has an specific amount of candy to give, and we want
to know how much candy we have at the end of the houses or
at the end of the houses we can visit.
*/
class Mock2 {
	static int halloween(Node head, int steps) {
		//you can't go backwards
		if(steps<0)
			return 0;
		//if you dont have houses to visit, you have 
		//no candy my friend
		if(head == null)
			return 0;
		//if you only have one house to visit,
		//you only have the candy from that house
		if(head.next==null)
			return head.getValue();
		//if you cant move you don't have any houses to visit 
		if(steps==0)
			return 0;
		//temporary head to iterate
		Node nextNode = head.next;
		//getting to the last node or the last step
		int allCandy = halloween(nextNode, --steps);

		int candy = head.getValue();

		return allCandy + candy;

	}
}