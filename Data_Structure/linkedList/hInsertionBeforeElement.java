package linkedList;

public class hInsertionBeforeElement {
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
	
	private static Node insertionBeforeIndex(Node head, int value,int ele) {
		if(head==null) {
			return null;
		}else if(head.data==ele) {
			return new Node(value,head);
		}else {
			Node temp=head;
			while(temp.next.data!=ele) {
				temp=temp.next;
			}
			Node insert=new Node(value,temp.next);
			temp.next=insert;
			return head;
		}
	}
	
	
	public static void main(String[] args) {
		int[] arr= {1,4,6,9,3};
		Node head=convertArr2LL(arr);
		Node temp=insertionBeforeIndex(head,67,6);
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
	}
}
