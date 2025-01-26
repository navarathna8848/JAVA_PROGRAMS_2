import java.util.Scanner;
class Accenture5 
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

		int max=0;
		int temp=0;
		int a=0;
		int b=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]+arr[j]==18)
				{
					temp=arr[i]*arr[j];
					
		

				if(temp>=max)
				{
					max=temp;
					a=arr[i];
					b=arr[j];

				}
			    
			    }

			}
		}
		if(a>b)
		{
           System.out.println("("+a+","+b+")");		
        }
        else
        { 
        	System.out.println("("+b+","+a+")");

        }
		
 
	}
}