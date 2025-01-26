import java.util.Scanner;
import java.util.Arrays;

class Swapping
{
	public static void mm1(int a,int b) 
	{
		
          int temp=a;
          a=b;
          b=temp;
          

          System.out.println("after swapping " +a+ " and " +b);
	}
	public static void main(String[] args) 
	{
         Scanner sc=new Scanner(System.in);	


             System.out.println("enter the first number ");
            	int a=sc.nextInt();

             System.out.println("enter the second number ");	
            	int b=sc.nextInt();

             System.out.println("befor swapping :");
             System.out.println();
             System.out.println("before swapping " +a+ " and " +b);
             System.out.println();
             mm1(a,b);        	
	}
}