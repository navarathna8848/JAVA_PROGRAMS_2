//write a program to  sum of digits present in a given no.
import java.util.Scanner;
class SumOfDigitSingle
{
	public static void single(int num ) {
		
		while(num>9)
		{
           int sum=0;
		 while(num!=0)//for( ; num!=0 ;num/=10)
		 {
		 	
		 	int last=num%10;//extracting the last digit
		 	sum=sum+last; //Adding last digit to sum
		 	num=num/10;//removing the last digit
        }
        num=sum;
	
		 System.out.println(" The sum is  " +sum);
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number you want to add ");
		int num=sc.nextInt();
		
		single(num);
        
	}

}