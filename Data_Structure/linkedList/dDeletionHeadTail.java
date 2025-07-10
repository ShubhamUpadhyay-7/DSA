package linkedList;

public class dDeletionHeadTail {
	
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
	
	//deletion of head
	private static Node removesHead(Node head) {
		if(head==null) return head;
		head=head.next;
		return head;
	}
	
	//deletion of Tail
	private static Node removesTail(Node head) {
		if(head==null || head.next==null) {
			return null;
		}else {
			Node temp=head;
			while(temp.next.next!=null) {
				temp=temp.next;
			}
			temp.next=null;
			return temp;
		}
	}

	public static void main(String[] args) {
		int[] arr= {1,4,6,9,3};
		Node head=convertArr2LL(arr);
		System.out.println(removesHead(head).data);
		
		System.out.println(removesTail(head).data);
	}

}
