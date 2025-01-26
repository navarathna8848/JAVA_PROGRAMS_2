import java.util.Scanner;
class SecondLargest
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

        int largest=arr[0];
        int secondlargest=arr[0];

        for(int i=0;i<arr.length;i++)
        {
        	if(arr[i]>largest)
        		largest=arr[i];

        }

        System.out.println("the largest element is "+largest);

        for(int i=0;i<arr.length;i++)
        {
        	if(arr[i]>=secondlargest && arr[i]<largest)
        		secondlargest=arr[i];
        	
        }

        System.out.println("the second largest element is "+secondlargest);

          int prod=largest*secondlargest;
          System.out.println("the product of first two large numbers is "+prod);
    }
     
}