import java.util.Scanner;
class RepeatNumber
{
	public static int RepeatNumberss(int arr[],int n)
	{
		for(int i=n-1;i>=0;i--)
		{
			for(int j=i-1;j>=0;j--)
			{
				if(arr[i]!=0 && arr[j]!=0 && arr[i]>0 && arr[j]>0)
				{

			        if(arr[i]==arr[j])
		          	return arr[j];
		        }
		        
		         return 0;
		    }
		    	    
		}
		return arr[n-1];

	}
}
class RepeatNumberInRearEnd
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("enter the array size ");
		int n=sc.nextInt();

		int arr[]=new int[n];

		System.out.println("enter the inputs ");

		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}

		int res=RepeatNumber.RepeatNumberss(arr,n);
		System.out.println("the result is "+res);

		
	}
}