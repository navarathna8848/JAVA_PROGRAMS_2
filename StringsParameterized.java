import java.util.Scanner;
class StringsParameterized
{
	public static String nava(String a,String b) 

	{


		String c=a+b;
		return c;
	}

	public static void main(String[] args) 
	{
		
		Scanner sc=new Scanner(System.in);


		System.out.println("-----------------------------");
		
		System.out.println("enter the string a ");
		String a=sc.next();

		System.out.println();

		System.out.println("enter the string b ");
		String b=sc.next();

		System.out.println("-------------------------------");
		
		
		System.out.println(nava(a,b));

	}
}