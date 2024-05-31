package linkedList;

public class cInsertion {
	private static Node convertArr2LL(int[] arr) {
		Node head=new Node(arr[0]);
		Node mover=head;
		for(int i=1;i<arr.length;i++) {
			Node temp=new Node(arr[i]);
			mover.next=temp;
			mover=temp;
		}
		return head;
	}
	
	//insertion at head
	public static Node insertionHead(Node head,int value){
		return new Node(value,head);
	}
	
	//insertion at tail
	public static Node insertionTail(Node head,int value){
		Node temp=head;
		while(temp.next!=null) {
			temp=temp.next;
		}
		Node tail =new Node(value);
		temp.next=tail;
		return head;
	}
	
	public static void main(String[] args) {
		int[] arr= {1,4,6,9,3};
		Node head=convertArr2LL(arr);
		Node temp=insertionHead(head,76);
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		System.out.println();
		
		
		
		Node temp1=insertionTail(head,67);
		while(temp1!=null) {
			System.out.print(temp1.data+" ");
			temp1=temp1.next;
		}
	}
}
