class QuickSortMiddle
{
	public static void main(String args[])
	{
		int[] ar = {12,13,15,2,1,7,4,8};
		QuickSortMiddle qsm = new QuickSortMiddle();
		int n =ar.length;
		qsm.partition(ar,0,n-1);
		qsm.quickSort(ar,0,n-1);
		qsm.printArray(ar);
		
	}
	int partition(int ar[],int low,int high)
	{
		int pivot=ar[(low+high)/2];
		while(low <= high)
		{
			while(ar[low]<pivot)
			{
				low++;
			}
			while(pivot<ar[high])
			{
				high--;
			}
			if(ar[low]>ar[high])
			{
				int temp=ar[low];
				ar[low]=ar[high];
				ar[high]=temp;
			}
			return low;
		}
	}
	void quickSort(int[] ar,int low ,int high)
	{
		int pi = partition(ar,low,high);
		if(low<pi-1)
		{
			quickSort(ar,low ,pi-1);
		}
		if(pi<high)
		{
			quickSort(ar,pi,high);
		}
	}
	void printArray(int[] ar)
	{
		for(int i: ar)
		{
			System.out.print(i+" ");
		}
	}
}