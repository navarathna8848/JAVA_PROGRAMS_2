import java.util.Scanner;
class Prime
{
	public static int SumOfPrimeIndexValues(int arr [],int n)
	{
		
		int sum=0;

		for(int i=0;i<arr.length;i++)
		{

		if(isPrime(i))
		{
			
            sum+=arr[i];
            System.out.println("the index "+i+" is prime number ");
		
		}
		else
		{
			 System.out.println("the index "+i+" is not a prime number ");
		}

	    }
	    return sum;
	
	}



	public static boolean isPrime(int index)
	{
		if(index<=1)
		{
			return false;

		}
		for(int i=2;i<=Math.sqrt(index);i++)
		{
			if(index % i==0)
			{
				return false;
			}
		}
		return true;

	}
}
class SumOfPrimeIndexValue
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

		int res=Prime.SumOfPrimeIndexValues(arr,n);
		System.out.println("the result is "+res);

		
	}
}