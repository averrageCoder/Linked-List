package com.bridgelabz.linkedlist;

public class SortedLinkedList {

	private INode head;
	private INode tail;
	private int size;

	public SortedLinkedList() {
		this.head = null;
		this.tail=null;
		this.size=0;
	}

	public void add(INode myNode) {
		
		if(this.tail==null) {
			this.tail=myNode;
		}
		if(this.head==null) {
			this.head=myNode;
		}
		else {
			INode tempNode = this.head;
			while(tempNode.getNext()!=null) {
				if(tempNode.getKey().compareTo(myNode.getKey()) > 0) {
					this.head = myNode;
					myNode.setNext(tempNode);
					break;
				}
				tempNode = tempNode.getNext();
			}
			if(tempNode.getNext()==null) {
				if(tempNode.getKey().compareTo(myNode.getKey()) > 0) {
					this.head = myNode;
					myNode.setNext(tempNode);
				}
				else {
					this.tail = myNode;
					tempNode.setNext(myNode);
				}
			}
		}
		this.size++;
	}
	
	public void printMyNodes() {
		StringBuffer myNodes = new StringBuffer("My nodes: ");
		INode tempNode = this.head;
		if(tempNode==null)
			System.out.println("Empty List!");
		else {
			while(tempNode.getNext()!=null) {
				myNodes.append(tempNode.getKey());
				if(!tempNode.equals(tail))
					myNodes.append("->");
				tempNode = tempNode.getNext();
			}
			myNodes.append(tempNode.getKey());
			System.out.println(myNodes);
		}
	}
	
}
