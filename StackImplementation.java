class Stack
{
	int size;
	int arr[];
	int top;
	
	//Time Complexity : O(1)
	
	public Stack(int size)
	{
		this.size = size;
		this.arr = new int[size];
		this.top = -1;
	}
	
	public boolean isEmpty()
	{
		return (top == -1);
	}
	
	public boolean isFull()
	{
		return (size-1 == top);
	}
	
	public int peek()
	{
		if(!this.isEmpty())
			return arr[top];
		else
		{
			System.out.println("Stack is empty");
			return -1;
		}
	}
	
	public void push(int element)
	{
		if(!isFull())
		{
			top++;
			arr[top] = element;
			System.out.println(element+" pushed successfully");
		}
		else
		{
			System.out.println("Stack is full");
		}
	}
	
	public int pop()
	{
		if(!isEmpty())
		{
			int returnedTop = top;
			top--;
			System.out.println(arr[returnedTop]+" poped successfully");
			return arr[returnedTop];
		}
		else
		{
			System.out.println("Stack is empty");
			return -1;
		}
	}
}

public class StackImplementation
{
	public static void main(String[] args)
	{
		Stack s = new Stack(5);
		s.pop();
		
		System.out.println("--------------------------------------");
		
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		
		System.out.println("--------------------------------------");
		
		s.pop();
		s.pop();
		s.pop();
		s.pop();
		
		System.out.println("--------------------------------------");
		
		System.out.println(s.isEmpty());
		
		System.out.println("--------------------------------------");
		
		System.out.println(s.isFull());
		
		System.out.println("--------------------------------------");
		
		System.out.println(s.peek());
		
	}
}
