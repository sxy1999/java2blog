package com.java2blog.algorithm.linkedlist;

public class Node {
	public int value;
	public Node next;

	Node() {
		super();
	}

	Node(int value) {
		this.value = value;
	}

	public void displayNodeData() {
		System.out.println("{ " + value + " } ");
	}
}
