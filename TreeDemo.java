class TreeDemo
{
	public class Node {
		Node key;
		Node left;
		Node right;
		Node(int key)
		{
			this.key=key;
		}
	}
	Node root= null;
	public void insert(int key)
	{
		while(true)
		{
			Node newnode = new Node(key);
		
			if(root==null)
			{
				root=newnode;
				return;
			}
			Node current = root;
			Node parent;
			else
			{
				if(current.data>newnode.data)
				{
					current=current.left;
					if(current == null )
					{
						current = newnode;
					}
					current = current.left;
				}
				current =current.right;
				if(current == null)
				{
					current = newnode;
				}
				current=current.right;
			}
		}
	}
	public static void main(String args[])
	{
		
		
	}
}