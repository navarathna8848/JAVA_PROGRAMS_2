import java.util.Scanner;
class Accenture6 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int[] arr=new int[N];

		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}

		int[] rev="";
		for(int i=arr.length-1;i>=0;i--)
		{
			rev=arr[i]+",";
		}
		System.out.println(rev);

 
	}
}