import java.util.Scanner;

class TripleWithZeroSum
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

        int sum=0;
        boolean found = false;

		for(int i=0;i<n-2;i++)
		{
			for(int j=i+1;i<n-1;i++)
			{
				for(int k=j+1;k<n;k++)
				{
					
					sum=arr[i]+arr[j]+arr[k];

					if(sum==0)
					System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);

				found = true;
					
				}
			}
		}
		if(found==false)
			System.out.println("not exist");
		
	}
}
