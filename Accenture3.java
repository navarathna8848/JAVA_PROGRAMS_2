import java.util.Scanner;
class Accenture3 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int[] arr={1,2,3,4,5,6};
		
		int N=sc.nextInt();

		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				System.out.print("even"+" ");
			}
			else
			{
				System.out.print("odd"+" ");
			}
		}        
	}
}