import java.util.Scanner;
class TypecastingWidening
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the value: ");
		int a=sc.nextInt();

		double d=a;
		System.out.println(d);

		long l=a;
		System.out.println(l);

	}
}
