package linkedList;

public class eDeletionAny {
	
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
	
	//deletion of any Index
	private static Node removeK(Node head,int k) {
		if(head==null) return head;
		if(k==1) {
			head=head.next;
			return head;
		}
		else {
			int count=0;
			Node temp=head;
			Node previous=null;
			while(count!=k) {
				if(temp.next==null) return head;
				previous=temp;
				temp=temp.next;
				count++;
			}
			previous.next=temp.next;
			return head;
		}
	}

	public static void main(String[] args) {
		int[] arr= {1,4,6,9,3};
		Node head=convertArr2LL(arr);
		head=removeK(head,6);
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
	}

}
