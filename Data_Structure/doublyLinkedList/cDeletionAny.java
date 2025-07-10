package doublyLinkedList;

public class cDeletionAny {
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
	
	private static Node deleteK(Node head,int K) {
		if(head==null || head.next==null) {
			if(K==1) {
				head=null;
				return head;
			}
			return null;
		}
		if(head.next!=null && K==1 ) {
			Node temp=head.next;
			temp.back=null;
			head=temp;
			return head;
		}
		Node temp=head;
		int count=1;
		while(temp.next!=null) {
			if(count==K) {
				Node temp1=temp.back;
				temp1.next=temp.next;
				temp.next.back=temp1;
				temp.back=null;
				temp.next=null;
				return head;
			}
			count++;
			temp=temp.next;
		}
		if(temp.next==null && K==count) {
			Node temp1=temp.back;
			temp.back=null;
			temp1.next=null;
		}
		return head;
	}

	public static void main(String[] args) {
		int[] arr= {16,56,38,46,272,84};
		Node head=convertArr2DLL(arr);
		Node temp=deleteK(head,1);
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
	}

}
