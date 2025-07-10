package stack;

import java.util.LinkedList;
import java.util.Queue;

public class cUsingQueues {
	class MyStack {
	    Queue<Integer> q1;
	    public MyStack() {
	        q1=new LinkedList<>();
	    }
	    
	    public void push(int x) {
	        q1.offer(x);
	        int size =q1.size();
	        while(size>1){
	            q1.offer(q1.poll());
	            size--;
	        }
	    }
	    
	    public int pop() {
	        return q1.poll();
	    }
	    
	    public int top() {
	        return q1.peek();
	    }
	    
	    public boolean empty() {
	        return q1.isEmpty();
	    }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cUsingQueues outer=new cUsingQueues();
		MyStack stack=outer.new MyStack();
		stack.push(6);
		stack.push(8);
		stack.push(15);
		stack.push(45);
		stack.push(36);
		stack.push(54);
		System.out.println(stack.top());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.top());
		System.out.println(stack.pop());
		System.out.println(stack.empty());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.empty());
	}

}
