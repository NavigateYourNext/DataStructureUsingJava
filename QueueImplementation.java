class Queue
{
	int capacity;
	int[] queueArr;
	int front;
	int rear;
	int currentSize;
	
	public Queue(int sizeOfQueue)
	{
		this.capacity = sizeOfQueue;
		front = 0;
		rear = -1;
		queueArr = new int[this.capacity];
	}
	
	public boolean isEmpty()
	{
		if(currentSize == 0)
			return true;
		else
			return false;
	}
	
	public boolean isFull()
	{
		if(currentSize == capacity)
			return true;
		else 
			return false;
	}
	
	//Add elements in Queue
	public void enqueue(int data)
	{
		if(isFull())
			System.out.println("Queue is full");
		else
		{
			rear++;
			if(rear == capacity-1)
			{
				rear = 0;
			}
			queueArr[rear] = data;
			currentSize++;
			System.out.println(data+ " added inside queue");
		}
	}
	
	//Remove data from front of Queue
	public void dequeue()
	{
		if(isEmpty())
		{
			System.out.println("Queue is empty");
		}
		else
		{
		  front++;
		  
		  if(front == capacity-1)
		  {
		    System.out.println(queueArr[front-1]+" removed from queue");
		    front = 0;
		  }
		  else
		  {
			  System.out.println(queueArr[front-1]+" removed from queue");
		  }
		  
		  currentSize--;
		}
	}
}





public class QueueImplementation 
{
	public static void main(String[] args)
	{
		Queue q  = new Queue(5);
		
		q.enqueue(1);
	    q.enqueue(2);
	    q.enqueue(3);
	    
	    q.dequeue();
	    q.dequeue();
	    
	    q.enqueue(4);
	    
	   System.out.println(q.isEmpty());
	    
	    q.dequeue();
	}
}
