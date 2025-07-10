package linkedList;
public class bTraversalLengthSearch {
	
	//conversion of array to ll
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
	
	
	//length
	private static int lengthofLL(Node head) {
		int count=0;
		Node temp=head;
		while(temp!=null) {
			count++;
			temp=temp.next;
		}
		return count;
	}
	
	//Search
	private static boolean Search(Node head,int search) {
		Node temp=head;
		while(temp!=null) {
			if(temp.data==search) {
				return true;
			}
			temp=temp.next;
		}
		return false;
	}

	public static void main(String[] args) {
		
		
		//Traversal
		
		int[] arr= {1,4,6,9,3};
		Node head=convertArr2LL(arr);
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		System.out.println();
		
		//length
		System.out.println(lengthofLL(head));
		
		//Search
		System.out.println(Search(head,0));
	}

}
