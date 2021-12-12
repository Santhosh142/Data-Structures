import java.util.Scanner;
class Node
{
	int data;
	Node left;
	Node right;
	Node(int data)
	{
		this.data=data;
	}
}

class LeftView
{
	static Node root;
	boolean isRight(Node tempNode)
	{
		return tempNode.right != null;
	}
	void printLeft(Node tempNode)
	{
		Node current = tempNode;
		while(current.left != null)
		{
			System.out.println(current.left.data);
			current=current.left;
		}
	}
	void printLeftView()
	{
		System.out.println(root.data);
		Node current = root;
		
		while(current.left != null)
		{
			System.out.println(current.left.data);
			current=current.left;
		}
	}
	
	public static void main(String args[])
	{
		LeftView lv = new LeftView();
		
		root = new Node(10);
		root.left = new Node(8);
		root.left.left = new Node(5);
		root.left.left.left = new Node(6);
		root.left.left.left.right=new Node(21);
		root.right = new Node(72);
		root.right.left = new Node(55);
		root.left.left.left.right.left=new Node(21);
		
		lv.printLeftView();
	}
}