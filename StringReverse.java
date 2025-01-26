import java.util.Scanner;
import java.util.Arrays;
class StringReverse
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("enter the number of strings you want to check: ");
		int numstringssize = sc.nextInt();
		sc.nextLine();

	    String [] strings=new String[numstringssize];

	    for(int i=0; i<numstringssize;i++)
	    {
	    	System.out.print("Enter string " + (i + 1) + ": ");
            strings[i] = sc.nextLine();
	    }

	    for(int i=0; i<numstringssize;i++)
	    {
	    	String originalstring=strings[i];
	    	String reversestring="";
	    
	    for(int j=originalstring.length()-1; j>=0;j--)
	    {
	    	reversestring=reversestring+originalstring.charAt(j);
	    }
        System.out.println(reversestring);
       
       if(originalstring.equals(reversestring))
       	System.out.println("palindrome");
       else
       	System.out.println("not palindrome");
   }


	}
}