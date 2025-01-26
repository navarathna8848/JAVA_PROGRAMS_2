import java.util.Scanner;
import java.util.Arrays;
class Accenture8
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
		int amount=sc.nextInt();

        int count=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%5==0)
			{
				count++;
			}
		}
		System.out.println(count);



	}
}	