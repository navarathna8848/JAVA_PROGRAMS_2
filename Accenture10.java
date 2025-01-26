import java.util.Scanner;
import java.util.Arrays;
class Accenture10
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String s=Integer.toString(n);
		StringBuilder modifiedString=new StringBuilder(s);

		for(int i=0;i<modifiedString.length();i++)
		{
			if(modifiedString.charAt(i)=='0')
			{
				modifiedString.setCharAt(i,'5');
			}
		}
		System.out.println(modifiedString.toString());
	}
}		
	