//write a program to reverse the array 
import java.util.Scanner;
import java.util.Arrays;
class reverseArr2
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
 
	     
	     /*int i=0;
	     int j=a.length-1;
	     int temp;

	     while(i<j)    
         {

	     temp=a[i];
	     a[i]=a[j];
	     a[j]=temp;	
	      
	     i++;
	     j--;

          } */

          for(int i=0; i<a.length/2 ;i++) 
          {
          	int temp=a[i];
          	a[i]=a[a.length-i-1];
            a[a.length-i-1]=temp;
          }           
            System.out.println("After reversing : "); 
           System.out.println(Arrays.toString(a));
			
     }
	public static void main(String[] args) 
	{
		 arrrev();
	}
}