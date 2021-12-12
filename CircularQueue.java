class CircularQueue
{
	int size=5;
	Node head;
	Node tail;
	static int i=0;
	class Node
	{
		int data;
		Node next;
		Node(int data)
		{
			this.data=data;
		}
	}
	CircularQueue(int size)
	{
		this.size=size;
		head=null;
		tail=null;
	}
	CircularQueue()
	{
		head=null;
		tail=null;
	}
	
	public void enqueue(int data)
	{
		Node newnode = new Node(data);
		
		if(head==null && i<=size)
		{
			head=newnode;
			tail=newnode;
			i=1;
			return;
		}
		else if(i>=this.size)
		{
			System.out.println("queue is full by adding "+data);
			return;
		}
		else if(head != null && i<=this.size)
		{
			tail.next=newnode;
			tail=newnode;
		}
		
		
		
		i++;
	}
	public void dequeue()
	{
		if(head == null)
		{
			System.out.println("Queue is empty");
		}
		head=head.next;
		
		i--;
	}
	public void print()
	{
		Node temp = head;
		while(temp!=null)
		{
			System.out.print(temp.data+"-->");
			temp=temp.next;
		}
		System.out.println();
	}
	
	
	
	
	public static void main(String args[])
	{
		CircularQueue cq = new CircularQueue();
		cq.enqueue(10);
		cq.enqueue(20);
		cq.enqueue(30);
		cq.enqueue(40);
		cq.enqueue(50);
		cq.enqueue(60);
		cq.print();
		cq.dequeue();
		//System.out.println(i);
		cq.print();
		cq.enqueue(60);
		cq.print();
		cq.enqueue(70);
		cq.print();
		
		
	}
}