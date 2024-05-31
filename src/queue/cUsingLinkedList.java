package queue;

import java.util.NoSuchElementException;

public class cUsingLinkedList {
	private ListNode front;
	private ListNode rear;
	private int length;
	
	private class ListNode{
		private int data;
		private ListNode next;
		
		public ListNode(int data) {
			this.data=data;
			this.next=null;
		}
	}
	public int length() {
		return length;
	}
	
	public boolean isEmpty() {
		return length==0;
	}
	
	public void enqueue(int data) {
		ListNode temp=new ListNode(data);
		if(isEmpty()) {
			front=temp;
		}else {
			rear.next=temp;
		}
		
		rear=temp;
		length++;
	}
	
	public cUsingLinkedList() {
		this.front=null;
		this.rear=null;
		this.length=0;
	}
	
	public int dequeue() {
		if(isEmpty()) {
			throw new NoSuchElementException();
		}
		int result=front.data;
		front=front.next;
		if(front==null) {
			rear=null;
		}
		length--;
		return result;
	}
	
	public void print() {
		if(isEmpty()) {
			return;
		}
		ListNode current=front;
		while(current!=null) {
			System.out.print(current.data + " --> ");
			current=current.next;
		}
		System.out.println("null");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cUsingLinkedList q1=new cUsingLinkedList();
		q1.enqueue(12);
		q1.enqueue(14);
		q1.enqueue(15);
		q1.enqueue(16);
		q1.print();
		
		q1.dequeue();
		q1.dequeue();
		
		q1.print();
		
		}
}
