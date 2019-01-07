package com.datastructure.tree;

public class BinaryTree {
	
	
	Node root;
	public BinaryTree() {
		root = null;
	}
	public BinaryTree(int data) {
		root = new Node(data);
		
	}
 public static void main(String[] args) {
	BinaryTree bt = new BinaryTree();
	
	bt.root = new Node(5);
	
	bt.root.left = new Node(2);
	
	bt.root.right = new Node(4);
	
	bt.root.left.left = new Node(6);
	
	System.out.println();
}
	
	

}

