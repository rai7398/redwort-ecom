package com.datastructure.linkedlist;

class LinkedList
{
	Node head; // head of list

	/* Linked list Node. This inner class is made static so that
	main() can access it */
	static class Node {
		int data;
		Node next;
		Node(int d) { data = d; next=null; } // Constructor
	}

	/* This function prints contents of linked list starting from head */
	public void printList()
	{
		Node n = head;
		while (n != null)
		{
			System.out.print(n.data+" ");
			n = n.next;
		}
	}
	/* This function is in LinkedList class. Inserts a
	   new Node at front of the list. This method is 
	   defined inside LinkedList class shown above */
	public void push(int new_data)
	{
	    /* 1 & 2: Allocate the Node &
	              Put in the data*/
	    Node new_node = new Node(new_data);
	 
	    /* 3. Make next of new Node as head */
	    new_node.next = head;
	 
	    /* 4. Move the head to point to new Node */
	    head = new_node;
	}
	/* method to create a simple linked list with 3 nodes*/
	public static void main(String[] args)
	{
		/* Start with the empty list. */
		LinkedList llist = new LinkedList();
		llist.printList();

		llist.head	 = new Node(1);
		Node second	 = new Node(2);
		Node third	 = new Node(3);

		llist.head.next = second; // Link first node with the second node
		second.next = third; // Link first node with the second node

		
	}
}
