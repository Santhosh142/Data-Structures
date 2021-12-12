import java.util.*;

class SingleLinkedList
{	
	class Node
	{
		int data;
		Node next;
		Node prev;
		Node(int data)
		{
			this.data=data;
		}
	}
	Node head=null;
	Node tail=null;
	public void insert(int data)
	{
		Node newnode=new Node(data);
		if(head==null)
		{
			head=newnode;
			tail=newnode;
		}
		else
		{
			tail.next=newnode;
			newnode.prev=tail;
			tail=newnode;
		}	
	}
	
	public void displayForward()
	{
		Node temp=head;
		if(head==null)
		{
			System.out.println("no elements");
		}
		while(temp!=null)
		{
			System.out.print(temp.data+"-->");
			temp=temp.next;
		}	
		System.out.println();
	}
	public void displayBackward()
	{
		Node temp=tail;
		if(tail==null)
		{
			System.out.println("no elements");
		}
		while(temp!=null)
		{
			System.out.print(temp.data+"-->");
			temp=temp.prev;
		}	
		System.out.println();
	}
	public void delete(int data)
	{
		Node temp;
		if(head.data==data)
		{
			head=head.next;
			head.prev=null;
		}
		else if(tail.data==data)
		{
			temp=tail.prev;
			temp.next=null;
			tail=temp;
		}
		else
		{
			Node temp2=head;
			while(temp2.data!=data)
			{
				temp2=temp2.next;
			}
			temp2.prev.next=temp2.next;
			temp2.next.prev=temp2.prev;
		}
	}
	public static void main(String args[])
	{
		SingleLinkedList s= new SingleLinkedList();
		s.insert(11);
		s.insert(12);
		s.insert(13);
		s.insert(14);
		s.insert(15);
		s.displayBackward();
		s.displayForward();
		s.delete(12);
		s.displayForward();
		

	}
}