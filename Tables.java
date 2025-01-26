import java.util.Scanner;
class Tables
{
	public static void main(String[] args) 

	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the a value : ");
		int a=sc.nextInt();
		System.out.println("enter the b value : ");
		int b=sc.nextInt();
	
		
	  for(int i=1;i<=a;i++)//no.of.rows 
	  {
	  	for(int j=1;j<=b;j++)///no.of.cols 
	  
	  	{
	  		System.out.println(i+" * "+j+ " = "+(i*j));
	  	}
	  	System.out.println("--------------------------------------------------");//to go to new line	
	  }
	}
}