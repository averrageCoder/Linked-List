package com.bridgelabz.linkedlist;

public class LinkedListTest {

	public static void main(String[] args) {
		
		MyNode<Integer> firstNode = new MyNode<Integer>(56);
		MyNode<Integer> secondNode = new MyNode<Integer>(70);
		MyNode<Integer> thirdNode = new MyNode<Integer>(30);
		MyNode<Integer> fourthNode = new MyNode<Integer>(40);
		
		
		SortedLinkedList mySortedLinkedList = new SortedLinkedList();
		mySortedLinkedList.add(firstNode);
		mySortedLinkedList.printMyNodes();
		mySortedLinkedList.add(fourthNode);
		mySortedLinkedList.printMyNodes();
		mySortedLinkedList.add(thirdNode);
		mySortedLinkedList.printMyNodes();
		mySortedLinkedList.add(secondNode);
		mySortedLinkedList.printMyNodes();
	}		
}
