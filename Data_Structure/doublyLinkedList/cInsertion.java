package doublyLinkedList;

public class cInsertion {
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
	public static void main(String[] args) {
		int[] arr= {1,4,7,2,7};
		Node head=convertArr2DLL(arr);
		Node temp=head;
		while(temp!=null) {
			System.out.println(temp.data);
			temp=temp.next;
		}
	}

}
