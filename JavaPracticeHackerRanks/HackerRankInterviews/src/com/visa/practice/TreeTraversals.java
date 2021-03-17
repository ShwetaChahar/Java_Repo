
package com.visa.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.Stack;
import java.util.TreeMap;

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode(int x) {
		val = x;
		left = null;
		right = null;
	}
}

class Tree {

	TreeNode root;

	Tree() {
		root = null;
	}

	public void insert(int d) {
		if (root == null) {
			root = new TreeNode(d);
			return;
		}
		recinsert(root, d);
	}

	public void recinsert(TreeNode root, int d) {
		if (d == root.val) {
			return;
		} else if (d < root.val) {
			if (root.left == null)
				root.left = new TreeNode(d);
			else
				recinsert(root.left, d);
		} else {
			if (root.right == null)
				root.right = new TreeNode(d);
			else
				recinsert(root.right, d);
		}
	}
	
	public void invertTree(TreeNode root) {
		if (root == null)
		    return;
		swap( root); 
		 invertTree(root.right);
		 invertTree(root.left);
		}
	private void swap(TreeNode root) {
		TreeNode temp = root.left;
	      root.left = root.right;
	      root.right = temp;
		
	}
	

	public void preorder(TreeNode root) {

		if (root == null)
			return;
		System.out.printf("%d, ", root.val);
		preorder(root.left);
		preorder(root.right);
	}

	public void inorder(TreeNode root) {

		if (root == null)
			return;
		inorder(root.left);
		System.out.printf("%d, ", root.val);
		inorder(root.right);
	}

	public void bfs() {
		if (root == null)
			return;

		List<TreeNode> ls = new ArrayList<TreeNode>();
		ls.add(root);
		System.out.println("BFS:");
		while (ls.size() != 0) {
			int len = ls.size();
			for (int i = 0; i < len; ++i) {
				TreeNode r = ls.remove(0);
				System.out.printf("%d, ", r.val);
				if (r.left != null)
					ls.add(r.left);
				if (r.right != null)
					ls.add(r.right);
			}
			System.out.println();
		}
		System.out.println("-----------------");
	}
}

public class TreeTraversals {

	public void testTree() {

		Tree t = createTree(10);
		System.out.print("In: ");
		t.inorder(t.root);
		System.out.println();
		
		System.out.print("Pre: ");
		t.preorder(t.root);
		System.out.println();
		t.invertTree(t.root);
		System.out.print("In: ");
		t.inorder(t.root);
		System.out.println();
		
		System.out.print("Pre: ");
		t.preorder(t.root);
		System.out.println();
		//t.bfs();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeTraversals p = new TreeTraversals();
		p.testTree();
		Integer a = 10;
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("PC", "SC");
		List<Object> ls = new ArrayList<Object>();
		ls.add(a);
		ls.add(hm);
		System.out.println(ls);
	}

	public Tree createTree(int n) {
		Tree root = new Tree();

		Random r = new Random((long) (Math.random() * 100000));
		for (int i = 0; i < n; ++i)
			root.insert(r.nextInt(100));
		return root;
	}
}
