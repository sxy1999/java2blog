package com.java2blog.algorithm.linkedlist;

public class ReverseLinkedListInPares {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		// Creating a linked list
		Node head = new Node(5);
		list.addToTheLast(head);
		list.addToTheLast(new Node(6));
		list.addToTheLast(new Node(7));
		list.addToTheLast(new Node(1));
		list.addToTheLast(new Node(2));

		list.printList(head);
		// Reversing LinkedList using method 1
		Node reverseHead = LinkedList.reverseLinkedListInPairItr(head);
		System.out.println("After reversing using method 1");
		list.printList(reverseHead);

		// restore LinkedList to original ordering
		head = LinkedList.reverseLinkedListInPairItr(reverseHead);
		System.out.println("After restore ordering");
		list.printList(head);

		// Reversing LinkedList using method 2
		reverseHead = LinkedList.reverseLinkedListInPairRec(head);
		System.out.println("After reversing using method 2");
		list.printList(reverseHead);

	}
}
