import java.util.*;
import java.util.Collection;
class BinarySearch
{
	public static void main(String args[])
	{
		int[] arr = {1,3,5,7,8,11,13,16,18};
		int ans = binarySearch(arr,14);
		System.out.println(ans);
	}
	static int binarySearch(int[] arr,int target)
	{
		int start=0;
		int end =arr.length-1;
		
		while(start<=end)
		{
			int mid=start+(end-start)/2;
			if(target<arr[mid])
			{
				end=mid-1;
			}
			else if(target>arr[mid])
			{
				start=mid+1;
			}
			else
			{
				return arr[mid];
			}
		}
		return arr[start-1];
	}
}