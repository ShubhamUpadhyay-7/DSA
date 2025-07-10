package queue;

import java.util.Stack;

public class dUsingStack {
	class MyQueue {

	    Stack<Integer> stack1;
	    Stack<Integer> stack2;
	    public MyQueue() {
	        stack1=new Stack<>();
	        stack2=new Stack<>();
	    }
	    
	    public void push(int x) {
	        while(stack1.size()>0){
	            stack2.push(stack1.pop());
	        }
	        stack1.push(x);
	        while(stack2.size()>0){
	            stack1.push(stack2.pop());
	        }
	    }
	    
	    public int pop() {
	        return stack1.pop();
	    }
	    
	    public int peek() {
	        return stack1.peek();
	    }
	    
	    public boolean empty() {
	        return stack1.isEmpty();
	    }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dUsingStack outer=new dUsingStack();
		MyQueue queue=outer.new MyQueue();
		queue.push(8);
		queue.push(7);
		queue.push(45);
		queue.push(34);
		queue.push(86);
		System.out.println(queue.pop());
		System.out.println(queue.pop());
		System.out.println(queue.peek());
		System.out.println(queue.pop());
		System.out.println(queue.peek());
		System.out.println(queue.empty());
	}

}
