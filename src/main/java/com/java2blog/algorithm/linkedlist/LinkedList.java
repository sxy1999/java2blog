package com.java2blog.algorithm.linkedlist;

public class LinkedList {

	private Node head;

	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}

	public boolean isEmpty() {
		return (head == null);
	}

	public void insertFirst(int data) {
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
	}

	public void addToTheLast(Node node) {
		if (head == null) {
			head = node;
		} else {
			Node temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = node;
		}
	}

	// used to delete node from start of linked list
	public Node deleteFirst() {
		Node temp = head;
		head = head.next;
		return temp;
	}

	// used to delete node from start of linked list
	public Node deleteFirst(Node node) {
		Node temp = head;
		head = head.next;
		return temp;
	}

	// Use to delete node after particular node
	public void deleteAfter(Node after) {
		Node temp = head;
		while (temp.next != null && temp.value != after.value) {
			temp = temp.next;
		}
		if (temp.next != null)
			temp.next = temp.next.next;
	}

	// used to insert a node at the start of linked list
	public void insertLast(int data) {
		Node current = head;
		while (current.next != null) {
			current = current.next; // we'll loop until current.next is null
		}
		Node newNode = new Node(data);
		current.next = newNode;
	}

	public int lengthOfLinkedList() {
		Node temp = head;
		int count = 0;
		while (temp != null) {
			temp = temp.next;
			count++;
		}
		return count;
	}

	public void printLinkedList() {
		System.out.println("Printing LinkedList (head --> last) ");
		Node current = head;
		while (current != null) {
			current.displayNodeData();
			current = current.next;
		}
		System.out.println();
	}

	public void printList(Node head) {
		Node temp = head;
		while (temp != null) {
			System.out.format("%d ", temp.value);
			temp = temp.next;
		}
		System.out.println();
	}

	// Reverse linkedlist using this function
	public static Node reverseLinkedList(Node currentNode) {
		// For first node, previousNode will be null
		Node previousNode = null;
		Node nextNode;
		while (currentNode != null) {
			nextNode = currentNode.next;
			// reversing the link
			currentNode.next = previousNode;
			// moving currentNode and previousNode by 1 node
			previousNode = currentNode;
			currentNode = nextNode;
		}
		return previousNode;
	}

	public static Node reverseLinkedListRec(Node node) {
		if (node == null || node.next == null) {
			return node;
		}

		Node remaining = reverseLinkedListRec(node.next);
		node.next.next = node;
		node.next = null;
		return remaining;
	}

	// Find length of linked list using recursion
	public static int lengthOfLinkedListRec(Node head) {
		Node temp = head;
		if (temp == null) {
			return 0;
		} else {
			return 1 + lengthOfLinkedListRec(temp.next);
		}
	}
}
