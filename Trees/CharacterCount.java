import java.util.Scanner;

class CharacterCount
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of frames ");
		int n=sc.nextInt();
		int ar[] = new int[n];
		for(int i=0;i<n;i++)
		{
			ar[i]=sc.nextInt();
		}
		int i=0;
		int frame=0;
		int count;
		int j;
		while(i<n)
		{
			int x=ar[i];
			frame++;
			count=0;
			System.out.println("Frame ="+frame);
			for(j=i;count<x;j++)
			{
				System.out.println(ar[j]);
				i++;
				count++;
			}
		}
	}
}