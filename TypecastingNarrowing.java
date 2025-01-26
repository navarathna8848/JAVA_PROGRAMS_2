import java.util.Scanner;
class TypecastingNarrowing
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the value: ");
		double a=sc.nextDouble();

		int d=(int)a;
		System.out.println(d);

		long l=(long)a;
		System.out.println(l);

	}
}
