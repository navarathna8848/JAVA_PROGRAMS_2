import java.util.Scanner;
class Accenture1 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int N=sc.nextInt();
		char c=sc.next().charAt(0);

        int count=0;
		for(int i=0;i<N;i++)
		{
			if(c==s.charAt(i))
			{
				count++;
			}
		}
		System.out.println(count);
	}
}