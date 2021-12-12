import java.util.Scanner;
class Node
{
	int data;
	Node left,right;
	Node(int data)
	{
		this.data = data;
		this.left = this.right = null;
	}	
}
class BST
{
	static Node root;
	BST(int data)
	{
		root=new Node(data);
	}
	BST()
	{
		root=null;
	}
	public void insert(int data)
	{
		root=insertRec(root,data);
	}
	public Node insertRec(Node localroot,int data)
	{
		if(localroot==null)
		{
			localroot=new Node(data);
			return localroot;
		}
		if(data<localroot.data)
		{
			localroot.left=insertRec(localroot.left,data);
		}
		else if(data>localroot.data)
		{
			localroot.right=insertRec(localroot.right,data);
		}
		return localroot;
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
		System.out.println(localroot.data);
		preOrder(localroot.left);
		preOrder(localroot.right);	
	}
	public void postOrder(Node localroot)
	{
		postOrder(localroot.left);
		postOrder(localroot.right);
		System.out.println(localroot.data);
	}
	
	public void minmum()
	{
		Node curr = root;
		while(curr.left!=null)
		{
			curr=curr.left;
		}
		System.out.println(curr.data);
	}
	public void maximum()
	{
		Node curr = root;
		while(curr.right!=null)
		{
			curr=curr.right;
		}
		System.out.println(curr.data);
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		BST bst = new BST();
		System.out.println("1.insert");
		System.out.println("2.inOrder");
		System.out.println("3.preOrder");
		System.out.println("4.postOrder");
		System.out.println("5.minimum");
		System.out.println("6.maximum");
		System.out.println("7.exit");
		do
		{
			
			System.out.println("Enter n value");
			int n =sc.nextInt();
			
			switch(n)
			{
				
				case 1:
					System.out.println("insert");
					int num = sc.nextInt();
					bst.insert(num);
					break;
				case 2:
					System.out.println("INORDER TRAVERSAL IS ");
					bst.inOrder(root);
					break;
				case 3:
					System.out.println("PREORDER TRAVERSAL");
					bst.preOrder(root);
					break;
				case 4:
					System.out.println("POSTORDER TRAVERSAL");
					//bst.postOrder();
					break;
				case 5:
					System.out.println("MINIMUM VALUE IS ");
					bst.minmum();
					break;
				case 6:
					System.out.println("MAXIMUM VALUE IS ");
					bst.maximum();
					break;
				case 7:
					System.exit(0);
					break;
			}
		}
		while(true);
	}
}