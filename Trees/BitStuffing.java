import java.util.Scanner;

class BitStuffing
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the bits");
		String s =sc.nextLine();
		int len = s.length();
		int count=0;
		String res="";
		for(int i=0;i<len;i++)
		{
			if(s.charAt(i)!='1' && s.charAt(i)!='0')
			{
				System.out.println("please enter binary format only");
				break;
			}
			if(s.charAt(i)=='1')
			{
				res+=s.charAt(i);
				count++;
			}
			else
			{
				res+=s.charAt(i);
				count=0;
			}
			if(count==5)
			{
				count=0;
				res+='0';
			}
		}
		System.out.println("01111110"+res+"01111110");
	}
}