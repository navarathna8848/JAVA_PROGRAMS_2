import java.util.Scanner;
class VoteAccen
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("enter the array size ");
		int n=sc.nextInt();

		int arr[]=new int[n];

		System.out.println("enter the inputs ");

		for(int q=0;q<arr.length;q++)
		{
			arr[q]=sc.nextInt();
		}

        int count=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])	
				{
					count++;
				}
				
			}
		}
		System.out.println(count);

	}
}		