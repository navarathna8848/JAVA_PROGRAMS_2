//write a program to print array element in reverse order
import java.util.Scanner;
class reverseArray3
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

	 System.out.println("enter the size ");
	 int size = sc.nextInt();
	 int a[] = new int[size];

	 System.out.println("enter the value ");

	 for(int i=0;i<a.length;i++)
	 {
	 	
	 	a[i]=sc.nextInt();

	 }
	 System.out.println("----------------");

		for(int i=a.length-1;i>=0;i--)
		{
			System.out.println(a[i]);
		}
	}
}