package stack;

public class bUsingLinkedList {
	class MyStack 
	{
	     class StackNode {
	         int data;
	         StackNode next;
	         StackNode(int a) {
	             data = a;
	             next = null;
	         }
	     }   
	    StackNode top;
	    
	    //Function to push an integer into the stack.
	    void push(int a) 
	    {
	        StackNode top1=new StackNode(a);
	        if(top==null){
	            top=top1;
	        }else{
	            top1.next=top;
	            top=top1;
	        }
	    }
	    
	    //Function to remove an item from top of the stack.
	    int pop() 
	    {
	        if(top==null){
	            return -1;
	        }
	        // Add your code here
	        int poppedValue=top.data;
	        top=top.next;
	        return poppedValue;
	    }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bUsingLinkedList usingLinkedList=new bUsingLinkedList();
		MyStack mystack=usingLinkedList.new MyStack();
		mystack.push(5);
		mystack.push(9);
		mystack.push(3);
		mystack.push(4);
		System.out.print(mystack.pop()+"-->");
		System.out.print(mystack.pop()+"-->");
		System.out.print(mystack.pop()+"-->");
		System.out.print(mystack.pop());
	}

}
