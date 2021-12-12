class MergeSort
{
	int[] arr;
	int[] tempMergeArr;
	int len;
	public static void main(String args[])
	{
		int[] inpArr = {4,3,5,2,6,1};
		MergeSort ms = new MergeSort();
		ms.sort(inpArr);
		for(int i:inpArr)
		{
			System.out.print(i+" ");
		}
		
		
	}
	public void sort(int[] inpArr)
	{
		this.arr=inpArr;
		this.len=arr.length;
		this.tempMergeArr= new int[len];
		
		divideArray(0,len-1);
	}
	public void divideArray(int lower,int higher)
	{
		int middle = lower+(higher-lower)/2;
		if(lower<higher)
		{
			divideArray(lower,middle);
			divideArray(middle+1,higher);
			
			mergeArray(lower,middle,higher);
		}
		
	}
	public void mergeArray(int lower,int middle,int higher)
	{
		for(int i=lower;i<higher;i++)
		{
			tempMergeArr[i]=arr[i];
		}
		int i=lower;
		int j=middle+1;
		int k=lower;
		while(i<=middle && j<=higher)
		{
			if(tempMergeArr[i]<=tempMergeArr[j])
			{
				arr[k]=tempMergeArr[i];
				i++;
			}
			else
			{
				arr[k]=tempMergeArr[j];
				j++;
			}
			k++;
		}
		while(i<middle)
		{
			arr[k]=tempMergeArr[i];
			i++;
			k++;
		}
	}
}