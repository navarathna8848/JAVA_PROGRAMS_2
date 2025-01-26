//write a progra to find sum of all the elements in array
import java.util.Scanner;
class SumArrayGap
{
	public static void main(String[] args) 
	{
	  
	 Scanner sc = new Scanner(System.in);

	 System.out.println("enter the size ");
	 int size = sc.nextInt();
	 int a[] = new int[size];

     System.out.println("enter the gap ");
	 int gap=sc.nextInt();
	 int sum=0;

	 System.out.println("enter the value ");

	 for(int i=0;i<a.length;i++)
	 {
	 	
	 	a[i]=sc.nextInt();

	 }

	 	for(int i=0;i<a.length;i=i+gap)
	 	{
	 		sum=sum+a[i];
	 		
	 	}
	 	System.out.println("the sum of the numbers based the given gap "+sum);
	}
}
