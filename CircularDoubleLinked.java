import java.util.*;
class CircularDoubleLinked
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
	public void add(int data)
	{
		Node newnode = new Node(data);
		if(head== null)
		{
			head=newnode;
			tail=newnode;
			return;
		}
		tail.next=newnode;
		newnode.prev=tail;
		tail=newnode;
	}
	public void delete(int data)
	{
		if(head==null)
		{
			System.out.println("List is Empty");
			return;
		}
		else if(head.data==data)
		{
			head=head.next;
			head.prev=null;
			return;
		}
		else if(tail.data==data)
		{
			tail=tail.prev;
			tail.next=null;return;
		}
		Node temp=head;
		while(temp.data!=data)
		{
			temp=temp.next;
		}
		temp.prev.next=temp.next;
		temp.next.prev=temp.prev;
	}
			
	public void print()
	{
		Node temp=head;
		while(temp !=null)
		{
			System.out.print(temp.data+"<-->");
			temp=temp.next;
		}
		System.out.println();
	}
			
		
	public static void main(String args[])
	{
		CircularDoubleLinked cd = new CircularDoubleLinked();
		Scanner sc = new Scanner(System.in);
		int n;
		do
		{
			System.out.println("1.insert\n2.delete\n3.display");
			n = sc.nextInt();
			switch(n)
			{
				case 1:
				cd.add(sc.nextInt());
				break;
				
				case 2:
				cd.delete(sc.nextInt());
				break;
				
				case 3:
				cd.print();
				break;
			}
		}
		while(n<4);
		
			
		
	}
}