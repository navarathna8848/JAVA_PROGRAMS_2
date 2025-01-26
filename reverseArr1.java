//write a program to reverse the array 
import java.til.Scanner;
class reverseArr1
{
	public static void arrrev() 
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("enter the size :");
		int size=sc.nextInt();
		int a[]=new int[size];

	    
         System.out.println("enter the value :");

	    for(int i=0;i<a.length;i++)
	     {
	 	       a[i]=sc.nextInt();
	     }
          
          System.out.println("before reversing : ");
	      System.out.println(Arrays.toString(a));

	    
	     for(int i=0;i<a.length/2;i++)

	     {
	     	a[i]=a[a.length-1];
	     	a[a.length-1]=a[i];
	     }

                        
            System.out.println("After left rotate : "); 
           System.out.println(Arrays.toString(a));
			
     }
	public static void main(String[] args) 
	{
		 arreev();
	}
}