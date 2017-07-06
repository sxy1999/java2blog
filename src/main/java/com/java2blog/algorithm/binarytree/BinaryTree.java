package com.java2blog.algorithm.binarytree;

import java.util.Stack;

public class BinaryTree {

	public void preOrderRec(TreeNode root) {
		if (root == null) {
			return;
		}

		System.out.println(root.toString());
		preOrderRec(root.left);
		preOrderRec(root.right);

	}

	public void preOrderIter(TreeNode root) {
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

	public void inOrderRec(TreeNode root) {
		if (root == null) {
			return;
		}

		preOrderRec(root.left);
		System.out.println(root.toString());
		preOrderRec(root.right);

	}

	public void inOrderIter(TreeNode root) {
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

	public static void main(String[] args) {
		BinaryTree bi = new BinaryTree();
		TreeNode rootNode = TreeNode.createBinaryTree();

		System.out.println("Using Recursive solution:");
		bi.preOrderRec(rootNode);
		bi.inOrderRec(rootNode);

		System.out.println();
		System.out.println("-------------------------");

		System.out.println("Using Iterative solution:");
		bi.preOrderIter(rootNode);
		bi.inOrderIter(rootNode);
	}
}
