import java.util.Scanner;
class Accenture14
{
	public static void main(String[] args) 
	{
		
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();

		
        int count=0;

        for(int i=1;i<=n;i++)
        {
		String binary=Integer.toBinaryString(i);

        StringBuilder modifyString = new StringBuilder();
         
        for (char c : binary.toCharArray()) 
        {
            if (c == '0') 
            {
                modifyString.append('1');
            }

            else
             {

                modifyString.append('2');
             }
        }


		int sum=0;

        for(char c: modifyString.toString().toCharArray())
        {
        	sum+=Character.getNumericValue(c);
        }
        if(sum%2!=0)
        {
        	count++;
        }

	    }
	    System.out.println(count);
			
	}
	
}