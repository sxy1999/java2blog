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

	public static void main(String[] args) {
		BinaryTree bi = new BinaryTree();
		TreeNode rootNode = TreeNode.createBinaryTree();

		System.out.println("Using Recursive solution:");
		bi.preOrderRec(rootNode);
		
		System.out.println();
		System.out.println("-------------------------");
		
		System.out.println("Using Iterative solution:");
		bi.preOrderIter(rootNode);
	}
}
