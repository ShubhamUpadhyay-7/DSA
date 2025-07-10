package doublyLinkedList;

class Node{
	int data;
	Node next;
	Node back;
	
	Node(int data1){
		this.data=data1;
		this.next=null;
		this.back=null;
	}
	Node(int data1,Node next1,Node back1){
		this.data=data1;
		this.next=next1;
		this.back=back1;
	}
}


public class aIntroduction {
	
	private static Node convertArr2DLL(int[] arr) {
		Node head=new Node(arr[0]);
		Node prev=head;
		for(int i=1;i<arr.length;i++) {
			Node temp=new Node(arr[i],null,prev);
			prev.next=temp;
			prev=temp;
		}
		return head;
	}
	public static void main(String args[]) {
		int[] arr= {1,4,7,2,7};
		Node head=convertArr2DLL(arr);
		Node temp=head;
		while(temp!=null) {
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
}
