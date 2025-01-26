//write a progra to find sum of all the elements in array
import java.util.Scanner;
class SumArray
{
	public static void main(String[] args) 
	{
	  
	 Scanner sc = new Scanner(System.in);

	 System.out.println("enter the size ");
	 int size = sc.nextInt();
	 int a[] = new int[size];
	 int sum=0;

	 System.out.println("enter the value ");

	 for(int i=0;i<a.length;i++)
	 {
	 	
	 	a[i]=sc.nextInt();

	 }

	 	for(int i=0;i<=a.length-1;i++)
	 	{
	 		sum=sum+a[i];
	 		
	 	}
	 	System.out.println(sum);
	}
}
