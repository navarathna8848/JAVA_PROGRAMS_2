import java.util.Scanner;
import java.util.Arrays;
class Zoho1
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("enter the size: ");
		int size = sc.nextInt();

		System.out.println("enter x value: ");
		int x=sc.nextInt();

		System.out.println("enter y value: ");
		int y=sc.nextInt();

	    int [] arr=new int[size];

	    
        System.out.print("Enter the inputs: ");
	    for(int i=0; i<arr.length;i++)
	    {
	    	
            arr[i] = sc.nextInt();
	    }

        int output;
	    for(int i=0; i<arr.length;i++)
	    {
	    	
	    	if(x<arr[i] && y>arr[i])
	    	{
	    		 output =arr[i];
	    		 System.out.println(output);

	    	}
	    	
	    }

	}
}
