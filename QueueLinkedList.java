class QueueLinkedList
{
	
	Node head=null;
	Node tail=null;
	class Node
	{
		int data;
		Node next,prev;
		Node(int data)
		{
			this.data=data;
		}
	}
	public void enqueue(int data)
	{
		Node newnode = new Node(data);
		if(head==null)
		{
			head=newnode;
			tail = newnode;
			return;
		}
		tail.next=newnode;
		newnode.prev=tail;
		tail = newnode;
	}
	public void dequeue()
	{
		if(head==null)
		{
			System.out.println("Queue is empty");
			return;
		}
		head=head.next;
		head.prev=null;
	}
		
	public void printForward()
	{
		Node temp=head;
		System.out.print("Null-->");
		while(temp != null)
		{
			System.out.print(temp.data+"-->");
			temp=temp.next;
		}
		System.out.println("Null");
	}
	public void printBackward()
	{
		Node temp = tail;
		System.out.print("Null-->");
		while(temp != null)
		{
			System.out.print(temp.data+"-->");
			temp=temp.prev;
		}
		System.out.println("Null");
	}


	public void deleteLast()
	{
		tail=tail.prev;
		tail.next=null;
	}
	public void middle(int data)
	{
		Node temp=head;
		while(temp.data != data)
		{
			temp=temp.next;
		}
		temp.prev.next = temp.next;
		temp.next.prev = temp.prev;
	}
			
	public static void main(String args[])
	{
		QueueLinkedList qll = new QueueLinkedList();
		qll.enqueue(20);
		qll.enqueue(30);
		qll.enqueue(40);
		qll.enqueue(50);
		qll.enqueue(60);
		qll.enqueue(70);
		qll.middle(50);
		qll.printForward();
	
	}
}