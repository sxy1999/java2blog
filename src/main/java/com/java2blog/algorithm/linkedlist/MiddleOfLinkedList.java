package com.java2blog.algorithm.linkedlist;

public class MiddleOfLinkedList {
	public static void main(String[] args) {
		LinkedList myLinkedlist = new LinkedList();
		myLinkedlist.insertFirst(5);
		myLinkedlist.insertFirst(6);
		myLinkedlist.insertFirst(7);
		myLinkedlist.insertFirst(1);
		myLinkedlist.insertLast(2);
		myLinkedlist.printLinkedList();
		// Linked list will be
		// 2 -> 1 -> 7 -> 6 -> 5
		System.out.println("Length of Linked List using iteration: " + myLinkedlist.lengthOfLinkedList());
		System.out.println("Length of Linked List Using recursion: " + LinkedList.lengthOfLinkedListRec(myLinkedlist.getHead()));

		Node middle = myLinkedlist.findMiddleNode(myLinkedlist.getHead());
		System.out.println("Middle node will be: " + middle.value);
	}
}
