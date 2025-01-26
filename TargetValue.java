//write a program to find pair whose sum is equals to target value

import java.util.Scanner;
import java.util.Arrays;

class TargetValue
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the targeted value ");
		int targetedValue=sc.nextInt();

		int size=sc.nextInt();

		int a[]=new int[size];


		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(a));

		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]+a[j]==targetedValue)
					System.out.println("["+a[i]+","+a[j]+"]");
			}
		}

		
	}
}