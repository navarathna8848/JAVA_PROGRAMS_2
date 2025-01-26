import java.util.Scanner;
class SecondSmallest
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the size of the element :");
		int size=sc.nextInt();

		
		int arr[]=new int[size];


        System.out.println("Enter the elements :");
        for(int i=0;i<arr.length;i++)
        {
        	arr[i]=sc.nextInt();

        }

        int smallest=arr[0];
        int secondsmallest=arr[0];

        for(int i=0;i<arr.length;i++)
        {
        	if(arr[i]<smallest)
        		smallest=arr[i];

        }

        System.out.println("the  smallest element is "+smallest);

        for(int i=0;i<arr.length;i++)
        {
        	if(arr[i]<=secondsmallest && arr[i]>smallest)
        		secondsmallest=arr[i];
        	
        }

        System.out.println("the second smallest element is "+secondsmallest);



	}
}