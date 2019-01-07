package com.datastructure.linkedlist;

import java.util.List;

public class MyLinkedList {

	Node head;
	static class Node
	{
		int data;
		Node next;
		Node(int data)
		{
			this.data = data;
			this.next = null;
		}
	}
public static void main(String[] args) {
	MyLinkedList ll = new MyLinkedList();

	ll.add(0);
	ll.head  = new Node(10);
	Node second = new Node(15);
	Node third = new Node(20);
	
	// link to all node to each other
	
	ll.head.next = second ;
	second.next = third;
	third.next = null;
	
	System.out.println(ll.search(3));
	System.out.println(ll.search(15));
	System.out.println(ll.search(20));
	
	ll.add(5);
	ll.addAtFront(55);
	ll.printList();
	
	
	
}

private  void printList() {
	if (head==null) {
		System.out.println("LinkedList is empty");;
	}
	else
	{
		Node node = head;
		while( node.next != null)
		{
			System.out.println(node.data);
			node = node.next;
		}
		if(node.next == null)
		{
			System.out.println(node.data);
		}
	}
		
		
	}
private  Boolean search( int data) {

	Node node = head;
	if (node==null) {
		return false;
		
	}
	else
	{
		while( node.next != null)
		{
			if(node.data== data)
			{
				return true;
			}
			node = node.next;
		}
		if(node.data == data)
		{
			return true;
		}
		
	}
return false;
	
}
// add node
public  void add(int data)
{

	Node node = new Node(data);
	if(head == null)
	head= node;
	else
	{
	Node temp = head;
	while(temp.next!= null)
	{
		temp = temp.next;
		
	}

	temp.next = node;
}
}
public  void addAtFront(int data)
{

	Node node = new Node(data);
	node.next = head;
	head = node;

}
public  void addAtEnd(int data)
{
	if(head==null)
	{
		head.data = data;
		head.next = null;
	}

	Node node = new Node(data);
	Node temp =  head;
	while(temp.next!= null)
	node = node.next;
	
	head = node;

}
// delete item

public boolean removeFromLast()
{
Node node = head;
Node prev = null;
while(node.next!= null)
	if(node.next!=null)
	{
		node = node.next;
	}
	else
	{
//		node = no
	}
	return true;
}

	

}
