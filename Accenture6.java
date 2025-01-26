import java.util.Scanner;
import java.util.Arrays;
class Accenture6 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int[] arr=new int[N];

		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}

		int k=0;
		int[] rev=new int[N];
		for(int i=arr.length-1;i>=0;i--)
		{
			rev[k++]=arr[i];
		}
		System.out.println(Arrays.toString(rev));

		int sum=0;
		for(int i=0;i<=rev.length-1;i++)
		{
			if(i%2==0)
			{
				sum+=rev[i];
			}
		}
		System.out.println(sum);

 
	}
}