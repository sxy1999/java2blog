package com.java2blog.algorithm.linkedlist;

public class QueueUsingLinkedList {
	private Node front, rear;
	private int currentSize;

	public QueueUsingLinkedList() {
		front = null;
		rear = null;
		currentSize = 0;
	}

	public boolean isEmpty() {
		return currentSize == 0;
	}

	public void enqueue(int data) {
		Node oldRear = rear;
		rear = new Node();
		rear.value = data;
		rear.next = null;
		if (isEmpty()) {
			front = rear;
		} else {
			oldRear.next = rear;
		}
		currentSize++;
		System.out.println(data + " added to the queue");
	}

	public Integer dequeue() {
		if (currentSize == 0) {
			System.out.println("Queue is empty!");
			return null;
		}
		int data = front.value;
		front = front.next;
		if (isEmpty()) {
			rear = null;
		}
		currentSize--;
		System.out.println(data + " removed from the queue");
		return data;
	}

	public static void main(String[] args) {
		QueueUsingLinkedList queue = new QueueUsingLinkedList();
		queue.enqueue(6);
		queue.dequeue();
		queue.enqueue(3);
		queue.enqueue(99);
		queue.enqueue(56);
		queue.dequeue();
		queue.enqueue(43);
		queue.dequeue();
		queue.enqueue(89);
		queue.enqueue(77);
		queue.dequeue();
		queue.enqueue(32);
		queue.enqueue(232);
		queue.dequeue();
		queue.dequeue();
		queue.dequeue();
		queue.dequeue();
		queue.dequeue();
		queue.dequeue();
		queue.dequeue();
	}
}
