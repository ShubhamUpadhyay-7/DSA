package linkedList;

public class gInsertionAny {
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
	
	private static Node insertionK(Node head,int k,int value) {
		if(head==null) {
			if(k==1) {
				Node node=new Node(value);
				return node;
			}
			else {
				return head;
			}
		}else if(k==1){
			Node temp=new Node(value,head);
			return temp;
		}else {
			int count=0;
			Node temp=head;
			while(count!=k-1) {
				if(temp==null) return head;
				count++;
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
		Node temp=insertionK(head,4,99);
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
	}
}
