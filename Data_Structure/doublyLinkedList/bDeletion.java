package doublyLinkedList;

public class bDeletion {
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
	
	//Deletion of head
	private static Node deleteHead(Node head) {
		if(head==null || head.next==null) return null;
		Node prev=head;
		head=head.next;
		head.back=null;
		prev.next=null;
		return head;
	}
	
	//Deletion of tail
	private static Node deleteTail(Node head) {
		if(head==null || head.next==null) {
			return null;
		}
		Node tail=head;
		while(tail.next!=null) {
			tail=tail.next;
		}
		Node temp=tail.back;
		temp.next=null;
		tail.back=null;
		return head;
	}
	public static void main(String[] args) {
		int[] arr= {1,4,7,2,7};
		Node head=convertArr2DLL(arr);
		Node temp=deleteHead(head);
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		
		System.out.println();
		
		int[] arr2= {16,49,74,28,75,45};
		Node head2=convertArr2DLL(arr2);
		Node temp2=deleteTail(head2);
		while(temp2!=null) {
			System.out.print(temp2.data+" ");
			temp2=temp2.next;
		}
	}

}
