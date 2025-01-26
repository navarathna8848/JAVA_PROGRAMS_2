//write a program to check whether the given number is strong numbera ( ex given 145 --> 1!+4!+5!= =145 )
import java .util.Scanner;
class StrongNumber
{
	public static void main(String[] args) 
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the number you want: ");
	int num=sc.nextInt();
	int sum=0;
	int temp=num;

	while(num>0)	
	{
		int last = num % 10;
		int fact=1;
		for(int i=last;i>=1;i--)
		{
		fact=fact*i;
	    }
		sum=sum+fact;
		num=num/10;

	}
	
	if(sum==temp)
	System.out.println("the number is strong ");
    else
    	System.out.println("the number is not strong ");
	}
}