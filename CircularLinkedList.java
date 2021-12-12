class CircularLinkedList
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
	int capacity=5;
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
		head.prev=tail;
		tail.next=head;
		size++;
	}
	public void tailnext()
	{
		Node temp = tail.next;
		System.out.println(temp.data);
		System.out.println(head.prev.data);
	}
		
	
		
	public static void main(String args[])
	{
		CircularLinkedList cll = new CircularLinkedList();
		cll.enqueue(10);
		cll.enqueue(20);
		cll.enqueue(30);
		cll.tailnext();
		
	}
}