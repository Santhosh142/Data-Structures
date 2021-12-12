class CrossMatrix
{
	public static void main(String args[])
	{
		int[][] arr = {
			{3,1,3},
			{1,3,1},
			{3,1,3}
		};
		int[][] arr1 = {
			{4,3,2,4},
			{1,4,4,1},
			{3,4,4,2},
			{4,1,1,4}
		};
		boolean ans = isCrossMatrix(arr1);
		System.out.println(ans);
		
	}
	static void printArray(int[][] arr)
	{
		for(int i = 0;i<arr.length;i++)
		{
			for(int j = 0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]+"  ");
			}
			System.out.println();
		}
	}
	static boolean isCrossMatrix(int[][] arr)
	{
		int len = arr.length;
		int ldiagonal = 0;
		int rdiagonal = 0;
		int lelement=arr[0][0];
		int relement=arr[len-1][len-1];
		if(lelement != relement)
			return false;
		for(int i = 0;i<arr.length;i++)
		{
			for(int j = 0;j<arr[i].length;j++)
			{
				if(i==j && arr[i][j]==lelement)
				{
					ldiagonal++;
				}
				if(j==(len-i-1) && arr[i][j]==lelement)
				{
					rdiagonal++;
				}
				if(i!=j && j!=(len-i-1) && arr[i][j]==lelement)
				{
					return false;
				}
			}
		}
		return (rdiagonal==len && ldiagonal==len);
	}
}