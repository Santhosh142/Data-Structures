import java.util.Scanner;
class Demo
{
	public static void main(String args[])
	{
		int[] ar1 = {1,3,5,7,9};
		int[] ar2 = {0,2,4,6,8};
		twoList(ar1,ar2);
	}
	static int i=0,j=0;
	static void twoList(int[] ar1,int[] ar2)
	{
		
		if(ar1[i]<ar2[j])
		{
			System.out.println(ar1[i]+" ");
			i++;
		}
		else if(ar1[i]>ar2[j])
		{
			System.out.println(ar2[j]+" ");
			j++;
		}
		if(i<ar1.length || j<ar2.length)
		{
			twoList(ar1,ar2);
		}
	}
}