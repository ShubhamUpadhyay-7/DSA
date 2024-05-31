package linkedList;

public class fDeletionOfElement {
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
	
	//deletion of any element
	private static Node removeEle(Node head,int value) {
		if(head==null) return head;
		if(head.data==value) {
			head=head.next;
			return head;
		}
		else {
			Node temp=head;
			Node previous=null;
			while(temp.data!=value) {
				if(temp.next==null) return head;
				previous=temp;
				temp=temp.next;
			}
			previous.next=temp.next;
			return head;
		}
	}

	public static void main(String[] args) {
		int[] arr= {1,4,6,9,3};
		Node head=convertArr2LL(arr);
		head=removeEle(head,9);
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
	}


}
