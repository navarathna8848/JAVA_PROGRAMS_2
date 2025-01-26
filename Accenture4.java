import java.util.Scanner;
class Accenture4 
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

		int sum=0;
		int xor=0;

		for(int i=0;i<arr.length;i++)
		{
			if(i%2!=0)
			{
				sum=sum+arr[i];
			}
			else
			{
				xor=xor^arr[i];
			}
		} 
        int diff=sum-xor;
		System.out.println(diff);       
	}
}