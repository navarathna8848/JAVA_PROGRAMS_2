import java.util.Scanner;
class SwitchStatement
{
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);

	System.out.println("enter a value");
	int a= sc.nextInt();

	System.out.println("enter b value");
	int b= sc.nextInt();

    System.out.println("enter your choice");
	int c=sc.nextInt();

	switch(c)
	{
		case 1:
		{
		System.out.println("addition of 2 nos is "+(a+b));
		break;
	    }

		case 2:
		{
		System.out.println(" subtraction of 2 nos is "+(a-b));
		break;
	    }

		case 3:
		{
		System.out.println("multiplication of 2 nos is  "+(a*b));
		break;
	    } 

	    case 4:
		{
		System.out.println("division of 2 nos is "+(a/b));
		break;
	    } 

		default:
		{
		System.out.println("invalid options");
		break;
	    }

	}


	}
}