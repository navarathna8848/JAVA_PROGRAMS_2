import java.util.Scanner;
import java.util.Arrays;
class ZeroSeparate
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("enter the size of an array ");
		int size=sc.nextInt();

		int a[]=new int[size];

        System.out.println("enter the array values ");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}

		int zerocount=0;

		for(int i=0;i<a.length;i++)
		{
			if(a[i]==0)
				zerocount++;

		}

		int zero[]=new int[zerocount];
		int nonzero[]=new int[a.length-zerocount];


		int zerosindex=0;
		int nonzerosindex=0;

		for(int i=0;i<a.length;i++)
		{
			if(a[i]==0)
				zero[zerosindex++]=a[i];

			else
				nonzero[nonzerosindex++]=a[i];
		}

		System.out.println("the zeros array "+Arrays.toString(zero));
		System.out.println("the nonzeros array "+Arrays.toString(nonzero));
		
	}
}