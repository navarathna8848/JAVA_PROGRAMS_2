//write a program to  sum of digits present in a given no.
import java.util.Scanner;
class SumProduct
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		int sum = 0;
		 int product = 1;

		 while(num!=0)//for(; num!=0 ;num/=10
		 {
		 	
		 	int last = num%10;//extracting the last digit
		 	sum = sum+last;
		 	if(last != 0)
		 	   product = product*last;
		 	num = num / 10;//removing the last digit

		 }

		 System.out.println(" The sum is  " +sum);
		 System.out.println("the product of number is "+product);

		 if(sum==product)
		 	System.out.println("the number is spy number ");
		 else
		 	System.out.println("the number is not a spy number ");
		

	}
	
}