package com.bridgelabz.linkedlist;

public class LinkedListTest {

	public static void main(String[] args) {
		
		MyNode<Integer> firstNode = new MyNode<Integer>(56);
		MyNode<Integer> secondNode = new MyNode<Integer>(70);
		MyNode<Integer> thirdNode = new MyNode<Integer>(30);
		
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.add(firstNode);
		myLinkedList.append(secondNode);
		myLinkedList.insert(firstNode,thirdNode);
		System.out.print("Before Popping : ");
		myLinkedList.printMyNodes();
		System.out.println("Popped element : "+myLinkedList.popLast().getKey());
		System.out.print("After Popping : ");
		myLinkedList.printMyNodes();
		
		
	}
	
}
