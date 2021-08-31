package com.bridgelabz.linkedlist;

public class LinkedListTest {

	public static void main(String[] args) {
		
		MyNode<Integer> firstNode = new MyNode<Integer>(56);
		MyNode<Integer> secondNode = new MyNode<Integer>(70);
		MyNode<Integer> thirdNode = new MyNode<Integer>(30);
		MyNode<Integer> fourthNode = new MyNode<Integer>(40);
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.add(firstNode);
		myLinkedList.append(secondNode);
		myLinkedList.insert(firstNode,thirdNode);
		//myLinkedList.searchAndInsert(30, fourthNode);	
		myLinkedList.insert(thirdNode,fourthNode);
		myLinkedList.printMyNodes();
		System.out.println("Initial Size: "+myLinkedList.getSize());
		
		myLinkedList.remove(40);
		myLinkedList.printMyNodes();
		System.out.println("Size after deleting: "+myLinkedList.getSize());
	}		
}
