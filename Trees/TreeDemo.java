class Node
{
	int data;
	Node left,right;
	Node(int data)
	{
		this.data=data;
		left=right=null;
	}
}
public class TreeDemo
{
	static Node root;
	TreeDemo(int data)
	{
		root = new Node(data);
	}
	TreeDemo()
	{
		root = null;
	}
	public void inOrder(Node localroot)
	{
		if(localroot!=null)
		{
			inOrder(localroot.left);
			System.out.println(localroot.data);
			inOrder(localroot.right);
		}
	}
	public void preOrder(Node localroot)
	{
		if(localroot!=null)
		{
			System.out.println(localroot.data);
			preOrder(localroot.left);
			preOrder(localroot.right);
		}
	}
	
	public void postOrder(Node localroot)
	{
		if(localroot!=null)
		{
			postOrder(localroot.left);
			postOrder(localroot.right);
			System.out.println(localroot.data);
		}
	}
	
	public static void main(String args[])
	{
		TreeDemo td = new TreeDemo();
		//System.out.println("enter element to insert");
		root=new Node(10);
		System.out.println(root.data+" is inserted");
		root.left=new Node(20);
		System.out.println(root.left.data+" is inserted");
		root.right=new Node(30);
		System.out.println(root.right.data+" is inserted ");
		root.left.left=new Node(40);
		System.out.println(root.left.left.data+" is inserted ");
		root.left.right=new Node(50);
		System.out.println(root.left.right.data+" is inserted ");
		root.right.left= new Node(60);
		System.out.println(root.right.left.data+" is inserted ");
		root.right.right=new Node(70);
		System.out.println(root.right.right.data+" is inserted ");
		
		System.out.println("\n\n\n\n");
		System.out.println("INORDER TRAVERSAL");
		td.inOrder(root);
		
		System.out.println("\n\n\n\n");
		System.out.println("PREORDER TRAVERSAL");
		td.preOrder(root);
		
		System.out.println("\n\n\n\n");
		System.out.println("POSTORDER TRAVERSAL");
		td.postOrder(root);
	}
}