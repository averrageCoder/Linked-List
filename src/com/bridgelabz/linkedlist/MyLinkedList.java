package com.bridgelabz.linkedlist;

public class MyLinkedList {
	
	private INode head;
	private INode tail;

	public MyLinkedList() {
		this.head = null;
		this.tail=null;
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
			this.head = myNode;
			this.head.setNext(tempNode);
		}
	}
	
	public void printMyNodes() {
		StringBuffer myNodes = new StringBuffer("My nodes: ");
		INode tempNode = this.head;
		while(tempNode.getNext()!=null) {
			myNodes.append(tempNode.getKey());
			if(!tempNode.equals(tail))
				myNodes.append("->");
			tempNode = tempNode.getNext();
		}
		myNodes.append(tempNode.getKey());
		System.out.println(myNodes);
	}

	public void append(INode myNode) {
		if(this.tail==null) {
			this.tail=myNode;
		}
		else {
			this.tail.setNext(myNode);
			this.tail = myNode;
		}
		if(this.head==null) {
			this.head=myNode;
		}
		
	}

	public void insert(INode startNode, INode newNode) {
		
		INode tempNode = startNode.getNext();
		startNode.setNext(newNode);
		newNode.setNext(tempNode);
		
	}
	
}
