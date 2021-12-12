

class ArrayBinaryTree
{
	static int root=0;
	public static void main(String args[])
	{
		ArrayBinaryTree abt = new ArrayBinaryTree();
		abt.setRoot("10");
		abt.setLeft("11",0);
		abt.setRight("12",0);
		abt.setLeft("13",2);
		abt.setRight("14",2);
		for(int i = 0;i<ar.length;i++)
		{
			System.out.println("data at index "+i+" is "+ar[i]);
		}
	}
	static String[] ar = new String[10];
	static void setRoot(String data)
	{
		ar[root]=data;
	}
	static void setLeft(String data,int parentInd)
	{
		if(ar[parentInd]==null)
		{
			System.out.println("Parentindex "+parentInd+" is null to insert "+data);
		}
		else
		{
			int t = (2*parentInd)+1;
			ar[t]=data;
		}
	}
	static void setRight(String data,int parentInd)
	{
		if(ar[parentInd]==null)
		{
			System.out.println("Parentindex "+parentInd+" is null to insert "+data);
		}
		else
		{
			int t = (2*parentInd)+2;
			ar[t]=data;
		}
	}
	static void printArray(String[] ar)
	{
		for(int i = 0; i<ar.length;i++)
		{
			System.out.println(ar[i]);
		}
	}
	
}