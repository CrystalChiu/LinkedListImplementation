
public class LinkedList<T> {
	
	Node head;
	Node tail;
	
	class Node {
		
		T data;
		Node next;
		
		// constructor
		Node(T data) {
			this.data = data;
		}
	}
	
	// insert an item at the back of the list
	void insert(T newData)
	{
		Node newNode = new Node(newData);
		
		// If list is empty
		if(head == null) {
			head = newNode;
			tail = newNode;
		} else {
			tail.next = newNode;
			tail = newNode;
		}
		
	}
	
	// Remove an item anywhere on the list ; returns true if successful and false if not
	boolean remove(T key)
	{
		Node curNode = head;
		Node prev = null;
		
		// Removing head
		if (head.data == key && curNode != null) {
			head = curNode.next;
			return true;
		} // If item is somewhere else in the list
		else
		{
			while(curNode != tail.next) {
				
				// need to deal with the previous node's next and the next node
				if(curNode.data == key) {
					
					prev.next = curNode.next;
					return true;
					
				} else {
					prev = curNode;
					curNode = curNode.next;
				}
			}
		}
		
		return false;
	}
	
	// Iteratively prints linked list in one line
	void printList()
	{
		Node curNode = head;
		
		while(curNode != tail.next) {
			System.out.print(curNode.data + " ");
			curNode = curNode.next;
		}
	}
	

}
