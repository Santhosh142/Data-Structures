public class DoublyLinkedList {
	private Node head;
	private Node tail;

	class Node {
		Node next;
		Node prev;
		int data; 
		public Node(int data)
		{
			this.data = data;
		}
		
	}
	public DoublyLinkedList()
	{
		this.head = null;
		this.tail = null;
	}
	
	public void insert(int data) {
		Node newnode = new Node(data);
		if(head==null) {
			head =newnode;
			tail=newnode;
			
		}
		else {
			tail.next =newnode;
		}
		newnode.prev=tail;
		tail = newnode;
	}
	
	public void printListForward() 
	{
		
		if(head==null)
		{
			System.out.println("List is EMPTY ");
			return;
		}
		Node temp=head;
			while(temp != null)
			{
				System.out.print(temp.data+"-->");
				temp=temp.next;
			}
			System.out.println("Null");
		
	}
	public void printListBackward()
	{
		Node temp= tail;
		if(tail == null)
		{
			System.out.println("List is EMPTY ");
			return;
		}
			while(temp != null)
			{
				System.out.print(temp.data+"-->");
				temp=temp.prev;
			}
			System.out.println("Null");
	
	}
			
			
	
	public static void main(String args[]) {
		DoublyLinkedList d = new DoublyLinkedList();
		d.insert(10);
		d.insert(20);
		d.insert(30);
		
		d.printListForward();
		d.printListBackward();
	}
}