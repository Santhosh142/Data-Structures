import java.util.Queue;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
class TreeNode
{
	int data;
	TreeNode left,right;
	TreeNode(int data)
	{
		this.data=data;
	}
}

class ReverseLevelOrder
{
	
	static TreeNode root;
	static void printLevelOrder(TreeNode root)
	{
		Queue<TreeNode> q= new LinkedList<>();
		Stack<TreeNode> stack = new Stack<>();
		if(root==null)
		{
			return;
		}
		q.offer(root);
		while(q.size()>0)
		{
			TreeNode temp = q.poll();
			stack.push(temp);
			if(temp.left != null)
			{
				q.offer(temp.left);
			}
			if(temp.right!=null)
			{
				q.offer(temp.right);
			}
			
		}
		while(stack.size()>0)
		{
			TreeNode dummy = stack.pop();
			System.out.println(dummy.data);
		}
		
	}
	static void inOrder(TreeNode root)
	{
		if(root==null)
		{
			return;
		}
		inOrder(root.left);
		System.out.println(root.data);
		inOrder(root.right);
	}
	public static void main(String args[])
	{
		root = new TreeNode(10);
		root.left=new TreeNode(5);
		root.right=new TreeNode(15);
		root.left.left= new TreeNode(3);
		root.left.right= new TreeNode(7);
		root.right.left=new TreeNode(13);
		root.right.right=new TreeNode(17);
		
		System.out.println("INORDER TREE TRAVERSAL");
		inOrder(root);
		
		System.out.println("REVERSING A LEVEL ORDER TRAVERSAL OF A TREE");
		printLevelOrder(root);
		
	}
}