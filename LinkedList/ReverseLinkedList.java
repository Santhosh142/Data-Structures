class Node
{
	Node next;
	int data;
	Node(int data)
	{
		this.data=data;
	}
}
class ReverseLinkedList
{
	static Node head;
	public static void main(String args[])
	{
		
		head = new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(30);
		head.next.next.next = new Node(40);
		head.next.next.next.next = new Node(50);
		printList();
		reverse();
		printList();
	}
	static void printList()
	{
		if(head==null)
			return;
		Node temp = head;
		while(temp!=null)
		{
			System.out.print(temp.data+"-->");
			temp=temp.next;
		}
		System.out.println();
	}
	static void reverse()
	{
		if(head==null)
		{
			return;
		}
		Node temp = head;
		Node curr = head;
		Node prev=null;
		while(cur!=null)
		{
			temp = curr.next;
			curr.next=prev;
			prev=curr;
			curr=curr.next;
		}
		head=curr;
	}
	
}