package com.java2blog.algorithm.binarytree;

import java.util.Queue;
import java.util.Stack;
import java.util.concurrent.LinkedBlockingQueue;

public class BinaryTree {

	public static void preOrderRec(TreeNode root) {
		if (root == null) {
			return;
		}

		System.out.println(root.toString());
		preOrderRec(root.left);
		preOrderRec(root.right);

	}

	public static void preOrderIter(TreeNode root) {
		if (root == null) {
			return;
		}

		Stack<TreeNode> stack = new Stack<>();
		stack.push(root);
		while (!stack.isEmpty()) {
			TreeNode node = stack.pop();
			System.out.println(node.toString());

			if (node.right != null) {
				stack.push(node.right);
			}

			if (node.left != null) {
				stack.push(node.left);
			}
		}
	}

	public static void inOrderRec(TreeNode root) {
		if (root == null) {
			return;
		}

		preOrderRec(root.left);
		System.out.println(root.toString());
		preOrderRec(root.right);

	}

	public static void inOrderIter(TreeNode root) {
		if (root == null)
			return;

		Stack<TreeNode> s = new Stack<>();
		TreeNode currentNode = root;

		while (!s.empty() || currentNode != null) {

			if (currentNode != null) {
				s.push(currentNode);
				currentNode = currentNode.left;
			} else {
				TreeNode n = s.pop();
				System.out.println(n.toString());
				currentNode = n.right;
			}
		}
	}

	public static void postOrderRec(TreeNode root) {
		if (root == null) {
			return;
		}

		preOrderRec(root.left);
		preOrderRec(root.right);
		System.out.println(root.toString());

	}

	public static void postOrderIter(TreeNode root) {
		if (root == null)
			return;

		Stack<TreeNode> s = new Stack<>();
		TreeNode current = root;

		while (true) {
			if (current != null) {
				if (current.right != null)
					s.push(current.right);
				s.push(current);
				current = current.left;
				continue;
			}

			if (s.isEmpty())
				return;
			current = s.pop();

			if (current.right != null && !s.isEmpty() && current.right == s.peek()) {
				s.pop();
				s.push(current);
				current = current.right;
			} else {
				System.out.println(current.toString());
				current = null;
			}
		}
	}

	// prints level order
	public static void levelOrderTraversal(TreeNode root) {
		Queue<TreeNode> queue = new LinkedBlockingQueue<>();
		queue.add(root);
		while (!queue.isEmpty()) {
			TreeNode node = queue.poll();
			System.out.println(node.toString());
			if (node.left != null) {
				queue.add(node.left);
			}
			if (node.right != null) {
				queue.add(node.right);
			}
		}
	}

	// prints spiral/zigzag level order
	public static void spiralOrZigzagLevelOrder(TreeNode root) {
		if (root == null)
			return;
		Stack<TreeNode> stack = new Stack<>();
		stack.push(root);

		boolean directionflag = false;
		while (!stack.isEmpty()) {
			Stack<TreeNode> tempStack = new Stack<>();

			while (!stack.isEmpty()) {
				TreeNode tempNode = stack.pop();
				System.out.println(tempNode.toString());
				if (!directionflag) {
					if (tempNode.left != null)
						tempStack.push(tempNode.left);
					if (tempNode.right != null)
						tempStack.push(tempNode.right);
				} else {
					if (tempNode.right != null)
						tempStack.push(tempNode.right);
					if (tempNode.left != null)
						tempStack.push(tempNode.left);
				}
			}
			// for changing direction
			directionflag = !directionflag;

			stack = tempStack;
		}
	}

	public static void main(String[] args) {
		TreeNode rootNode = TreeNode.createBinaryTree();

		System.out.println("Using preOrder Recursive solution:");
		preOrderRec(rootNode);
		System.out.println("Using inOrder Recursive solution:");
		inOrderRec(rootNode);
		System.out.println("Using postOrder Recursive solution:");
		postOrderRec(rootNode);

		System.out.println();
		System.out.println("-------------------------");

		System.out.println("Using preOrder Iterative solution:");
		preOrderIter(rootNode);
		System.out.println("Using inOrder Iterative solution:");
		inOrderIter(rootNode);
		System.out.println("Using postOrder Iterative solution:");
		postOrderIter(rootNode);

		System.out.println();
		System.out.println("-------------------------");

		System.out.println("Using levelOrder Iterative solution:");
		levelOrderTraversal(rootNode);
		
		System.out.println();
		System.out.println("-------------------------");

		System.out.println("Using spiralOrZigzagLevelOrder Iterative solution:");
		spiralOrZigzagLevelOrder(rootNode);
	}
}
