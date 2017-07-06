package com.java2blog.algorithm.linkedlist;

public class LoopExistOfLinkedList {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		// Creating a linked list

		Node loopNode = new Node(7);
		list.addToTheLast(new Node(5));
		list.addToTheLast(new Node(6));
		list.addToTheLast(loopNode);
		list.addToTheLast(new Node(1));
		list.addToTheLast(new Node(2));

		list.printLinkedList();
		// Test if loop existed or not
		System.out.println("Loop existed-->" + LinkedList.isLoopExist(list.getHead()));

		Node startPoint = LinkedList.findStartNodeOfTheLoop(list.getHead());
		if (startPoint != null) {
			System.out.println("Start point of loop found: ");
			startPoint.displayNodeData();
		}

		list.addToTheLast(loopNode);
		System.out.println("Loop existed-->" + LinkedList.isLoopExist(list.getHead()));

		startPoint = LinkedList.findStartNodeOfTheLoop(list.getHead());
		if (startPoint != null) {
			System.out.println("Start point of loop found: ");
			startPoint.displayNodeData();
		}

	}
}
