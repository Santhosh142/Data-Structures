import java.util.Queue;
import java.util.LinkedList;

class TreeNode
{
	int data;
	TreeNode left,right;
	TreeNode(int data)
	{
		this.data=data;
		this.left=null;
		this.right=null;
	}
}
class InsertBinary
{
	static TreeNode root;
	static void inOrder(TreeNode root)
	{
		if(root == null)
		{
			return;
		}
		inOrder(root.left);
		System.out.println(root.data);
		inOrder(root.right);
	}
	
	static void insFirstBinary(TreeNode local,int data)
	{
		TreeNode temp = new TreeNode(data);
		if(local==null)
		{
			root=temp;
			return;
		}
		Queue<TreeNode> q = new LinkedList<>();
		
		q.offer(local);
		while(!q.isEmpty())
		{
			local = q.peek();
			q.poll();
			if(local.left==null)
			{
				local.left=temp;
				break;
			}
			else
				q.offer(local.left);
			if(local.right==null)
			{
				local.right=temp;
				break;
			}
			else
			{
				q.offer(local.right);
			}
		}
			
		
	}
	
	static void deleteBinary(TreeNode temp,int data)
	{
		if(root == null)
		{
			System.out.println("There are no nodes to delete");
			return;
		}
		else
		{
			
		}
	}
	
	public static void main(String args[])
	{
		root=new TreeNode(10);
		root.left=new TreeNode(5);
		root.right=new TreeNode(15);
		root.left.right=new TreeNode(7);
		root.left.left=new TreeNode(3);
		root.right.left=new TreeNode(13);
		root.right.right= new TreeNode(17);
		
		System.out.println("INORDER TREE TRAVERSAL");
		inOrder(root);
		
		System.out.println("Insertion of element at first empty place");
		insFirstBinary(root,11);
		System.out.println("After insertion ");
		inOrder(root);
	}
}