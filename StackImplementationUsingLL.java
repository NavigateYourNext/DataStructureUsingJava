public class StackImplementationUsingLL
{
	Node head;

	class Node
	{
		int value;
		Node nextNode;
	}

	public StackImplementationUsingLL()
	{
		head = null;
	}

	public void push(int value)
	{
		Node extraHead = head;
		head = new Node();
		head.value = value;
		head.nextNode = extraHead;
	}

	public int pop()
	{
		if(head == null)
		{
			System.out.println("Stack is empty");
			return -1;
		}
		else
		{
			int value = head.value;
			head = head.nextNode;
			return value;
		}
	}
	
	public static void printList(Node head)
	{
		Node temp = head;
		while(temp != null)
		{
			System.out.println(temp.value+" ");
			temp = temp.nextNode;
		}
	}

	public static void main(String[] args)
	{
		StackImplementationUsingLL ls = new StackImplementationUsingLL();

		//System.out.println(ls.pop());
		
		ls.push(1);
		ls.push(2);
		
		System.out.println(ls.pop());
		System.out.println(ls.pop());
		
		ls.push(3);
		
		System.out.println(ls.pop());
		System.out.println(ls.pop());
		
		ls.push(4);
		ls.push(5);
		
		printList(ls.head);

	}
}
