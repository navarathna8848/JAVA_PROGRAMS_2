import java.util.Scanner;
class Accenture2 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int h=sc.nextInt();
		int v1=sc.nextInt();
		int v2=sc.nextInt();

		int e=v1/v2;
		int h1=h*e*e;

		System.out.println(h1);
        
	}
}