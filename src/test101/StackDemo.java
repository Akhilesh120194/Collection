package test101;

//Stack Using java Demonstration 

public class StackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack_Methods nums = new Stack_Methods();
		nums.push(100);
		nums.push(200);
		nums.push(400);
		nums.push(300);
		nums.push(700);

		System.out.println("Displaying the inserted values in the stack ");
		nums.show();
		
		
		System.out.println("Removing the top values from  the stack ");
		System.out.println(nums.pop());
		
		System.out.println("Stack after Removing the top values from  the stack ");
		nums.show();
		
		
		System.out.println("getting the top values from  the stack ");
		System.out.println(nums.peek());
		
	}

}

class Stack_Methods {

	int stack[] = new int[6];
	int top = 0;

	public void push(int data) {
		stack[top] = data;
		top++;
	}

	public void show() {
		
		for(int n :stack)
		{
			System.out.println(n +" ");
		}

	}
	
	public int pop()
	{
		top--; //During last push operation index inremented by +1 extra . so to get the actual top value we need to decrement it by 1 
		
		int data=stack[top];
		System.out.println(top);
		stack[top]=0;
		return data;
		
	}
	
	public int peek()
	{
		
		int data=stack[top-1];
		System.out.println(top);
		stack[top]=0;
		return data;
		
	}
}
